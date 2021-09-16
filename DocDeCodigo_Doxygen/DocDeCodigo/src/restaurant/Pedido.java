package restaurant;
import java.util.List;
/*
@brief clase encargada de contener los datos de pedidos
*/
public class Pedido {
	static int nextID=0;
	List<ItemPedido> items;
	Usuario usuario;
	String estado;
	int id;
	public Pedido() {
		super();
		this.items = items;
		this.usuario = usuario;
	}
	public Pedido(List<ItemPedido> items, Usuario usuario) {
		super();
		this.items = items;
		this.usuario = usuario;
		estado=null;
	}
	/*
	@param del tipo @class ItemPedido
	@brief el metodo chequea que el estado sea null, si es así los setea en "ABIERTO"
	y luego agrega el item pasado por parametro a la lista items
	*/
	void agregarItem(ItemPedido item) {
		if(estado==null)
			estado="ABIERTO";
		items.add(item);
	}
	/*
	@param del tipo @class ItemPedido
	@brief el metodo remueve de la lista items el item pasado por parametro
	*/
	void eliminarItem(ItemPedido item) {
		items.remove(item);
	}
	/*
	@return del tipo float que es el total pedido
	@brief el metodo crea un float para el total y recorre con un for los items del atributo
	para obtener la cantidad y multiplicarlo por el precio de venta de este y así sumarlo al total
	*/
	float totalPedido() {
		float  acum=0.0f;
		for(int i = 0;i<items.size();i++) {
			acum+=items.get(i).cantidad*items.get(i).getReceta().getPrecioVenta();
		}
		return acum;
	}
	/*
	@brief el metodo invoca a la funcion totalPedido y se lo descuenta al usuario dueño del pedido.
	Posteriormente setea el estado en "ENVIADO". Si ocurre un error ejecuta class SinSaldoException
	*/
	void completarPedido() {
		float total=totalPedido();
		try {
			this.getUsuario().descontarSaldo(total);
			this.setEstado("ENVIADO");
		} catch (SinSaldoException e) {
			System.out.println(e);
		} finally {

		}

	}
	//@brief metodos set y get de los atributos
	public List<ItemPedido> getItems() {
		return items;
	}
	public static int getNextID() {
		return nextID;
	}
	public static void setNextID(int nextID) {
		Pedido.nextID = nextID;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setItems(List<ItemPedido> items) {
		this.items = items;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

}
