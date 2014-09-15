package cantina.main;

import cantina.view.product.ProductView;

/**
 * 
 * @author HSG, M3D0NH0
 *
 */
public class CantinaProjectMain {

	private static ProductView initialize;

	public static void main(String[] args) {
		initialize = new ProductView();
		initialize.init();
	}
}
