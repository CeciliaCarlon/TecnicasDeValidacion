package restaurant;
import java.util.List;
/*
@author es un codigo entregado por la materia validacion
@version unica
*/
public class ItemMenu {
	//@description Atributos de la clase
	static int nextID;
	int id;
	String nombre;
	float precio;
	Receta receta;
	String tipo;

	/*
	@description Constructor
	@param1 del tipo String y es el nombre del Item
	@param2 del tipo float y es el precio del item
	@param3 del tipo @see Receta
	@param4 del tipo String para saber el tipo
	@return es un constructor
	*/
	public ItemMenu(String nombre, float precio, Receta receta, String tipo) {
		super();
		this.id=nextID;
		nextID++;
		this.nombre = nombre;
		this.precio = precio;
		this.receta = receta;
		this.tipo = tipo;
	}

	//@description getters y setters de los atributos
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
