package cantina.view.product;

import static java.lang.System.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSplitPane;

/**
 * 
 * @author HSG, M3D0NH0
 *
 */
public class ProductView extends JFrame {

	public ProductView() {
	}

	private ProductView home;
	protected static JSplitPane splitPane;
	private ProductBusca produtosBusca;
	private JMenuBar menuBar;
	private JMenu mnMenu;
	private JMenuItem mntmHome;
	private JMenuItem mntmSair;

	public void init() {
		iniciaComponentes();
		addAction();
		ImageIcon img = new ImageIcon("img/cantinalogo.jpg");
		setIconImage(img.getImage());
	}

	private void iniciaComponentes() {
		home = new ProductView();
		splitPane = new JSplitPane();
		splitPane.setBounds(0, 11, 1010, 590);
		setResizable(false);
		setTitle("Cantina D'Italia");
		setSize(1020, 665);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		mntmHome = new JMenuItem("Home");
		mntmSair = new JMenuItem("Sair");
		produtosBusca = new ProductBusca();
		mnMenu.add(mntmHome);
		mnMenu.add(mntmSair);
		getContentPane().add(splitPane, new BorderLayout().CENTER);
		splitPane.setLeftComponent(produtosBusca);
		splitPane.setRightComponent(new JLabel(new ImageIcon("img/cantinaditalia.jpg")));
		setLocationRelativeTo(null);
		splitPane.setDividerLocation(200);
		setVisible(false);
		setVisible(true);
		splitPane.setBackground(Color.GRAY);
		produtosBusca.setBackground(Color.GRAY);
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
				setJMenuBar(menuBar);
				getContentPane().add(splitPane, new BorderLayout().CENTER);
				splitPane.setLeftComponent(produtosBusca);
				splitPane.setRightComponent(new JLabel(new ImageIcon("img/cantinaditalia.jpg")));
				setLocationRelativeTo(null);
				splitPane.setDividerLocation(200);
				setVisible(false);
				setVisible(true);
			} else if (e.getSource() == mntmSair) {
				exit(0);
			}
		}
	}
}