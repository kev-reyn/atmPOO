/**
 * 
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * @author ItKevinR
 *
 * 10:20:50 PM
 */
public class PantallaPrincipal extends JFrame {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCuenta;
	private JTextField txtClave;
	private int acum = 0;
	public static int numeroCuentaActual;
	
	private BancoBD bancoBD;
	private VistaUsuario vistaUsuario;

	private boolean usuarioAutentificado;
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaPrincipal frame = new PantallaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public void CloseFrame() {
		super.dispose();
	}
	
	public PantallaPrincipal() {
		
		usuarioAutentificado = false;
		numeroCuentaActual = 0;
		bancoBD = new BancoBD();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelPantalla = new JPanel();
		panelPantalla.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), Color.BLACK, Color.BLACK, Color.BLACK));
		panelPantalla.setBackground(Color.LIGHT_GRAY);
		panelPantalla.setForeground(Color.WHITE);
		panelPantalla.setBounds(10, 11, 555, 100);
		contentPane.add(panelPantalla);
		panelPantalla.setLayout(null);
		
		JLabel lblBienvenidos = new JLabel("Bienvenido");
		lblBienvenidos.setBounds(10, 11, 77, 14);
		panelPantalla.add(lblBienvenidos);
		
		txtCuenta = new JTextField();
		txtCuenta.setEditable(false);
		txtCuenta.setBackground(Color.LIGHT_GRAY);
		txtCuenta.setBounds(188, 34, 235, 20);
		panelPantalla.add(txtCuenta);
		txtCuenta.setColumns(10);
		
		txtClave = new JTextField();
		txtClave.setEditable(false);
		txtClave.setBackground(Color.LIGHT_GRAY);
		txtClave.setBounds(188, 69, 235, 20);
		panelPantalla.add(txtClave);
		txtClave.setColumns(10);
		
		txtCuenta.setText("");
		txtClave.setText("");
		
		JLabel lblCuenta = new JLabel("Numero de cuenta");
		lblCuenta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCuenta.setBounds(20, 37, 147, 14);
		panelPantalla.add(lblCuenta);
		
		JLabel lblNip = new JLabel("NIP");
		lblNip.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNip.setBounds(121, 72, 46, 14);
		panelPantalla.add(lblNip);
		
		JPanel panelTeclado = new JPanel();
		panelTeclado.setForeground(new Color(0, 0, 0));
		panelTeclado.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panelTeclado.setBounds(10, 122, 225, 308);
		contentPane.add(panelTeclado);
		panelTeclado.setLayout(null);
		
		JPanel panelTeclado1 = new JPanel();
		panelTeclado1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panelTeclado1.setBounds(10, 11, 50, 50);
		panelTeclado.add(panelTeclado1);
		panelTeclado1.setLayout(null);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(2, 2, 46, 46);
		panelTeclado1.add(btn1);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				acum = acum + 1;
				
				if(acum<=5) {
				txtCuenta.setText((txtCuenta.getText()+"1"));
				}
				
				if(acum>=6 && acum<=10) {
					txtClave.setText(txtClave.getText()+"1");
				}
			}
		});
		
		JPanel panelTeclado2 = new JPanel();
		panelTeclado2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panelTeclado2.setBounds(89, 11, 50, 50);
		panelTeclado.add(panelTeclado2);
		panelTeclado2.setLayout(null);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acum = acum + 1;
				
				if(acum<=5) {
				txtCuenta.setText((txtCuenta.getText()+"2"));
				}
				
				if(acum>=6 && acum<=10) {
					txtClave.setText(txtClave.getText()+"2");
				}
			}
		});
		btn2.setBounds(2, 2, 46, 46);
		panelTeclado2.add(btn2);
		
		JPanel panelTeclado3 = new JPanel();
		panelTeclado3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panelTeclado3.setBounds(165, 11, 50, 50);
		panelTeclado.add(panelTeclado3);
		panelTeclado3.setLayout(null);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acum = acum + 1;
				
				if(acum<=5) {
				txtCuenta.setText((txtCuenta.getText()+"3"));
				}
				
				if(acum>=6 && acum<=10) {
					txtClave.setText(txtClave.getText()+"3");
				}
			}
		});
		btn3.setBounds(2, 2, 46, 46);
		panelTeclado3.add(btn3);
		
		JPanel panelTeclado4 = new JPanel();
		panelTeclado4.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panelTeclado4.setBounds(10, 72, 50, 50);
		panelTeclado.add(panelTeclado4);
		panelTeclado4.setLayout(null);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acum = acum + 1;
				
				if(acum<=5) {
				txtCuenta.setText((txtCuenta.getText()+"4"));
				}
				
				if(acum>=6 && acum<=10) {
					txtClave.setText(txtClave.getText()+"4");
				}
			}
		});
		btn4.setBounds(2, 2, 46, 46);
		panelTeclado4.add(btn4);
		
		JPanel panelTeclado5 = new JPanel();
		panelTeclado5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelTeclado5.setBounds(89, 72, 50, 50);
		panelTeclado.add(panelTeclado5);
		panelTeclado5.setLayout(null);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acum = acum + 1;
				
				if(acum<=5) {
				txtCuenta.setText((txtCuenta.getText()+"5"));
				}
				
				if(acum>=6 && acum<=10) {
					txtClave.setText(txtClave.getText()+"5");
				}
			}
		});
		btn5.setBounds(2, 2, 46, 46);
		panelTeclado5.add(btn5);
		
		JPanel panelTeclado6 = new JPanel();
		panelTeclado6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelTeclado6.setBounds(165, 72, 50, 50);
		panelTeclado.add(panelTeclado6);
		panelTeclado6.setLayout(null);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acum = acum + 1;
				
				if(acum<=5) {
				txtCuenta.setText((txtCuenta.getText()+"6"));
				}
				
				if(acum>=6 && acum<=10) {
					txtClave.setText(txtClave.getText()+"6");
				}
			}
		});
		btn6.setBounds(2, 2, 46, 46);
		panelTeclado6.add(btn6);
		
		JPanel panelTeclado7 = new JPanel();
		panelTeclado7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelTeclado7.setBounds(10, 133, 50, 50);
		panelTeclado.add(panelTeclado7);
		panelTeclado7.setLayout(null);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acum = acum + 1;
				
				if(acum<=5) {
				txtCuenta.setText((txtCuenta.getText()+"7"));
				}
				
				if(acum>=6 && acum<=10) {
					txtClave.setText(txtClave.getText()+"7");
				}
			}
		});
		btn7.setBounds(2, 2, 46, 46);
		panelTeclado7.add(btn7);
		
		JPanel panelTeclado8 = new JPanel();
		panelTeclado8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelTeclado8.setBounds(89, 133, 50, 50);
		panelTeclado.add(panelTeclado8);
		panelTeclado8.setLayout(null);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acum = acum + 1;
				
				if(acum<=5) {
				txtCuenta.setText((txtCuenta.getText()+"8"));
				}
				
				if(acum>=6 && acum<=10) {
					txtClave.setText(txtClave.getText()+"8");
				}
			}
		});
		btn8.setBounds(2, 2, 46, 46);
		panelTeclado8.add(btn8);
		
		JPanel panelTeclado9 = new JPanel();
		panelTeclado9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelTeclado9.setBounds(165, 133, 50, 50);
		panelTeclado.add(panelTeclado9);
		panelTeclado9.setLayout(null);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acum = acum + 1;
				
				if(acum<=5) {
				txtCuenta.setText((txtCuenta.getText()+"9"));
				}
				
				if(acum>=6 && acum<=10) {
					txtClave.setText(txtClave.getText()+"9");
				}
			}
		});
		btn9.setBounds(2, 2, 46, 46);
		panelTeclado9.add(btn9);
		
		
		JPanel panelTeclado0 = new JPanel();
		panelTeclado0.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panelTeclado0.setBounds(10, 194, 50, 50);
		panelTeclado.add(panelTeclado0);
		panelTeclado0.setLayout(null);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acum = acum + 1;
				
				if(acum<=5) {
				txtCuenta.setText((txtCuenta.getText()+"0"));
				}
				
				if(acum>=6 && acum<=10) {
					txtClave.setText(txtClave.getText()+"0");
				}
			}
		});
		btn0.setBounds(2, 2, 46, 46);
		panelTeclado0.add(btn0);
		
		JPanel panelTecladoEnter = new JPanel();
		panelTecladoEnter.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panelTecladoEnter.setBounds(89, 194, 126, 50);
		panelTeclado.add(panelTecladoEnter);
		panelTecladoEnter.setLayout(null);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int usuario = Integer.parseInt(txtCuenta.getText());
				int nipUsuario = Integer.parseInt(txtClave.getText());
				
				usuarioAutentificado = bancoBD.autentificarCuenta(usuario, nipUsuario);
				
				if(usuarioAutentificado) {
					numeroCuentaActual = usuario;
					vistaUsuario = new VistaUsuario();
					vistaUsuario.setVisible(true);
					CloseFrame();
				}else {
					txtCuenta.setText("");
					txtClave.setText("");
					acum=0;
					JOptionPane.showMessageDialog(null, "CUENTA INEXISTENTE");

				}
				
			}
		});
		btnEnter.setBounds(2, 2, 122, 46);
		panelTecladoEnter.add(btnEnter);
		
		JPanel panelLimpiar = new JPanel();
		panelLimpiar.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panelLimpiar.setBounds(10, 255, 205, 40);
		panelTeclado.add(panelLimpiar);
		panelLimpiar.setLayout(null);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(2, 2, 201, 36);
		panelLimpiar.add(btnLimpiar);
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCuenta.setText("");
				txtClave.setText("");
				acum=0;
			}
		});
	}
}
