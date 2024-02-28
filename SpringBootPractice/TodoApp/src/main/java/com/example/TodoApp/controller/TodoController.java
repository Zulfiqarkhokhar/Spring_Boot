package com.example.TodoApp.controller;

import com.example.TodoApp.entity.Todo;
import com.example.TodoApp.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:3000")
public class TodoController {

    @Autowired
    private TodoRepo todoRepo;

    @GetMapping("/alltodos")
    public List<Todo> getTodos() {
        return todoRepo.findAll();
    }

    @PostMapping("/todos")
    public String addTask(@RequestBody Todo todo){
        todoRepo.save(todo);
        return "success";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id){
        todoRepo.deleteById(id);
        return "deleted";
    }

    @PutMapping("/updatetask/{id}")
    public String updatetask(@PathVariable Long id, @RequestBody Todo updatedTodo){

        Optional<Todo> existingTodo = todoRepo.findById(id);

        if(existingTodo.isPresent()) {
            Todo todo = existingTodo.get();
            todo.setTask(updatedTodo.getTask());
            todoRepo.save(todo);
        }
        return "Updated";
    }
}
