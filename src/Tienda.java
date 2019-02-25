/**
 *
 * @author jgonzalezar
 */
public class Tienda extends Eslabon {
    protected double precioProducto;
    protected int codigoVenta;

    public Tienda(double precioProducto, int codigoVenta, String nombre, String descripcion) {
        super(nombre, descripcion);
        this.precioProducto = precioProducto;
        this.codigoVenta = codigoVenta;
    }

    public int getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }
    
    
}
