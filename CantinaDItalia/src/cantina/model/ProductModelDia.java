package cantina.model;

import java.util.ArrayList;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import cantina.db.ProductDAODB;

/**
 * 
 * @author HSG, M3D0NH0
 *
 */
public class ProductModelDia extends AbstractTableModel {

	private String header[];
	private List<Product> produtos = new ArrayList<Product>();
	private ProductDAODB dao = new ProductDAODB();

	public ProductModelDia(String[] header, String data) {
		this.header = header;
		this.produtos = dao.getProdutosDia(data);
	}

	public ProductModelDia(String[] header, List<Product> produtos) {
		this.header = header;
		this.produtos = produtos;
	}

	@Override
	public int getRowCount() {
		return (produtos.size());
	}

	@Override
	public int getColumnCount() {
		return (3);
	}

	@Override
	public String getColumnName(int column) {
		return header[column];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		if (columnIndex == 0) {
			return (produtos.get(rowIndex).getID());
		} else if (columnIndex == 1) {
			return (produtos.get(rowIndex).getName());
		} else {
			return (produtos.get(rowIndex).getDate());
		}
	}

	public Product getProdutos(int linha) {
		return (produtos.get(linha));
	}
}
