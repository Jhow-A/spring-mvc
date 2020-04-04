package br.com.fiap.dao;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.model.Aluno;;

public class AlunoDAO {
	public List<Aluno> listaAlunos(){
		
		Aluno lucas = new Aluno(123, "Lucas", 1d);
		Aluno jose = new Aluno(124, "José", 8d);
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		alunos.add(lucas);
		alunos.add(jose);

		return alunos;
	}
}	
