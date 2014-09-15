package cantina.view.product;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 * @author HSG
 *
 */
public class ProductBusca extends JPanel {
	
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
		lblBuscaProduto = new JLabel("Busca por Data de Validade");
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
				    ProductTable produtosRela = new ProductTable(data);
					ProductView.splitPane.setRightComponent(produtosRela);
					ProductView.splitPane.setDividerLocation(200);
				}
			}
		});
		btnBuscar.setBounds(28, 214, 110, 23);
		add(btnBuscar);
	}

}
