package preMatricula.controllers;

import java.util.List;

import javax.xml.ws.soap.AddressingFeature.Responses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.status.Status;
import preMatricula.exceptions.SenhaIncorretaException;
import preMatricula.models.Aluno;
import preMatricula.repositories.AlunoRepositorio;

@RestController
@RequestMapping("/")
public class ValidarController {
	
	@Autowired
	AlunoRepositorio rep;
	
	
	
	@GetMapping("validar/{email}/{senha}")
	public @ResponseBody Aluno Email(@PathVariable String email , @PathVariable String senha) throws SenhaIncorretaException{
		
		Aluno a = rep.findByEmail(email);
		
		if ( a == null) {
			a = new Aluno();
			a.setEmail(email);
			a.setSenha(senha);
			rep.save(a);
			return a;
		}
		
		if(a.getSenha() == senha) {
			return a;
		}
		
		else {
			throw new SenhaIncorretaException();
		}
	}
	

}
