package serviços;

import java.util.List;
import java.util.Optional;

import com.example.models.Aluno;
import com.example.models.Disciplina;

public interface AlunoService {
	
	
	public Aluno buscar(long id);
	
	public void remover(Aluno aluno);
	
	public void atualizar(Aluno aluno);
	
	public void adicionar(Aluno aluno);
	
	public Iterable<Aluno> BuscarTodos();
	
	public Iterable<Disciplina> buscarDisciplinas(Aluno a);
	
	public void adicionarDisciplinas(Disciplina disciplina,Aluno aluno);

}
