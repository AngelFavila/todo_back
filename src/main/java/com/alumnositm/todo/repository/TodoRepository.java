package com.alumnositm.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alumnositm.todo.entities.TodoEntity;

public interface TodoRepository  extends JpaRepository<TodoEntity, Long> {
    
}
