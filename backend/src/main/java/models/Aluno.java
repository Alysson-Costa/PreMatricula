package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
 
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;



@Entity
public class Aluno {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;

private String matricula;

private String email;

@JsonManagedReference
@ManyToMany(mappedBy = "alunos")
private List<Disciplina> disciplinas;


public String getMatricula() {
	return matricula;
}

// creio que não seja necessario , depois discutimos isso

public void setMatricula(String matricula) {
	this.matricula = matricula;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public long Getid() {
	return this.id;
}









	

}
