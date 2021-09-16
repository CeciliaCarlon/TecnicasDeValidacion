package restaurant;
import java.util.Date;
/*
@author es un codigo entregado por la materia validacion
@version unica
*/
public class Usuario {
	//@description Atributos de la clase
	static int nextID;
	int id;
	String nombreYApellido;
	int tipoUsuario;
	float saldoCuenta;
	Date ultimaRecarga;
	String email;

	//@description Constructor
	public Usuario(String nombreYApellido, int tipoUsuario, float saldoCuenta,String email) {
		super();
		this.nombreYApellido = nombreYApellido;
		this.tipoUsuario = tipoUsuario;
		this.saldoCuenta = saldoCuenta;
		this.email=email;
	}
	/*
	@param1 del tipo float y es la cantidad que se desea cargar del saldoCuenta
	@return del void
	@description Suma el saldo actual con el atributo que se pasa.
	*/
	public void cargarCredito(float cuanto) {
		saldoCuenta+=cuanto;
	}
	/*
	@param1 del tipo float y es la cantidad que se desea descontar del saldoCuenta
	@return del tipo float y retorna el atributo saldoCuenta
	@description Chequea que el descuento no provoque que el atributo saldoCuenta quede en negativo,
	si es así @exception throw SinSaldoException. De lo contrario descuenta.
	*/
	float descontarSaldo(float cuanto) throws SinSaldoException {
		if((saldoCuenta-cuanto)<0) throw new SinSaldoException();
		else
			saldoCuenta-= cuanto;
		return saldoCuenta;

	}
}
