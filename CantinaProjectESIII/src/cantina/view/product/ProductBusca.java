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

	private void iniciaComponentes() {
		lblBuscaProduto = new JLabel("Busca por Data");
		textFieldBusca = new JTextField();
		btnLimpar = new JButton("Limpar");
		btnBuscar = new JButton("Buscar");
	}

	private void addComponentes() {
		setLayout(null);
		lblBuscaProduto.setBounds(208, 87, 193, 19);
		add(lblBuscaProduto);

		textFieldBusca.setBounds(195, 147, 144, 20);
		add(textFieldBusca);
		textFieldBusca.setColumns(10);

		btnLimpar.setBounds(161, 192, 110, 23);
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
				}

			}
		});
		btnBuscar.setBounds(291, 192, 110, 23);
		add(btnBuscar);
	}
}
