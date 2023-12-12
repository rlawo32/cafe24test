import React, {useState} from "react";
import useJoinProgressStore from "../stores/useJoinProgressStore";
import axios from "axios";

interface Props {
    setIsMemberEmailCheck: React.Dispatch<React.SetStateAction<boolean>>;
    duplicationChk: boolean;
}

const MemberAuth = (props: Props):any => {

    const [memberEmail, setMemberEmail] = useState<string>("");
    const [memberEmailCode, setMemberEmailCode] = useState<string>("");
    const [memberEmailCodeChk, setMemberEmailCodeChk] = useState<string>("");

    const [isMemberEmailConfirm, setIsMemberEmailConfirm] = useState<boolean>(false);
    const [isMemberEmailCodeChkConfirm, setIsMemberEmailCodeChkConfirm] = useState<boolean>(false);

    const [memberEmailMessage, setMemberEmailMessage] = useState<string>("");
    const [memberEmailCodeChkMessage, setMemberEmailCodeChkMessage] = useState<string>("");
    const [isMemberEmailEffect, setIsMemberEmailEffect] = useState<boolean>(true);
    const [isMemberEmailCodeChkEffect, setIsMemberEmailCodeChkEffect] = useState<boolean>(true);

    const {setInputMemberEmail} = useJoinProgressStore();

    const memberEmailRegex = (data:string):void => {
        const regexChk:RegExp = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i;
        const currentData:string = data;

        setMemberEmail(currentData);

        if(!regexChk.test(currentData)) {
            setMemberEmailMessage('이메일 주소를 다시 확인해주세요.');
            setIsMemberEmailEffect(false);
            setIsMemberEmailConfirm(false);
        } else {
            setMemberEmailMessage('');
            setIsMemberEmailEffect(true);
            setIsMemberEmailConfirm(true);
        }
    }

    const memberEmailCodeChkRegex = (data:string):void => {
        const regexChk:RegExp = /^.{6}$/;
        const currentData:string = data;

        setMemberEmailCodeChk(currentData);

        if(!regexChk.test(currentData)) {
            setMemberEmailCodeChkMessage('인증번호를 다시 확인해주세요.');
            setIsMemberEmailCodeChkEffect(false);
            setIsMemberEmailCodeChkConfirm(false);
        } else {
            setMemberEmailCodeChkMessage('');
            setIsMemberEmailCodeChkEffect(true);
            setIsMemberEmailCodeChkConfirm(true);
        }
    }

    const emailAuthSendHandler = async():Promise<void> => {

        if(isMemberEmailConfirm) {
            if(props.duplicationChk) {
                await axios({
                    method: "GET",
                    url: "/member/memberEmailDuplicationChk",
                    params: {memberEmail: memberEmail}
                }).then((res):void => {
                    if(res.data) {
                        alert('이미 가입된 이메일입니다.');
                        setIsMemberEmailEffect(false);
                        setMemberEmailMessage('이미 가입된 이메일입니다.');
                    } else {
                        emailAuthSend();
                    }
                })
            } else {
                emailAuthSend();
            }
        } else {
            alert('이메일을 확인해주세요.');
            setMemberEmailMessage('이메일 주소를 다시 확인해주세요.');
            setIsMemberEmailEffect(false);
            setIsMemberEmailConfirm(false);
        }
    }

    const emailAuthSend = ():void => {
        alert('인증코드를 발송했습니다. 이메일을 확인해주세요.');
        setIsMemberEmailEffect(true);
        setMemberEmailMessage('');

        axios({
            method: "GET",
            url: "/member/sendAuthCode",
            params: {memberEmail: memberEmail}
        }).then((res) => {
            console.log('authCode : ' + res.data.authCode);
            setMemberEmailCode(res.data.authCode);
        }).catch((err) => {
            alert('인증코드 발송에 실패했습니다.' + err);
        })
    }

    const emailAuthCheckHandler = ():void => {

        if(isMemberEmailCodeChkConfirm) {
            if(memberEmailCode === memberEmailCodeChk) {
                alert('인증에 성공하였습니다!');
                props.setIsMemberEmailCheck(true);
                setInputMemberEmail(memberEmail);
            } else {
                alert('인증번호가 일치하지 않습니다.');
                setMemberEmailCodeChkMessage('인증번호가 일치하지 않습니다.');
                setIsMemberEmailCodeChkEffect(false);
                setIsMemberEmailCodeChkConfirm(false);
            }
        } else {
            alert('인증번호를 확인해주세요.');
            setMemberEmailCodeChkMessage('인증번호를 다시 확인해주세요.');
            setIsMemberEmailCodeChkEffect(false);
            setIsMemberEmailCodeChkConfirm(false);
        }
    }

    return (
        <div>
            <input type="text" onChange={(data) => memberEmailRegex(data.target.value)} placeholder="이메일"
                   style={ isMemberEmailEffect ? {} : {border: '2px solid red'} } />
            <span style={  isMemberEmailEffect ? {display:'none'} : {display:'inline', color:'red', fontSize:'13px'} }>
                        {memberEmailMessage}
                </span>
            <button onClick={() => emailAuthSendHandler()}>전송하기</button>
            <input type="text" onChange={(e) => memberEmailCodeChkRegex(e.target.value)} placeholder="이메일 인증"
                   style={ isMemberEmailCodeChkEffect ? {} : {border: '2px solid red'} } />
            <span style={  isMemberEmailCodeChkEffect ? {display:'none'} : {display:'inline', color:'red', fontSize:'13px'} }>
                        {memberEmailCodeChkMessage}
                </span>
            <button onClick={() => emailAuthCheckHandler()}>확인하기</button>
        </div>
    )
}

export default MemberAuth;