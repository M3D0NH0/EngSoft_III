package cantina.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import cantina.model.Product;

/**
 * 
 * @author HSG, M3D0NH0
 *
 */
public class ProductInsert extends JPanel{
	
	
	private JTextField tx_nome, tx_tipo, tx_validade, tx_quantidade, tx_preco;
	private JLabel lb_nome, lb_tipo, lb_validade, lb_quantidade, lb_preco;
	private JButton bt_adicionar, bt_limpar;
	
	
	public ProductInsert (){
		iniciaComponentes();
		addComponetes();
	}
	
	public void iniciaComponentes(){
		tx_nome = new JTextField();
		tx_tipo = new JTextField();
		tx_validade = new JTextField();
		tx_quantidade = new JTextField();
		tx_preco = new JTextField();
		
		lb_nome = new JLabel("Nome : ");
		lb_tipo = new JLabel("Tipo : ");
		lb_validade = new JLabel("Validade : ");
		lb_quantidade = new JLabel("Quantidade : ");
		lb_preco = new JLabel("Preço : ");
		
		bt_adicionar = new JButton("Adicionar");
		bt_limpar = new JButton("Limpar");
	}
	
	public void addComponetes(){
		setLayout(null);
		
		lb_nome.setBounds(26, 77, 208, 23);
		add(lb_nome);
		lb_nome.setForeground(Color.WHITE);
		
		tx_nome.setBounds(30, 77, 208, 23);
		add(tx_nome);
		tx_nome.setForeground(Color.WHITE);
		
		lb_tipo.setBounds(30, 77, 208, 23);
		add(lb_tipo);
		lb_tipo.setForeground(Color.WHITE);
		
		tx_tipo.setBounds(30, 77, 208, 23);
		add(tx_tipo);
		tx_tipo.setForeground(Color.WHITE);
		
		lb_validade.setBounds(30, 77, 208, 23);
		add(lb_validade);
		lb_validade.setForeground(Color.WHITE);
		
		tx_validade.setBounds(30, 77, 208, 23);
		add(tx_validade);
		tx_validade.setForeground(Color.WHITE);
		
		lb_quantidade.setBounds(30, 77, 208, 23);
		add(lb_quantidade);
		lb_quantidade.setForeground(Color.WHITE);
		
		tx_quantidade.setBounds(30, 77, 208, 23);
		add(tx_quantidade);
		tx_quantidade.setForeground(Color.WHITE);
		
		lb_preco.setBounds(30, 77, 208, 23);
		add(lb_preco);
		lb_preco.setForeground(Color.WHITE);
		
		tx_preco.setBounds(30, 77, 208, 23);
		add(tx_preco);
		tx_preco.setForeground(Color.WHITE);
		
		bt_adicionar.setBounds(30, 77, 208, 23);
		add(bt_adicionar);
		bt_adicionar.setForeground(Color.WHITE);
		bt_adicionar.addActionListener(new tratadorBotoes());
		
		bt_limpar.setBounds(30, 77, 208, 23);
		add(bt_limpar);
		bt_limpar.setForeground(Color.WHITE);
		bt_limpar.addActionListener(new tratadorBotoes());
		
	}
	
	public class tratadorBotoes implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(bt_adicionar)){
				Product produto = new Product();
				produto.
				
			}else if(e.getSource().equals(bt_limpar)){
				tx_nome.setText(null);
				tx_tipo.setText(null);
				tx_quantidade.setText(null);
				tx_validade.setText(null);
				tx_preco.setText(null);
			}else{
				
			}
		}
	}
	
	
	

}
