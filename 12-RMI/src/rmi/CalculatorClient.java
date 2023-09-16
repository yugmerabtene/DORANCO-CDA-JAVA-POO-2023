package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorClient {

    public static void main(String[] args) {
        try {
            // Obtient une r�f�rence au registre RMI sur le serveur
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Recherche l'objet distant par son nom
            CalculatorInterface calculator = (CalculatorInterface) registry.lookup("CalculatorService");

            // Utilise la m�thode distante pour effectuer l'addition
            int a = 10;
            int b = 5;
            int result = calculator.add(a, b);

            // Affiche le r�sultat
            System.out.println("R�sultat : " + result);
        } catch (Exception e) {
            System.err.println("Erreur du client RMI : " + e.toString());
            e.printStackTrace();
        }
    }
}
