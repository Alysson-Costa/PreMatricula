package com.example.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name = "aluno")
public class Aluno implements Serializable {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
long id;
@Column(name = "Matricula")
private String matricula;
@Column(name = "Email")
private String email;

@JsonManagedReference
@ManyToMany(mappedBy = "alunos")
private List<Disciplina> disciplinas;

public Aluno(String matricula , String nome) {
	
}


public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
}


public List<Disciplina> getDisciplinas() {
	return disciplinas;
}


public void setDisciplinas(List<Disciplina> disciplinas) {
	this.disciplinas = disciplinas;
}


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

public void addDisciplinas(Disciplina disciplina) {
	
	this.disciplinas.add(disciplina);
}









	

}
