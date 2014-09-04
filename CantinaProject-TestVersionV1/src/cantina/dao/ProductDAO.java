package cantina.dao;

/**
 * @author Gelatti , M3D0NH0
 */

public interface ProductDAO {

	public boolean insert(String name, String type,double price,int quantidade);
		
	public boolean insertWithDate(String name, String date);
	
	public boolean showAllWithDateBuy(String date);
	
	public boolean buyProduct(String name, String fornecedor,String fornecDate);
	
	public boolean showFornecAndDate(String fornec);
	
	public String showAll();
	
	public boolean showAllWithQtd(String nome);
	
	public boolean showAllWithDate(String date);
}


