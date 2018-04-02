package com.example.demo.todo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
	
	@Autowired
	private TodoServices todoservice;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/todos")
	public List<Todo> getTodoList() {
		
		return todoservice.getAllTodos();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/todos/{id}")
	public Optional<Todo> getTodo(@PathVariable Integer id) {

		return todoservice.getTodo(id);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method=RequestMethod.POST, value="todos")
	public List<Todo> addTodo(@RequestBody Todo todo) {
		return todoservice.addTodo(todo);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method=RequestMethod.PUT, value="todos")
	public List<Todo> updateTodo(@RequestBody Todo todo) {
		return todoservice.updateTodo(todo);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method=RequestMethod.DELETE, value="todos/{id}")
	public List<Todo> addTodo(@PathVariable Integer id) {
		return todoservice.deleteTodo(id);
	}

	
}
