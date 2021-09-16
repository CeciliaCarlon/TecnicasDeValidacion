package restaurant;
import java.util.List;
/*
@author es un codigo entregado por la materia validacion
@version unica
*/
public class Receta {
	//@description Atributos de la clase
	List<ItemReceta> ingredientes;
	String nombre;
	String tiempoDeCoccion;
	float precioVenta;

	//@description getters y setter de los atributos
	public float getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTiempoDeCoccion() {
		return tiempoDeCoccion;
	}
	public void setTiempoDeCoccion(String tiempoDeCoccion) {
		this.tiempoDeCoccion = tiempoDeCoccion;
	}
	/*
	@param1 del tipo @see ItemReceta
	@return del tipo void
	@description Agrega el item pasado por parametro al atributo ingredientes.
	*/
	public void addIngrediente(ItemReceta i) {
		ingredientes.add(i);
	}
	/*
	@param1 del tipo @see Producto que es el producto que se desea agregar
	@param2 del tipo int que es la cantidad
	@return del tipo void
	@description Crea un @ItemReceta con los parametros y agrega este al atributo ingredientes
	*/
	public void addIngrediente(Producto producto, int cantidad ) {
		ItemReceta item=new ItemReceta(producto, cantidad);
		ingredientes.add(item);
	}
}
