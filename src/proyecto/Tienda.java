package proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tienda extends JFrame {

	private JPanel contentPane;
	
	//Primer colchon
	public static String marca0 = "Suavestar";
	public static double precio0 = 499.0;
	public static int garantia0 = 7;
	public static String tamaño0 = "1 1/2 Plaza";
	public static String material0 = "Tela Tricot Acolchada";

	//Segundo colchon
	public static String marca1 = "Springwall";
	public static double precio1 = 679.0;
	public static int garantia1 = 10;
	public static String tamaño1 = "2 Plazas";
	public static String material1 = "Tejido de Punto con Algodón Orgánico";

	//Tercer colhon
	public static String marca2 = "Paraiso";
	public static double precio2 = 479.0;
	public static int garantia2 = 5;
	public static String tamaño2 = "1 1/2 Plazas";
	public static String material2 = "Tejido de Punto";

	//Cuarto colchon
	public static String marca3 = "Drimer";
	public static double precio3 = 749.0;
	public static int garantia3 = 4;
	public static String tamaño3 = "Queen";
	public static String material3 = "Jacquard";

	//Quinto colchon
	public static String marca4 = "Cisne";
	public static double precio4 = 389.0;
	public static int garantia4 = 2;
	public static String tamaño4 = "1 1/2 Plazas";
	public static String material4 = "Tejido de punto";

	//Porcentajes de descuento
	public static double porcentaje0 = 0.0;
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;

	//Cantidad optima de colchones vendidos
	public static int cantidadOptima = 10;

	//Cantidad minima de colchones adquiridos para acceder al obsequio
	public static int cantidadMinimaObsequiable = 3;

	//Obsequio por cantidad minima de colchones adquiridos
	public static String obsequio = "USB";

	//Numero de cliente que recibe el premio sorpresa
	public static int numeroClienteSorpresa = 5;

	//Premio sorpresa
	public static String premioSorpresa = "Un polo";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda frame = new Tienda();
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
	public Tienda() {
		setTitle("Tienda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnArchivo.add(mntmSalir);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		JMenuItem mntmConsultarColchn = new JMenuItem("Consultar colch\u00F3n");
		mntmConsultarColchn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarColchón objconsultarcolchon = new ConsultarColchón();
				objconsultarcolchon.setVisible(true);
			}
		});
		mnMantenimiento.add(mntmConsultarColchn);
		
		JMenuItem mntmModificarColchn = new JMenuItem("Modificar colch\u00F3n");
		mntmModificarColchn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modificar_colchon obj_modificar_colchon = new modificar_colchon();
				obj_modificar_colchon.setVisible(true);
			}
		});
		mnMantenimiento.add(mntmModificarColchn);
		
		JMenuItem mntmListarColchones = new JMenuItem("Listar colchones");
		mntmListarColchones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarColchones objlistarcolchones = new ListarColchones();
				objlistarcolchones.setVisible(true);
			}
		});
		mnMantenimiento.add(mntmListarColchones);
		
		JMenu mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		JMenuItem mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vender objvender = new vender();
				objvender.setVisible(true);
			}
		});
		mnVentas.add(mntmVender);
		
		JMenuItem mntmGenerarReportes = new JMenuItem("Generar reportes");
		mntmGenerarReportes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				generar_reportes obj_generar_reportes = new generar_reportes();
				obj_generar_reportes.setVisible(true);
			}
		});
		mnVentas.add(mntmGenerarReportes);
		
		JMenu mnConfiguracin = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracin);
		
		JMenuItem mntmConfigurarDescuentos = new JMenuItem("Configurar descuentos");
		mntmConfigurarDescuentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConfigurarDescuentos objconfigurardescuentos = new ConfigurarDescuentos();
				objconfigurardescuentos.setVisible(true);
			}
		});
		mnConfiguracin.add(mntmConfigurarDescuentos);
		
		JMenuItem mntmConfigurarObsequio = new JMenuItem("Configurar obsequio");
		mntmConfigurarObsequio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConfigurarObsequio objconfigurarobsequio = new ConfigurarObsequio();
				objconfigurarobsequio.setVisible(true);
			}
		});
		mnConfiguracin.add(mntmConfigurarObsequio);
		
		JMenuItem mntmConfigurarCantidadptima = new JMenuItem("Configurar cantidad \u00F3ptima de colchones vendidos");
		mntmConfigurarCantidadptima.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConfigurarCantidadOptimaDeColchones objoptima = new ConfigurarCantidadOptimaDeColchones();
				objoptima.setVisible(true);
			}
		});
		mnConfiguracin.add(mntmConfigurarCantidadptima);
		
		JMenuItem mntmConfigurarPremioSorpresa = new JMenuItem("Configurar premio sorpresa");
		mntmConfigurarPremioSorpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConfigurarPremioSorpresa objsorpresa = new ConfigurarPremioSorpresa();
				objsorpresa.setVisible(true);
			}
		});
		mnConfiguracin.add(mntmConfigurarPremioSorpresa);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		JMenuItem mntmAcercaDeTienda = new JMenuItem("Acerca de Tienda");
		mntmAcercaDeTienda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acercade objacercade = new acercade();
				objacercade.setVisible(true);
			}
		});
		mnAyuda.add(mntmAcercaDeTienda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
