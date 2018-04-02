package com.example.demo.todo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServices {
	
	@Autowired
	private TodoRepo todorepo;

	 
		
	public List<Todo> getAllTodos() {
		List<Todo> todos = new ArrayList<>(); 
		todorepo.findAll().forEach(todos::add);
		
		return todos;
	}
	
	public Optional<Todo> getTodo(Number id) {
		
		return todorepo.findById(id);
		
	}

	public List<Todo> addTodo(Todo todo) {
		// TODO Auto-generated method stub
		todorepo.save(todo);
		List<Todo> todos = new ArrayList<>(); 
		todorepo.findAll().forEach(todos::add);
		
		return todos;
	}
	
	public List<Todo> updateTodo(Todo todo) {
		// TODO Auto-generated method stub
		todorepo.save(todo);
		List<Todo> todos = new ArrayList<>(); 
		todorepo.findAll().forEach(todos::add);
		
		return todos;
	}

	public List<Todo> deleteTodo(Number id) {
		
		todorepo.deleteById(id);
		
		List<Todo> todos = new ArrayList<>(); 
		todorepo.findAll().forEach(todos::add);
		
		return todos;
		
	}
	
	
}
