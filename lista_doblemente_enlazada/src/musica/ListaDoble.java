package musica;

import javax.swing.JOptionPane;


public class ListaDoble {
	private NodoDoble cabeza;
	//private NodoDoble cola;
	
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
		boolean respuesta=true;
		if(this.cabeza!=null) {
			respuesta=false;
		}
		return respuesta;
	}
	/*
	 public void insertar(int valor) {//se crea un metodo llamado insertar con parametro llamado valor de tipo entero
		NodoSimple nuevo=new NodoSimple();//se crea un NodoSimple llamado nuevo
		nuevo.setDato(valor);//
		nuevo.setSiguiente(null);
		this.cabeza=nuevo;
		
	} */
	
	public void insertar(NodoMusica informacion) {
		NodoDoble nuevo=new NodoDoble();
		nuevo.setInformacion(informacion);
		nuevo.setSiguente(null);
		nuevo.setAnterior(null);
		this.cabeza=nuevo;
		
	}
	
	public void insertarAdelante(NodoMusica informacion) {
		if(isVacio()) {
			insertar(informacion);
		}else {
			NodoDoble nuevo = new NodoDoble();
			nuevo.setInformacion(informacion);
			nuevo.setSiguente(this.cabeza);
			this.cabeza.setAnterior(nuevo);
			nuevo.setAnterior(null);
			this.cabeza=nuevo;
		}
	}
	
/*	public void insertarFinal(String dato) {
		if(!isVacio()) {
			cola= new NodoDoble(dato,null, cola);
			cola.Anterior.Siguiente=cola;
		}
		
	}*/
	
	/*public void mostrasrInicioaFin() {
		NodoDoble recorrer=cabeza;
		while (recorrer!=null) {
			String datos="<=>";
			NodoDoble auxiliar=cabeza;
			while (auxiliar!=null) {
				datos=datos+"["+auxiliar.getDato()+"]<=>";
				auxiliar=auxiliar.getSiguente();
				
			}
			JOptionPane.showMessageDialog(null, datos,
					"MOSTRANDO LISTA DE INICIO A FIN",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}*/
	

}
