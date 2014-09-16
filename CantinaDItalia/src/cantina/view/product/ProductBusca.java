package cantina.view.product;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Closeable;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 * @author HSG, M3D0NH0
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
		lblBuscaProduto = new JLabel("Data de validade:");
		textFieldBusca = new JTextField();
		btnLimpar = new JButton("Limpar");
		btnBuscar = new JButton("Buscar");
	}

	private void addComponentes() {
		setLayout(null);
		lblBuscaProduto.setBounds(26, 77, 110, 37);
		add(lblBuscaProduto);
		lblBuscaProduto.setForeground(Color.WHITE);
		
		
		textFieldBusca.setBounds(26, 113, 110, 20);
		add(textFieldBusca);
		textFieldBusca.setColumns(10);
		
		btnLimpar.setBounds(28, 154, 108, 23);
		add(btnLimpar);
		btnLimpar.setBackground(Color.WHITE);
		btnLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textFieldBusca.setText(null);
			}
		});

		btnBuscar.setBackground(Color.WHITE);
		btnBuscar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getSource().equals(btnBuscar)) {
					if (textFieldBusca.getText() == null
							|| textFieldBusca.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Data inválida");
					} else {
					data = textFieldBusca.getText();
					ProductTable produtosRela = new ProductTable(data);
					ProductView.splitPane.setRightComponent(produtosRela);
					produtosRela.setBackground(Color.GRAY);
					ProductView.splitPane.setDividerLocation(200);
					textFieldBusca.setText(null);
					JOptionPane.showMessageDialog(null, "Busca realizada");
					}
				}
			}
		});
		btnBuscar.setBounds(28, 181, 108, 23);
		add(btnBuscar);
	}

}
