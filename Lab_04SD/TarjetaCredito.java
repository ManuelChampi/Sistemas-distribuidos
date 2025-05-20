
package Lab_04SD;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TarjetaCredito extends Remote {
    public double consultarSaldo(String numero) throws RemoteException;
    public boolean realizarCompra(String numero, double monto) throws RemoteException;
}

