package br.com.arq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.arq.entity.Users;
import br.com.arq.repository.UsersRepository;

@ResponseBody
@RestController
@RequestMapping("/api")
public class UsersController {

	@Autowired
	private UsersRepository usersRepository;

	@PostMapping("/users")
	public ResponseEntity<?> createUser(@RequestBody Users users) {
		try {
			Users resposta = usersRepository.save(users);
			if (resposta == null) {
		throw new Exception("Nao gravou"); // va para o catch
			}
			return ResponseEntity.status(200).body(resposta);
		} catch (Exception ex) {
	return ResponseEntity.status(500).body("error servidor internal");
		}
	}

	@GetMapping("/users")
	public List<Users> findUsers() {
		return usersRepository.findAll();
	}
}
