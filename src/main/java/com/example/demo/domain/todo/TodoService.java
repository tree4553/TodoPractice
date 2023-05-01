package com.example.demo.domain.todo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class TodoService {
    private final TodoMapper todoMapper;
    private final TodoRepository todoRepository;

    public TodoService(TodoMapper todoMapper, TodoRepository todoRepository) {
        this.todoMapper = todoMapper;
        this.todoRepository = todoRepository;
    }

    public TodoDto.ResponseDto postTodo(TodoDto.PostDto postDto) {
        Todo todo = todoMapper.todoPostDtoToTodo(postDto);
        todoRepository.save(todo);

        TodoDto.ResponseDto responseDto = todoMapper.todoToTodoResponseDto(todo);
        return responseDto;
    }

    public TodoDto.ResponseDto getTodo(Long todoId) {
        Optional<Todo> findTodo = todoRepository.findById(todoId);
        // 예외 처리

        Todo todo = findTodo.get();

        TodoDto.ResponseDto responseDto = todoMapper.todoToTodoResponseDto(todo);
        return responseDto;
    }
}
