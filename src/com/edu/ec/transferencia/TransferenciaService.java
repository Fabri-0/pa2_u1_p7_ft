package com.edu.ec.repaso;

public class TransferenciaService {

    public void transferir(Transferencia transferencia) {

        System.out.println("Sistema de transferencias");
        System.out.println("Cuenta origen: " + transferencia.getOrigen().getTitular());
        System.out.println("Cuenta destino: " + transferencia.getDestino().getTitular());
        System.out.println("Monto: " + transferencia.getMonto());

        CuentaService cuentaService = new CuentaService();

        if (cuentaService.retiro(transferencia.getOrigen(), transferencia.getMonto())) {
            cuentaService.deposito(transferencia.getDestino(), transferencia.getMonto());

            System.out.println("Deposito realizado con exito...");

        } else {
            System.out.println("Transferencia fallida...");
        }
        cuentaService = null;
    }
}
