package restaurant;
import java.util.List;
//@brief Clase que simula un menu y almacena todos los datos de cada @class Receta.
public class ItemMenu {
	static int nextID;
	int id;
	String nombre;
	float precio;
	Receta receta;
	String tipo;
	//@brief constructor
	public ItemMenu(String nombre, float precio, Receta receta, String tipo) {
		super();
		this.id=nextID;
		nextID++;
		this.nombre = nombre;
		this.precio = precio;
		this.receta = receta;
		this.tipo = tipo;
	}
	//@brief getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public Receta getReceta() {
		return receta;
	}
	public void setReceta(Receta receta) {
		this.receta = receta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
