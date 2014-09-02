package cantina.daobd;

import java.sql.SQLException;

import cantina.dao.ProductDAO;


/**
 * @author Gelatti , M3D0NH0
 */

public class ProductDAOModel extends Connect implements ProductDAO {

	private boolean estado;

	@Override
	public boolean insert(String nome, String tipo,double price,int quantidade)
			throws ClassNotFoundException, SQLException {
		Product p = new Product();
		p.setName(nome);
		p.setType(tipo);
		p.setPrice(price);
		p.setQtd(quantidade);
		estado = false;
		iniciaConexao("INSERT INTO produto(nome,tipo,preco,quantidade) VALUES (?,?,?,?)");
		comando.setString(1, p.getName());
		comando.setString(2, p.getType());
		comando.setDouble(3, p.getPrice());
		comando.setInt(4, p.getQtd());
		comando.executeUpdate();
		if (p.getName() != null && p.getType() != null) {
			estado = true;
			System.out.println("inserido no banco.");
		}
		fecharConexao();
		return estado;
	}

	@Override
	public String showAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean showAllWithQtd(String nome) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean showAllWithDate(String date) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertWithDate(String name, String date) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
