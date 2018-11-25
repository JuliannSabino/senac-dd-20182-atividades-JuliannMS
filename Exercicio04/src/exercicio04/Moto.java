package exercicio04;
 
public class Moto extends Veiculo {
	
	public Moto(int roda, String combustivel, double potencia, double tanque, String marca, String modelo, int ano) {
		super();
		roda = roda;
		combustivel = combustivel;
		potencia = potencia;
		tanque = tanque;
		marca = marca;
		modelo = modelo;
		ano = ano;
	}
	
	public Moto() {
		
	}	
	
	public void empinar() {
		System.out.println("Empinando");
	}

}
