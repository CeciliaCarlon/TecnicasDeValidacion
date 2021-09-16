package restaurant;
//@brief Clase encargada de contener la cantidad de @class Receta de un @class Pedido.
public class ItemPedido {
	int cantidad;
	Receta receta;
	//@brief constructor
	public ItemPedido(int cantidad, Receta receta) {
		super();
		this.cantidad = cantidad;
		this.receta = receta;
	}
	//@brief geter y setters
	public int getCantidad() {
			return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Receta getReceta() {
		return receta;
	}
	public void setReceta(Receta receta) {
		this.receta = receta;
	}
	//@brief metodo encargado de encargar las recetas, si esto no sucede ejecuta @class SinSuficientesIngredientesException
	public void encargar() throws SinSuficientesIngredientesException {

	}
}
