package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Aluno;
import com.example.models.Disciplina;

import repositorios.DisciplinaRepositorio;
import serviços.DisciplinaService;

@RestController
@RequestMapping("/Disciplinas")
@CrossOrigin("*")

public class DisciplinaController {

	
	private DisciplinaService rep;
	
	@GetMapping
	public @ResponseBody List <Disciplina> disciplinas() {
		
	
	return rep.BuscarTodos();
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Disciplina busca(@PathVariable long id) {
		
		return rep.buscar(id);
	}
	
	@PostMapping
	public void adicionar(@RequestBody Disciplina d) {
		
		rep.adicionar(d);
		
	}
	
	
	
	
	
	
	
	
	
	
}
