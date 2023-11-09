package com.springproject.todoapp.controller;

import com.springproject.todoapp.domain.ToDo;
import com.springproject.todoapp.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class ToDoController {
    @Autowired
    private ToDoService toDoService;

    @GetMapping("/multitasks")
    public List<ToDo> getAllToDos(){
        return toDoService.getAllToDoTasks();
    }

    @PostMapping("/createtask")
    public ToDo createToDoTask(@RequestBody ToDo toDo){
        return toDoService.createToDoTask(toDo);
    }

    @PutMapping("/todotask/{id}")
    public ToDo updateTodoTask(@PathVariable(value = "id", name = "id") Long id, @RequestBody ToDo toDo){
        return toDoService.updateToDoTaskById(toDo, id);
    }

    @DeleteMapping("/todotask/{id}")
    public void deleteToDoTask(@PathVariable(value = "id", name = "id") Long id){
        toDoService.deleteToDoTaskById(id);
    }
}
