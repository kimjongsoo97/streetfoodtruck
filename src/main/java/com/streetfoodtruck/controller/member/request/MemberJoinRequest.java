package com.streetfoodtruck.controller.member.request;

import lombok.Builder;
import lombok.Getter;

@Getter
public class MemberJoinRequest {

    private String memberName;
    private String email;
    private String password;

    @Builder
    public MemberJoinRequest(String memberName, String email, String password) {
        this.memberName = memberName;
        this.email = email;
        this.password = password;
    }
}
