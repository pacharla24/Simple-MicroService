package com.basicmicroservice1.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basicmicroservice1.model.restUser;

@RestController
@RequestMapping("/Users")
public class basicApi1 {
	Map<String,restUser>allusers=new HashMap<>();
@GetMapping
 public Collection<restUser> getmethod() {
	
	return allusers.values();
}
@PostMapping
public String postmethod(@RequestBody restUser userdetails) {
	restUser alldetails=new restUser();
	alldetails.setId(userdetails.getId());
	alldetails.setName(userdetails.getName());
	alldetails.setEmail(userdetails.getEmail());
	allusers.put(userdetails.getId(),alldetails);
	return "your details are added";
}
@PutMapping(path="/{id}")
public String putmethod(@PathVariable String id,@RequestBody restUser userdetails) {
	if (allusers.containsKey(id)) {
		restUser alldetails=new restUser();
		alldetails.setId(userdetails.getId());
		alldetails.setName(userdetails.getName());
		alldetails.setEmail(userdetails.getEmail());
		allusers.put(id,alldetails);
		return "your  modify details are added";
	}
	else {
		return "invalid id";
	}
}

@DeleteMapping(path="/{id}")
public String deletemethod(@PathVariable String id) {
	if (allusers.containsKey(id)){
		allusers.remove(id);
		return "deleted successfully";
	}
	else {
		return "userid invalid";  
	}
		
}
}
