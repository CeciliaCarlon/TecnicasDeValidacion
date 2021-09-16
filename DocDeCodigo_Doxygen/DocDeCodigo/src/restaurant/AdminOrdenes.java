package restaurant;
import java.util.ArrayList;
import java.util.List;
//@brief Clase encargada de administrar los pedidos realizados.
public class AdminOrdenes {
List<Pedido> pedidos;
	//@brief constructor
	public AdminOrdenes() {
		super();
		pedidos= new ArrayList<Pedido>();
	}
	//@brief metodo que procesa el pedido
	void procesar() {

	}
	//@return del tipo int y retorna el id del pedido
	/*@brief metodo que agrega el pedido pasado por parametro a la lista pedidos.
	Setea el estado en "ENCARGADO", setea los datos de este nuevo pedido.
	*/
	int agregar(Pedido p)  {
		p.setEstado("ENCARGADO");
		pedidos.add(p);
		int id=Pedido.getNextID();
		p.setId(id);
		Pedido.setNextID(id+1);
		System.out.println("se ha generado el pedido con el id: "+id);
		return id;
	}
}
