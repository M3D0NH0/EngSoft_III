package cantina.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
	private JLabel lblTitulo;
	private JLabel lblBuscaProduto;
	private JLabel lblGuardaBuscaData;
	private JLabel lblGuardaBuscaNome;
	private JButton btnLimpar;
	private JButton btnBuscar;
	private JButton btnUltimoMes;
	private String data, nome, mes;

	public ProductBusca() {
		iniciaComponentes();
		addComponentes();
	}

	private void iniciaComponentes() {
		lblBuscaProduto = new JLabel("Buscar por nome ou validade:");
		textFieldBusca = new JTextField();
		lblTitulo = new JLabel("BUSCA DE PRODUTOS DO ESTOQUE");
		lblGuardaBuscaData = new JLabel();
		lblGuardaBuscaNome = new JLabel();
		btnLimpar = new JButton("Limpar");
		btnBuscar = new JButton("Buscar");
		btnUltimoMes = new JButton("Mês atual");
	}

	private void addComponentes() {
		setLayout(null);
		
		lblBuscaProduto.setBounds(26, 77, 208, 23);
		add(lblBuscaProduto);
		lblBuscaProduto.setForeground(Color.WHITE);

		lblTitulo.setBounds(26, 7, 208, 23);
		add(lblTitulo);
		lblTitulo.setForeground(Color.WHITE);
	
		lblGuardaBuscaNome.setBounds(26, 230, 208, 23);
		add(lblGuardaBuscaNome);
		lblGuardaBuscaNome.setForeground(Color.WHITE);
		
		lblGuardaBuscaData.setBounds(26, 250, 208, 23);
		add(lblGuardaBuscaData);
		lblGuardaBuscaData.setForeground(Color.WHITE);
		
		textFieldBusca.setBounds(26, 113, 208, 23);
		add(textFieldBusca);
		textFieldBusca.setColumns(10);

		btnUltimoMes.setBounds(26, 44, 208, 23);
		add(btnUltimoMes);
		btnUltimoMes.setBackground(Color.WHITE);

		btnLimpar.setBounds(28, 154, 208, 23);
		add(btnLimpar);
		btnLimpar.setBackground(Color.WHITE);

		btnBuscar.setBackground(Color.WHITE);
		btnBuscar.setBounds(28, 194, 208, 23);
		add(btnBuscar);
		btnBuscar.setBackground(Color.WHITE);


		btnLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textFieldBusca.setText(null);
			}
		});

		btnUltimoMes.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(btnUltimoMes)) {
					DateFormat dateFormat = new SimpleDateFormat("MM/yyyy");
					mes = dateFormat.format(new Date());
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
		});

		btnBuscar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				if (arg0.getSource().equals(btnBuscar)) {
					if (textFieldBusca.getText() == null
							|| textFieldBusca.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Busca Invalida");
					} else {
						data = textFieldBusca.getText();
						lblGuardaBuscaData.setText("Última busca realizada: "+data);
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
