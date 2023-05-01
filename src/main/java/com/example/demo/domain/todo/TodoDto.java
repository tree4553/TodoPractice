package com.example.demo.domain.todo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

public class TodoDto {
    @Getter
    @Setter
    @AllArgsConstructor
    public static class PostDto {
        private Long memberId;
        private String title;
        private String content;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    public static class ResponseDto {
        private String memberName;
        private String title;
        private String content;
        private LocalDateTime createdAt;
    }
}
