package restaurant;
import java.util.Date;
/*
@brief Esta clase es la encargada de contener los datos de los usuarios así como tambien los
metodos cargarCredito (para incrementar el credito de este) y descontarSaldo (para disminuir el credito)
*/
public class Usuario {
static int nextID;
int id;
String nombreYApellido;
int tipoUsuario;
float saldoCuenta;
Date ultimaRecarga;
String email;
public Usuario(String nombreYApellido, int tipoUsuario, float saldoCuenta,String email) {
	super();
	this.nombreYApellido = nombreYApellido;
	this.tipoUsuario = tipoUsuario;
	this.saldoCuenta = saldoCuenta;
	this.email=email;
}
//@param del tipo float y es la cantidad a incrementar del atributo saldoCuenta
public void cargarCredito(float cuanto) {
	saldoCuenta+=cuanto;

}
/*
@param del tipo float y es la cantidad a descontar del atributo saldoCuenta
@return retorna el saldoCuenta si esta no queda en valor negativo, si es así
tira un @class SinSaldoException
*/
float descontarSaldo(float cuanto) throws SinSaldoException {
	if((saldoCuenta-cuanto)<0) throw new SinSaldoException();
	else
		saldoCuenta-= cuanto;
	return saldoCuenta;

}
}
