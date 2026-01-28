public class Cuenta{
	private int nCuenta;
	private int saldo;
	//constructores
	public Cuenta(){}
	public Cuenta(int nCuenta, int saldo){
		this.nCuenta=nCuenta;
		this.saldo=saldo;
	}
	
	//métodos
	//gets
	public int getNCuenta(){
		return nCuenta;
	}
	public int getSaldo(){
		return saldo;
	}

	//set
	public void setNCuenta(int nCuenta){
		this.nCuenta=nCuenta;
	}
	public void setSaldo(int saldo){
		this.saldo=saldo;
	}


	public void ingresar(int dinero){
		saldo=saldo+dinero;
	}
	public void retirar(int dinero){
		saldo=saldo-dinero;
	}
	public void transferencia(Cuenta origen, Cuenta destino, int cantidad){
		if(cantidad>=0 && origen.saldo>=cantidad){
			origen.saldo-=cantidad;
			destino.saldo+=cantidad;
		}
	}
	public 
}