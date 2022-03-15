package proyecto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;

public class vender extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private final JLabel lblMarca = new JLabel("Marca");
	private final JLabel lblPrecio = new JLabel("Precio (S/)");
	private final JLabel lblCantidad = new JLabel("Cantidad");
	private final JComboBox cb_marca = new JComboBox();
	private final JTextField txt_cantidad = new JTextField();
	private final JTextPane txt_precio = new JTextPane();
	private final JButton btnVender = new JButton("Vender");
	private final JButton btnCerrar = new JButton("Cerrar");
	private final JTextArea textArea = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static double precio = 0;
	public static int cantidad = 0;
	public static double imp_compra = 0, imp_descuento = 0, imp_total = 0;
	public static String marca;
	public static int cantidad_acumulada;
	public static String premio;
	public static int numero_cliente = 1;
	public static String sorpresa = "";
	public static int numero_sorpresa = 0;
	
	// Contadores
	public static int cont_drimer, cont_suavestar, cont_paraiso, cont_cisne, cont_springwall = 0; //cantidad de ventas por marca
	public static int colchones_drimer, colchones_suavestar, colchones_paraiso, colchones_cisne, colchones_springwall = 0; //cantidad de colchones por marca
	public static double imp_drimer, imp_suavestar, imp_paraiso, imp_cisne, imp_springwall = 0; //monto total por marca
	
	

	
	public static void main(String[] args) {
		try {
			vender dialog = new vender();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static double vender (int cantidadp, double preciop){
		double precio_total = cantidadp * preciop;
		return precio_total;
	}
	
	public static double descuento (int cantidadp, double preciop){
		double imp_descuento = 0;
		if (cantidadp == 0){
			imp_descuento = (preciop * (Tienda.porcentaje0)/100) * cantidadp;
		} else if(cantidadp>1 && cantidadp<=5){
			imp_descuento = (preciop * (Tienda.porcentaje1)/100) * cantidadp;
		} else if (cantidadp>5 && cantidadp<=10){
			imp_descuento = (preciop * (Tienda.porcentaje2)/100) * cantidadp;
		} else if (cantidadp>10 && cantidadp<=15){
			imp_descuento = (preciop * (Tienda.porcentaje3)/100) * cantidadp;
		} else if (cantidadp>15){
			imp_descuento = (preciop * (Tienda.porcentaje4)/100) * cantidadp;
		}
		return imp_descuento;
	}
	
	public static double acumulador_cantidad(int cantidadp){
		cantidad_acumulada+= cantidadp;
		return cantidad_acumulada;
	}

	/**
	 * Create the dialog.
	 */
	public static String corresponde_obsequio(int cantidadp){
		String mensaje = "Sin obsequio";
		if(cantidadp >= Tienda.cantidadMinimaObsequiable){
			return Tienda.obsequio;
		}else
			return mensaje;
	}
	public static String num_venta(){
		if (numero_cliente == Tienda.numeroClienteSorpresa){
			premio=Tienda.premioSorpresa;
			return premio;
		}else{
			numero_cliente = numero_cliente + 1;
			premio = "No corresponde";
			return premio;
		}
	}
	
	public static String Sorpresa(int numsor){
		if (numsor==Tienda.numeroClienteSorpresa){
			return Tienda.premioSorpresa;
		}else{
			return "No corresponde";
		}
	}
	
	void mostrarresultados(){
		int cantidad;
		cantidad = Integer.parseInt(txt_cantidad.getText());
		double resultado = vender(cantidad, precio);
		int marca_vendida = cb_marca.getSelectedIndex();
		switch(marca_vendida){
		case 1:
			cont_suavestar++;
			colchones_suavestar+=cantidad;
			imp_suavestar = imp_suavestar + (resultado - descuento(cantidad, precio));
			break;
		case 2:
			cont_springwall++;
			colchones_springwall+=cantidad;
			imp_springwall = imp_springwall + (resultado - descuento(cantidad, precio));
			break;
		case 3:
			cont_paraiso++;
			colchones_paraiso+=cantidad;
			imp_paraiso = imp_paraiso + (resultado - descuento(cantidad, precio));
			break;
		case 4:
			cont_drimer++;
			colchones_drimer+=cantidad;
			imp_drimer = imp_drimer + (resultado - descuento(cantidad, precio));
			break;
		case 5:
			cont_cisne++;
			colchones_cisne+=cantidad;
			imp_cisne = imp_cisne + (resultado - descuento(cantidad, precio));
			break;
			}
		
		
		numero_sorpresa++;
		sorpresa=Sorpresa(numero_sorpresa);
				
		textArea.setText("Marca del colchón: " + marca + "\n");
		textArea.append("Precio unitario: " + precio + "\n");
		textArea.append("Cantidad de unidades adquiridas: " + cantidad + "\n");
		textArea.append("Importe de compra: " + resultado + "\n");
		textArea.append("Importe de descuento: " + descuento(cantidad, precio) + "\n");
		textArea.append("Importe a pagar: " + (resultado - descuento(cantidad, precio)) + "\n");
		textArea.append("Obsequio: " + corresponde_obsequio(cantidad) + "\n");
		textArea.append("Corresponde: " + sorpresa);
			
		
	}
	

	public vender() {
		txt_cantidad.setBounds(81, 73, 86, 20);
		txt_cantidad.setColumns(10);
		setBounds(100, 100, 454, 324);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		lblMarca.setBounds(10, 11, 46, 14);
		
		contentPanel.add(lblMarca);
		lblPrecio.setBounds(10, 44, 61, 14);
		
		contentPanel.add(lblPrecio);
		lblCantidad.setBounds(10, 76, 61, 14);
		txt_precio.setEditable(false);
		
		contentPanel.add(txt_precio);
		
		contentPanel.add(lblCantidad);
		cb_marca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object selected = cb_marca.getSelectedItem();
                if(selected.equals(Tienda.marca0)){
                	marca = Tienda.marca0;
	                txt_precio.setText("" + Tienda.precio0);
	                precio = Tienda.precio0;}
                else if(selected.equals(Tienda.marca1)){
                	marca = Tienda.marca1;
                    txt_precio.setText("" + Tienda.precio1);
                	precio = Tienda.precio1;}
                else if(selected.equals(Tienda.marca2)){
                	marca = Tienda.marca2;
                    txt_precio.setText("" + Tienda.precio2);
                    precio = Tienda.precio2;}
                else if(selected.equals(Tienda.marca3)){
                	marca = Tienda.marca3;
                    txt_precio.setText("" + Tienda.precio3);
                    precio = Tienda.precio3;}
                else if(selected.equals(Tienda.marca4)){
                	marca = Tienda.marca4;
                    txt_precio.setText("" + Tienda.precio4);
                    precio = Tienda.precio4;}
			}
		});
		cb_marca.setBounds(83, 8, 84, 20);
		cb_marca.setModel(new DefaultComboBoxModel(new String[] {"", "Suavestar", "Springwall", "Paraiso", "Drimer", "Cisne"}));
		
		contentPanel.add(cb_marca);
		
		contentPanel.add(txt_cantidad);
		txt_precio.setBounds(81, 42, 86, 16);
		
		
		btnVender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mostrarresultados();
				
			}
		});
		btnVender.setBounds(335, 7, 89, 23);
		
		contentPanel.add(btnVender);
		btnCerrar.setBounds(335, 40, 89, 23);
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		contentPanel.add(btnCerrar);
		textArea.setBounds(10, 105, 418, 169);
		
		contentPanel.add(textArea);
	}
}
