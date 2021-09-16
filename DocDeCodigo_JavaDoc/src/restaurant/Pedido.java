package restaurant;
import java.util.List;
/*
@author es un codigo entregado por la materia validacion
@version unica
*/
public class Pedido {
	//@description Atributos de la clase
	static int nextID=0;
	//@see ItemPedido
	List<ItemPedido> items;
	//@see Usuario
	Usuario usuario;
	String estado;
	int id;

	//@description Constructor
	public Pedido() {
		super();
		this.items = items;
		this.usuario = usuario;
	}

	/*
	@param1 del tipo List @see ItemPedido para saber los pedidos
	@param2 del tipo @see Usuario para saber quien lo pide
	@return es el constructor
	@description Constructor
	*/
	public Pedido(List<ItemPedido> items, Usuario usuario) {
		super();
		this.items = items;
		this.usuario = usuario;
		estado=null;
	}
	/*
	@param1 del tipo @see ItemPedido para saber que item se pidio
	@return del tipo void
	@description Chequea si el estado es null y si no lo es lo setea como "ABIERTO" y agrega
	el @ItemPedido por parametro al atributo items
	*/
	void agregarItem(ItemPedido item) {
		//Variable creada para utilizarse en el assert
		int cantidadAnterior = this.getItems().size();
		if(estado==null){
			estado="ABIERTO";
			items.add(item);
		}
		//si el items tiene un nuevo valor siginica que entro al if y se setea el estado a "ABIERTO"
		assert (items.size() == cantidadAnterior + 1);
	}
	/*
	@param1 del tipo @see ItemPedido para saber que se debe retirar
	@return del tipo void
	@description Remueve el item parado por parametro del atributo items.
	*/
	void eliminarItem(ItemPedido item) {
		items.remove(item);
	}
	/*
	@return del tipo float y es el total del pedido
	@description Recorre los items que se encuentran en el atributo y suma el valor de estos
	en una variable que posteriormente retorna.
	*/
	float totalPedido() {
		float  acum=0.0f;
		for(int i = 0;i<items.size();i++) {
			acum+=items.get(i).cantidad*items.get(i).getReceta().getPrecioVenta();
		}
		return acum;
	}
	/*
	@return del tipo void
	@description Crea una variable total invocando al metodo totalPedido y realiza un try catch.
	Le decuenta el total al @see Usuario con un metodo de este y setea el estado
	como "ENVIADO", sino @expection SinSaldoException e imprime la excepcion.
	*/
	void completarPedido() {
		float total=totalPedido();
		try {
			this.getUsuario().descontarSaldo(total);
			this.setEstado("ENVIADO");
			assert (this.getEstado().equals("ENVIADO"));
		} catch (SinSaldoException e) {
			System.out.println(e);
			Assert false: "Ocurrio un error";
		} finally {

		}
	}

	//@description getters y setter de los atributos
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
	public List<ItemPedido> getItems() {
		return items;
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
