package com.springproject.todoapp.repository;

import com.springproject.todoapp.domain.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {
}
