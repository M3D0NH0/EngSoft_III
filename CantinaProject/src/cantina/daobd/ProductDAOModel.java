package cantina.daobd;

import java.sql.SQLException;

import cantina.dao.ProductDAO;

/**
 * @author Gelatti , M3D0NH0
 */

public class ProductDAOModel extends Connect implements ProductDAO {

	private boolean estado;

	@Override
	public boolean insert(String nome, String tipo)
			throws ClassNotFoundException, SQLException {
		Product p = new Product();
		p.setName(nome);
		p.setType(tipo);
		estado = false;
		iniciaConexao("INSERT INTO produto(nome,tipo) VALUES (?,?)");
		comando.setString(1, p.getName());
		comando.setString(2, p.getType());
		comando.executeUpdate();
		if (p.getType() != null && p.getName() != null) {
			estado = true;
			System.out.println("inserido no banco.");
		}
		fecharConexao();
		return estado;
	}

}
