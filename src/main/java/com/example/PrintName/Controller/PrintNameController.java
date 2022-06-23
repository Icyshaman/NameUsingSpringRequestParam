package com.example.PrintName.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrintNameController {

	@GetMapping("/name")
	public String printName(@RequestParam(name = "firstname") String firstName, @RequestParam(name = "lastname") String lastName) {
		return firstName+" "+lastName;
	}

}
