package estudo1.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import estudo1.model.vo.PessoaVo;

public class PessoaDao {
	
	public boolean existeRegistroPorCpf(String cpf) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		ResultSet resultado = null;
		String query = "select * from pessoa where cpf like '" + cpf + "'";
		
		try {
			resultado = stmt.executeQuery(query);
			if (resultado.next())
				return true;
		} catch (SQLException e) {
			System.out.println("Erro ao executar a Query que verifica existencia de Pessoa por CPF");
			return false;
		} finally {
			Banco.closeResultSet(resultado);
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		
		return false;
	}

	public int cadastrarPessoaDao(PessoaVo pessoaVo) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		int resultado = 0;
		
		System.out.println(pessoaVo.getIdPessoa());
		System.out.println(pessoaVo.getNome());
		System.out.println(pessoaVo.getCpf());
		System.out.println(pessoaVo.getTelefone());
		System.out.println(pessoaVo.getSexo());
		System.out.println(pessoaVo.getSalario());
		
		String query = "INSERT INTO pessoa (idpessoa, nome, cpf, telefone, sexo, salario) values ('" + pessoaVo.getIdPessoa() + "', '" + pessoaVo.getNome() + "', '" + pessoaVo.getCpf() + "', '" + pessoaVo.getTelefone() + "', '" + pessoaVo.getSexo() + "', '" + pessoaVo.getSalario() + "')";
		
		try {
			resultado = stmt.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("Erro ao executar a query de Cadastro");
		} finally {
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		
		return resultado;
	}

	public boolean existeResgistroPorIdPessoa(int id) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		ResultSet resultado = null;
		String query = "select * from pessoa where idpessoa = " + id;
		
		try {
			resultado = stmt.executeQuery(query);
			if (resultado.next())
				return true;
		} catch (SQLException e) {
			System.out.println("Erro ao executar a Query que verifica existencia de Pessoa por ID");
			return false;
		} finally {
			Banco.closeResultSet(resultado);
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		
		return false;
	}

	public int atualizarPessoaDao(PessoaVo pessoaVo) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		int resultado = 0;
		String query =  "update pessoa set nome = '" + pessoaVo.getNome() + "', '" + pessoaVo.getCpf() + "', '" + pessoaVo.getTelefone() + "' , '" + pessoaVo.getSexo() + "', '" + pessoaVo.getSalario();
		
		try {
			resultado = stmt.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("Erro ao executar a Query de atualização por Funcionario por ID");
		} finally {
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		return resultado;
	}

	public int excluirPessoaDao(PessoaVo pessoaVo) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		int resultado = 0;
		String query = "delete from pessoa where idpessoa = " + pessoaVo.getIdPessoa();
		
		try {
			resultado = stmt.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("Erro ao executar a Query de exclusão de Pessoa por ID");
		} finally {
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		return resultado;
	}

	public PessoaVo consultarPessoaDao(PessoaVo pessoaVo) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		ResultSet resultado = null;
		PessoaVo pessoa = new PessoaVo();

		String query = "select * from pessoa where idpessoa = " + pessoaVo.getIdPessoa();
		
		try {
			resultado = stmt.executeQuery(query);
			resultado.next();
			pessoa.setIdPessoa(Integer.parseInt(resultado.getString(1)));
			pessoa.setNome(resultado.getString(2));
			pessoa.setCpf(resultado.getString(3));
			pessoa.setTelefone(resultado.getInt(4));
			pessoa.setSexo(resultado.getString(5));
			pessoa.setSalario(resultado.getDouble(6));
			
		} catch (SQLException e) {
			System.out.println("Erro ao executar a Query de Consulta de Pessoa por ID");
		} finally {
			Banco.closeResultSet(resultado);
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		return pessoa;
	}

	public ArrayList<PessoaVo> consultarTodasPessoasDao() {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		ResultSet resultado = null;
		ArrayList<PessoaVo> pessoasVo = new ArrayList<PessoaVo>();
		String query = "select * from pessoa";
		
		try {
			resultado = stmt.executeQuery(query);
			while(resultado.next()) {
				PessoaVo pessoaVo = new PessoaVo();
				pessoaVo.setIdPessoa(Integer.parseInt(resultado.getString(1)));
				pessoaVo.setNome(resultado.getString(2));
				pessoaVo.setCpf(resultado.getString(3));
				pessoaVo.setTelefone(resultado.getInt(4));
				pessoaVo.setSexo(resultado.getString(5));
				pessoaVo.setSalario(resultado.getDouble(6));
				pessoasVo.add(pessoaVo);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao executar a Query de Consulta de Todos os Funcionario");
		} finally {
			Banco.closeResultSet(resultado);
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		return pessoasVo;
	}
	
}
