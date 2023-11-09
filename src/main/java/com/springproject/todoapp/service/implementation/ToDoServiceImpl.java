package com.springproject.todoapp.service.implementation;

import com.springproject.todoapp.domain.ToDo;
import com.springproject.todoapp.repository.ToDoRepository;
import com.springproject.todoapp.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ToDoServiceImpl implements ToDoService {
    @Autowired
    private ToDoRepository toDoRepository;
    @Override
    public List<ToDo> getAllToDoTasks() {
        return toDoRepository.findAll();
    }

    @Override
    public void deleteToDoTaskById(long id) {
        toDoRepository.deleteById(id);
    }

    @Override
    public ToDo createToDoTask(ToDo toDo) {
        return toDoRepository.save(toDo);
    }

    @Override
    public ToDo getToDoTaskById(long id) {
        return toDoRepository.findById(id).get();
    }

    @Override
    public ToDo updateToDoTaskById(ToDo updatedToDo, long id) {
        ToDo existingToDo = toDoRepository.findById(id).orElse(null);
        if (existingToDo != null){
            existingToDo.setTitle(updatedToDo.getTitle());
            existingToDo.setDescription(updatedToDo.getDescription());
            existingToDo.setDate(updatedToDo.getDate());
            existingToDo.setWork_status(updatedToDo.getWork_status());
            return toDoRepository.save(existingToDo);
        }
        return null;
    }
}
