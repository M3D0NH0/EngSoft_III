package cantina.view.product;

import javax.swing.JFrame;

/**
 * 
 * @author HSG
 *
 */
public class ProductView extends JFrame {

	private ProductTable produtosRela;

	public void iniciaComponentes() {
		setResizable(false);
		setTitle("Cantina Project");
		setSize(425, 315);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		produtosRela = new ProductTable();
		getContentPane().add(produtosRela);
		setVisible(false);
		setVisible(true);
	}
}