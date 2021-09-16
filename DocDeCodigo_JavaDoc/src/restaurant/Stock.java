package restaurant;

import java.util.ArrayList;
import java.util.List;

/*
@author es un codigo entregado por la materia validacion
@version unica
*/
public class Stock {
	//@description Atributos de la clase
	//Atributo del tipo @see Producto
	List<Producto> stock;

	//@description Constructor
	public Stock() {
		stock=new ArrayList<Producto>();
	}
	/*
	@param1 es del tipo @see Producto y es el que se desea agregar
	@param2 es del tipo int y contiene la cantidad de @see Producto que se desean agregar
	@return del tipo void
	@description Chequea si hay stock del producto, y si no agrega stock de este a la lista stock
	*/
	public void agregar(Producto p, int cantidad) {
		//Variable creada para utilizarse en el assert
		int cantStockViejo = this.stock.size();
		if(stock.indexOf(p)>=0)
			p.setStock(p.getStock()+cantidad);
		else {
			p.setStock(cantidad);
			stock.add(p);
			assert (this.stock.size() = cantStockViejo + 1);
		}
	}
}
