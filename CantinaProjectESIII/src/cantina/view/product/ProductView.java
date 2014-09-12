package cantina.view.product;

import static java.lang.System.*;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSplitPane;

/**
 * 
 * @author HSG
 *
 */
public class ProductView extends JFrame {
	public ProductView() {
	}

	private ProductView home;
	private JSplitPane splitPane;
	private ProductTable produtosRela;
	private ProductBusca produtosBusca;
	private JMenuBar menuBar;
	private JMenu mnMenu;
	private JMenuItem mntmHome;
	private JMenuItem mntmSair;

	public void init() {
		iniciaComponentes();
		addAction();
	}

	private void iniciaComponentes() {
		home = new ProductView();
		splitPane = new JSplitPane();
		splitPane.setBounds(0, 11, 1010, 590);
		setResizable(false);
		setTitle("Cantina Project");
		setSize(1020, 665);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		mntmHome = new JMenuItem("Home");
		mntmSair = new JMenuItem("Sair");
		produtosRela = new ProductTable();
		produtosBusca = new ProductBusca();
		mnMenu.add(mntmHome);
		mnMenu.add(mntmSair);
		getContentPane().add(splitPane, new BorderLayout().CENTER);
		splitPane.setLeftComponent(produtosBusca);
		splitPane.setRightComponent(produtosRela);
		setLocationRelativeTo(null);
		splitPane.setDividerLocation(200);
		setVisible(false);
		setVisible(true);
	}

	private void addAction() {
		mntmHome.addActionListener(new Tratador());
		mntmSair.addActionListener(new Tratador());
	}

	public class Tratador implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == mntmHome) {
				getContentPane().removeAll();
				getContentPane().add(splitPane, new BorderLayout().CENTER);
				setVisible(false);
				setVisible(true);
			} else if (e.getSource() == mntmSair) {
				exit(0);
			}
		}
	}
}