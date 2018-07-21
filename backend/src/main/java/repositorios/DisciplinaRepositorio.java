package repositorios;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.models.Aluno;
import com.example.models.Disciplina;

public interface DisciplinaRepositorio extends JpaRepository<Disciplina, Long> {
	
	
    
	
	
	

}
