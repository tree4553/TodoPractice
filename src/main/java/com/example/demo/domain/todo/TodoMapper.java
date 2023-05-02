package com.example.demo.domain.todo;

import com.example.demo.domain.member.MemberRepository;
import org.springframework.stereotype.Component;

@Component
public class TodoMapper {
    MemberRepository memberRepository;

    public TodoMapper(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Todo todoPostDtoToTodo(TodoDto.PostDto postDto) {
        Todo todo = new Todo();
        todo.setMember(memberRepository.findById(postDto.getMemberId()).get());
        todo.setTitle(postDto.getTitle());
        todo.setContent(postDto.getContent());
        return todo;
    }

    public TodoDto.ResponseDto todoToTodoResponseDto(Todo todo) {
        TodoDto.ResponseDto responseDto = new TodoDto.ResponseDto(
                todo.getMember().getName(),
                todo.getTitle(),
                todo.getContent(),
                todo.getCreatedAt()
        );

        return responseDto;
    }
}
