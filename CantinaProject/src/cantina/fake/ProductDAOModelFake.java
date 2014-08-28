package cantina.fake;

import cantina.dao.ProductDAO;

/**
 * @author Gelatti , M3D0NH0
 */

public class ProductDAOModelFake implements ProductDAO {

	private ProductFake p[];
	private int count;
	boolean estado;

	
	public ProductDAOModelFake() {	
		this.p = new ProductFake[10];
		this.count = 0;
		this.estado = false;
	}

	@Override
	public boolean insert(String name,String type) {
		p[count] = new ProductFake();
		p[count].setName(name);
		p[count].setType(type);
		if(p[count] != null)
		{
			estado = true;
			System.out.println("inserido na memória.");
		}
		count++;
		return estado;
		
	}

}
