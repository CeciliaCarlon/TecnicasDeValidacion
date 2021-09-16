package restaurant;
import java.util.List;
/*
@brief Es la clase encargada de almacenar los datos de la receta. Entre ellos: los ingredientes,
el nombre de la receta, el tiempo de coccion y el precio de venta.
*/
public class Receta {
	List<ItemReceta> ingredientes;
	String nombre;
	String tiempoDeCoccion;
	float precioVenta;
	//@brief metodos set y get de los atributos anteriormente mencionados
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
	@param del tipo @class ItemReceta
	@brief el metodo se encarga de agregar al array ingredientes el item pasado por parametro
	*/
	public void addIngrediente(ItemReceta i) {

		ingredientes.add(i);
	}
	/*
	@param del tipo @class Producto y del tipo int
	@brief el metodo se encarga de crear un item con los datos pasados por parametro
	y luego agregar este al array ingredientes
	*/
	public void addIngrediente(Producto producto, int cantidad ) {
		ItemReceta item=new ItemReceta(producto, cantidad);
		ingredientes.add(item);
	}
}
