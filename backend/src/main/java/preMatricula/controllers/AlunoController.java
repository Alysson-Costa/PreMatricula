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
import preMatricula.repositories.AlunoRepositorio;
import preMatricula.repositories.DisciplinaRepositorio;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	AlunoRepositorio rep;
	@Autowired
	DisciplinaRepositorio drep;
	
	@GetMapping
	public @ResponseBody List<Aluno> VerTodos(){
		return rep.findAll();
	}
	
	@PostMapping
	public void add(@RequestBody Aluno a) {
		rep.save(a);
	}
	
	@PutMapping
	public void update(@RequestBody Aluno a) {
		rep.save(a);
	}
	
	@DeleteMapping
	public void Delete(@RequestBody Aluno a) {
		for(Disciplina i :a.getDisciplinas()) {
			i.getAlunos().remove(a);
			drep.save(i);
		}
		rep.delete(a);
	}
	
	@GetMapping("{Id}")
	public @ResponseBody Optional<Aluno> alunoID(@PathVariable Long Id){
		return rep.findById(Id);
	}
	
	@GetMapping("{Id}/disciplinas")
	public @ResponseBody List<Disciplina> alunoDisciplinas(@PathVariable Long Id){
		try {
		Aluno a = rep.getOne(Id);
		return a.getDisciplinas();
		}
		
		catch (Exception e) {
		
		}
		return null;
	}
	
	@PutMapping("{idAluno}/matricular/{idDisciplina}")
	public void matricular(@PathVariable long idAluno , @PathVariable long idDisciplina) {
		Aluno a = rep.getOne(idAluno);
		Disciplina d  = drep.getOne(idDisciplina);
		
		a.getDisciplinas().add(d);
		d.getAlunos().add(a);
		rep.save(a);
		drep.save(d);
	}
	
	@PutMapping("{idAluno}/remover/{idDisciplina}")
	public void remover(@PathVariable long idAluno , @PathVariable long idDisciplina) {
		Aluno a = rep.getOne(idAluno);
		Disciplina d  = drep.getOne(idDisciplina);
		
		a.getDisciplinas().remove(d);
		d.getAlunos().remove(a);
		rep.save(a);
		drep.save(d);
	}
	
	
	
	
	
	
	

}
