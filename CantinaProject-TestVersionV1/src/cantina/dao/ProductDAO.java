package cantina.dao;

/**
 * @author Gelatti , M3D0NH0
 */

public interface ProductDAO {

	boolean insert(String name, String type,double price,int quantidade);
		
	boolean insertWithDate(String name, String date);
	
	public boolean showAllWithDateBuy(String date);
	
	public boolean buyProduct(String name, String fornecedor,String fornecDate);
	
	public boolean showFornecAndDate(String fornec);
	
	String showAll();
	
	boolean showAllWithQtd(String nome);
	
	boolean showAllWithDate(String date);
}


