package restaurant;
//@brief Clase encargada de informar cuando ocurre un error.
public class SinSaldoException extends Exception {
  //@return del tipo String ya que retorna el mensaje que debe aparecer cuando ocurre un error
  public String toString() { return "No tiene suficiente saldo";}
}
