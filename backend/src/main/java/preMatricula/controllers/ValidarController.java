package preMatricula.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import preMatricula.models.Aluno;
import preMatricula.repositories.AlunoRepositorio;

@RestController
@RequestMapping("/")
public class ValidarController {
	
	@Autowired
	AlunoRepositorio rep;
	
	@GetMapping("validar/{email}")
	public @ResponseBody List<Aluno> procurarPorEmail(@PathVariable String email) {
		
		return rep.findByEmail(email);
	}
	

}
