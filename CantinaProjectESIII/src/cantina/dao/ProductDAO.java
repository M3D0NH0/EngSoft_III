package cantina.dao;

import java.util.List;

import cantina.model.Product;

/**
 * 
 * @author HSG
 *
 */
public interface ProductDAO {

	public List<Product> getProdutosDia(Product pro);
	
	public List<Product> getTodosProdutos();
}
