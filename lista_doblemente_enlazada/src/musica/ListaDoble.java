package musica;

import javax.swing.JOptionPane;


public class ListaDoble {
	private NodoDoble cabeza;
	private NodoDoble cola;
	
	

	public ListaDoble() {
		cabeza=null;
		cola=null;
		
	}	
	public NodoDoble getCola() {
		return cola;
	}

	public void setCola(NodoDoble cola) {
		this.cola = cola;
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
			cabeza.setSiguente(nuevo);
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
	
	public StringBuilder mostrasrInicioaFin() {
		StringBuilder recorrer=new StringBuilder();
		NodoDoble temporal=cola;
		recorrer.append("NULL <==>");
		while (temporal!=null) {
			recorrer.append(temporal.getInformacion());
			recorrer.append("<==>");
			temporal=temporal.getSiguente();
				
			}
			recorrer.append("NULL");
			return recorrer;
		
	}
	
	public StringBuilder mostrasrFinaInicio() {
		StringBuilder recorrer=new StringBuilder();
		NodoDoble temporal=cabeza;
		recorrer.append("NULL <==>");
		while (temporal!=null) {
			recorrer.append(temporal.getInformacion());
			recorrer.append("<==>");
			temporal=temporal.getAnterior();
				
			}
			recorrer.append("NULL");
			return recorrer;
		
	}
	
	public NodoMusica eliminarCola(){
		NodoMusica dato=cola.getInformacion();
		cola=cola.getAnterior();
		
		if(cola!=null){
			cola.setSiguente(null);;
		}
		else{
			cabeza=null;
		}
		return dato;
	}
	
	public NodoMusica eliminarCabeza(){
		NodoMusica dato=cabeza.getInformacion();
		cabeza=cabeza.getSiguente();
		
		if(cabeza!=null){
			cabeza.setAnterior(null);
		}
		else{
			cola=null;
		}
		return dato;
	}

}
