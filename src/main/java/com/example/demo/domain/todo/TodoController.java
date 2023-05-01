package com.example.demo.domain.todo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping("/todo")
    public ResponseEntity<TodoDto.ResponseDto> postTodo(@RequestBody TodoDto.PostDto postDto) {
        TodoDto.ResponseDto responseDto = todoService.postTodo(postDto);
        return new ResponseEntity(responseDto, HttpStatus.CREATED);
    }

    @GetMapping("/todo/{todo-id}")
    public ResponseEntity<TodoDto.ResponseDto> getTodo(@PathVariable("todo-id") Long todoId) {
        TodoDto.ResponseDto responseDto = todoService.getTodo(todoId);
        return new ResponseEntity(responseDto, HttpStatus.OK);
    }
}
