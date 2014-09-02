package main;

import java.sql.SQLException;
import java.util.Scanner;

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
		 
		ProductDAOModel p = new ProductDAOModel();
		p.insert("café", "bebida",23.3,23);
		*/
		
		
		ProductDAOModelFake pro = new ProductDAOModelFake();
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("Escolha entre: \n1 - Inserir Produto\n2 - Mostrar Produtos\n3 - Mostrar Quantidade");
			int opc = sc.nextInt();
		switch(opc)
		{
		case 1:
			System.out.println("Digite o produto: ");
			String produto = sc.next();
			System.out.println("Digite o tipo do produto: ");
			String tipo = sc.next();
			System.out.println("Digite o preço: ");
			Double preco = sc.nextDouble();
			System.out.println("Digite a quantidade que vai para o estoque: ");
			int qtd = sc.nextInt();
			pro.insert(produto,tipo,preco,qtd);
			break;
		case 2:
			System.out.println(pro.showAll());
			break;
		case 3:
			break;
		default:
			System.out.println("fail");
		}
		}while(true);
	}
}
