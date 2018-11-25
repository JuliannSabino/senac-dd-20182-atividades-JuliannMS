package estudo1.model.bo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import estudo1.model.vo.PessoaVo;
import estudo1.model.dao.PessoaDao;

public class PessoaBo {

	public static void cadastrarPessoaBo(PessoaVo pessoaVo) {
		PessoaDao pessoaDao = new PessoaDao();
		if(pessoaDao.existeRegistroPorCpf(pessoaVo.getCpf()))
			JOptionPane.showMessageDialog(null, "Ja cadastrado", "ERROR", JOptionPane.ERROR_MESSAGE);
		else {
			int resultado = pessoaDao.cadastrarPessoaDao(pessoaVo);
			if(resultado == 1)
				JOptionPane.showMessageDialog(null, "OK", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
			else
				JOptionPane.showMessageDialog(null, "ERRO", "ERROR", JOptionPane.ERROR_MESSAGE);
	}	
		
	}

	public static void atualizarPessoaBo(PessoaVo pessoaVo) {
		PessoaDao pessoaDao = new PessoaDao();
		if(pessoaDao.existeResgistroPorIdPessoa(pessoaVo.getIdPessoa())) {
			int resultado = pessoaDao.atualizarPessoaDao(pessoaVo);
			if(resultado == 1)
				JOptionPane.showMessageDialog(null, "OK", "ERROR", JOptionPane.INFORMATION_MESSAGE);
			else
				JOptionPane.showMessageDialog(null, "ERRO", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void excluirPessoaBo(PessoaVo pessoaVo) {
		PessoaDao pessoaDao = new PessoaDao();
		if(pessoaDao.existeResgistroPorIdPessoa(pessoaVo.getIdPessoa())) {
			int resultado = pessoaDao.excluirPessoaDao(pessoaVo);
			if(resultado == 1)
				System.out.println("\nPessoa excluida com sucesso!");
			else
				JOptionPane.showMessageDialog(null, "ERRO", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}

	public ArrayList<PessoaVo> consultarPessoasBo() {
		PessoaDao pessoaDao = new PessoaDao();
		ArrayList<PessoaVo> pessoasVo = pessoaDao.consultarTodasPessoasDao();
		if(pessoasVo.isEmpty())
			JOptionPane.showMessageDialog(null, "ERRO", "ERROR", JOptionPane.ERROR_MESSAGE);
		return pessoasVo;
	}

	public PessoaVo consultarPessoaBo(PessoaVo pessoaVo) {
		PessoaDao pessoaDao = new PessoaDao();
		PessoaVo pessoa = pessoaDao.consultarPessoaDao(pessoaVo);
		if(pessoa == null)
			JOptionPane.showMessageDialog(null, "ERRO", "ERROR", JOptionPane.ERROR_MESSAGE);
		return pessoa;
	}
	
}
