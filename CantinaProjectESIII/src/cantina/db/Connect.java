package cantina.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 
 * @author HSG
 *
 */
public class Connect {
	private Connection conexao = null;
	protected PreparedStatement comando = null;

	public void iniciaConexao(String sql) throws ClassNotFoundException,
			SQLException {
		conexao = ConnectionFactory.getConexaoPostgres();
		comando = conexao.prepareStatement(sql);
	}

	public void fecharConexao() throws SQLException {
		comando.close();
		conexao.close();
	}
}