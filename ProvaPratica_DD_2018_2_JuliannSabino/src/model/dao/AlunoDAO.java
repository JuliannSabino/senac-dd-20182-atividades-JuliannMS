package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;

import model.Banco;
import model.vo.Aluno;

public class AlunoDAO {

	public int inserir(Aluno a){
		int novoId = -1;

		String sql = " INSERT INTO ALUNO (NOME, SOBRENOME, MATRICULA, NIVEL, NOTAPROVA1, NOTAPROVA2, NOTATRABALHO1, NOTATRABALHO2, PESOPROVAS, PESOTRABALHOS) "
				+ " VALUES (?,?,?,?,?,?,?,?,?,?) ";

		Connection conexao = Banco.getConnection();
		PreparedStatement prepStmt = Banco.getPreparedStatement(conexao, sql, 
				java.sql.Statement.RETURN_GENERATED_KEYS);

		try {
			prepStmt.setString(1, a.getNome());
			prepStmt.setString(2, a.getSobrenome());
			prepStmt.setString(3, a.getMatricula());
			prepStmt.setString(4, a.getNivel());
			prepStmt.setDouble(5, a.getNotaProva1());
			prepStmt.setDouble(6, a.getNotaProva2());
			prepStmt.setDouble(7, a.getNotaTrabalho1());
			prepStmt.setDouble(8, a.getNotaTrabalho2());
			prepStmt.setDouble(9, a.getPesoProvas());
			prepStmt.setDouble(10, a.getPesoTrabalhos());

			prepStmt.execute();

			ResultSet generatedKeys = prepStmt.getGeneratedKeys();
			if (generatedKeys.next()) {
				novoId = generatedKeys.getInt(1);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao inserir aluno. Causa: \n:" + e.getCause());
		} finally{
			Banco.closePreparedStatement(prepStmt);
			Banco.closeConnection(conexao);
		}

		return novoId;
	}

	public boolean atualizar(Aluno a){
		boolean sucessoUpdate = false;

		String sql = " UPDATE ALUNO P SET NOME=?, SOBRENOME=?, MATRICULA=?, NIVEL=?, NOTAPROVA1=?, NOTAPROVA2=?, NOTATRABALHO1=?, NOTATRABALHO2=?, PESOPROVAS=?, PESOTRABALHOS=? "
				+ " WHERE P.ID = ? ";

		Connection conexao = Banco.getConnection();
		PreparedStatement prepStmt = Banco.getPreparedStatement(conexao, sql);

		try {
			prepStmt.setString(1, a.getNome());
			prepStmt.setString(2, a.getSobrenome());
			prepStmt.setString(3, a.getMatricula());
			prepStmt.setString(4, a.getNivel());
			prepStmt.setDouble(5, a.getNotaProva1());
			prepStmt.setDouble(6, a.getNotaProva2());
			prepStmt.setDouble(7, a.getNotaTrabalho1());
			prepStmt.setDouble(8, a.getNotaTrabalho2());
			prepStmt.setDouble(9, a.getPesoProvas());
			prepStmt.setDouble(10, a.getPesoTrabalhos());

			int codigoRetorno = prepStmt.executeUpdate();

			if(codigoRetorno == 1){
				sucessoUpdate = true;
			}

		} catch (SQLException e) {
			System.out.println("Erro ao atualizar aluno. Causa: \n:" + e.getCause());
		}finally{
			Banco.closePreparedStatement(prepStmt);
			Banco.closeConnection(conexao);
		}

		return sucessoUpdate;
	}
	
	public boolean remover(int id){
		boolean sucessoDelete = false;

		String sql = " DELETE FROM ALUNO "
				+ " WHERE ID = ? ";

		Connection conexao = Banco.getConnection();
		PreparedStatement prepStmt = Banco.getPreparedStatement(conexao, sql);
		try {
			prepStmt.setInt(1, id);
			int codigoRetorno = prepStmt.executeUpdate();
			if(codigoRetorno == 1){//1 - sucesso na execução
				sucessoDelete = true;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao remover aluno. Causa: \n:" + e.getCause());
		}finally{
			Banco.closePreparedStatement(prepStmt);
			Banco.closeConnection(conexao);
		}
		return sucessoDelete;
	}
	
	public ArrayList<Aluno> listarTodos(){
		String sql = " SELECT * FROM ALUNO ";
		
		Connection conexao = Banco.getConnection();
		PreparedStatement prepStmt = Banco.getPreparedStatement(conexao, sql);
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		
		try {
			ResultSet result = prepStmt.executeQuery();
			
			while(result.next()){
				Aluno aluno = new Aluno();
	
				aluno.setId(result.getInt("ID"));
				aluno.setNome(result.getString("NOME"));
				aluno.setSobrenome(result.getString("SOBRENOME"));
				aluno.setMatricula(result.getString("MATRICULA"));
				aluno.setNivel(result.getString("NIVEL"));
				aluno.setNotaProva1(result.getDouble("NOTAPROVA1"));
				aluno.setNotaProva2(result.getDouble("NOTAPROVA2"));
				aluno.setNotaTrabalho1(result.getDouble("NOTATRABALHO1"));
				aluno.setNotaTrabalho2(result.getDouble("NOTATRABALHO2"));
				aluno.setPesoProvas(result.getDouble("NOTATRABALHO1"));
				aluno.setPesoTrabalhos(result.getDouble("NOTATRABALHO2"));
				
				alunos.add(aluno);
			}
		} catch (SQLException e) {
			System.out.println("Erro listar todos os alunos. Causa: \n:" + e.getCause());
		}
		return alunos;
	}
	/**
	 * Retorna um produto dado um id.
	 * 
	 * @param id o identificador do produto
	 * @return um produto caso o id exista na tabela Produto
	 * 		   null caso contrário
	 */
	public Aluno obterPorId(int id){
		String sql = " SELECT * FROM ALUNO "
				+ " WHERE ID=?";
		
		Connection conexao = Banco.getConnection();
		PreparedStatement prepStmt = Banco.getPreparedStatement(conexao, sql);
		Aluno aluno = null;
		
		try {
			prepStmt.setInt(1, id);
			ResultSet result = prepStmt.executeQuery();
			
			while(result.next()){
				aluno = new Aluno();
				
				aluno.setId(result.getInt("ID"));
				aluno.setNome(result.getString("NOME"));
				aluno.setSobrenome(result.getString("SOBRENOME"));
				aluno.setMatricula(result.getString("MATRICULA"));
				aluno.setNivel(result.getString("NIVEL"));
				aluno.setNotaProva1(result.getDouble("NOTAPROVA1"));
				aluno.setNotaProva2(result.getDouble("NOTAPROVA2"));
				aluno.setNotaTrabalho1(result.getDouble("NOTATRABALHO1"));
				aluno.setNotaTrabalho2(result.getDouble("NOTATRABALHO2"));
				aluno.setPesoProvas(result.getDouble("NOTATRABALHO1"));
				aluno.setPesoTrabalhos(result.getDouble("NOTATRABALHO2"));
				
			}
		} catch (SQLException e) {
			System.out.println("Erro buscar um aluno. Causa: \n:" + e.getCause());
		}
		return aluno;
	}
	
	public boolean verificaPorMatricula(String m)
	{
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		ResultSet resultado = null;
		String query = "select * from aluno where matricula = '" + m + "'";
		
		try {
			resultado = stmt.executeQuery(query);
			if (resultado.next())
				return true;
		} catch (SQLException e) {
			System.out.println("Erro ao executar a Query que verifica existencia de Aluno por matricula");
			return false;
		} finally {
			Banco.closeResultSet(resultado);
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		return false;
	}
}