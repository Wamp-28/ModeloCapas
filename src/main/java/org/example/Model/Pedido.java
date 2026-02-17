package org.example.Model;

public class Pedido {

    private Long id;
    private String nombreCliente;
    private double valorTotal;
    private EstadoPedido estado;

    public Pedido() {
    }

    public Pedido(Long id, String nombreCliente, double valorTotal) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.valorTotal = valorTotal;
        this.estado = EstadoPedido.CREADO;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", valorTotal=" + valorTotal +
                ", estado=" + estado +
                '}';
    }

    public void establecerValorTotal(double valorTotal){
        if(valorTotal > 0 ){
            this.valorTotal = valorTotal;
        }else{
            throw new IllegalArgumentException("El valor debe ser mayor a cero");
        }

    }

    public void establecerEstado(EstadoPedido estado){
        this.estado = estado;

    }
}
