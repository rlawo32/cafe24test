package com.cac.duduproject.web.controller;

import com.cac.duduproject.service.lecture.LectureImageService;
import com.cac.duduproject.service.lecture.LectureListService;
import com.cac.duduproject.service.lecture.LectureWriteService;
import com.cac.duduproject.service.member.MemberService;
import com.cac.duduproject.util.ImageUploadUtil;
import com.cac.duduproject.web.dto.CommonResponseDto;
import com.cac.duduproject.web.dto.lecture.LectureRoomRequestDto;
import com.cac.duduproject.web.dto.lecture.LectureSubCategoryRequestDto;
import com.cac.duduproject.web.dto.lecture.LectureWriteRequestDto;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RequiredArgsConstructor
@RestController
@RequestMapping("/lecture")
public class LectureController {

    private final LectureWriteService lectureWriteService;
    private final LectureListService lectureListService;
    private final LectureImageService lectureImageService;
    private final MemberService memberService;
    private final ImageUploadUtil imageUploadUtil;

    @PostMapping("/write")
    public CommonResponseDto<?> lectureWrite(@RequestBody LectureWriteRequestDto requestDto) {
        return lectureWriteService.lectureWrite(requestDto);
    }

    @GetMapping("/lectureInstitutionList")
    public CommonResponseDto<?> lectureInstitutionList() {
        return lectureWriteService.findAllLectureInstitution();
    }

    @PostMapping("/insertLectureRoom")
    public CommonResponseDto<?> insertLectureRoom(@RequestBody LectureRoomRequestDto requestDto) {
        return lectureWriteService.insertLectureRoom(requestDto);
    }

    @GetMapping("/lectureRoomList")
    public CommonResponseDto<?> lectureRoomList(HttpServletRequest request) {
        return lectureWriteService.findAllLectureRoom(request);
    }

    @GetMapping("/lectureMainCategoryList")
    public CommonResponseDto<?> lectureMainCategoryList() {
        return lectureWriteService.findAllLectureMainCategory();
    }

    @PostMapping("/insertLectureSubCategory")
    public CommonResponseDto<?> insertLectureSubCategory(@RequestBody LectureSubCategoryRequestDto requestDto) {
        return lectureWriteService.insertLectureSubCategory(requestDto);
    }

    @GetMapping("/lectureSubCategoryList")
    public CommonResponseDto<?> lectureSubCategoryList(HttpServletRequest request) {
        return lectureWriteService.findAllLectureSubCategory(request);
    }

    @GetMapping("/lectureTeacherList")
    public CommonResponseDto<?> lectureTeacherList(HttpServletRequest request) {
        return memberService.findAllMemberList(request);
    }

    @GetMapping("/lectureList")
    public CommonResponseDto<?> lectureList(HttpServletRequest request) {
        return lectureListService.findAllLectureList(request);
    }

    @PostMapping("/lectureUploadImage")
    public CommonResponseDto<?> lectureUploadImage(@RequestPart("files") MultipartFile multipartFile, @RequestPart("type") String type) {
        return lectureImageService.lectureImageUploadS3(multipartFile, type);
    }

    @DeleteMapping("/lectureDeleteImage")
    public void lectureDeleteImage(HttpServletRequest request) {
        imageUploadUtil.ImageDeleteS3(request);
    }

}
