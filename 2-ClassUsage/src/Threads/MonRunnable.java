package Threads;

class MonRunnable implements Runnable {
    private String name;

    public MonRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + ": Étape " + i);
            try {
                // Faites dormir le thread pendant un certain temps pour simuler un travail
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(name + " a été interrompu.");
            }
        }
    }
}

