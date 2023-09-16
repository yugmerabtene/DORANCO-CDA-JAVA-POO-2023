package Threads;

public class InitThreads {

    public static void main(String[] args) {
        // Crée et démarre un thread
        Thread thread1 = new Thread(new MonRunnable("Thread 1"));
        thread1.start();

        // Crée et démarre un autre thread
        Thread thread2 = new Thread(new MonRunnable("Thread 2"));
        thread2.start();

        // Attend que les deux threads se terminent
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.err.println("Le thread principal a été interrompu.");
        }

        // Affiche un message lorsque les threads ont terminé
        System.out.println("Les threads ont terminé leur exécution.");
    }
}