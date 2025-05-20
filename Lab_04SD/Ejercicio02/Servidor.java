package Lab_04SD;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Servidor {
    public static void main(String[] args) {
        try {
            TarjetaCreditoImpl obj = new TarjetaCreditoImpl();
            Registry registry = LocateRegistry.createRegistry(2000);
            registry.rebind("TarjetaServicio", obj);
            System.out.println("Servidor listo");
        } catch (Exception e) {
            System.out.println("Servidor error: " + e.getMessage());
        }
    }
}
