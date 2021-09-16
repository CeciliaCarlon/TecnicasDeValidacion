package restaurant;
/*
@author es un codigo entregado por la materia validacion
@version unica
*/
public class Producto {
	//@description Atributos de la clase
	static int nextID;
	int id;
	int stock;
	String nombre;
	float precioCompra;

	//@description Constructor
	/*
	@param1 del tipo String para indicar el nombre del Producto
	@param2 del tipo int para indicar la cantidad de stock de este
	@return es el constructor, no retorna nada
	*/
	public Producto(String nombre, int stock) {
		this.stock=stock;
		this.nombre=nombre;
	}
	//@return del tipo int y es el stock del Producto
	public int getStock() {
		return stock;
	}
	/*
	@param1 del tipo int y es el stock que se desea establecer en este Producto
	@return del tipo void
	@description Se establece un stock y se setea como el nuevo valor del atributo Stock
	*/
	public void setStock(int stock) {
		this.stock = stock;
	}
	//@return del tipo String y es el nombre del Producto
	public String getNombre() {
		return nombre;
	}
	/*
	@param1 del tipo String y es el nombre que se desea establecer en este Producto
	@return del tipo void
	@description Se establece un nombre y se setea como el nuevo valor del atributo nombre
	*/
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//@return del tipo float y es el precio de la compra del Producto
	public float getPrecioCompra() {
		return precioCompra;
	}
	/*
	@param1 del tipo float y es el precio de compra que se desea establecer en este Producto
	@return del tipo void
	@description Se establece un precio de compra y se setea como el nuevo valor del atributo precioCompra
	*/
	public void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}
}
