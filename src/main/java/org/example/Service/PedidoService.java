package org.example.Service;

import org.example.Model.EstadoPedido;
import org.example.Model.Pedido;

public interface PedidoService {

    Pedido crearPedido(Long id, String cliente, double valor);

    void cambiarEstado(Pedido pedido, EstadoPedido nuevoEstado);

    double aplicarDescuento(Pedido pedido);




}
