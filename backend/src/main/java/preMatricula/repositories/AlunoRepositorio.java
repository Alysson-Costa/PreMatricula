package preMatricula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import preMatricula.models.Aluno;
import java.lang.String;
import java.util.List;


public interface AlunoRepositorio extends JpaRepository<Aluno,Long> {
	
	
	List<Aluno> findByEmail(String email);

}
