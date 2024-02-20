package com.basicmicroservice1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class basicApi1 {
@RequestMapping("/basicweb")
 public String test() {
	return "basic webpage";
}
}
