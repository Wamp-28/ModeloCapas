package org.example.Service;

import org.example.Model.EstadoPedido;
import org.example.Model.Pedido;

public class PedidoServiceImpl implements PedidoService {


    @Override
    public Pedido crearPedido(Long id, String cliente, double valor) {
        return new Pedido(id, cliente, valor);
    }

    @Override
    public void cambiarEstado(Pedido pedido, EstadoPedido nuevoEstado) {
        pedido.setEstado(nuevoEstado);
    }

    @Override
    public double aplicarDescuento(Pedido pedido) {

        double valor = pedido.getValorTotal();

        if(valor > 1000000){
            return valor*0.9;
        }

        return valor;
    }
}
