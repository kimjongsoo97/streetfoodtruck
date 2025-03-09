package com.streetfoodtruck.repository.member;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Builder
@Table(name="member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="member_id")
    private Long memberId;
    @Column(name="member_name",nullable = false)
    private String memberName;
    @Column(name="email")
    private String email;
    @Column(name="password",nullable = false)
    private String password;

}
