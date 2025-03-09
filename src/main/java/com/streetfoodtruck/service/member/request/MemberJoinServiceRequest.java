package com.streetfoodtruck.service.member.request;

import com.streetfoodtruck.controller.member.request.MemberJoinRequest;
import com.streetfoodtruck.repository.member.Member;
import lombok.Builder;
import lombok.Getter;

@Getter
public class MemberJoinServiceRequest {
    private String memberName;
    private String email;
    private String password;

    @Builder
    public MemberJoinServiceRequest(String memberName, String email, String password) {
        this.memberName = memberName;
        this.email = email;
        this.password = password;
    }

    public static MemberJoinServiceRequest of(MemberJoinRequest request) {
        return MemberJoinServiceRequest.builder()
                .memberName(request.getMemberName())
                .email(request.getEmail())
                .password(request.getPassword())
                .build();
    }

    public static Member toEntity(MemberJoinServiceRequest request) {
        return Member.builder()
                .memberName(request.getMemberName())
                .email(request.getEmail())
                .password(request.getPassword())
                .build();
    }
}
