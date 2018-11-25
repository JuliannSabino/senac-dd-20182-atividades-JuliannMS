package estudo1.model.vo;

public class Carro {
	
	private int idcarro;
	private String modelo;
	private String marca;
	private String cor;
	private String placa;
	private double valor;
	private int ano;
	
	public Carro() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Carro(int idcarro, String modelo, String marca, String cor, String placa, double valor, int ano) {
		super();
		this.idcarro = idcarro;
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
		this.placa = placa;
		this.valor = valor;
		this.ano = ano;
	}

	public int getIdcarro() {
		return idcarro;
	}

	public void setIdcarro(int idcarro) {
		this.idcarro = idcarro;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
}


