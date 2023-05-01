package com.example.demo.domain.member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


public class MemberDto {
    @Getter
    @Setter
    @AllArgsConstructor
    public static class PostDto {
        private String email;
        private String password;
        private String name;
    }
}
