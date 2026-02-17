package org.example;

import org.example.Controller.PedidoController;
import org.example.Model.EstadoPedido;
import org.example.Model.Pedido;
import org.example.Service.PedidoService;
import org.example.Service.PedidoServiceImpl;
import org.example.View.PedidoView;

public class Main {
    public static void main(String[] args) {


        PedidoService service = new PedidoServiceImpl();

        PedidoView view = new PedidoView();

        PedidoController controller = new PedidoController(service, view);

        // POST
        Pedido pedido = controller.crearPedido(10L, "Juan", 150000);


        // GET
        controller.mostraPedido(pedido);

        // GET
        controller.aplicarDescuento(pedido);

        // PUT
        controller.cambiarEstado(pedido, EstadoPedido.PAGADO);

        // GET
        controller.mostraPedido(pedido);









    }
}