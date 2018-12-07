package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class CompteServeur {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		LocateRegistry.createRegistry(1099);
		CompteImpl od = new CompteImpl(1234);
		Naming.rebind("rmi://localhost:1099/BK", od);
		System.out.println("serveur pret !");
	}

}
