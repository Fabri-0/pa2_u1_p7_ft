package com;

import com.edu.ec.repaso.Cuenta;
import com.edu.ec.repaso.Transferencia;
import com.edu.ec.repaso.TransferenciaService;

public class AppTransferencia {

    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta("Fabrii", "1234", 300.23);
        Cuenta cuenta2 = new Cuenta("Joss", "1235", 800.23);

        Transferencia transferencia = new Transferencia(cuenta2, cuenta1, 1000);

        TransferenciaService transferenciaService = new TransferenciaService();

        transferenciaService.transferir(transferencia);
        System.out.println(cuenta1.getSaldo());
        System.out.println(cuenta2.getSaldo());

        // Eliminamos las referencias a los objetos
        transferenciaService = null;
        transferencia = null;
        cuenta1 = null;
        cuenta2 = null;

    }

}