
package Lab_04SD;

import java.rmi.Naming;

public class Cliente {
    public static void main(String[] args) {
        try {
            // Usa el nombre correcto y el puerto correcto
            TarjetaCredito stub = (TarjetaCredito) Naming.lookup("rmi://localhost:2000/TarjetaServicio");

            System.out.println("Saldo: " + stub.consultarSaldo("123456"));
            boolean exito = stub.realizarCompra("123456", 200.0);
            System.out.println("Compra realizada: " + exito);
            System.out.println("Nuevo saldo: " + stub.consultarSaldo("123456"));
        } catch (Exception e) {
            System.out.println("Cliente error: " + e.getMessage());
        }
    }
}
