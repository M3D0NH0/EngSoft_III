package cantina.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.table.AbstractTableModel;

import cantina.db.ProductDAOBD;

/**
 * 
 * @author HSG, M3D0NH0
 * 
 */
public class ProductModel extends AbstractTableModel {

	private String header[];
	private List<Product> produtos = new ArrayList<Product>();
	private ProductDAOBD dao = new ProductDAOBD();

	public ProductModel() {
	}

	public ProductModel(String[] header, List<Product> produtos) {
		this.header = header;
		this.produtos = produtos;
	}

	public void productModelData(String[] header, String data) {
		this.header = header;
		this.produtos = dao.getProdutosData(data);
		produtos.addAll(dao.getProdutosNome(data));
		Set<Product> s = new HashSet<>(produtos);
		produtos = new ArrayList<>(s);
	}

	public void productModelNome(String[] header, String nome) {
		this.header = header;
		this.produtos = dao.getProdutosNome(nome);
	}

	public void productModelMes(String[] header, String mes) {
		this.header = header;
		this.produtos = dao.getProdutosMes(mes);
	}

	@Override
	public int getRowCount() {
		return (produtos.size());
	}

	@Override
	public int getColumnCount() {
		return (6);
	}

	@Override
	public String getColumnName(int column) {
		return header[column];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		if (columnIndex == 0) {
			return (produtos.get(rowIndex).getName());
		} else if (columnIndex == 1) {
			return (produtos.get(rowIndex).getType());
		} else if (columnIndex == 2) {
			return (produtos.get(rowIndex).getDate());
		} else if (columnIndex == 3) {
			return (produtos.get(rowIndex).getQtd());
		} else if (columnIndex == 4) {
			return String.format("R$ %.2f", produtos.get(rowIndex).getPrice());
		} else {
			return String.format("R$ %.2f", produtos.get(rowIndex)
					.getTotalPrice());
		}
	}

	public Product getProdutos(int linha) {
		return (produtos.get(linha));
	}
}
