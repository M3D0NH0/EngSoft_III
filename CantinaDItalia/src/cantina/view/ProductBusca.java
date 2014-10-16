package cantina.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	private JButton btnBuscarNome;
	private JButton btnBuscarData;
	private String data, nome;

	public ProductBusca() {
		iniciaComponentes();
		addComponentes();
	}

	private void iniciaComponentes() {
		lblBuscaProduto = new JLabel("Buscar por nome ou validade");
		textFieldBusca = new JTextField();
		btnBuscarNome = new JButton("Buscar por Nome");
		btnLimpar = new JButton("Limpar");
		btnBuscarData = new JButton("Buscar por Data");
	}

	private void addComponentes() {
		setLayout(null);
		lblBuscaProduto.setBounds(26, 77, 208, 23);
		add(lblBuscaProduto);
		lblBuscaProduto.setForeground(Color.WHITE);

		textFieldBusca.setBounds(26, 113, 208, 23);
		add(textFieldBusca);
		textFieldBusca.setColumns(10);

		btnLimpar.setBounds(28, 154, 208, 23);
		add(btnLimpar);
		btnLimpar.setBackground(Color.WHITE);

		btnBuscarData.setBackground(Color.WHITE);
		btnBuscarData.setBounds(28, 194, 208, 23);
		add(btnBuscarData);
		btnBuscarData.setBackground(Color.WHITE);

		btnBuscarNome.setBackground(Color.WHITE);
		btnBuscarNome.setBounds(28, 174, 208, 23);
		add(btnBuscarNome);
		btnBuscarNome.setBackground(Color.WHITE);

		btnLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textFieldBusca.setText(null);
			}
		});

		btnBuscarNome.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(btnBuscarNome)) {
					if (textFieldBusca.getText() == null
							|| textFieldBusca.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Nome inválido");
					} else {
						nome = textFieldBusca.getText();
						ProductTable produtosRela = new ProductTable();
						produtosRela.productTableNome(nome);
						ProductView.splitPane.setRightComponent(produtosRela);
						produtosRela.setBackground(Color.GRAY);
						ProductView.splitPane.setDividerLocation(250);
						ProductView.splitPane.setEnabled(false);
						textFieldBusca.setText(null);
						JOptionPane.showMessageDialog(null, "Busca realizada");
					}
				}

			}
		});

		btnBuscarData.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				if (arg0.getSource().equals(btnBuscarData)) {
					if (textFieldBusca.getText() == null
							|| textFieldBusca.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Data inválida");
					} else {
						data = textFieldBusca.getText();
						ProductTable produtosRela = new ProductTable();
						produtosRela.productTableData(data);
						ProductView.splitPane.setRightComponent(produtosRela);
						produtosRela.setBackground(Color.GRAY);
						ProductView.splitPane.setDividerLocation(250);
						ProductView.splitPane.setEnabled(false);
						textFieldBusca.setText(null);
						JOptionPane.showMessageDialog(null, "Busca realizada");
					}
				}
			}
		});

	}
}
