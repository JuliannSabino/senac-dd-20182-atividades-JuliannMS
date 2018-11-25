package controller;

import model.bo.AlunoBO;
import model.vo.Aluno;

public class AlunoController {
	public int cadastrarAlunoController(Aluno novoAluno) {
		//FuncionarioBo funcionarioBo = new FuncionarioBo();
		AlunoBO alunoBo = new AlunoBO();
		return alunoBo.salvarAluno(novoAluno);	
	}
	
	public double calcularMediaFinal(Aluno novoAluno) {
		AlunoBO alunoBo = new AlunoBO();
		return alunoBo.calcularMediaFinal(novoAluno);
	}
	
	public int calcularSituacao(Aluno novoAluno) {
		AlunoBO alunoBo = new AlunoBO();
				
		return alunoBo.calcularSituacao(novoAluno);
	}
	
	public boolean verificaPorMatricula(String matricula)
	{
		AlunoBO alunoBo = new AlunoBO();
		return alunoBo.verificaPorMatricula(matricula);
	}
	
}
