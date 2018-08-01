package serviços;

import java.util.List;

import com.example.models.Aluno;
import com.example.models.Disciplina;

import repositorios.DisciplinaRepositorio;

public class DisciplinaServiceImpl implements DisciplinaService{
	
	
	private DisciplinaRepositorio rep;

	@Override
	public Disciplina buscar(long id) {
		
		return rep.getOne(id);
	}

	@Override
	public void remover(long id) {
		
		rep.deleteById(id);
		
	}

	@Override
	public void atualizar(long id, Disciplina disciplina) {
		
		rep.save(disciplina);
		
	}

	@Override
	public void adicionar(Disciplina disciplina) {
		rep.save(disciplina);
		
	}

	@Override
	public List<Disciplina> BuscarTodos() {
		
		return rep.findAll();
	}

	@Override
	public List<Aluno> listarAlunos(Disciplina d) {
		return d.getAlunos();
	}

}
