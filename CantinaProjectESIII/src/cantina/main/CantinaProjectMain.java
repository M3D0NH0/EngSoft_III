package cantina.main;

import cantina.view.product.ProductView;

/**
 * 
 * @author HSG
 *
 */
public class CantinaProjectMain {

	private static ProductView init;

	public static void main(String[] args) {
		init = new ProductView();
		init.iniciaComponentes();
	}
}
