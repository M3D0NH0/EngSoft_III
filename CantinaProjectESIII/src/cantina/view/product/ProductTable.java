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
		String[] colunas = { "C�digo", "Nome", "Tipo", "Validade","Pre�o (R$)","Quantidade","Lote" };

		ProductModel modelo = new ProductModel(colunas);
		tabela = new JTable(modelo);
		tabela.setPreferredScrollableViewportSize(new Dimension(780, 400));
		tabela.setFillsViewportHeight(true);
		tabela.setSize(400, 250);
		JScrollPane scrollPane = new JScrollPane(tabela);
		add(scrollPane);
	}

	public JTable getTabela() {
		return tabela;
	}

}
