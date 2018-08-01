package com.example.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name = "disciplina")
public class Disciplina implements Serializable {
	
	
public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

private String nome;

private String codigo;

@JsonManagedReference
@ManyToMany
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
