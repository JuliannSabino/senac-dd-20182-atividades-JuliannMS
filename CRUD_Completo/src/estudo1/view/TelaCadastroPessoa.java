package estudo1.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import estudo1.model.vo.PessoaVo;
import estudo1.controller.PessoaController;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TelaCadastroPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNomePessoa;
	private JTextField textFieldCpfPessoa;
	private JTextField textFieldTelefonePessoa;
	private JTextField textFieldSalarioPessoa;
	private JTextField textFieldIdPessoa;
	JComboBox<?> comboBoxSexoPessoa = new JComboBox();
	private JTable tableBuscarPessoa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroPessoa frame = new TelaCadastroPessoa();
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
	public TelaCadastroPessoa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 745, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDePessoa = new JLabel("CADASTRO DE PESSOA");
		lblCadastroDePessoa.setBounds(78, 11, 145, 14);
		contentPane.add(lblCadastroDePessoa);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(37, 46, 31, 14);
		contentPane.add(lblId);
		
		JLabel lblNome = new JLabel("NOME");
		lblNome.setBounds(78, 46, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(37, 92, 46, 14);
		contentPane.add(lblCpf);
		
		JLabel lblTelefone = new JLabel("TELEFONE");
		lblTelefone.setBounds(37, 137, 62, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblSexo = new JLabel("SEXO");
		lblSexo.setBounds(169, 137, 46, 14);
		contentPane.add(lblSexo);
		
		JLabel lblSalario = new JLabel("SALARIO");
		lblSalario.setBounds(37, 182, 62, 14);
		contentPane.add(lblSalario);
		
		textFieldIdPessoa = new JTextField();
		textFieldIdPessoa.setBounds(37, 61, 31, 20);
		contentPane.add(textFieldIdPessoa);
		textFieldIdPessoa.setColumns(10);
		
		textFieldNomePessoa = new JTextField();
		textFieldNomePessoa.setBounds(78, 61, 180, 20);
		contentPane.add(textFieldNomePessoa);
		textFieldNomePessoa.setColumns(10);
		
		textFieldCpfPessoa = new JTextField();
		textFieldCpfPessoa.setBounds(37, 106, 221, 20);
		contentPane.add(textFieldCpfPessoa);
		textFieldCpfPessoa.setColumns(10);
		
		textFieldTelefonePessoa = new JTextField();
		textFieldTelefonePessoa.setBounds(37, 151, 119, 20);
		contentPane.add(textFieldTelefonePessoa);
		textFieldTelefonePessoa.setColumns(10);
		
		textFieldSalarioPessoa = new JTextField();
		textFieldSalarioPessoa.setBounds(37, 196, 119, 20);
		contentPane.add(textFieldSalarioPessoa);
		textFieldSalarioPessoa.setColumns(10);
	
		
		comboBoxSexoPessoa.setModel(new DefaultComboBoxModel(new String[] {"", "M", "F"}));
		comboBoxSexoPessoa.setBounds(169, 151, 89, 20);
		contentPane.add(comboBoxSexoPessoa);
	
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
	
				PessoaVo novaPessoa = new PessoaVo();
	

				novaPessoa.setNome(textFieldNomePessoa.getText());
				novaPessoa.setCpf(textFieldCpfPessoa.getText());
				novaPessoa.setTelefone(Integer.parseInt(textFieldTelefonePessoa.getText()));
				novaPessoa.setSexo((String) comboBoxSexoPessoa.getSelectedItem());
				novaPessoa.setSalario(Double.parseDouble(textFieldSalarioPessoa.getText()));

				PessoaController controlador = new PessoaController();
				controlador.cadastrarPessoaController(novaPessoa);
				limparTela();
			}

			

		});
		btnSalvar.setBounds(169, 238, 89, 23);
		contentPane.add(btnSalvar);
		
		JButton btnExcluir = new JButton("EXCLUIR");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				PessoaVo novaPessoa = new PessoaVo();
				
				novaPessoa.setIdPessoa(Integer.parseInt(textFieldIdPessoa.getText()));
				PessoaController controlador = new PessoaController();
				controlador.excluirPessoaController(novaPessoa);
				
				limparTela();
				
				
			}

			
		});
		
		
		btnExcluir.setBounds(169, 272, 89, 23);
		contentPane.add(btnExcluir);
		
		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				limparTela();
				
			}
		});
		
			
		
		btnLimpar.setBounds(37, 238, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PessoaVo novaPessoa = new PessoaVo();
				
				novaPessoa.setIdPessoa(Integer.parseInt(textFieldIdPessoa.getText()));
				PessoaController controlador = new PessoaController();
				novaPessoa = controlador.consultarPessoaController(novaPessoa);
				
				textFieldIdPessoa.setText(novaPessoa.getIdPessoa()+"");
				textFieldNomePessoa.setText(novaPessoa.getNome());
				textFieldCpfPessoa.setText(novaPessoa.getCpf());
				textFieldTelefonePessoa.setText(novaPessoa.getTelefone()+"");
				comboBoxSexoPessoa.setSelectedItem(novaPessoa.getSexo());
				textFieldSalarioPessoa.setText(novaPessoa.getSalario()+"");
				textFieldNomePessoa.setEditable(false);
			}
		});
		btnBuscar.setBounds(37, 272, 89, 23);
		contentPane.add(btnBuscar);
		
		tableBuscarPessoa = new JTable();
		tableBuscarPessoa.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Nome", "Cpf", "Telefone", "Sexo", "Salario"
			}
		));
		tableBuscarPessoa.setBounds(268, 64, 440, 246);
		contentPane.add(tableBuscarPessoa);
		
		JButton btnBuscarTodos = new JButton("BUSCAR TODOS");
		btnBuscarTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<PessoaVo> todaspessoas = new ArrayList<PessoaVo>();
				
				PessoaController controlador = new PessoaController();
				
				todaspessoas = controlador.consultarTodasPessoasController();
				atualizarTabelaPessoas(todaspessoas);
				
				
			}
		});
		btnBuscarTodos.setBounds(416, 32, 145, 20);
		contentPane.add(btnBuscarTodos);
		
		
	}
	
	private void limparTela() {

		textFieldIdPessoa.setText("");
		textFieldNomePessoa.setText("");
		textFieldCpfPessoa.setText("");
		textFieldTelefonePessoa.setText("");
		comboBoxSexoPessoa.setSelectedItem("");
		textFieldSalarioPessoa.setText("");

	}
	
	protected void atualizarTabelaPessoas(ArrayList<PessoaVo> pessoasvo) {

		tableBuscarPessoa.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Id", "Nome", "Cpf", "Telefone", "Sexo", "Salario"
				}
			));
		DefaultTableModel modelo = (DefaultTableModel) tableBuscarPessoa.getModel();
		
		for(PessoaVo pessoa: pessoasvo)
		{
			Object[] novaLinha = new Object[] {
					pessoa.getIdPessoa(),
					pessoa.getNome(),
					pessoa.getCpf(),
					pessoa.getTelefone(),
					pessoa.getSexo(),
					pessoa.getSalario()
			};
			modelo.addRow(novaLinha);
		}
	}
}
