package com.streetfoodtruck.service.member;

import com.streetfoodtruck.repository.member.Member;
import com.streetfoodtruck.repository.member.MemberRepository;
import com.streetfoodtruck.service.member.request.MemberJoinServiceRequest;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service

@RequiredArgsConstructor

public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public void register(MemberJoinServiceRequest request) {
        Member member = MemberJoinServiceRequest.toEntity(request);
        memberRepository.save(member);
    }

}
