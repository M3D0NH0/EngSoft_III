package cantina.daobd;

import cantina.dao.ProductDAO;

/**
 * @author Gelatti , M3D0NH0
 */

public class ProductDAOModel extends Connect implements ProductDAO {

	public boolean insert(String name, String type, double price, int quantidade) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean insertWithDate(String name, String date) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean showAllWithDateBuy(String date) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean buyProduct(String name, String fornecedor, String fornecDate) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean showFornecAndDate(String fornec) {
		// TODO Auto-generated method stub
		return false;
	}

	public String showAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean showAllWithQtd(String nome) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean showAllWithDate(String date) {
		// TODO Auto-generated method stub
		return false;
	}


}
