package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

// L'interface distante d�finit les m�thodes expos�es par le serveur RMI
public interface CalculatorInterface extends Remote {
    // Cette m�thode permet d'ajouter deux nombres
    int add(int a, int b) throws RemoteException;
}

