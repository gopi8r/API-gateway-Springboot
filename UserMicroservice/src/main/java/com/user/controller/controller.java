package com.user.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.userentity;

@RestController
public class controller {
	
	 @GetMapping("/users")
	    public List<userentity> getUsers() {
	        return Arrays.asList(
	            new userentity(1, "John Doe"),
	            new userentity(2, "Jane Doe")
	        );
	    }
	
}
