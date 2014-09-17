package cantina.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import cantina.model.ProductModelDia;

/**
 * 
 * @author HSG, M3D0NH0
 *
 */
public class ProductTableDia extends JPanel {
	private JTable tabela;

	public ProductTableDia(String data) {

		String[] colunas = { "Código", "Nome", "Validade" };

		ProductModelDia modelo = new ProductModelDia(colunas, data);
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
