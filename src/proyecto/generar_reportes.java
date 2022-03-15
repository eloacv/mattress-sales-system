package proyecto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class generar_reportes extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private final JLabel lblTipoDeReporte = new JLabel("Tipo de reporte:");
	private final JComboBox comboBox = new JComboBox();
	private final JButton btnCerrar = new JButton("Cerrar");
	private final JTextArea textArea = new JTextArea();
	private final JScrollPane scrollPane = new JScrollPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			generar_reportes dialog = new generar_reportes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
					textArea.append("Total colchones: " + acumulador_cantidad(cantidad) + "\n");

	 */
	void cuadro1(){
		textArea.setText("Ventas por colchón \n\n");
		textArea.append("Marca: " + Tienda.marca0 + "\n");
		textArea.append("Cantidad de ventas: " + vender.cont_suavestar + "\n");
		textArea.append("Cantidad total de unidades vendidas: " + vender.colchones_suavestar + "\n");
		textArea.append("Importe total acumulado: " + vender.imp_suavestar + "\n\n");
		textArea.append("Marca: " + Tienda.marca1 + "\n");
		textArea.append("Cantidad de ventas: " + vender.cont_springwall + "\n");
		textArea.append("Cantidad total de unidades vendidas: " + vender.colchones_springwall + "\n");
		textArea.append("Importe total acumulado: " + vender.imp_springwall + "\n\n");
		textArea.append("Marca: " + Tienda.marca2 + "\n");
		textArea.append("Cantidad de ventas: " + vender.cont_paraiso + "\n");
		textArea.append("Cantidad total de unidades vendidas: " + vender.colchones_paraiso + "\n");
		textArea.append("Importe total acumulado: " + vender.imp_paraiso + "\n\n");
		textArea.append("Marca: " + Tienda.marca3 + "\n");
		textArea.append("Cantidad de ventas: " + vender.cont_drimer + "\n");
		textArea.append("Cantidad total de unidades vendidas: " + vender.colchones_drimer + "\n");
		textArea.append("Importe total acumulado: " + vender.imp_drimer + "\n\n");
		textArea.append("Marca: " + Tienda.marca0 + "\n");
		textArea.append("Cantidad de ventas: " + vender.cont_cisne + "\n");
		textArea.append("Cantidad total de unidades vendidas: " + vender.colchones_cisne + "\n");
		textArea.append("Importe total acumulado: " + vender.imp_cisne + "\n\n");
	}
	void cuadro2(){
		int i = 0;
		textArea.setText("");
		if(vender.colchones_suavestar>=Tienda.cantidadOptima){
			i+=1;
			textArea.append("Marca: " + Tienda.marca0 + "\n");
			textArea.append("Cantidad total de unidades vendidas: " + vender.colchones_suavestar + "("+(vender.colchones_suavestar-Tienda.cantidadOptima)+"más que la cantidad óptima) \n\n");
		}else{
			textArea.append("");
		}
			
		if(vender.colchones_springwall>=Tienda.cantidadOptima){
			i+=1;
			textArea.append("Marca: " + Tienda.marca1 + "\n");
			textArea.append("Cantidad total de unidades vendidas: " + vender.colchones_springwall + "("+(vender.colchones_springwall-Tienda.cantidadOptima)+"más que la cantidad óptima) \n\n");
		}else{
			textArea.append("");
		}
		
		if(vender.colchones_paraiso>=Tienda.cantidadOptima){
			i+=1;
			textArea.append("Marca: " + Tienda.marca2 + "\n");
			textArea.append("Cantidad total de unidades vendidas: " + vender.colchones_paraiso + "("+(vender.colchones_paraiso-Tienda.cantidadOptima)+"más que la cantidad óptima) \n\n");
		}else{
			textArea.append("");
		} 
		
		if(vender.colchones_drimer>=Tienda.cantidadOptima){
			i+=1;
			textArea.append("Marca: " + Tienda.marca3 + "\n");
			textArea.append("Cantidad total de unidades vendidas: " + vender.colchones_drimer + "("+(vender.colchones_drimer-Tienda.cantidadOptima)+"más que la cantidad óptima) \n\n");
		}else{
			textArea.append("");
		}
		
		if(vender.colchones_cisne>=Tienda.cantidadOptima){
			i+=1;
			textArea.append("Marca: " + Tienda.marca4 + "\n");
			textArea.append("Cantidad total de unidades vendidas: " + vender.colchones_cisne + "("+(vender.colchones_cisne-Tienda.cantidadOptima)+"más que la cantidad óptima) \n\n");
		}else{
			textArea.append("");
		}
		
		if(i==0){
			textArea.append("No existen marcas con venta óptima");
		}

	}
	
	void cuadro3(){
		textArea.setText("");
		double precio_promedio = (Tienda.precio0+Tienda.precio1+Tienda.precio2+Tienda.precio3+Tienda.precio4)/5;
		String condicion1 = "";
		if(Tienda.precio0>precio_promedio){
			condicion1=" (mayor al promedio)";
		}else if(Tienda.precio0<precio_promedio){
			condicion1=" (menor al promedio)";
		}else condicion1=" (igual al promedio)";
		
		
		String condicion2 = "";
		if(Tienda.precio1>precio_promedio){
			condicion2=" (mayor al promedio)";
		}else if(Tienda.precio1<precio_promedio){
			condicion2=" (menor al promedio)";
		}else condicion2=" (igual al promedio)";
		
		String condicion3 = "";
		if(Tienda.precio2>precio_promedio){
			condicion3=" (mayor al promedio)";
		}else if(Tienda.precio2<precio_promedio){
			condicion3=" (menor al promedio)";
		}else condicion3=" (igual al promedio)";
		
		String condicion4 = "";
		if(Tienda.precio3>precio_promedio){
			condicion4=" (mayor al promedio)";
		}else if(Tienda.precio3<precio_promedio){
			condicion4=" (menor al promedio)";
		}else condicion4=" (igual al promedio)";
		
		String condicion5 = "";
		if(Tienda.precio4>precio_promedio){
			condicion5=" (mayor al promedio)";
		}else if(Tienda.precio4<precio_promedio){
			condicion5=" (menor al promedio)";
		}else condicion5=" (igual al promedio)";
		
		
		textArea.append("Marca: " + Tienda.marca0 + "\n");
		textArea.append("Precio: "+Tienda.precio0 + condicion1 + "\n\n");
		textArea.append("Marca: " + Tienda.marca1 + "\n");
		textArea.append("Precio: "+Tienda.precio1 + condicion2 + "\n\n");
		textArea.append("Marca: " + Tienda.marca2 + "\n");
		textArea.append("Precio: "+Tienda.precio2 + condicion3 + "\n\n");
		textArea.append("Marca: " + Tienda.marca3 + "\n");
		textArea.append("Precio: "+Tienda.precio3 + condicion4 + "\n\n");
		textArea.append("Marca: " + Tienda.marca4 + "\n");
		textArea.append("Precio: "+Tienda.precio4 + condicion5 + "\n\n");
		textArea.append("Precio promedio: " + precio_promedio);
	}
	
	void cuadro4(){
		textArea.setText("");
		double precio_promedio = (Tienda.precio0+Tienda.precio1+Tienda.precio2+Tienda.precio3+Tienda.precio4)/5;
		double mayor = Tienda.precio0;
		double menor = Tienda.precio0;


		if(mayor <= Tienda.precio1)
			mayor = Tienda.precio1;
		if(mayor <= Tienda.precio2)
			mayor = Tienda.precio2;
		if(mayor <= Tienda.precio3)
			mayor = Tienda.precio3;
		if(mayor <= Tienda.precio4)
			mayor = Tienda.precio4;
		
		
		if(menor >= Tienda.precio1)
			menor = Tienda.precio1;
		if(menor >= Tienda.precio2)
			menor = Tienda.precio2;
		if(menor >= Tienda.precio3)
			menor = Tienda.precio3;
		if(menor >= Tienda.precio4)
			menor = Tienda.precio4;
		
		textArea.append("Precio promedio: " + precio_promedio + "\n");
		textArea.append("Precio mayor: " + mayor + "\n");
		textArea.append("Precio menor: " + menor + "\n");
		
		
		
		
	}
	public generar_reportes() {
		setBounds(100, 100, 626, 352);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		lblTipoDeReporte.setBounds(10, 11, 97, 14);
		
		contentPanel.add(lblTipoDeReporte);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int seleccionado = comboBox.getSelectedIndex();
				if(seleccionado == 1){
					cuadro1();
				}else if (seleccionado == 2){
					cuadro2();
				}else if (seleccionado == 3){
					cuadro3();
				}else if (seleccionado ==4){
					cuadro4();
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Ventas por marca", "Marcas con venta \u00F3ptima", "Precios en relaci\u00F3n al promedio", "Precio promedio, menor y mayor"}));
		comboBox.setBounds(136, 8, 218, 20);
		
		contentPanel.add(comboBox);
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnCerrar.setBounds(511, 7, 89, 23);
		
		contentPanel.add(btnCerrar);
		scrollPane.setBounds(10, 49, 590, 253);
		
		contentPanel.add(scrollPane);
		scrollPane.setViewportView(textArea);
	}
}
