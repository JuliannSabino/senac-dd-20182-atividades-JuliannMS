package exercicio04;

public class Caminhao extends Veiculo {
	
	private int eixos;	
	private Carroceria carroceria;

	public Caminhao(int roda, String combustivel, double potencia, double tanque, String marca, String modelo, int ano,
			int eixos, Carroceria carroceria) {
		super(roda, combustivel, potencia, tanque, marca, modelo, ano);
		this.eixos = eixos;
		this.carroceria = carroceria;
	}
	
	public Caminhao() {
		
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}	

	public Carroceria getCarroceria() {
		return carroceria;
	}

	public void setCarroceria(Carroceria carroceria) {
		this.carroceria = carroceria;
	}
	
	public void carregar() {
		System.out.println("Carregando");
		this.carroceria.setStatus(true);
	}
	
	public void descarregar(){
		System.out.println("Descarregando");
		this.carroceria.setStatus(false);
	}

}
