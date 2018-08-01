package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Disciplina {
	
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;

private String nome;

private String codigo;

@JsonManagedReference
@ManyToMany(mappedBy = "disciplinas")
private List<Aluno> alunos;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCodigo() {
	return codigo;
}

public void setCodigo(String codigo) {
	this.codigo = codigo;
}

public List<Aluno> getAlunos() {
	return alunos;
}


}
