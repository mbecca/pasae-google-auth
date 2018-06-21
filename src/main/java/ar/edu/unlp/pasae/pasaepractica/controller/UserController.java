package ar.edu.unlp.pasae.pasaepractica.controller;

import java.util.Arrays;
import java.util.Collection;

import javax.annotation.security.RolesAllowed;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@RolesAllowed("ROLE_USER")
	@GetMapping(value = "list")
	public Collection<String> list() {
		return Arrays.asList("mbecca", "mbutti");
	}

	@RolesAllowed("ROLE_STUDENT")
	@GetMapping(value = "listStudents")
	public Collection<String> listStudents() {
		return Arrays.asList("marcos", "agustin", "gonzalo", "genaro");
	}

}
