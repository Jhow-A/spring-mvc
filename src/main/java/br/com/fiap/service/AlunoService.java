package br.com.fiap.service;

import java.util.List;

import br.com.fiap.dao.AlunoDAO;
import br.com.fiap.model.Aluno;

public class AlunoService {

	private AlunoDAO dao = new AlunoDAO();
	private List<Aluno> listaAlunos;

	public List<Aluno> listaAlunos() {
		listaAlunos = dao.listaAlunos();

		for (Aluno aluno : listaAlunos) {
			aluno.setPassou(alunoPassou(aluno.getNota()));
		}

		return listaAlunos;
	}

	private boolean alunoPassou(Double nota) {
		return nota >= 7;
	}
}
