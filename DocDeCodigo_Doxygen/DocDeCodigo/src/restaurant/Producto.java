package restaurant;
/*
@brief Es la clase encargada de contener los datos del producto
*/
public class Producto {
static int nextID;
	int id;
	int stock;
	String nombre;
	float precioCompra;
	public Producto(String nombre, int stock) {
		this.stock=stock;
		this.nombre=nombre;
	}
	//@brief metodos set y get de los atributos
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}
}
