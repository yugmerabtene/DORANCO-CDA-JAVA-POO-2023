package classloaders;

public class InitClassloaders {

    public static void main(String[] args) {
        // Obtient le ClassLoader de la classe actuelle (ClassLoader par d�faut)
        ClassLoader classLoader = InitClassloaders.class.getClassLoader();

        try {
            // Charge la classe "MyClassToLoad"
            Class<?> myClass = classLoader.loadClass("classloaders.MyClassToLoad");
            
            // Cr�e une instance de la classe charg�e
            Object myObject = myClass.newInstance();

            // Utilise la classe charg�e
            if (myObject instanceof MyClassToLoad) {
                MyClassToLoad instance = (MyClassToLoad) myObject;
                instance.sayHello();
            } else {
                System.err.println("La classe charg�e n'est pas une instance de MyClassToLoad.");
            }
        } catch (ClassNotFoundException e) {
            System.err.println("La classe sp�cifi�e n'a pas �t� trouv�e.");
        } catch (InstantiationException e) {
            System.err.println("Impossible de cr�er une instance de la classe.");
        } catch (IllegalAccessException e) {
            System.err.println("Acc�s ill�gal � la classe ou � son constructeur.");
        }
    }
}
