package exercicio04;

import javax.swing.JOptionPane;

public class Carro extends Veiculo {
	
	private double portamala;
	private int id;
	private static int idCarro = 0;

	public Carro(int roda, String combustivel, double potencia, double tanque, String marca, String modelo, int ano,
			double portamala) {
		super(roda, combustivel, potencia, tanque, marca, modelo, ano);
		this.portamala = portamala;
		idCarro++;
		setIdCarro(idCarro);
		
	}
	
	public Carro( ) {
		
	}

	public double getPortamala() {
		return portamala;
	}

	public void setPortamala(double portamala) {
		this.portamala = portamala;
	}
	
	public void passear() {
		System.out.println("Passeando");
	}
	
	public void setIdCarro(int idCarro) {
		this.id = idCarro;
	}
	
	public void printCarro() {
		JOptionPane.showMessageDialog(null, this.printVeiculo() + "\nPorta mala: " + this.portamala);
	}
	
	

}
