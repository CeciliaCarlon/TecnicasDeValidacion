package restaurant;
//@brief Clase encargada de almacenar el producto y la cantidad de este para cada @class Receta
public class ItemReceta {
	Producto p;
	int cantidad;
	//@brief constructor
	public ItemReceta(Producto p, int cantidad) {
		super();
		this.p = p;
		this.cantidad = cantidad;
	}

}
