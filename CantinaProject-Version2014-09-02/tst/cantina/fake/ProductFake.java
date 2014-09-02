package cantina.fake;

/**
 * @author Gelatti , M3D0NH0
 */

public class ProductFake {
	private String name;
	private String type;
	private double price;
	private int quantidade;
	private String date;

	public ProductFake() {	}

	public ProductFake(String name,String type,double price,int quantidade,String date) { 
		this.name = name;
		this.type = type;
		this.price = price;
		this.quantidade = quantidade;
		this.date = date;
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
	
	public void setDate(String date)
	{
		this.date = date;
	}
	
	public String getDate()
	{
		return this.date;
	}
	
	
}

