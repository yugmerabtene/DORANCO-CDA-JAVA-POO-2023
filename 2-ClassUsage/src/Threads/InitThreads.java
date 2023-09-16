package Threads;

public class InitThreads {

    public static void main(String[] args) {
        // Cr�e et d�marre un thread
        Thread thread1 = new Thread(new MonRunnable("Thread 1"));
        thread1.start();

        // Cr�e et d�marre un autre thread
        Thread thread2 = new Thread(new MonRunnable("Thread 2"));
        thread2.start();

        // Attend que les deux threads se terminent
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.err.println("Le thread principal a �t� interrompu.");
        }

        // Affiche un message lorsque les threads ont termin�
        System.out.println("Les threads ont termin� leur ex�cution.");
    }
}