package com.springproject.todoapp.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

import java.sql.Date;

@Entity
@Table(name = "todo")
@Data
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    @NotNull
    @NotBlank
    @NotEmpty
    private long id;
    @Column(name = "title", nullable = false, updatable = true)
    @NotNull
    @NotBlank(message = "Title should not be Blank")
    @NotEmpty(message = "Title should not be Empty")
    @Size(min = 5, max = 50, message = "Title should be in between 5 to 50 characters")
    private  String title;
    @Column(name = "description", nullable = false, updatable = true)
    @NotNull
    @NotBlank(message = "Description should not be Blank")
    @NotEmpty(message = "Description should not be Empty")
    @Size(min = 15, max = 500, message = "Description should be in between 15 to 500 characters")
    private String description;
    private Date date;
    @Column(name = "work_status", nullable = false, updatable = true)
    @NotNull
    @NotBlank
    @NotEmpty
    private String work_status;
}
