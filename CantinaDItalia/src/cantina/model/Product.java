package cantina.model;

/**
 * 
 * @author HSG, M3D0NH0
 *
 */
public class Product {

	private String name, type, date, fornec, fornecDate,mes;
	private double price, totalprice;
	private int id, quantidade, lote;

	public Product() {}
	
	public Product(int id, String name, String type, String date, double price,
			int quantidade) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.date = date;
		this.price = price;
		this.quantidade = quantidade;
	}
		
	public Product(double totalPrice){
		this.totalprice = totalPrice;
	}
	
	public String getMes() {
		return this.mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}


	public String getFornec() {
		return this.fornec;
	}

	public void setFornec(String fornec) {
		this.fornec = fornec;
	}

	public String getFornecDate() {
		return this.fornecDate;
	}

	public void setFornecDate(String fornecDate) {
		this.fornecDate = fornecDate;
	}

	public double getTotalprice() {
		return this.totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtd() {
		return this.quantidade;
	}

	public void setQtd(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getID() {
		return this.id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}

	public int getLote() {
		return this.lote;
	}

	public void setTotalPrice(double totalprice) {
		this.totalprice = totalprice;
	}

	public double getTotalPrice() {
		return this.totalprice;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Product) {
			return id == ((Product)obj).id;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return new Integer(id).hashCode();
	}
	
}
