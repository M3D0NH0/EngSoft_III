package cantina.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import cantina.fake.ProductDAOModelFake;

/**
 * @author Gelatti , M3D0NH0
 */

public class ProductTest {

	private ProductDAOModelFake cant;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		cant = new ProductDAOModelFake();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInsertionTrue()
	{
	assertTrue(cant.insert("torrada","lanche"));
	}
	
	@Test
	public void testInsertionFalse()
	{
	assertFalse(cant.insert("água","bebida"));
	}
	
}
