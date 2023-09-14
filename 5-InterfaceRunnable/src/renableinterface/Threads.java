package renableinterface;

//Fichier Threads.java
public class Threads {
 public static void main(String[] args) {
     // Créer deux instances de MonRunnable avec des noms différents
     Runnable tache1 = new MonRunnable("Thread 1");
     Runnable tache2 = new MonRunnable("Thread 2");

     // Créer deux threads avec les tâches correspondantes et les démarrer
     Thread thread1 = new Thread(tache1);
     Thread thread2 = new Thread(tache2);

     thread1.start();
     thread2.start();

     // Attendre que les threads se terminent
     try {
         thread1.join();
         thread2.join();
     } catch (InterruptedException e) {
         System.out.println("Thread principal interrompu.");
     }

     System.out.println("Thread principal a terminé.");
 }
}
