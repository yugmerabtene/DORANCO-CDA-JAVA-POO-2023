package renableinterface;
// Fichier MonRunnable.java
public class MonRunnable implements Runnable {
    private String nom; // Le nom du thread

    public MonRunnable(String nom) {
        this.nom = nom;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(nom + ": Étape " + i);
            try {
                Thread.sleep(1000); // Pause d'une seconde
            } catch (InterruptedException e) {
                System.out.println(nom + ": Thread interrompu.");
            }
        }
        System.out.println(nom + " a terminé son exécution.");
    }
}
