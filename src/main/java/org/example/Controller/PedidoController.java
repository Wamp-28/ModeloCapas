package org.example.Controller;

import org.example.Model.EstadoPedido;
import org.example.Model.Pedido;
import org.example.Service.PedidoService;
import org.example.View.PedidoView;

public class PedidoController {

    private final PedidoService service;
    private final PedidoView view;

    public PedidoController(PedidoService service, PedidoView view) {
        this.service = service;
        this.view = view;
    }


    public Pedido crearPedido(Long id, String cliente, double valor) {

        Pedido pedido = service.crearPedido(id, cliente,valor);
        view.mostrarMesaje("PEDIDO CREADO"  + pedido.getEstado());
        return pedido;
    }

    public void cambiarEstado(Pedido pedido, EstadoPedido nuevoEstado) {

        service.cambiarEstado(pedido, nuevoEstado);
        view.mostrarMesaje("Estado Cambiado " + nuevoEstado);
    }

    public double aplicarDescuento(Pedido pedido) {
        double valorConDescuento= service.aplicarDescuento(pedido);
        view.mostrarMesaje("Valor con descuento " +valorConDescuento);

        return valorConDescuento;
    }

    public void mostraPedido(Pedido pedido){
        view.mostrarPedidos(pedido);

    }
}
