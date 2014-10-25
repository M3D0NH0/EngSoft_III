package cantina.view;

import static java.lang.System.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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

	protected static JSplitPane splitPane;
	private ProductBusca produtosBusca;
	private ProductInsert produtosInserir;
	private JMenuBar menuBar;
	private JMenu mnMenu;
	private JMenuItem mntmHome;
	private JMenuItem mntmBuscaValidade;
	private JMenuItem mntmCadastro;
	private JMenuItem mntmUltimoMes;
	private JMenuItem mntmSair;
	
	

	public void init() {
		iniciaComponentes();
		addAction();
		addMnemonic();
		ImageIcon img = new ImageIcon("img/cantinalogo.jpg");
		setIconImage(img.getImage());
	}

	private void iniciaComponentes() {
		splitPane = new JSplitPane();
		splitPane.setBounds(0, 11, 1010, 590);
		setResizable(false);
		setTitle("Cantina D'itália");
		setSize(1020, 665);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		mntmHome = new JMenuItem("Home");
		mntmSair = new JMenuItem("Sair");
		mntmBuscaValidade = new JMenuItem("Busca por Validade");
		mntmCadastro = new JMenuItem("Cadastrar Produtos");
		mntmUltimoMes = new JMenuItem("Buscar Mês Atual");
		produtosBusca = new ProductBusca();
		produtosInserir = new ProductInsert();
		mnMenu.add(mntmHome);
		mnMenu.add(mntmBuscaValidade);
		mnMenu.add(mntmUltimoMes);
		mnMenu.add(mntmCadastro);
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
		mntmCadastro.addActionListener(new Tratador());
		mntmUltimoMes.addActionListener(new Tratador());
		mntmSair.addActionListener(new Tratador());
	}
	
	private void addMnemonic(){
			mntmHome.setMnemonic(KeyEvent.VK_H);
			mntmHome.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,
					ActionEvent.CTRL_MASK));

			mntmBuscaValidade.setMnemonic(KeyEvent.VK_B);
			mntmBuscaValidade.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,
					ActionEvent.CTRL_MASK));
			
			mntmCadastro.setMnemonic(KeyEvent.VK_C);
			mntmCadastro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,
					ActionEvent.CTRL_MASK));
			
			mntmUltimoMes.setMnemonic(KeyEvent.VK_M);
			mntmUltimoMes.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,
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
				getClass().getResource("img/cantinaditalia.jpg");
				setLocationRelativeTo(null);
				splitPane.setDividerLocation(250);
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
			} else if(e.getSource() == mntmCadastro){
				getContentPane().removeAll();
				setJMenuBar(menuBar);
				getContentPane().add(splitPane, new BorderLayout().CENTER);
				splitPane.setLeftComponent(produtosInserir);
				splitPane.setRightComponent(new JLabel(new ImageIcon("img/cantinaditalia.jpg")));
				setLocationRelativeTo(null);
				splitPane.setDividerLocation(250);
				splitPane.setBackground(Color.GRAY);
				splitPane.setEnabled(false);
				produtosInserir.setBackground(Color.GRAY);
				setVisible(false);
				setVisible(true);
				
			} else if(e.getSource() == mntmUltimoMes){
				DateFormat dateFormat = new SimpleDateFormat("MM/yyyy");
				String mes = dateFormat.format(new Date());
				ProductTable produtosRela = new ProductTable();
				produtosRela.productTableMes(mes);
				produtosRela.setBackground(Color.GRAY);
				//textFieldBusca.setText(null);
		

				getContentPane().removeAll();
				setJMenuBar(menuBar);
				getContentPane().add(produtosRela);
				setLocationRelativeTo(null);
				produtosBusca.setBackground(Color.GRAY);
				setVisible(false);
				setVisible(true);	
				
			}
		}
	}
}