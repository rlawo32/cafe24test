package com.cac.duduproject.jpa.domain.member;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = 224231812L;

    public static final QMember member = new QMember("member1");

    public final StringPath memberAttributeCode = createString("memberAttributeCode");

    public final StringPath memberEmail = createString("memberEmail");

    public final StringPath memberGender = createString("memberGender");

    public final StringPath memberId = createString("memberId");

    public final StringPath memberJoinDate = createString("memberJoinDate");

    public final StringPath memberModifyDate = createString("memberModifyDate");

    public final StringPath memberName = createString("memberName");

    public final NumberPath<Long> memberNo = createNumber("memberNo", Long.class);

    public final StringPath memberPhone = createString("memberPhone");

    public final StringPath memberProvider = createString("memberProvider");

    public final StringPath memberPw = createString("memberPw");

    public final StringPath memberWithdrawYn = createString("memberWithdrawYn");

    public final EnumPath<com.cac.duduproject.util.Role> role = createEnum("role", com.cac.duduproject.util.Role.class);

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    public QMember(Path<? extends Member> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata metadata) {
        super(Member.class, metadata);
    }

}

