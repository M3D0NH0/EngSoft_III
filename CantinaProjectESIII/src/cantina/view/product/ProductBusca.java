package cantina.view.product;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import cantina.db.ProductDAODB;
import cantina.model.Product;

/**
 * 
 * @author HSG
 *
 */
public class ProductBusca extends JPanel {
	
	private Product pro;
	private ProductDAODB product;
	private JTextField textFieldBusca;
	private JLabel lblBuscaProduto;
	private JButton btnLimpar;
	private JButton btnBuscar;
	private String data;

	public ProductBusca() {
		iniciaComponentes();
		addComponentes();
	}

	private void iniciaComponentes(){
		pro = new Product();
		product = new ProductDAODB();
		lblBuscaProduto = new JLabel("Busca por Data");
		textFieldBusca = new JTextField();
		btnLimpar = new JButton("Limpar");
		btnBuscar = new JButton("Buscar");
	}

	private void addComponentes() {
		setLayout(null);
		lblBuscaProduto.setBounds(26, 35, 193, 19);
		add(lblBuscaProduto);

		textFieldBusca.setBounds(26, 99, 110, 20);
		add(textFieldBusca);
		textFieldBusca.setColumns(10);

		btnLimpar.setBounds(28, 154, 110, 23);
		add(btnLimpar);
		btnLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			   textFieldBusca.setText(null);
			}
		});

		btnBuscar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getSource().equals(btnBuscar)) {
					data = textFieldBusca.getText();
					pro.setDate(data);
					product.getProdutosDia(pro);
				}

			}
		});
		btnBuscar.setBounds(28, 214, 110, 23);
		add(btnBuscar);
	}
}
