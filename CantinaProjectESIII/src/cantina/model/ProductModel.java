package cantina.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import cantina.dao.ProductDAO;
import cantina.db.ProductDAODB;

/**
 * 
 * @author HSG
 *
 */
public class ProductModel extends AbstractTableModel {

	private String header[];
	private List<Product> produtos;

	public ProductModel() {
		produtos = new ArrayList<Product>();
	}

	public ProductModel(String[] header) {
		this.header = header;
		ProductDAO dao = new ProductDAODB();
		this.produtos = dao.getTodosProdutos();

	}

	public ProductModel(String[] header, List<Product> produtos) {
		this.header = header;
		this.produtos = produtos;
	}

	@Override
	public int getRowCount() {
		return (produtos.size());
	}

	@Override
	public int getColumnCount() {
		return (7);
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
		} else if (columnIndex == 2) {
			return (produtos.get(rowIndex).getType());
		} else if (columnIndex == 3) {
			return (produtos.get(rowIndex).getDate());
		} else if(columnIndex == 4){
			return (produtos.get(rowIndex).getPrice());
		}else if(columnIndex == 5){
			return (produtos.get(rowIndex).getQuantidade());
		}else{
			return (produtos.get(rowIndex).getLote());
		}
	}

	public Product getProdutos(int linha) {
		return (produtos.get(linha));
	}
}
