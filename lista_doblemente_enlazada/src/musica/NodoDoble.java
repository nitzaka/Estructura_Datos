package musica;

public class NodoDoble {
	private NodoMusica Informacion;
	private NodoDoble Siguente;
	private NodoDoble Anterior;
	
	public NodoMusica getInformacion() {
		return Informacion;
	}
	public void setInformacion(NodoMusica informacion) {
		Informacion = informacion;
	}
	public NodoDoble getSiguente() {
		return Siguente;
	}
	public void setSiguente(NodoDoble siguente) {
		Siguente = siguente;
	}
	public NodoDoble getAnterior() {
		return Anterior;
	}
	public void setAnterior(NodoDoble anterior) {
		Anterior = anterior;
	}

	
	

}
