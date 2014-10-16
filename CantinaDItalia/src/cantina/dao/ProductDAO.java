package cantina.dao;

import java.util.List;

import cantina.model.Product;

/**
 * 
 * @author HSG, M3D0NH0
 *
 */
public interface ProductDAO {
	
	public List<Product> getProdutosData(String mes);

	public List<Product> getTodosProdutos();
	
	public Product insereProdutos(Product produto);
}
