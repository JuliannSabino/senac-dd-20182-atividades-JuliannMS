package exercicio10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	
	TelaCadastroPessoa menuCadastroPessoa = new TelaCadastroPessoa();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaPrincipal.class.getResource("/exercicio10/icones/icons8-letras-mi\u00FAdas-48.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 50);
		contentPane.add(menuBar);
		
		JMenu mnPessoa = new JMenu("Pessoa");
		mnPessoa.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/exercicio10/icones/icons8-usu\u00E1rio-48.png")));
		menuBar.add(mnPessoa);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 48, 434, 213);
		contentPane.add(desktopPane);
		
		JMenuItem mntmCadastro = new JMenuItem("Cadastrar");
		mntmCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				desktopPane.add(menuCadastroPessoa);
				desktopPane.getDesktopManager().maximizeFrame(menuCadastroPessoa);
				
				//Arrumar Logica
				if(!menuCadastroPessoa.isVisible()){
					menuCadastroPessoa.setVisible(true);
			
				}
				
				
			}
		});
		mntmCadastro.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/exercicio10/icones/icons8-adicionar-usu\u00E1rio-masculino-48.png")));
		mnPessoa.add(mntmCadastro);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Listar");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Arrumar Listar com Jpane
				contentPane = new PanelLista();
				setContentPane (contentPane);
				revalidate();
						
			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/exercicio10/icones/icons8-menu-de-usu\u00E1rio-masculino-48.png")));
		mnPessoa.add(mntmNewMenuItem);
		
		JMenu mnProduto = new JMenu("Produto");
		mnProduto.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/exercicio10/icones/icons8-caminh\u00E3o-48.png")));
		menuBar.add(mnProduto);
		
		JMenuItem mntmCadastrar = new JMenuItem("Cadastrar");
		mntmCadastrar.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/exercicio10/icones/icons8-adicionar-propriedade-48.png")));
		mnProduto.add(mntmCadastrar);
		
		JMenuItem mntmListar = new JMenuItem("Listar");
		mntmListar.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/exercicio10/icones/icons8-letras-mi\u00FAdas-48.png")));
		mnProduto.add(mntmListar);
		
		JMenu mnSobre = new JMenu("Sobre");
		mnSobre.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/exercicio10/icones/icons8-gavi\u00E3o-arqueiro-48.png")));
		menuBar.add(mnSobre);
		
		
	}
}
