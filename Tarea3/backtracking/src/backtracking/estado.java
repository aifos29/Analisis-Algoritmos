package backtracking;
/* Est� clase es la crea los posibles estados que se tendr�n.
 * Tendr� un identificador que hara referencia a los posibles estados que llevara la barca es decir:
 * 	-Misionero y canibal
 * 	-Misionero y Misionero
 * 	-Canibal y Canibal
 * 	-Misionero
 *  -Canibal	
 *Tendr� ademas la cantidad de canibales y misioneros que el estado conlleva
 *Y una opci�n que permita cambiar el lado. 0 para derecha 1 para izquierda 
 */	
public class estado {
	//Variables 
	private String identificador;
	private int canibales;
	private int misioneros;
	private int lado;
	//M�todos get and set
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public int getCanibales() {
		return canibales;
	}
	public void setCanibales(int canibales) {
		this.canibales = canibales;
	}
	public int getMisioneros() {
		return misioneros;
	}
	public void setMisioneros(int misioneros) {
		this.misioneros = misioneros;
	}
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	//Constructor. El lado de la barca es el �nico que no se inicializa
	public estado(String identificador, int canibales, int misioneros) {
		super();
		this.identificador = identificador;
		this.canibales = canibales;
		this.misioneros = misioneros;
	}
	
	
	
	
}
