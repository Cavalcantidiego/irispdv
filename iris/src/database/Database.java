package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
	//informação do banco de dados 
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/pdviris";
	private String user = "root";
	private String passoword;
	
	//método("função") para conectar o banco
	public Connection conectar() {
		try {
			Class.forName(driver);
			return DriverManager.getConnection(url, user, passoword); //abre a conexão com o banco
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	//método para testar a conexão (status de conexão) 
	public boolean testarConexão() {
		// a linha a baixo cria o objeto con que é responsável por estabelecer a conexão com o banco 
		Connection con = conectar();
		
		//se não conseguir estabelecer a conexão
		if (con == null) {
			return false;
		}
		
		//se não conseguir fechar a conexão 
		try {
			con.close(); //encerrar a conexão após teste 
			return true;//retorno verdadeiro para Main 
		} catch (Exception e) {
			// se não conseguir fechar a conexão
			System.out.println(e);
			return false;
		}
	}
	

}
