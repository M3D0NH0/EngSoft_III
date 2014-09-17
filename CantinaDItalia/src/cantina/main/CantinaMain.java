package cantina.main;

import cantina.view.ProductView;

/**
 * 
 * @author HSG, M3D0NH0
 *
 */
public class CantinaMain {

	private static ProductView initialize;

	public static void main(String[] args) {
		initialize = new ProductView();
		initialize.init();
	}
}
