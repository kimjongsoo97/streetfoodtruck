package com.streetfoodtruck.service.member;

import com.streetfoodtruck.repository.member.Member;
import com.streetfoodtruck.repository.member.MemberRepository;
import com.streetfoodtruck.service.member.request.MemberJoinServiceRequest;
import jakarta.transaction.Transactional;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
class MemberServiceTest {

    @Autowired
    private MemberService memberService;
    @Autowired
    private MemberRepository memberRepository;

    @Test
    @DisplayName("이메일, 패스워드, 회원이름을 받아서 회원가입을 할 수 있다.")
    void join() {
        MemberJoinServiceRequest request  = MemberJoinServiceRequest.builder()
                .email("rlagudwog@gmail.com")
                .password("asdasdasdasd")
                .memberName("김형재")
                .build();
        memberService.register(request);

        Member member = memberRepository.findById(1L).get();

        Assertions.assertThat(member.getMemberName()).isEqualTo("김형재");
    }
}