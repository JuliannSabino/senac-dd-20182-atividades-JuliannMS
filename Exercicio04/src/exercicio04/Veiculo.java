package exercicio04;

public class Veiculo {
	
	private int roda;
	private String combustivel; 
	private double potencia;
	private double tanque;
	private String marca;
	private String modelo;
	private int ano;

	public Veiculo(int roda, String combustivel, double potencia, double tanque, String marca, String modelo, int ano) {
		super();
		this.roda = roda;
		this.combustivel = combustivel;
		this.potencia = potencia;
		this.tanque = tanque;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public Veiculo() {
		
	}	

	public int getRoda() {
		return roda;
	}

	public void setRoda(int roda) {
		this.roda = roda;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public double getTanque() {
		return tanque;
	}

	public void setTanque(double tanque) {
		this.tanque = tanque;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void acelera() {
		System.out.println("Acelerando!");
	}
	
	public void freia() {
		System.out.println("Freiando");
	}
	
	public void abastecer(int litros) {
		if(litros < this.tanque)
			System.out.println("Abastecendo");
		else
			System.out.println("Tanque cheio");
	}
	
	public String printVeiculo() {
		String tmp =  "Numero de rodas: " + this.getRoda()
			+ "\nCombustivel: " + this.getCombustivel()
			+ "\nLitros tanque: " + this.getTanque()
			+ "\nPotencia: " + this.getPotencia()
			+ "\nMarca: " + this.getMarca()
			+ "\nModelo: " + this.getModelo();
		return tmp;
	}

}
