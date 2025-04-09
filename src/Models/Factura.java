package Models;

import Utils.Util;

public class Factura {

    private int numero;
    private Cliente cliente;
    private Producto[] productos = new Producto[3];
    private double total;
    private double subtotal;
    private double iva;
    private int cont=0;

    public Factura(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }

    void agregarProducto(Producto producto){
        productos[cont]=producto;
        cont++;
    }

    void calcularTotal(){
        for (int i=0;i<cont;i++){
            subtotal+=productos[i].getPrecio()*productos[i].getCantidad();
        }
        this.iva = subtotal * Util.porcentajeIVA;
        this.total = subtotal + iva;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
}
