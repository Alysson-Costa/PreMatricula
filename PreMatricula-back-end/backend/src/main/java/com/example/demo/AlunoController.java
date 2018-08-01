package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Aluno;
import com.example.models.Disciplina;

import repositorios.AlunorRpositorio;
import serviços.AlunoServiceImpl;

@RestController
@RequestMapping("/alunos")
@CrossOrigin(origins = "*")


public class AlunoController {
	
	
	private AlunoServiceImpl rep;
	
	@GetMapping
	public @ResponseBody Iterable <Aluno> alunos() {
		
	Iterable <Aluno> er	= rep.BuscarTodos();
	return er;
	}
	
	@PostMapping
	public void post(@RequestBody Aluno aluno) {
		rep.adicionar(aluno);
		
	}
	
	@GetMapping("/{id}")
	public @ResponseBody ResponseEntity<Aluno> buscar(@PathVariable long id){
		
		Aluno a = rep.buscar(id);
		if(a == null) {return ResponseEntity.notFound().build();}
		
		else {
			return ResponseEntity.ok(a);
		}
		
	}
	
	@GetMapping("/{id}/disciplinas")
	public @ResponseBody List<Disciplina> getDisciplinas(@PathVariable long id){
		
		return rep.buscar(id).getDisciplinas();
	}
	
	
	

	@DeleteMapping
	public void deletar(@RequestBody Aluno aluno) {
	
		rep.remover(aluno);
	}
	
	
		
	
	

}
