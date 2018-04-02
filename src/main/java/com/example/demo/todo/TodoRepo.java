package com.example.demo.todo;

import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<Todo, Number> {

	
}
