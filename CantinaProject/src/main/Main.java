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
		 * Inserção em banco de dados.
		 */
		
		ProductDAOModel p = new ProductDAOModel();
		p.insert("café", "bebida");
		
		/**
		 * Inserção em memória.
		 */
		ProductDAOModelFake pro = new ProductDAOModelFake();
		pro.insert("refri","bebida");
	}
	
}
