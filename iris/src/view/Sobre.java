package view;

import java.awt.EventQueue;
import java.net.URI;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Sobre extends JDialog {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setModal(true);
		setTitle("Sobre");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblJaPDV = new JLabel("JA-PDV");
		lblJaPDV.setBounds(10, 11, 106, 28);
		getContentPane().add(lblJaPDV);
		
		JLabel lblSistema = new JLabel("Sistema para gestão de estoque PDV");
		lblSistema.setBounds(10, 50, 232, 14);
		getContentPane().add(lblSistema);
		
		JLabel lblAutor = new JLabel("Autor Diego Fernandes Cavalcanti");
		lblAutor.setBounds(10, 75, 232, 14);
		getContentPane().add(lblAutor);
		
		JLabel lblVersao = new JLabel("Versão: 1.0");
		lblVersao.setBounds(10, 104, 106, 14);
		getContentPane().add(lblVersao);
		
		JLabel lblLicenca = new JLabel("New label");
		lblLicenca.setIcon(new ImageIcon(Sobre.class.getResource("/img/mit.png")));
		lblLicenca.setBounds(321, 39, 64, 64);
		getContentPane().add(lblLicenca);
		
		JLabel lblLogogit = new JLabel("New label");
		lblLogogit.setIcon(new ImageIcon(Sobre.class.getResource("/img/github.png")));
		lblLogogit.setBounds(10, 209, 32, 32);
		getContentPane().add(lblLogogit);
		
		JLabel lblgitlink = new JLabel("github.com/Cavalcantidiego");
		lblgitlink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link ("https://github.com/Cavalcantidiego");
			}
		});
		lblgitlink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblgitlink.setForeground(new Color(0, 0, 255));
		lblgitlink.setBounds(52, 218, 168, 14);
		getContentPane().add(lblgitlink);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//fechar apenas o sobre
				dispose();
			}
		});
		btnOk.setBounds(311, 218, 89, 23);
		getContentPane().add(btnOk);

	}// fim do construtor

	//funcção (método) para abrir um link no navegador 
	private void link(String url) {
		//A linha abaixo obtem o desktop do cliente
		Desktop desktop = Desktop.getDesktop();
		//uso do try catch(tratamento de execões)
		try {
			// objeto uri para acessar os métodos necessarios para estabelecer uma conexão com a url (link)
			URI uri = new URI (url);
			// abrir o link no navegador padrão do cliente 
			desktop.browse(uri);
		} catch (Exception e) {
			System.out.print(e);
		}
	}
}
