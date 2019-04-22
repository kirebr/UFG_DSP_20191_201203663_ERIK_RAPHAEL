package br.com.kirebr.dsp20191.aulas2124.ead;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Empacotamento {

	public void gravarArquivoBinario(ArrayList<Object> lista, String nomeArq) {
		File arq = new File(nomeArq);
		try {
			arq.delete();
			arq.createNewFile();
			ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arq));
			objOutput.writeObject(lista);
			objOutput.close();
		} catch (IOException erro) {
			System.out.printf("Erro: %s", erro.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Object> lerArquivoBinario(String nomeArq) {
		ArrayList<Object> lista = new ArrayList<Object>();
		try {
			File arq = new File(nomeArq);
			if (arq.exists()) {
				ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
				lista = (ArrayList<Object>) objInput.readObject();
				objInput.close();
			}
		} catch (IOException erro1) {
			System.out.printf("Erro: %s", erro1.getMessage());
		} catch (ClassNotFoundException erro2) {
			System.out.printf("Erro: %s", erro2.getMessage());
		}
		return (lista);
	}
	
	public void imprimeAluno(String nomeArq) {
		ArrayList<Object> listAluno = lerArquivoBinario(nomeArq);
		for (Object object : listAluno) {
			System.out.println(((Aluno) object).aferirAvaliação());
		}
	}

}
