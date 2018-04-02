package com.example.demo.todo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
	
	@Autowired
	private TodoServices todoservice;
	
	@RequestMapping("/todos")
	public List<Todo> getTodoList() {
		
		return todoservice.getAllTodos();
	}
	
	@RequestMapping("/todos/{id}")
	public Optional<Todo> getTodo(@PathVariable Integer id) {

		return todoservice.getTodo(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="todos")
	public List<Todo> addTodo(@RequestBody Todo todo) {
		return todoservice.addTodo(todo);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="todos/{id}")
	public List<Todo> addTodo(@PathVariable Integer id) {
		return todoservice.deleteTodo(id);
	}

	
}
