package cantina.model;

/**
 * 
 * @author HSG
 *
 */
public class Product {

	private String name, type, date;
	private double price, totalprice;
	private int id, quantidade,lote;

	public Product(int id, String name, String type, String date, double price,
			int quantidade,int lote,double totalprice) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.date = date;
		this.price = price;
		this.quantidade = quantidade;
		this.lote = lote;
		this.totalprice = totalprice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public void setLote(int lote)
	{
		this.lote = lote;
	}
	
	public int getLote()
	{
		return lote;
	}
	
	public void setTotalPrice(double totalprice)
	{
		this.totalprice = totalprice;
	}
	
	public double getTotalPrice()
	{
		return totalprice;
	}
	
	
}
