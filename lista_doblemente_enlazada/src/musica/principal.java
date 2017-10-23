package musica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;

public class principal {

	private JFrame frame;
	private JTextField txtId;
	private JTextField txtAlbum;
	private JTextField txtArtista;
	private JTextField txtGenero;
	
	ListaDoble listadoble=new ListaDoble();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal window = new principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 787, 482);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		TextArea txthola = new TextArea();
		txthola.setBounds(28, 243, 687, 160);
		frame.getContentPane().add(txthola);
		
		JLabel lblNewLabel = new JLabel("MEN\u00DA DE  OPCI\u00D3NES");
		lblNewLabel.setBounds(267, 11, 160, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnInsertarAdelante = new JButton("Insertar nodo adelante");
		btnInsertarAdelante.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		btnInsertarAdelante.setBackground(Color.PINK);
		btnInsertarAdelante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NodoMusica nuevo=new NodoMusica();
				
				nuevo.setId(txtId.getText());
				nuevo.setAlbum(txtAlbum.getText());
				nuevo.setArtista(txtArtista.getText());
				nuevo.setGenero(txtGenero.getText());
				
				listadoble.insertarAdelante(nuevo);	
				JOptionPane.showMessageDialog(null, "Informacion insertada adelante!");
				



			}
		});
		btnInsertarAdelante.setBounds(10, 26, 192, 23);
		frame.getContentPane().add(btnInsertarAdelante);
		
		JButton btnInsertarAtras = new JButton("Insertar nodo atras");
		btnInsertarAtras.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		btnInsertarAtras.setBackground(Color.PINK);
		btnInsertarAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NodoMusica nuevo=new NodoMusica();
				
				nuevo.setId(txtId.getText());
				nuevo.setAlbum(txtAlbum.getText());
				nuevo.setArtista(txtArtista.getText());
				nuevo.setGenero(txtGenero.getText());
				
				listadoble.insertarFinal(nuevo);	
				JOptionPane.showMessageDialog(null, "Informacion insertada atras!");
				


				
			}
		});
		btnInsertarAtras.setBounds(72, 52, 160, 23);
		frame.getContentPane().add(btnInsertarAtras);
		
		JButton btnEliminarPrimer = new JButton("Eliminar primer nodo");
		btnEliminarPrimer.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		btnEliminarPrimer.setBackground(Color.PINK);
		btnEliminarPrimer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int op=JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar el primer nodo?");
				if(JOptionPane.YES_OPTION==op) {
					listadoble.eliminarCabeza();
					JOptionPane.showMessageDialog(null, "Se a eliminado correctamente!!");
					txthola.setText("");
				}
			}
		});
		btnEliminarPrimer.setBounds(267, 26, 192, 23);
		frame.getContentPane().add(btnEliminarPrimer);
		
		JButton btnEliminarUltimo = new JButton("Eliminar ultimo nodo");
		btnEliminarUltimo.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		btnEliminarUltimo.setBackground(Color.PINK);
		btnEliminarUltimo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int op=JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar el ultimo nodo?");
				if(JOptionPane.YES_OPTION==op) {
					listadoble.eliminarCola();
					JOptionPane.showMessageDialog(null, "Se a eliminado correctamente!!");
					txthola.setText("");
				}
				
			}
		});
		btnEliminarUltimo.setBounds(309, 52, 183, 23);
		frame.getContentPane().add(btnEliminarUltimo);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		btnSalir.setBackground(Color.PINK);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(465, 409, 94, 23);
		frame.getContentPane().add(btnSalir);
		
		txtId = new JTextField();
		txtId.setBackground(new Color(255, 228, 225));
		txtId.setBounds(28, 123, 301, 37);
		frame.getContentPane().add(txtId);
		txtId.setColumns(10);
		
		JLabel lblInserteElTipo = new JLabel("INSERTE EL ID DE LA CANCION");
		lblInserteElTipo.setBounds(39, 98, 225, 14);
		frame.getContentPane().add(lblInserteElTipo);
		
		JLabel lblNewLabel_1 = new JLabel("INSERTE EL ALBUM DE LA CANCION");
		lblNewLabel_1.setBounds(38, 171, 225, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtAlbum = new JTextField();
		txtAlbum.setBackground(new Color(255, 228, 225));
		txtAlbum.setBounds(28, 196, 301, 37);
		frame.getContentPane().add(txtAlbum);
		txtAlbum.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("INSERTE EL NOMBRE DEL ARTISTA");
		lblNewLabel_2.setBounds(465, 98, 225, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtArtista = new JTextField();
		txtArtista.setBackground(new Color(255, 228, 225));
		txtArtista.setBounds(408, 123, 301, 37);
		frame.getContentPane().add(txtArtista);
		txtArtista.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("INSERTE EL GENERO DE LA CANCION");
		lblNewLabel_3.setBounds(465, 171, 225, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		txtGenero = new JTextField();
		txtGenero.setBackground(new Color(255, 228, 225));
		txtGenero.setBounds(408, 196, 307, 37);
		frame.getContentPane().add(txtGenero);
		txtGenero.setColumns(10);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		btnLimpiar.setBackground(Color.PINK);
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtId.setText("");
				txtAlbum.setText("");
				txtArtista.setText("");
				txtGenero.setText("");
				
				txthola.setText("");
			}
		});
		btnLimpiar.setBounds(175, 409, 89, 23);
		frame.getContentPane().add(btnLimpiar);
		
		JButton btnRecorridoHaciaDelante = new JButton("Recorrido hacia delante");
		btnRecorridoHaciaDelante.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		btnRecorridoHaciaDelante.setBackground(Color.PINK);
		btnRecorridoHaciaDelante.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txthola.setText(listadoble.mostrasrInicioaFin().toString());
			}
		});
		btnRecorridoHaciaDelante.setBounds(512, 26, 197, 23);
		frame.getContentPane().add(btnRecorridoHaciaDelante);
		
		JButton btnRecorridoHaciaAtras = new JButton("Recorrido hacia atras");
		btnRecorridoHaciaAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txthola.setText(listadoble.mostrasrFinaInicio().toString());
			}
		});
		btnRecorridoHaciaAtras.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		btnRecorridoHaciaAtras.setBackground(Color.PINK);
		btnRecorridoHaciaAtras.setBounds(566, 52, 183, 23);
		frame.getContentPane().add(btnRecorridoHaciaAtras);
		
		
		
		
	}
}
