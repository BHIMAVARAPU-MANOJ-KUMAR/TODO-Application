package com.springproject.todoapp.service;

import com.springproject.todoapp.domain.ToDo;

import java.util.List;
import java.util.Optional;

public interface ToDoService {
    List<ToDo> getAllToDoTasks();
    void deleteToDoTaskById(long id);
    ToDo createToDoTask(ToDo toDo);
    ToDo getToDoTaskById(long id);
    ToDo updateToDoTaskById(ToDo toDo, long id);
}
