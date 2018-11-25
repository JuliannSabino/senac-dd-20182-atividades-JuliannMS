package estudo1.model.vo;

public class PessoaVo {
	
	private int idPessoa;
	private String nome;
	private String cpf;
	private int telefone;
	private String sexo;
	private double salario;
	
	public PessoaVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PessoaVo(String nome, String cpf, int telefone, String sexo, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.sexo = sexo;
		this.salario = salario;
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}


