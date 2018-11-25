package exercicio04;

public class Carroceria {
	
	private double tamanho;
	private boolean status;
	
	public Carroceria(double tamanho, boolean status) {
		super();
		this.tamanho = tamanho;
		this.status = status;
	}
	
	public Carroceria() {
		
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void statusCarroceria() {
		if(this.status == true) {
			System.out.println("Carroceria cheia");
		} else {
			System.out.println("Carroceria vazia");
		}
	}
	
	
	

}
