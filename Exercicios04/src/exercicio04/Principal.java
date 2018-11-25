package exercicio04;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	
	public static Veiculo cadastrarCarro(){
		
		Carro carro = new Carro();
		
		carro.setRoda(Integer.parseInt(JOptionPane.showInputDialog("Digite quantas rodas tem o seu carro: ")));
		carro.setCombustivel(JOptionPane.showInputDialog("Digite o combustivel"));
		carro.setPotencia(Double.parseDouble(JOptionPane.showInputDialog("Digite potencia do carro")));
		carro.setTanque(Double.parseDouble(JOptionPane.showInputDialog("Digite quantos litros tem o tanque")));
		carro.setMarca(JOptionPane.showInputDialog("Digite a marca do carro"));
		carro.setModelo(JOptionPane.showInputDialog("Digite o modelo do carro"));
		carro.setPortamala(Double.parseDouble(JOptionPane.showInputDialog("Digite quantos litros tem o porta mala")));
		
		return carro;		
	}

	public static void main(String[] args) {
		
		ArrayList<Veiculo> veiculos = new ArrayList<>();
		
		JOptionPane.showMessageDialog(null, "Bem vindo ao meu programa");
		
		String menu = "MENU\n";
        menu = menu + "1 – Cadastrar Carro\n";
        menu = menu + "2 – Cadastrar Caminhao\n";
        menu = menu + "3 – Cadastrar Moto\n";
        menu = menu + "9 – SAIR";
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        
        if(opcao == 1) {
        	veiculos.add(cadastrarCarro());
        }
       
		
		
		
				
		
		
		
		

	}

}
