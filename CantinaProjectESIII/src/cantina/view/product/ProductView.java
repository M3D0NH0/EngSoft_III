package cantina.view.product;

import static java.lang.System.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * 
 * @author HSG
 *
 */
public class ProductView extends JFrame {
	public ProductView() {
	}

	private ProductTable produtosRela;
	private JMenuBar menuBar;
	private JMenu mnMenu;
	private JMenuItem mntmTabelaGeral;
	private JMenuItem mntmSair;
	
	public void init()
	{
		iniciaComponentes();
		addAction();
	}
	
	private void iniciaComponentes() {
		setResizable(false);
		setTitle("Cantina Project");
		setSize(1020, 665);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		mntmTabelaGeral = new JMenuItem("Tabela Geral");
		mntmSair = new JMenuItem("Sair");
		mnMenu.add(mntmTabelaGeral);
		mnMenu.add(mntmSair);
		produtosRela = new ProductTable();
		setLocationRelativeTo(null);
		setVisible(false);
		setVisible(true);
	}
	
	private void addAction()
	{
		mntmTabelaGeral.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == mntmTabelaGeral){
					getContentPane().add(produtosRela);
					setVisible(false);
					setVisible(true);
				}
				
			}
		});
		 mntmSair.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource() == mntmSair){
						exit(0);
					}
					
				}
			});
	}
}