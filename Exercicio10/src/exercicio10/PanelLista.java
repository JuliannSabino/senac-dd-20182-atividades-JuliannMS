package exercicio10;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;

public class PanelLista extends JPanel {
	private JTextField txtListar;

	/**
	 * Create the panel.
	 */
	public PanelLista() {
		setLayout(null);
		
		txtListar = new JTextField();
		txtListar.setFont(new Font("Tahoma", Font.PLAIN, 50));
		txtListar.setText("LISTAR");
		txtListar.setBounds(94, 63, 281, 156);
		add(txtListar);
		txtListar.setColumns(10);

	}
}
