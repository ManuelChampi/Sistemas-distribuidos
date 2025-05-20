
package Lab_04SD;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.HashMap;

public class TarjetaCreditoImpl extends UnicastRemoteObject implements TarjetaCredito {
    private HashMap<String, Double> cuentas;

    protected TarjetaCreditoImpl() throws RemoteException {
        cuentas = new HashMap<>();
        cuentas.put("123456", 1000.0);
        cuentas.put("654321", 500.0);
    }

    public double consultarSaldo(String numero) throws RemoteException {
        return cuentas.getOrDefault(numero, 0.0);
    }

    public boolean realizarCompra(String numero, double monto) throws RemoteException {
        double saldo = cuentas.getOrDefault(numero, 0.0);
        if (saldo >= monto) {
            cuentas.put(numero, saldo - monto);
            return true;
        }
        return false;
    }
}
