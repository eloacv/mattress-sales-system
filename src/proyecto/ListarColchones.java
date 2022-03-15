package proyecto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListarColchones extends JDialog {

	private final JPanel contentPanel = new JPanel();
	int Ga0, Ga1, Ga2, Ga3, Ga4;
	double Pre0, Pre1, Pre2, Pre3, Pre4;
	String Ta0, Ta1, Ta2, Ta3, Ta4, Ma0 , Ma1, Ma2, Ma3, Ma4;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListarColchones dialog = new ListarColchones();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ListarColchones() {
		setResizable(false);
		setModal(true);
		setTitle("Listado de colchones");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 208);
		contentPanel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(122, 227, 89, 23);
		contentPanel.add(btnCerrar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mostrar_Precio();
				Mostrar_Garantia();
				Mostrar_Tamaño();
				Mostrar_Material();
				Mostrar_Resultados();
			}
			
			void Mostrar_Precio(){
				Pre0 = Tienda.precio0;
				Pre1 = Tienda.precio1;
				Pre2 = Tienda.precio2;
				Pre3 = Tienda.precio3;
				Pre4 = Tienda.precio4;
			}
			
			void Mostrar_Garantia(){
				Ga0 = Tienda.garantia0;
				Ga1 = Tienda.garantia1;
				Ga2 = Tienda.garantia2;
				Ga3 = Tienda.garantia3;
				Ga4 = Tienda.garantia4;
			}
			
			void Mostrar_Tamaño(){
				Ta0 = Tienda.tamaño0;
				Ta1 = Tienda.tamaño1;
				Ta2 = Tienda.tamaño2;
				Ta3 = Tienda.tamaño3;
				Ta4 = Tienda.tamaño4;
			}
			
			void Mostrar_Material(){
				Ma0 = Tienda.material0;
				Ma1 = Tienda.material1;
				Ma2 = Tienda.material2;
				Ma3 = Tienda.material3;
				Ma4 = Tienda.material4;
			}
			
			void Mostrar_Resultados(){
				textArea.setText("\tLISTADO DE COLCHONES" +"\n\n");
				textArea.append("Marca: Suavestar" +"\n");
				textArea.append("Precio: " + Pre0 + "\n");
				textArea.append("Garantia:" + Ga0 + "\n");
				textArea.append("Tamaño: " + Ta0 + "\n");
				textArea.append("Material: " + Ma0 + "\n\n");
				textArea.append("Marca: Springwall" +"\n");
				textArea.append("Precio: " + Pre1 + "\n");
				textArea.append("Garantia:" + Ga1 + "\n");
				textArea.append("Tamaño: " + Ta1 + "\n");
				textArea.append("Material: " + Ma1 + "\n\n");
				textArea.append("Marca: Paraiso" +"\n");
				textArea.append("Precio: " + Pre2 + "\n");
				textArea.append("Garantia:" + Ga2 + "\n");
				textArea.append("Tamaño: " + Ta2 + "\n");
				textArea.append("Material: " + Ma2 + "\n\n");
				textArea.append("Marca: Drimer" +"\n");
				textArea.append("Precio: " + Pre3 + "\n");
				textArea.append("Garantia:" + Ga3 + "\n");
				textArea.append("Tamaño: " + Ta3 + "\n");
				textArea.append("Material: " + Ma3 + "\n\n");
				textArea.append("Marca: Cisne" +"\n");
				textArea.append("Precio: " + Pre4 + "\n");
				textArea.append("Garantia:" + Ga4 + "\n");
				textArea.append("Tamaño: " + Ta4 + "\n");
				textArea.append("Material: " + Ma4 + "\n\n");
			}
		});
		btnListar.setBounds(219, 227, 89, 23);
		contentPanel.add(btnListar);
	}
}
