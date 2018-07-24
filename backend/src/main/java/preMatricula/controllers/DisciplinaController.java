package preMatricula.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import preMatricula.models.Aluno;
import preMatricula.models.Disciplina;
import preMatricula.repositories.DisciplinaRepositorio;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {
	
	@Autowired
	DisciplinaRepositorio rep;
	
	@GetMapping
	public @ResponseBody List<Disciplina>VerTodos(){
		return rep.findAll();
	}
	
	@PostMapping
	public void add(@RequestBody Disciplina a) {
		rep.save(a);
	}
	
	@PutMapping
	public void update(@RequestBody Disciplina a) {
		rep.save(a);
	}
	
	@DeleteMapping
	public void Delete(@RequestBody Disciplina a) {
		rep.delete(a);
	}
	
	@GetMapping("{Id}")
	public @ResponseBody Optional<Disciplina> diciplinaByID(@PathVariable Long Id){
		return rep.findById(Id);
	}
	
	@GetMapping("{Id}/alunos")
	public @ResponseBody List<Aluno> disciplinasAluno(@PathVariable Long Id){
		try {
		Disciplina a = rep.getOne(Id);
		return a.getAlunos();
		}
		
		catch (Exception e) {
		
		}
		return null;
	}
	

}
