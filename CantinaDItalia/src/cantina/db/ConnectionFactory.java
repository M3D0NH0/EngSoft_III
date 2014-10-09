package cantina.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author HSG, M3D0NH0
 *
 */
public class ConnectionFactory {
	public final static String BANCO = "cantinaditalia";
	public final static String USER = "root";
	public final static String SENHA = "";

	public static Connection getConexaoPostgres()
			throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost/" + BANCO;
		Connection conexao = DriverManager.getConnection(url, USER, SENHA);
		return (conexao);
	}
	
	

}
