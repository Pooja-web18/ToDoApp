package com.ToDoApp.ToDoApp.Repository;

import com.ToDoApp.ToDoApp.Models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

}