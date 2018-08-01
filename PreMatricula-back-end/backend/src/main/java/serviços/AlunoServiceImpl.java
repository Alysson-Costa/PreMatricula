package serviços;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.models.Aluno;
import com.example.models.Disciplina;

import repositorios.AlunorRpositorio;

@Service
public class AlunoServiceImpl implements AlunoService {
	
	@Autowired
	private AlunorRpositorio rep;

	@Override
	public Aluno buscar(long id) {
			
		Aluno a = rep.getOne(id);
		
		return a;
	}

	@Override
	public void remover(Aluno aluno) {
		rep.delete(aluno);
		
	}

	@Override
	public void atualizar(Aluno aluno) {
		
		rep.save(aluno);
	}

	@Override
	public void adicionar(Aluno aluno) {
		rep.save(aluno);
		
	}

	@Override
	public Iterable<Aluno> BuscarTodos() {
	 Iterable <Aluno> er	= rep.findAll();
	 return rep.findAll();
	}

	@Override
	public Iterable<Disciplina> buscarDisciplinas(Aluno aluno) {
		
		return aluno.getDisciplinas();
		
		
	}

	
	@Override
	public void adicionarDisciplinas(Disciplina disciplina, Aluno aluno) {
		
		aluno.getDisciplinas().add(disciplina);
		rep.save(aluno);
		
		
	}

}
