package cantina.view.product;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import cantina.model.ProductModel;

/**
 * 
 * @author HSG
 *
 */
public class ProductTable extends JPanel {
	private JTable tabela;

	public ProductTable() {
		String[] colunas = { "Código", "Nome", "Tipo", "Validade", "Quantidade" };

		ProductModel modelo = new ProductModel(colunas);
		tabela = new JTable(modelo);
		tabela.setPreferredScrollableViewportSize(new Dimension(400, 250));
		tabela.setFillsViewportHeight(true);
		tabela.setSize(400, 250);
		JScrollPane scrollPane = new JScrollPane(tabela);
		add(scrollPane);
	}

	public JTable getTabela() {
		return tabela;
	}

}
