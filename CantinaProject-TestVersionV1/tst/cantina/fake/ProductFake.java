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
	private double totalPrice;
	private String fornec;
	private String fornecDate;

	public ProductFake() {	}

	public ProductFake(String name,String type,double price,int quantidade,String date) { 
		this.name = name;
		this.type = type;
		this.price = price;
		this.quantidade = quantidade;
		this.date = date;
	}
	
	public ProductFake(String name,String fornec,String fornecDate){
		this.name = name;
		this.fornec = fornec;
		this.fornecDate = fornecDate;
	}
	
	public ProductFake(String name,String type,double price,int quantidade,String date,String fornec,String fornecDate,double totalPrice) { 
		this.name = name;
		this.type = type;
		this.price = price;
		this.quantidade = quantidade;
		this.date = date;
		this.fornec = fornec;
		this.fornecDate = fornecDate;
		this.totalPrice = totalPrice;
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
	
	public String getFornec(){
		return this.fornec;
	}
	
	public void setFornec(String fornec){
		this.fornec = fornec;
	}
	
	public String getFornecDate(){
		return this.fornecDate;
	}
	
	public void setFornecDate(String fornecDate){
		this.fornecDate = fornecDate;
	}
	
	public double getPriceTotal(){
		return this.totalPrice;
	}
	
	public void setPriceTotal(double totalPrice){
		this.totalPrice = totalPrice;
	}
}

