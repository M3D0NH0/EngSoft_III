package cantina.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
		add(lb_nome);
		add(tx_nome);
		add(lb_tipo);
		add(tx_tipo);
		add(lb_validade);
		add(tx_validade);
		add(lb_quantidade);
		add(tx_quantidade);
		add(lb_preco);
		add(tx_preco);
		add(bt_adicionar);
		add(bt_limpar);
	}
	
	
	

}
