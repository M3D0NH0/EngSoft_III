package main;

import java.sql.SQLException;

import cantina.daobd.ProductDAOModel;
import cantina.fake.ProductDAOModelFake;

/**
 * @author Gelatti , M3D0NH0
 */

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		/**
		 * Inser��o em banco de dados.
		 */
		
		ProductDAOModel p = new ProductDAOModel();
		p.insert("caf�", "bebida");
		
		/**
		 * Inser��o em mem�ria.
		 */
		ProductDAOModelFake pro = new ProductDAOModelFake();
		pro.insert("refri","bebida");
	}
	
}
