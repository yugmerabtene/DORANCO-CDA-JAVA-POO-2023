package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

// L'interface distante définit les méthodes exposées par le serveur RMI
public interface CalculatorInterface extends Remote {
    // Cette méthode permet d'ajouter deux nombres
    int add(int a, int b) throws RemoteException;
}

