package br.com.kirebr.dsp20191.aulas2124.ead;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Aluno implements Serializable {
	private String nome;
	
	private int matricula;
	
	private String disciplina;
	
	private float frequencia;
	
	private float nota1;
	
	private float nota2;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public float getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(float frequencia) {
		this.frequencia = frequencia;
	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

	public String aferirAvaliação() {
		float mediaFinal = this.nota1 + this.nota2 / 2;
		if (this.frequencia < 0.75 && mediaFinal < 6) {
			return "Reprovado por frequência e por média.";
		} else if (this.frequencia < 0.75) {
			return "Reprovado por frequência";
		} else if (mediaFinal < 6) {
			return "Reprovado por média";
		} else {
			return "Aprovado";
		}
	}
}
