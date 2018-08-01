package serviços;

import java.util.List;

import com.example.models.Aluno;
import com.example.models.Disciplina;

public interface DisciplinaService {
	
	
    public Disciplina buscar(long id);
	
	public void remover(long id);
	
	public void atualizar(long id , Disciplina disciplina);
	
	public void adicionar(Disciplina disciplina);
	
	public List<Disciplina> BuscarTodos();
	
	public List<Aluno> listarAlunos(Disciplina disciplina);

}
