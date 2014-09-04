package cantina.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cantina.fake.ProductDAOModelFake;

/**
 * @author Gelatti , M3D0NH0
 */

public class ProductTest {

	private ProductDAOModelFake cant;

	@Before
	public void setUp() throws Exception {
		cant = new ProductDAOModelFake();
	}

	@Test
	public void testInsertionTrue() {
		assertTrue(cant.insert("torrada", "lanche", 23.3, 13));
	}

	@Test
	public void historiaUsuario01() {
		cant.insertWithDate("Bolacha Recheada", "2014-08-21");
		assertTrue(cant.showAllWithDate("2014-08-21"));
	}

	@Test
	public void historiaUsuario02Teste01() {
		cant.buyProduct("Bolacha Recheada", "Fornets", "2014-08-21");
		assertTrue(cant.showAllWithDateBuy("2014-08-21"));
	}

	@Test
	public void historiaUsuario02Teste02() {
		cant.buyProduct("Bolacha Recheada", "Vendas ltda", "2014-08-21");
		assertTrue(cant.showFornecAndDate("Vendas ltda"));
	}
	
	@Test
	public void historiaUsuario03() {
		cant.insert("Bolacha Recheada", "Biscoito", 5, 60);
		assertTrue(cant.showAllWithQtd("Bolacha Recheada"));
	}
}
