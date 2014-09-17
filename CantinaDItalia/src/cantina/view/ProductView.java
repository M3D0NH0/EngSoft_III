package cantina.view;

import static java.lang.System.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSplitPane;
import javax.swing.KeyStroke;

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
	private JMenuItem mntmBuscaValidade;
	private JMenuItem mntmSair;

	public void init() {
		iniciaComponentes();
		addAction();
		addMnemonic();
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
		mntmBuscaValidade = new JMenuItem("Busca por Validade");
		produtosBusca = new ProductBusca();
		mnMenu.add(mntmHome);
		mnMenu.add(mntmBuscaValidade);
		mnMenu.add(mntmSair);
		getContentPane().add(new JLabel(new ImageIcon("img/cantinaditalia.jpg")));
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.GRAY);
		setVisible(false);
		setVisible(true);
	}

	private void addAction() {
		mntmHome.addActionListener(new Tratador());
		mntmBuscaValidade.addActionListener(new Tratador());
		mntmSair.addActionListener(new Tratador());
	}
	
	private void addMnemonic(){
			mntmHome.setMnemonic(KeyEvent.VK_H);
			mntmHome.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,
					ActionEvent.CTRL_MASK));

			mntmBuscaValidade.setMnemonic(KeyEvent.VK_B);
			mntmBuscaValidade.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,
					ActionEvent.CTRL_MASK));

			mntmSair.setMnemonic(KeyEvent.VK_W);
			mntmSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4,
					ActionEvent.ALT_MASK));
	}
	

	public class Tratador implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == mntmBuscaValidade) {
				getContentPane().removeAll();
				setJMenuBar(menuBar);
				getContentPane().add(splitPane, new BorderLayout().CENTER);
				splitPane.setLeftComponent(produtosBusca);
				splitPane.setRightComponent(new JLabel(new ImageIcon("img/cantinaditalia.jpg")));
				setLocationRelativeTo(null);
				splitPane.setDividerLocation(200);
				splitPane.setBackground(Color.GRAY);
				splitPane.setEnabled(false);
				produtosBusca.setBackground(Color.GRAY);
				setVisible(false);
				setVisible(true);
			} else if (e.getSource() == mntmSair) {
				exit(0);
			} else if(e.getSource() == mntmHome){
				getContentPane().removeAll();
				setJMenuBar(menuBar);
				getContentPane().add(new JLabel(new ImageIcon("img/cantinaditalia.jpg")));
				setLocationRelativeTo(null);
				getContentPane().setBackground(Color.GRAY);
				setVisible(false);
				setVisible(true);
			}
		}
	}
}