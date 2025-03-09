package com.streetfoodtruck.controller.member;

import com.streetfoodtruck.controller.member.request.MemberJoinRequest;
import com.streetfoodtruck.controller.response.ApiResponse;
import com.streetfoodtruck.service.member.MemberService;
import com.streetfoodtruck.service.member.request.MemberJoinServiceRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/register")
    public ApiResponse<Void> register(@RequestBody MemberJoinRequest request) {
        memberService.register(MemberJoinServiceRequest.of(request));
        return ApiResponse.ok();

    }
}
