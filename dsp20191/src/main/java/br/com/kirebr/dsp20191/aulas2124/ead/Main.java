package br.com.kirebr.dsp20191.aulas2124.ead;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
	
	static private String nomeArquivo = "src/main/resources/aluno.dat";
	
	public static void main(String[] args) throws IOException {		
		Aluno aluno = new Aluno();
		Empacotamento inputOutput = new Empacotamento();
		aluno.setNome("Aluno Teste");
		aluno.setMatricula(1212);
		aluno.setFrequencia((float) 0.75);
		aluno.setDisciplina("Disciplin2a");
		aluno.setNota1(5);
		aluno.setNota2(7);
		ArrayList<Object> listAluno = new ArrayList();
		listAluno.add(aluno);
		inputOutput.gravarArquivoBinario((listAluno), nomeArquivo);
		inputOutput.imprimeAluno(nomeArquivo);
	}
}