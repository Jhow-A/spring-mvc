package br.com.fiap.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.fiap.model.Aluno;
import br.com.fiap.service.AlunoService;

@Controller
public class AlunoController {
	
	private AlunoService alunoService = new AlunoService();
	
	@RequestMapping(value = "/aluno", method = RequestMethod.GET)
	public String aluno(Model model) {
		
		/*	
		List<String> alunos = new ArrayList<>();
		alunos.add("Gabi");
		alunos.add("Lucas");
		alunos.add("Baguncinha");
		alunos.add("Rudilei");
		
		model.addAttribute("listaDeAlunos", alunos);
		*/
				
		String nomeDoAluno = "Jhow";
		int qualquerNumero = new Random().nextInt();
		
		
		model.addAttribute("nomeDoAluno", nomeDoAluno);
		model.addAttribute("numero", qualquerNumero);
		
		List<Aluno> alunos = alunoService.listaAlunos();
		
		model.addAttribute("listaDeAlunos", alunos);
		
		return "aluno";
				
	}
	
	@RequestMapping(value = "/aluno/prova")
	public String prova() {
		return "prova";
	}
}
