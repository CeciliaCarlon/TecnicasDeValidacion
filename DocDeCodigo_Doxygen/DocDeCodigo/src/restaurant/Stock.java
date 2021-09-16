package restaurant;

import java.util.ArrayList;
import java.util.List;
/*
@brief La clase se encarga de administrar el stock de @class Producto
*/
public class Stock {
List<Producto> stock;
public Stock() {
	stock=new ArrayList<Producto>();
}
/*
@param del tipo @class Producto y del tipo int
@brief se encarga de fijarse si hay stock del producto que se desea agregar. Si lo hay
incrementa el stock de este, de lo contrario lo agrega al array y le setea la cantidad
*/
public void agregar(Producto p, int cantidad) {
	if(stock.indexOf(p)>=0)
		p.setStock(p.getStock()+cantidad);
	else {
		p.setStock(cantidad);
		stock.add(p);
	}

}
}
