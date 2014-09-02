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

	/**
	@Test
	public void testInsertionTrue()
	{
	assertTrue(cant.insert("torrada","lanche",23.3,13));
	}
	*/
	
	/**
	 * HU03: Como controlador do estoque, desejo manter controle permanente sobre a disponibilidade do estoque para suprir as faltas de produtos rapidamente.
    TU01:
    Entrada: (nome do produto) [String]

    Saida: (nome do produto, quantidade em estoque)
    [Bolacha Recheada, 000]
	 */
	
	@Test
	public void historiaUsuario03()
	{
        cant.insert("Bolacha Recheada", "Biscoito", 5, 60);
        assertTrue(cant.showAllWithQtd("Bolacha Recheada"));
	}
	
	/**
	 * História de Usuario

    HU01: Como o controlador do estoque, desejo controlar o prazo de validade de produtos filtrando por data para que eu possa verificar a data de validade de alimentos perecíveis.
    TU01:
    Entrada: (data de vencimento) [2014-08-21]

    Saida: (nome do produto, data)
    [Bolacha Recheada, 2014-08-21]
	 */
	
	@Test
	public void historiaUsuario01()
	{
		cant.insertWithDate("Bolacha Recheada", "2014-08-21");
		assertTrue(cant.showAllWithDate("2014-08-21"));
		
	}
}

