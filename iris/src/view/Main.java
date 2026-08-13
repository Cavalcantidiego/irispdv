package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

// import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import javax.swing.UIManager; // Importação necessária para redimensionar na própria linha

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lbldata;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		// Uso da biblioteca flatlaf (swing moderno)
		// FlatLightLaf.setup();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setResizable(false);
		setTitle("Iris PDV");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(new Color(245, 246, 248));
		contentPane.setLayout(null);
		
		JPanel panel_fundobtn = new JPanel();
		panel_fundobtn.setBounds(0, 0, 228, 527);
		panel_fundobtn.setBackground(new Color(43, 50, 60));
		contentPane.add(panel_fundobtn);
		panel_fundobtn.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(10, 11, 64, 64);
		panel_fundobtn.add(lblLogo);
		// Redimensionamento direto na linha (64x64)
		lblLogo.setIcon(new ImageIcon(new ImageIcon(Main.class.getResource("/img/logo_iris.png")).getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH)));
		
		JLabel lbliris = new JLabel("Iris");
		lbliris.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbliris.setForeground(new Color(255, 255, 255));
		lbliris.setBounds(90, 26, 77, 23);
		panel_fundobtn.add(lbliris);
		
		JLabel lblsistemaDePDV = new JLabel("Sistema de PDV");
		lblsistemaDePDV.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblsistemaDePDV.setForeground(new Color(150, 160, 175));
		lblsistemaDePDV.setBounds(73, 61, 91, 14);
		panel_fundobtn.add(lblsistemaDePDV);
		
		JButton btnfornecedores = new JButton("Fornecedores");
		btnfornecedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmFornecedor fornecedor = new frmFornecedor();
				fornecedor.setVisible(true);
			}
		});
		btnfornecedores.setForeground(new Color(220, 220, 225));
		btnfornecedores.setBackground(new Color(43, 50, 60));
		btnfornecedores.setIconTextGap(12);
		btnfornecedores.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnfornecedores.setHorizontalAlignment(SwingConstants.LEFT);
		// Redimensionamento direto na linha (64x64)
		btnfornecedores.setIcon(new ImageIcon(new ImageIcon(Main.class.getResource("/img/fornecedores.png")).getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH)));
		btnfornecedores.setBounds(10, 86, 208, 54);
		btnfornecedores.setFocusPainted(false); 
		btnfornecedores.setBorderPainted(false); 
		btnfornecedores.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		panel_fundobtn.add(btnfornecedores);
		
		JButton btnprodutos = new JButton("Produtos");
		btnprodutos.setIconTextGap(12);
		// Redimensionamento direto na linha (64x64)
		btnprodutos.setIcon(new ImageIcon(new ImageIcon(Main.class.getResource("/img/produtos.png")).getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH)));
		btnprodutos.setHorizontalAlignment(SwingConstants.LEFT);
		btnprodutos.setForeground(Color.WHITE);
		btnprodutos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnprodutos.setBackground(new Color(43, 50, 60));
		btnprodutos.setBounds(10, 151, 177, 54);
		btnprodutos.setFocusPainted(false);
		btnprodutos.setBorderPainted(false);
		btnprodutos.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panel_fundobtn.add(btnprodutos);
		
		JButton btnPDV = new JButton("PDV");
		btnPDV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPDV.setIconTextGap(12);
		// Redimensionamento direto na linha (64x64)
		btnPDV.setIcon(new ImageIcon(new ImageIcon(Main.class.getResource("/img/pdv.png")).getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH)));
		btnPDV.setHorizontalAlignment(SwingConstants.LEFT);
		btnPDV.setForeground(Color.WHITE);
		btnPDV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPDV.setBackground(new Color(43, 50, 60));
		btnPDV.setBounds(10, 216, 177, 54);
		btnPDV.setFocusPainted(false);
		btnPDV.setBorderPainted(false);
		btnPDV.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panel_fundobtn.add(btnPDV);
		
		JButton btnVendas = new JButton("Vendas");
		btnVendas.setIconTextGap(12);
		// Redimensionamento direto na linha (64x64)
		btnVendas.setIcon(new ImageIcon(new ImageIcon(Main.class.getResource("/img/vendas.png")).getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH)));
		btnVendas.setHorizontalAlignment(SwingConstants.LEFT);
		btnVendas.setForeground(Color.WHITE);
		btnVendas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVendas.setBackground(new Color(43, 50, 60));
		btnVendas.setBounds(10, 281, 177, 54);
		btnVendas.setFocusPainted(false);
		btnVendas.setBorderPainted(false);
		btnVendas.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panel_fundobtn.add(btnVendas);
		
		JLabel lblNewLabel_2 = new JLabel("------------------------");
		lblNewLabel_2.setForeground(new Color(150, 160, 175));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(13, 420, 177, 14);
		panel_fundobtn.add(lblNewLabel_2);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			// Quando clicar no botão 
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair do sistema?" , "Confirmar saída", JOptionPane.YES_NO_OPTION);
				// apoio ao entendimento da lógica
				System.out.print(resposta); 
				if (resposta == 0) {
					System.exit(0); //encerra o sistema 
				}
			}
		});
		btnSair.setIconTextGap(12);
		// Redimensionamento direto na linha (64x64)
		btnSair.setIcon(new ImageIcon(new ImageIcon(Main.class.getResource("/img/sair.png")).getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH)));
		btnSair.setHorizontalAlignment(SwingConstants.LEFT);
		btnSair.setForeground(Color.WHITE);
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSair.setBackground(new Color(43, 50, 60));
		btnSair.setBounds(10, 356, 177, 54);
		btnSair.setFocusPainted(false);
		btnSair.setBorderPainted(false);
		btnSair.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panel_fundobtn.add(btnSair);
		
		JButton btnSobre = new JButton("Sobre");
		btnSobre.setSelectedIcon(new ImageIcon(Main.class.getResource("/img/information.png")));
		btnSobre.addActionListener(new ActionListener() {
			// Ativar a tela sobre
			public void actionPerformed(ActionEvent e) {
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
			}
		});
		btnSobre.setBounds(30, 445, 137, 54);
		panel_fundobtn.add(btnSobre);
		btnSobre.setIconTextGap(12);
		// Redimensionamento direto na linha (64x64)
		btnSobre.setIcon(new ImageIcon(Main.class.getResource("/img/information.png")));
		btnSobre.setHorizontalAlignment(SwingConstants.LEFT);
		btnSobre.setForeground(Color.WHITE);
		btnSobre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSobre.setBackground(new Color(43, 50, 60));
		btnSobre.setFocusPainted(false);
		btnSobre.setBorderPainted(false);
		btnSobre.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblLogo_1 = new JLabel("");
		lblLogo_1.setBounds(216, 11, 64, 64);
		panel_fundobtn.add(lblLogo_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(238, 45, 170, 112);
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(43, 50, 60));
		contentPane.add(panel_1);
		
		JLabel lblProdutosdash = new JLabel("Produtos");
		lblProdutosdash.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblProdutosdash.setForeground(new Color(255, 255, 255));
		lblProdutosdash.setIcon(new ImageIcon(Main.class.getResource("/img/produtosdash.png")));
		lblProdutosdash.setBounds(10, 11, 150, 53);
		panel_1.add(lblProdutosdash);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(604, 45, 170, 112);
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(43, 50, 60));
		contentPane.add(panel_3);
		
		JLabel lblsemestoque = new JLabel("Sem estoque");
		lblsemestoque.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblsemestoque.setIcon(new ImageIcon(Main.class.getResource("/img/semestoque.png")));
		lblsemestoque.setForeground(new Color(255, 255, 255));
		lblsemestoque.setBounds(0, 0, 180, 75);
		panel_3.add(lblsemestoque);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(418, 45, 176, 112);
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(43, 50, 60));
		contentPane.add(panel_2);
		
		JLabel lblLogo_1_2 = new JLabel("");
		lblLogo_1_2.setBounds(10, 11, 64, 64);
		panel_2.add(lblLogo_1_2);
		
		JLabel lblEstoqueAlert = new JLabel("Estoque baixo");
		lblEstoqueAlert.setForeground(new Color(255, 255, 255));
		lblEstoqueAlert.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEstoqueAlert.setIcon(new ImageIcon(Main.class.getResource("/img/alerTa.png")));
		lblEstoqueAlert.setBounds(0, 11, 186, 53);
		panel_2.add(lblEstoqueAlert);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(238, 168, 170, 112);
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(43, 50, 60));
		contentPane.add(panel_4);
		
		JLabel lblNewLabel = new JLabel("Vendas hoje");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/img/bag.png")));
		lblNewLabel.setBounds(0, 0, 170, 64);
		panel_4.add(lblNewLabel);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(418, 168, 176, 112);
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(43, 50, 60));
		contentPane.add(panel_5);
		
		JLabel lblLogo_1_3_1 = new JLabel("");
		lblLogo_1_3_1.setBounds(10, 11, 64, 64);
		panel_5.add(lblLogo_1_3_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(10, 11, 52, 46);
		panel_5.add(lblNewLabel_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(604, 168, 170, 112);
		panel_6.setLayout(null);
		panel_6.setBackground(new Color(43, 50, 60));
		contentPane.add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(238, 306, 536, 209);
		panel_7.setLayout(null);
		panel_7.setBackground(new Color(43, 50, 60));
		contentPane.add(panel_7);
		
		JLabel lblLogo_1_3_2 = new JLabel("");
		lblLogo_1_3_2.setBounds(10, 11, 64, 64);
		panel_7.add(lblLogo_1_3_2);
		
		JPanel panel_rodape = new JPanel();
		panel_rodape.setBackground(Color.LIGHT_GRAY);
		panel_rodape.setForeground(Color.WHITE);
		panel_rodape.setBounds(0, 526, 784, 35);
		contentPane.add(panel_rodape);
		panel_rodape.setLayout(null);
		
		JLabel lblBancoDeDados = new JLabel(" ");
		lblBancoDeDados.setBounds(10, 0, 39, 35);
		lblBancoDeDados.setIcon(new ImageIcon(Main.class.getResource("/img/servidor.png")));
		panel_rodape.add(lblBancoDeDados);
		
		JLabel lblpornto = new JLabel("●");
		lblpornto.setForeground(new Color(255, 0, 0));
		lblpornto.setBounds(176, 10, 27, 14);
		panel_rodape.add(lblpornto);
		
		JLabel lblMySQL = new JLabel("Mysql Desconectado");
		lblMySQL.setBounds(44, 10, 145, 14);
		panel_rodape.add(lblMySQL);
		
		JPanel panel_cabecalho = new JPanel();
		panel_cabecalho.setBounds(227, -1, 557, 35);
		contentPane.add(panel_cabecalho);
		panel_cabecalho.setForeground(Color.WHITE);
		panel_cabecalho.setBackground(Color.LIGHT_GRAY);
		panel_cabecalho.setLayout(null);
		
		lbldata = new JLabel("");
		lbldata.setBounds(471, 0, 65, 30);
		panel_cabecalho.add(lbldata);
		
		JLabel lblcalendario = new JLabel("New label");
		lblcalendario.setIcon(new ImageIcon(Main.class.getResource("/img/calendario (1).png")));
		lblcalendario.setBounds(424, 1, 37, 40);
		panel_cabecalho.add(lblcalendario);
		
		JLabel lblDashboard = new JLabel("Dashboard");
		lblDashboard.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDashboard.setBounds(70, 8, 181, 22);
		panel_cabecalho.add(lblDashboard);
		
		JLabel lblvelocimetro = new JLabel("New label");
		lblvelocimetro.setIcon(new ImageIcon(Main.class.getResource("/img/velocimentro.png")));
		lblvelocimetro.setBounds(24, 8, 37, 22);
		panel_cabecalho.add(lblvelocimetro);

		setLocationRelativeTo(null);
		
		//atualizar data
		atualizarData();
		
	} //fim do construtor 
	
	
	//Função (Método) para atualizar data do sistema 
	private void atualizarData() {
		//Obtem a data do sistema operacional
		LocalDate hoje = LocalDate.now();
		// Formatar data dia/mes/ano(4 digitos)
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// Alterar o texto de lblData
		lbldata.setText(hoje.format(formato));
	}
} // fim da clase principal (classe Main)