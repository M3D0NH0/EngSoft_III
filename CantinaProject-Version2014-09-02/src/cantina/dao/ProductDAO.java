package cantina.dao;

import java.sql.SQLException;

/**
 * @author Gelatti , M3D0NH0
 */

public interface ProductDAO {

	boolean insert(String name, String type,double price,int quantidade) throws ClassNotFoundException, SQLException;
		
	boolean insertWithDate(String name, String date);
	
	String showAll();
	
	boolean showAllWithQtd(String nome);
	
	boolean showAllWithDate(String date);
}


