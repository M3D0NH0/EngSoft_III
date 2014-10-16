package cantina.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import cantina.model.ProductModel;

/**
 * 
 * @author HSG, M3D0NH0
 *
 */
public class ProductTable extends JPanel {
	
	private JTable tabela;
	
	public ProductTable(){
		setLayout(new BorderLayout());
	}
		
	public void productTableData(String data) {

		String[] colunas = { "Código", "Nome", "Validade" };

		ProductModel modelo = new ProductModel();
		modelo.productModelData(colunas, data);
		tabela = new JTable(modelo);
		tabela.setPreferredScrollableViewportSize(new Dimension(680, 575));
		tabela.setFillsViewportHeight(true);
		tabela.setSize(400, 250);
		tabela.setBackground(Color.white);
		JScrollPane scrollPane = new JScrollPane(tabela);
		add(scrollPane);
	}

	public JTable getTabela() {
		return tabela;
	}

}
