package cantina.model;

/**
 * 
 * @author HSG
 *
 */
public class Product {

	private String name, type, date;
	private double price;
	private int id, quantidade;

	public Product(int id, String name, String type, String date, double price,
			int quantidade) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.date = date;
		this.price = price;
		this.quantidade = quantidade;
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

}
