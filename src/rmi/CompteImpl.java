package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CompteImpl extends UnicastRemoteObject implements Compte {
	
	double solde;
	

	public CompteImpl(double solde) throws RemoteException {
		super();
		this.solde = solde;
	}

	@Override
	public void Debiter(double c) throws RemoteException {
		this.solde+=c;

	}

	@Override
	public double LireSolde() throws RemoteException {
		// TODO Auto-generated method stub
		return solde;
	}

	@Override
	public void Crediter(double c) throws RemoteException {
		this.solde-=c;

	}

}
