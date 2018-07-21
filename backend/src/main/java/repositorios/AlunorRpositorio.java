package repositorios;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.models.Aluno;

public interface AlunorRpositorio extends JpaRepository<Aluno,Long> {
	
	
	

}
