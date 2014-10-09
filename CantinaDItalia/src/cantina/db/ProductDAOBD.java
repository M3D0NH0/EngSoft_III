package cantina.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import cantina.dao.ProductDAO;
import cantina.model.Product;

/**
 * 
 * @author HSG, M3D0NH0
 *
 */
public class ProductDAOBD extends Connect implements ProductDAO {

	@Override
	public List<Product> getProdutosDia(String data) {
		List<Product> listaProduct = new ArrayList<>();
		try {

			iniciaConexao("SELECT * FROM PRODUTOS WHERE VALIDADE=?");
			comando.setString(1, data);
			ResultSet resultado = comando.executeQuery();
			while (resultado.next()) {
				Product product = new Product(resultado.getInt("id"),
						resultado.getString("nome"),
						resultado.getString("validade"));
				listaProduct.add(product);
			}
			fecharConexao();
		} catch (ClassNotFoundException | SQLException ex) {
			Logger.getLogger(ProductDAOBD.class.getName()).log(Level.SEVERE,
					null, ex);
		}
		return (listaProduct);
	}

	@Override
	public List<Product> getTodosProdutos() {
		List<Product> listaProduct = new ArrayList<>();
		try {

			iniciaConexao("select * from produtos");
			ResultSet resultado = comando.executeQuery();
			while (resultado.next()) {
				Product product = new Product(resultado.getInt("id"),
						resultado.getString("nome"),
						resultado.getString("tipo"),
						resultado.getString("validade"),
						resultado.getDouble("preco"),
						resultado.getInt("quantidade"),
						resultado.getInt("lote"),
						resultado.getDouble("precototal"));
				listaProduct.add(product);
			}
			fecharConexao();
		} catch (ClassNotFoundException | SQLException ex) {
			Logger.getLogger(ProductDAOBD.class.getName()).log(Level.SEVERE,
					null, ex);
		}
		return (listaProduct);
	}

	@Override
	public List<Product> getProdutosMes(String mes) {
	
		List<Product> listaProduct = new ArrayList<>();
		try {

			iniciaConexao("SELECT * FROM PRODUTOS WHERE VALIDADE LIKE ?");
			comando.setString(1 ,"%"+mes+"%");
			ResultSet resultado = comando.executeQuery();
			while (resultado.next()) {
				Product product = new Product(resultado.getInt("id"),
						resultado.getString("nome"),
						resultado.getString("validade"));
				listaProduct.add(product);
			}
			fecharConexao();
		} catch (ClassNotFoundException | SQLException ex) {
			Logger.getLogger(ProductDAOBD.class.getName()).log(Level.SEVERE,
					null, ex);
		}
		return (listaProduct);
	}

	@Override
	public Product insereProdutos(Product produto) {
		try {
			iniciaConexao("INSERT INTO produtos(nome,tipo,validade,quantidade,preco) VALUES (?,?,?,?,?)");
			comando.setString(1, produto.getName());
			comando.setString(2, produto.getType());
			comando.setString(3, produto.getDate());
			comando.setInt(4, produto.getQtd());
			comando.setDouble(5, produto.getPrice());
			comando.executeQuery();
			return produto;
			
		} catch (ClassNotFoundException | SQLException ex) {
			Logger.getLogger(ProductDAOBD.class.getName()).log(Level.SEVERE,
					null, ex);
		}
		return null;
	}
	

	

}
