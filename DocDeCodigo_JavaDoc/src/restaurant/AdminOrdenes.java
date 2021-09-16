package restaurant;
import java.util.ArrayList;
import java.util.List;
/*
@author es un codigo entregado por la materia validacion
@version unica
*/
public class AdminOrdenes {
	//@description Atributos de la clase
	List<Pedido> pedidos;

	//@description Constructor
	public AdminOrdenes() {
		super();
		pedidos= new ArrayList<Pedido>();
	}
	void procesar() {

	}
	/*
	@param1 del tipo @see Pedido
	@return del tipo int que es id
	@description Se setea el estado como "ENCARGADO" se agrega el pedido por paramtro al atributo
	pedidos, se obtiene el proximo ID, se setea, se informa el id del pedido y se
	retorna.
	*/
	int agregar(Pedido p)  {
		p.setEstado("ENCARGADO");
		pedidos.add(p);
		int id=Pedido.getNextID();
		p.setId(id);
		Pedido.setNextID(id+1);
		System.out.println("se ha generado el pedido con el id: "+id);
		return id;
		assert (p.getEstado().equals("ENCARGADO"));
	}


}
