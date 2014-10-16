package cantina.dao;

import java.util.List;

import cantina.model.Product;

/**
 * 
 * @author HSG, M3D0NH0
 *
 */
public interface ProductDAO {
	
	public List<Product> getProdutosMes(String mes);
	
	public List<Product> getProdutosNome(String nome);  
	
	public List<Product> getProdutosData(String data);
	
	public Product insereProdutos(Product produto);
	
}
