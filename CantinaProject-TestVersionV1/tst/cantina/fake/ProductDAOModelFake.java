package cantina.fake;

import java.util.ArrayList;

import cantina.dao.ProductDAO;

/**
 * @author Gelatti , M3D0NH0
 */

public class ProductDAOModelFake implements ProductDAO {

	private ArrayList<ProductFake> p;
	private ArrayList<ProductFake> pAux;

	public ProductDAOModelFake() {
		this.p = new ArrayList<ProductFake>();
		this.pAux = new ArrayList<ProductFake>();
	}

	@Override
	public boolean buyProduct(String name, String fornecedor, String fornecDate) {
		boolean estado = false;
		ProductFake fake = new ProductFake();
		fake.setName(name);
		fake.setFornec(fornecedor);
		fake.setFornecDate(fornecDate);
		pAux.add(fake);

		if (pAux.size() != 0) {
			estado = true;
			System.out.println("inserido na mem�ria. ");
		}
		return estado;
	}

	@Override
	public boolean insert(String name, String type, double price, int quantidade) {
		boolean estado = false;
		ProductFake fake = new ProductFake();
		fake.setName(name);
		fake.setType(type);
		fake.setPrice(price);
		fake.setQtd(quantidade);
		p.add(fake);

		if (p.size() != 0) {
			estado = true;
			System.out.println("inserido na mem�ria.");
		}
		return estado;
	}

	@Override
	public boolean insertWithDate(String name, String date) {
		boolean estado = false;
		ProductFake fake = new ProductFake();
		fake.setName(name);
		fake.setDate(date);
		p.add(fake);

		if (p.size() != 0) {
			estado = true;
			System.out.println("inserido na mem�ria ");
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
			if (pro.getName().equals(nome)) {
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
			if (pro.getDate().equals(date)) {
				System.out.println(pro.getName() + " " + pro.getDate());
				estado = true;
			}
		}
		return estado;
	}

	@Override
	public boolean showAllWithDateBuy(String date) {
		boolean estado = false;
		for (ProductFake pro : pAux) {
			if (pro.getFornecDate().equals(date)) {
				System.out.println(pro.getName() + " " + pro.getFornecDate());
				estado = true;
			}
		}
		return estado;
	}

	@Override
	public boolean showFornecAndDate(String fornec) {
		boolean estado = false;
		for (ProductFake pro : pAux) {
			if (pro.getFornec().equals(fornec)) {
				System.out.println(pro.getFornec() + " " + pro.getFornecDate());
				estado = true;
			}
		}
		return estado;
	}

}
