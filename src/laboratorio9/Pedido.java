
package laboratorio9;

/**
 *
 * @author olste
 */
public class Pedido {
	public String codigo;
	public String tipo;
	public String tamanio;
	public int cantidad;
	public double precio;
	public double total;

	public Pedido(){
		this.codigo = "";
		this.tipo = "";
		this.tamanio = "";
		this.cantidad = 0;
		this.precio = 0;
		this.total = 0;
	}

	public void setPedido(String c, String t, String tam, int cant, double pre, double tot){
		this.codigo =c;
		this.tipo = t;
		this.tamanio = tam;
		this.cantidad = cant;
		this.precio = pre;
		this.total = tot;
	}

}
