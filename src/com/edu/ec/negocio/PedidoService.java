package com.edu.ec.negocio;

public class PedidoService {

    public void realizar(Pedido pedido) {
        System.out.println("Realizar pedido");
        System.out.println("Pedido realizado para cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Correo: " + pedido.getCorreo());
        System.out.println("Pedido realizado con exito.");

        MailService mailService = new MailService(); // creamos manualmente el objeto de la clase MailService
        String asunto = "Confirmacion de pedido";
        String cuerpo = "Estimado " + pedido.getCliente() + ", su pedido de " + pedido.getProducto()
                + " por un total de $" + pedido.getTotal() + " ha sido realizado con exito.";

        mailService.enviar(pedido.getCorreo(), asunto, cuerpo);
        mailService = null; // el objeto es elegible por el Garbage Collector

    }
}
