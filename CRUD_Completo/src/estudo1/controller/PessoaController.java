package estudo1.controller;

import java.util.ArrayList;

import estudo1.model.vo.PessoaVo;
import estudo1.model.bo.PessoaBo;

public class PessoaController {

	public void cadastrarPessoaController(PessoaVo pessoaVo) {
		//FuncionarioBo funcionarioBo = new FuncionarioBo();
		PessoaBo.cadastrarPessoaBo(pessoaVo);	
	}
		
	public void excluirPessoaController(PessoaVo pessoaVo) {
		//FuncionarioBo funcionarioBo = new FuncionarioBo();
		PessoaBo.excluirPessoaBo(pessoaVo);
	}
	
	public void atualizarPessoaController(PessoaVo pessoaVo) {
		//FuncionarioBo funcionarioBo = new FuncionarioBo();
		PessoaBo.atualizarPessoaBo(pessoaVo);
	}
	
	public ArrayList<PessoaVo> consultarTodasPessoasController() {
		PessoaBo pessoaBo = new PessoaBo();
		return pessoaBo.consultarPessoasBo();
	}
	
	public PessoaVo consultarPessoaController(PessoaVo pessoaVo) {
		PessoaBo pessoaBo = new PessoaBo();
		return pessoaBo.consultarPessoaBo(pessoaVo);
	}

}