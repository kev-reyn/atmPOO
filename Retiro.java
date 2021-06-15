/**
 * 
 */


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

/**
 * @author ItKevinR
 *
 * 03:43:12 AM
 */
public class Retiro extends JFrame {

	private JPanel contentPane;
	private JTextField txtRetiro;
	public static double montoR;
	private double num;
	
	public void CloseFrame() {
		super.dispose();
	}
	
	public void ObtenerNum(double num) {
		this.num=num;
	}

	public Retiro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 11, 555, 100);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblInstrucciones = new JLabel("LOS RETIROS SOLO PUEDEN SER M\u00DALTIPLOS DE 100");
		lblInstrucciones.setHorizontalAlignment(SwingConstants.CENTER);
		lblInstrucciones.setBounds(10, 11, 535, 14);
		panel.add(lblInstrucciones);
		
		JLabel lblOpcion1 = new JLabel("INGRESA MONTO A RETIRAR");
		lblOpcion1.setHorizontalAlignment(SwingConstants.CENTER);
		lblOpcion1.setBounds(10, 49, 183, 14);
		panel.add(lblOpcion1);
		
		JLabel lblOpcion2 = new JLabel("ELIGE 0 Y DA ENTER PARA CANCELAR LA TRANSACCI\u00D3N");
		lblOpcion2.setHorizontalAlignment(SwingConstants.CENTER);
		lblOpcion2.setBounds(10, 24, 535, 14);
		panel.add(lblOpcion2);
		
		JLabel lblSalir = new JLabel("PARA SALIR S\u00D3LO PRESIONE LA TECLA \"0\"");
		lblSalir.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalir.setBounds(127, 75, 326, 14);
		panel.add(lblSalir);
		
		txtRetiro = new JTextField();
		txtRetiro.setEditable(false);
		txtRetiro.setBounds(189, 46, 183, 20);
		panel.add(txtRetiro);
		txtRetiro.setColumns(10);
		
		JPanel panelTeclado = new JPanel();
		panelTeclado.setLayout(null);
		panelTeclado.setForeground(Color.BLACK);
		panelTeclado.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panelTeclado.setBounds(10, 122, 225, 308);
		contentPane.add(panelTeclado);
		
		JPanel panelTeclado1 = new JPanel();
		panelTeclado1.setLayout(null);
		panelTeclado1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panelTeclado1.setBounds(10, 11, 50, 50);
		panelTeclado.add(panelTeclado1);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtRetiro.setText((txtRetiro.getText()+"1"));
				
			}
		});
		btn1.setBounds(2, 2, 46, 46);
		panelTeclado1.add(btn1);
		
		JPanel panelTeclado2 = new JPanel();
		panelTeclado2.setLayout(null);
		panelTeclado2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panelTeclado2.setBounds(89, 11, 50, 50);
		panelTeclado.add(panelTeclado2);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtRetiro.setText((txtRetiro.getText()+"2"));
			
			}
			
		});
		btn2.setBounds(2, 2, 46, 46);
		panelTeclado2.add(btn2);
		
		JPanel panelTeclado3 = new JPanel();
		panelTeclado3.setLayout(null);
		panelTeclado3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panelTeclado3.setBounds(165, 11, 50, 50);
		panelTeclado.add(panelTeclado3);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtRetiro.setText((txtRetiro.getText()+"3"));
			}
		});
		btn3.setBounds(2, 2, 46, 46);
		panelTeclado3.add(btn3);
		
		JPanel panelTeclado4 = new JPanel();
		panelTeclado4.setLayout(null);
		panelTeclado4.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panelTeclado4.setBounds(10, 72, 50, 50);
		panelTeclado.add(panelTeclado4);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRetiro.setText((txtRetiro.getText()+"4"));
			}
		});
		btn4.setBounds(2, 2, 46, 46);
		panelTeclado4.add(btn4);
		
		JPanel panelTeclado5 = new JPanel();
		panelTeclado5.setLayout(null);
		panelTeclado5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelTeclado5.setBounds(89, 72, 50, 50);
		panelTeclado.add(panelTeclado5);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRetiro.setText((txtRetiro.getText()+"5"));
			}
		});
		btn5.setBounds(2, 2, 46, 46);
		panelTeclado5.add(btn5);
		
		JPanel panelTeclado6 = new JPanel();
		panelTeclado6.setLayout(null);
		panelTeclado6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelTeclado6.setBounds(165, 72, 50, 50);
		panelTeclado.add(panelTeclado6);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRetiro.setText((txtRetiro.getText()+"6"));
			}
		});
		btn6.setBounds(2, 2, 46, 46);
		panelTeclado6.add(btn6);
		
		JPanel panelTeclado7 = new JPanel();
		panelTeclado7.setLayout(null);
		panelTeclado7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelTeclado7.setBounds(10, 133, 50, 50);
		panelTeclado.add(panelTeclado7);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRetiro.setText((txtRetiro.getText()+"7"));
			}
		});
		btn7.setBounds(2, 2, 46, 46);
		panelTeclado7.add(btn7);
		
		JPanel panelTeclado8 = new JPanel();
		panelTeclado8.setLayout(null);
		panelTeclado8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelTeclado8.setBounds(89, 133, 50, 50);
		panelTeclado.add(panelTeclado8);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRetiro.setText((txtRetiro.getText()+"8"));
			}
		});
		btn8.setBounds(2, 2, 46, 46);
		panelTeclado8.add(btn8);
		
		JPanel panelTeclado9 = new JPanel();
		panelTeclado9.setLayout(null);
		panelTeclado9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelTeclado9.setBounds(165, 133, 50, 50);
		panelTeclado.add(panelTeclado9);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRetiro.setText((txtRetiro.getText()+"9"));
			}
		});
		btn9.setBounds(2, 2, 46, 46);
		panelTeclado9.add(btn9);
		
		JPanel panelTeclado0 = new JPanel();
		panelTeclado0.setLayout(null);
		panelTeclado0.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panelTeclado0.setBounds(10, 194, 50, 50);
		panelTeclado.add(panelTeclado0);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRetiro.setText((txtRetiro.getText()+"0"));
			}
		});
		btn0.setBounds(2, 2, 46, 46);
		panelTeclado0.add(btn0);
		
		JPanel panelTecladoEnter = new JPanel();
		panelTecladoEnter.setLayout(null);
		panelTecladoEnter.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panelTecladoEnter.setBounds(89, 194, 126, 50);
		panelTeclado.add(panelTecladoEnter);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double monto = Double.parseDouble(txtRetiro.getText());
				
			
				
				
				if(monto==0) {
					CloseFrame();
				}
				
				if(monto<=num) {
					montoR=monto;
					CloseFrame();
				}
				
			}
		});
		btnEnter.setBounds(2, 2, 122, 46);
		panelTecladoEnter.add(btnEnter);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_1.setBounds(10, 255, 205, 40);
		panelTeclado.add(panel_1);
		
		JButton button = new JButton("Limpiar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRetiro.setText("");
			}
		});
		button.setBounds(2, 2, 201, 36);
		panel_1.add(button);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_3.setBounds(245, 307, 320, 123);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton button_1 = new JButton("-------------------------------------------------------------------------");
		button_1.setBounds(10, 77, 300, 12);
		panel_3.add(button_1);
		
		JLabel lblInserteAquEl = new JLabel("INSERTE AQU\u00CD EL SOBRE DE DEPOSITO");
		lblInserteAquEl.setHorizontalAlignment(SwingConstants.CENTER);
		lblInserteAquEl.setBounds(40, 32, 238, 14);
		panel_3.add(lblInserteAquEl);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_2.setBounds(245, 124, 320, 123);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnRetiro = new JButton("-------------------------------------------------------------------------");
		btnRetiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInternalMessageDialog(null, "PRIMERO TIENES QUE DAR ENTER Y DESPUES RETIRAR EL EFECTIVO");
			}
		});
		btnRetiro.setBounds(10, 72, 300, 12);
		panel_2.add(btnRetiro);
		
		JLabel lblNewLabel = new JLabel("TOMA AQU\u00CD EL EFECTIVO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(38, 25, 238, 14);
		panel_2.add(lblNewLabel);
	}

}
