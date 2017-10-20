package musica;

import javax.swing.JOptionPane;


public class ListaDoble {
	private NodoDoble cabeza;
	private NodoDoble cola;
	
	public ListaDoble() {
		this.cabeza=null;
		
	}
	
	public NodoDoble getCabeza() {
		return cabeza;
	}



	public void setCabeza(NodoDoble cabeza) {
		this.cabeza = cabeza;
	}



	public boolean isVacio() {
		if(cola==null && cabeza==null) {
			return true;
			
		}else {
			return false;
		}
	}
	/*
	 public void insertar(int valor) {//se crea un metodo llamado insertar con parametro llamado valor de tipo entero
		NodoSimple nuevo=new NodoSimple();//se crea un NodoSimple llamado nuevo
		nuevo.setDato(valor);//
		nuevo.setSiguiente(null);
		this.cabeza=nuevo;
		
	} */
	
	/*public void insertar(NodoMusica informacion) {
		NodoDoble nuevo=new NodoDoble();
		nuevo.setInformacion(informacion);
		nuevo.setSiguente(null);
		nuevo.setAnterior(null);
		this.cabeza=nuevo;
		
	}*/
	
	public void insertarAdelante(NodoMusica informacion) {
		if(cabeza==null) {
			cabeza=new NodoDoble(informacion,null,null);
			cola=cabeza;
		}else {
			NodoDoble nuevo=new NodoDoble(informacion,null,cabeza);
			cabeza.setAnterior(nuevo);
			cabeza=nuevo;
		}
		
	}
	
	public void insertarFinal(NodoMusica informacion) {
		if(cola==null) {
			cola= new NodoDoble(informacion,null, null);
			cabeza=cola;
		}else {
			NodoDoble nuevo=new NodoDoble(informacion,cola,null);
			cola.setAnterior(nuevo);
			cola=nuevo;
		}
		
	}
	
	public void mostrasrInicioaFin() {
		NodoDoble recorrer=cabeza;
		while (recorrer!=null) {
			String datos="<=>";
			NodoDoble auxiliar=cabeza;
			while (auxiliar!=null) {
				datos=datos+"["+auxiliar.getInformacion()+"]<=>";
				auxiliar=auxiliar.getSiguente();
				
			}
			JOptionPane.showMessageDialog(null, datos,
					"MOSTRANDO LISTA DE INICIO A FIN",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
	

}
