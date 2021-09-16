package restaurant;
/*
@author es un codigo entregado por la materia validacion
@version unica
*/
public class ItemPedido {
	//@description Atributos de la clase
	int cantidad;
	Receta receta;

	//@description Constructor
	public ItemPedido(int cantidad, Receta receta) {
		super();
		this.cantidad = cantidad;
		this.receta = receta;
	}

	//@description getters y setter de los atributos
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
	/*
	@return del tipo void
	@description Encarga los intems que ya no tienen stock y puede @exception SinSuficientesIngredientesException
	*/
	public void encargar() throws SinSuficientesIngredientesException {

	}
}
