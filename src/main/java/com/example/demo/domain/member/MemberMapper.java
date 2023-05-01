package com.example.demo.domain.member;

import org.springframework.stereotype.Component;

@Component
public class MemberMapper {
    public Member memberPostDtoToMember(MemberDto.PostDto postDto) {
        Member member = new Member(
                postDto.getPassword(),
                postDto.getName(),
                postDto.getEmail()
        );
        return member;
    }
}
