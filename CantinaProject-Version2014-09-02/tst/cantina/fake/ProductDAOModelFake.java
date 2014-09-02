package cantina.fake;

import java.util.ArrayList;

import cantina.dao.ProductDAO;

/**
 * @author Gelatti , M3D0NH0
 */

public class ProductDAOModelFake implements ProductDAO {

	private ArrayList<ProductFake> p;
	private boolean estado;

	public ProductDAOModelFake() {
		this.p = new ArrayList<ProductFake>();
		this.estado = false;
	}

	@Override
	public boolean insert(String name, String type, double price, int quantidade) {
		ProductFake fake = new ProductFake();
		fake.setName(name);
		fake.setType(type);
		fake.setPrice(price);
		fake.setQtd(quantidade);
		p.add(fake);

		if (p.size() != 0) {
			estado = true;
			System.out.println("inserido na memória.");
		}
		return estado;
	}

	@Override
	public boolean insertWithDate(String name,String date)
	{
		ProductFake fake = new ProductFake();
		fake.setName(name);
		fake.setDate(date);
		p.add(fake);
		
		if(p.size() != 0)
		{
			estado = true;
			System.out.println("inserido na memória ");
		}
		return estado;
	}

	@Override
	public String showAll() {
		String s = null;
		for (ProductFake pro : p) {
			s += " " + pro.getName() + " " + pro.getType() + " "
					+ pro.getPrice() + " " + pro.getQtd();
		}
		return s;
	}

	@Override
	public boolean showAllWithQtd(String nome) {
		boolean estado = false;
		for (ProductFake pro : p) {
			if(pro.getName().equals(nome))
			{
			System.out.println(pro.getName() + " " + pro.getQtd());
			estado = true;
			}
		}
		return estado;
	}

	@Override
	public boolean showAllWithDate(String date) {
		boolean estado = false;
		for (ProductFake pro : p) {
			if(pro.getDate().equals(date))
			{
			System.out.println(pro.getName() + " " + pro.getDate());
			estado = true;
			}
		}
		return estado;
	}

}
