package cantina.daobd;

/**
 * @author Gelatti , M3D0NH0
 */

public class Product {
	private String name;
	private String type;
	private double price;
	private int quantidade;

	public Product() {	}

	public Product(String name,String type,double price,int quantidade) { 
		this.name = name;
		this.type = type;
		this.price = price;
		this.quantidade = quantidade;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public int getQtd()
	{
		return this.quantidade;
	}
	
	public void setQtd(int quantidade)
	{
		this.quantidade = quantidade;
	}
	

}

