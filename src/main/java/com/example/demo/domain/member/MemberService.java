package com.example.demo.domain.member;

import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private final MemberMapper memberMapper;
    private final MemberRepository memberRepository;

    public MemberService(MemberMapper memberMapper, MemberRepository memberRepository) {
        this.memberMapper = memberMapper;
        this.memberRepository = memberRepository;
    }

    public void postMember(MemberDto.PostDto postDto) {
        Member member = memberMapper.memberPostDtoToMember(postDto);
        memberRepository.save(member);
        // 예외 처리 : 같은 이메일을 사용하는 유저가 미리 존재 하는 경우 예외 처리
        return;
    }
}
