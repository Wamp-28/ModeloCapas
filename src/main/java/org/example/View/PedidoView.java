package org.example.View;

import org.example.Model.Pedido;

public class PedidoView {

    public void mostrarPedidos(Pedido pedido){

        System.out.println("------------PEDIDOS----------------");
        System.out.println("ID: " + pedido.getId());
        System.out.println("Cliente: " + pedido.getNombreCliente());
        System.out.println("Valor: " + pedido.getValorTotal());
        System.out.println("Estado: " + pedido.getEstado());

    }


    public void mostrarMesaje(String mensaje){
        System.out.println(mensaje);
    }





}
