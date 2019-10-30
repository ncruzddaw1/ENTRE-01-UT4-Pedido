
/**
 *  Describe una línea de un pedido
 *  En una línea de pedido se incluye un producto
 *  y el nº de unidades compradas de ese producto
 *   
 */
public class LineaPedido
{
    private Producto producto;
    private int cantidad;
    /**
     * Constructor  
     */
    public LineaPedido(Producto producto,int cantidad)    
    {
         this.cantidad = cantidad;
         this.producto = producto;
    }

     /**
     * accesor para el producto
     */
    public Producto getProducto()
    {
        return producto;
    }

    /**
     * accesor para la cantidad de producto
     */
    public int getCantidad() {
        return cantidad;
    }
    
    /**
     * obtiene una nueva línea de pedido copia idéntica de la actual
     */
    public LineaPedido obtenerCopia() 
    {
         LineaPedido copia = new LineaPedido(producto.obtenerCopia(),cantidad);
         return copia;
    }
    
     /**
     * Representación textual de la línea de pedido
     * (ver enunciado)
     */
    public String toString() 
    {
        String str= String.format(producto.toString() + "%4d \nUnidades", cantidad);
        return str;
    }
}
