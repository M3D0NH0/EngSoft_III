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
	private JButton btnBuscarAnoMes;
	private JButton btnBuscar;
	private String data, mes;

	public ProductBusca() {
		iniciaComponentes();
		addComponentes();
	}

	private void iniciaComponentes() {
		lblBuscaProduto = new JLabel("Dia ou Ano/Mês");
		textFieldBusca = new JTextField();
		btnLimpar = new JButton("Limpar");
		btnBuscar = new JButton("Buscar por data");
		btnBuscarAnoMes = new JButton("Buscar por Ano/Mês");
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

		btnBuscarAnoMes.setBackground(Color.WHITE);
		btnBuscarAnoMes.setBounds(28, 208, 208, 23);
		add(btnBuscarAnoMes);
		btnBuscarAnoMes.setBackground(Color.WHITE);

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
						ProductTable produtosRela = new ProductTable();
						produtosRela.productTableDia(data);
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

		btnBuscarAnoMes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				if (arg0.getSource().equals(btnBuscarAnoMes)) {
					if (textFieldBusca.getText() == null
							|| textFieldBusca.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Data inválida");
					} else {
						mes = textFieldBusca.getText();
						ProductTable produtosRela = new ProductTable();
						produtosRela.productTableMes(mes);
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
		btnBuscar.setBounds(28, 181, 208, 23);
		add(btnBuscar);

	}
}
