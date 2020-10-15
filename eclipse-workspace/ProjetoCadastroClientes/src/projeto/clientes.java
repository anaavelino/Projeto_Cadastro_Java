package projeto;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;



public class clientes extends JFrame {
	

   
		private JPanel contentPane;
		private JTextField jtfNome;
		private JTextField jtfEmail;
		private JTextField jtfCelular;
	    
		private	String nome;
		private	String email;
		private String celular;


	public clientes(){
		
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\anaav\\eclipse-workspace\\ProjetoPiloto\\img\\cadastro.png"));
		
		setTitle("PROGRAMA PILOTO");
	
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setBounds(100, 100, 641, 468);
		 contentPane = new JPanel();
		 contentPane.setBorder(new EmptyBorder(5,5,5,5));
		 setContentPane(contentPane);
		 contentPane.setBackground(new Color(245, 222, 179));
		 setLocationRelativeTo(null);
		 contentPane.setLayout(null);
		 
		 JLabel lblNewLabel = new JLabel("CADASTRO DE CLIENTES");
		 lblNewLabel.setBounds(226, 56, 278, 34);
		 lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 19));
		 lblNewLabel.setForeground(new Color(105, 105, 105));
		 contentPane.add(lblNewLabel);
		 
		 JLabel lblNome = new JLabel("Nome Completo ");
		 lblNome.setBounds(130, 150, 192, 14);
		 lblNome.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
		 lblNome.setForeground(new Color(0, 0, 0));
		 contentPane.add(lblNome);
		 
		 //EMAIL
		 JLabel lblEmail = new JLabel("Email");
		 lblEmail.setBounds(130, 198, 78, 14);
		 lblEmail.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		 lblEmail.setForeground(new Color(0, 0, 0));
		 contentPane.add(lblEmail);
		 
		 //CELULAR
		 JLabel lblCelular = new JLabel("Celular");
		 lblCelular.setBounds(130, 245, 78, 14);
		 lblCelular.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		 lblCelular.setForeground(new Color(0, 0, 0));
		 contentPane.add(lblCelular);
		 
		 
		 jtfNome = new JTextField();
		 jtfNome.setBounds(130, 167, 355, 20);
		 contentPane.add(jtfNome);
		 
		 jtfEmail = new JTextField();
		 jtfEmail.setBounds(130, 214, 355, 20);
		 contentPane.add(jtfEmail);
		 
		 jtfCelular = new JTextField();
		 jtfCelular.setBounds(130, 261, 150, 20);
		 contentPane.add(jtfCelular);
		 
		 
 
		 JButton btnCadastrar = new JButton("Cadastrar");
		 btnCadastrar.setBackground(new Color(152, 251, 152));
		 btnCadastrar.setIcon(new ImageIcon("C:\\Users\\anaav\\eclipse-workspace\\ProjetoPiloto\\img\\mais (1).png"));
		 btnCadastrar.setBounds(82, 372, 112, 23);
		 btnCadastrar.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			String nome = jtfNome.getText();
			String email = jtfEmail.getText();
			String celular = jtfCelular.getText();
		
			
			controller con = new controller();
			
			try {
				con.inserir(nome, email, celular);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		
		}
	});
 
		 btnCadastrar.setFont(new Font("Tahona",Font.BOLD,11));
		 contentPane .add(btnCadastrar);
		 
		 JButton btnLimpar = new JButton("Limpar");
		 btnLimpar.setBackground(new Color(255, 165, 0));
		 btnLimpar.setIcon(new ImageIcon("C:\\Users\\anaav\\eclipse-workspace\\ProjetoPiloto\\img\\borracha (2).png"));
		 btnLimpar.setBounds(462, 372, 102, 23);
		 btnLimpar.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					jtfNome.setText("");;
					jtfEmail.setText("");
					jtfCelular.setText("");
				}
			});
		 
		 btnLimpar.setFont(new Font("Tahona",Font.BOLD,11));
		 contentPane .add(btnLimpar);
		 
		 JLabel lblNewLabel_1 = new JLabel("");
		 lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\anaav\\eclipse-workspace\\ProjetoPiloto\\img\\adicionar-amigo.png"));
		 lblNewLabel_1.setBounds(130, 11, 64, 92);
		 contentPane.add(lblNewLabel_1);
		
	}

}
