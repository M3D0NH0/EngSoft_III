package cantina.main;

import cantina.view.product.ProductView;

/**
 * 
 * @author HSG
 *
 */
public class CantinaProjectMain {

	private static ProductView initialize;

	public static void main(String[] args) {
		initialize = new ProductView();
		initialize.init();
	}
}
