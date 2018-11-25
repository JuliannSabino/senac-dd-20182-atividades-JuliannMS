package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.AlunoController;
import model.vo.Aluno;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JTextField txtMatricula;
	private JTextField txtNp1;
	private JTextField txtNp2;
	private JTextField txtT1;
	private JTextField txtT2;
	private JTextField txtPesoProvas;
	private JTextField txtPesoTrabalhos;
	private JTextField txtResultadoMedia;
	private JTextField txtResultadoSituacao;
	JComboBox cBoxNivel = new JComboBox();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(44, 44, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setBounds(44, 91, 62, 14);
		contentPane.add(lblMatricula);
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setBounds(264, 44, 72, 14);
		contentPane.add(lblSobrenome);
		
		JLabel lblNivel = new JLabel("Nivel:");
		lblNivel.setBounds(264, 91, 38, 14);
		contentPane.add(lblNivel);
		
		JLabel lblNp = new JLabel("NP1:");
		lblNp.setBounds(44, 148, 35, 14);
		contentPane.add(lblNp);
		
		JLabel lblNp_1 = new JLabel("NP2: ");
		lblNp_1.setBounds(150, 148, 35, 14);
		contentPane.add(lblNp_1);
		
		JLabel lblT = new JLabel("T1:");
		lblT.setBounds(264, 148, 26, 14);
		contentPane.add(lblT);
		
		JLabel lblT_1 = new JLabel("T2:");
		lblT_1.setBounds(397, 148, 26, 14);
		contentPane.add(lblT_1);
		
		JLabel lblPesoDasProvas = new JLabel("Peso das Provas:");
		lblPesoDasProvas.setBounds(44, 191, 102, 14);
		contentPane.add(lblPesoDasProvas);
		
		JLabel lblPesoDosTrabalhos = new JLabel("Peso dos Trabalhos:");
		lblPesoDosTrabalhos.setBounds(264, 191, 120, 14);
		contentPane.add(lblPesoDosTrabalhos);
		
		JLabel lblMediaFinal = new JLabel("Media Final:");
		lblMediaFinal.setBounds(44, 254, 68, 14);
		contentPane.add(lblMediaFinal);
		
		JLabel lblSitucao = new JLabel("Situacao:");
		lblSitucao.setBounds(264, 254, 57, 14);
		contentPane.add(lblSitucao);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Notas");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(12, 8, 173, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblModinhasystens = new JLabel("ModinhaSystens");
		lblModinhasystens.setForeground(Color.LIGHT_GRAY);
		lblModinhasystens.setBounds(423, 354, 106, 14);
		contentPane.add(lblModinhasystens);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(SystemColor.activeCaption);
		separator.setBounds(10, 120, 508, 14);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(SystemColor.activeCaption);
		separator_1.setBounds(10, 220, 508, 14);
		contentPane.add(separator_1);
		
		txtNome = new JTextField();
		txtNome.setBounds(89, 41, 150, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setBounds(341, 41, 150, 20);
		contentPane.add(txtSobrenome);
		txtSobrenome.setColumns(10);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(108, 88, 131, 20);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		JComboBox cBoxNivel = new JComboBox();
		cBoxNivel.setModel(new DefaultComboBoxModel(new String[] {"", "Basico", "Intermediario", "Avancado"}));
		cBoxNivel.setBounds(312, 88, 179, 20);
		contentPane.add(cBoxNivel);
		
		txtNp1 = new JTextField();
		txtNp1.setBounds(77, 145, 57, 20);
		contentPane.add(txtNp1);
		txtNp1.setColumns(10);
		
		txtNp2 = new JTextField();
		txtNp2.setBounds(182, 145, 57, 20);
		contentPane.add(txtNp2);
		txtNp2.setColumns(10);
		
		txtT1 = new JTextField();
		txtT1.setBounds(294, 145, 68, 20);
		contentPane.add(txtT1);
		txtT1.setColumns(10);
		
		txtT2 = new JTextField();
		txtT2.setBounds(423, 145, 68, 20);
		contentPane.add(txtT2);
		txtT2.setColumns(10);
		
		txtPesoProvas = new JTextField();
		txtPesoProvas.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				double aux;
				try {
					aux = 100 - Double.parseDouble(txtPesoProvas.getText()); 
				}catch(Exception e) {
					aux = 0;
				}
				txtPesoTrabalhos.setText(aux + "");
			}
		});
		txtPesoProvas.setBounds(150, 188, 89, 20);
		contentPane.add(txtPesoProvas);
		txtPesoProvas.setColumns(10);
		
		txtPesoTrabalhos = new JTextField();
		txtPesoTrabalhos.setBounds(389, 188, 102, 20);
		contentPane.add(txtPesoTrabalhos);
		txtPesoTrabalhos.setColumns(10);
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.setBackground(SystemColor.activeCaption);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AlunoController	controllerAluno = new AlunoController();
				boolean validacaoErro = false;
				Aluno novoAluno = new Aluno();
				
				try {
					novoAluno.setNome(txtNome.getText());
					novoAluno.setSobrenome(txtSobrenome.getText());
					novoAluno.setMatricula(txtMatricula.getText());
					novoAluno.setNivel((String)cBoxNivel.getSelectedItem());
					novoAluno.setNotaProva1(Double.parseDouble(txtNp1.getText()));
					novoAluno.setNotaProva2(Double.parseDouble(txtNp2.getText()));
					novoAluno.setNotaTrabalho1(Double.parseDouble(txtT1.getText()));
					novoAluno.setNotaTrabalho2(Double.parseDouble(txtT2.getText()));
					novoAluno.setPesoProvas(Double.parseDouble(txtPesoProvas.getText()));
					novoAluno.setPesoTrabalhos(Double.parseDouble(txtPesoTrabalhos.getText()));
				}catch(Exception e){
					validacaoErro = true;
				}	
				
				if (novoAluno.getNome().equals("")) {
					validacaoErro = true;
				}
				else if(novoAluno.getSobrenome().equals("")) {
					validacaoErro = true;
				}
				else if(novoAluno.getNotaProva1() < 0) {
					validacaoErro = true;
				}
				else if(novoAluno.getNotaProva2() < 0) {
					validacaoErro = true;
				}
				else if(novoAluno.getNotaTrabalho1() < 0) {
					validacaoErro = true;
				}
				else if(novoAluno.getNotaTrabalho2() < 0) {
					validacaoErro = true;
				}
				else if(novoAluno.getPesoProvas() < 0 || novoAluno.getPesoProvas() > 99) {
					validacaoErro = true;
				}
				
				if (!validacaoErro)
				{
					if (controllerAluno.verificaPorMatricula(novoAluno.getMatricula())) {
						JOptionPane.showMessageDialog(null, "Matricula Existente!!!", "ERROR", JOptionPane.ERROR_MESSAGE);
						limpartela();
					}
					else
					{
						if(controllerAluno.cadastrarAlunoController(novoAluno) > 0)
						{
							txtResultadoMedia.setText(controllerAluno.calcularMediaFinal(novoAluno) + "");
							int situacao = controllerAluno.calcularSituacao(novoAluno);
							switch(situacao) {
								case 1: 
									txtResultadoSituacao.setText("Aprovado");
									txtResultadoSituacao.setForeground(Color.GREEN);
									break;
								case 2:
									txtResultadoSituacao.setText("Recuperacao");
									txtResultadoSituacao.setForeground(Color.YELLOW);
									break;
								case 3:
									txtResultadoSituacao.setText("Reprovado");
									txtResultadoSituacao.setForeground(Color.RED);
									break;
								default:
									break;
										
							}
						}
						else
							JOptionPane.showMessageDialog(null, "ERRO AO GRAVAR O ALUNO", "ERROR", JOptionPane.ERROR_MESSAGE);
					}
				}
				else
				{
					validacaoErro = false;
					JOptionPane.showMessageDialog(null, "FAVOR PREENCHER TODOS OS CAMPOS", "ERROR", JOptionPane.ERROR_MESSAGE);
					limpartela();
				}
			} 
		});
		
		btnSalvar.setBounds(77, 298, 120, 45);
		contentPane.add(btnSalvar);
		
		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.setBackground(SystemColor.activeCaption);
			btnLimpar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					limpartela();
				}
		});
		btnLimpar.setBounds(333, 298, 131, 45);
		contentPane.add(btnLimpar);
		
		txtResultadoMedia = new JTextField();
		txtResultadoMedia.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtResultadoMedia.setEditable(false);
		txtResultadoMedia.setBounds(123, 251, 74, 36);
		contentPane.add(txtResultadoMedia);
		txtResultadoMedia.setColumns(10);
		
		txtResultadoSituacao = new JTextField();
		txtResultadoSituacao.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtResultadoSituacao.setEditable(false);
		txtResultadoSituacao.setBounds(333, 251, 131, 36);
		contentPane.add(txtResultadoSituacao);
		txtResultadoSituacao.setColumns(10);
	}
	
	public void limpartela() {
		txtNome.setText("");
		txtSobrenome.setText("");
		txtMatricula.setText("");
		cBoxNivel.setSelectedItem("");
		txtNp1.setText("");
		txtNp2.setText("");
		txtT1.setText("");
		txtT2.setText("");
		txtPesoProvas.setText("");
		txtPesoTrabalhos.setText("");
		txtResultadoMedia.setText("");
		txtResultadoSituacao.setText("");
	}	
}
