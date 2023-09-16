package classloaders;

public class InitClassloaders {

    public static void main(String[] args) {
        // Obtient le ClassLoader de la classe actuelle (ClassLoader par défaut)
        ClassLoader classLoader = InitClassloaders.class.getClassLoader();

        try {
            // Charge la classe "MyClassToLoad"
            Class<?> myClass = classLoader.loadClass("classloaders.MyClassToLoad");
            
            // Crée une instance de la classe chargée
            Object myObject = myClass.newInstance();

            // Utilise la classe chargée
            if (myObject instanceof MyClassToLoad) {
                MyClassToLoad instance = (MyClassToLoad) myObject;
                instance.sayHello();
            } else {
                System.err.println("La classe chargée n'est pas une instance de MyClassToLoad.");
            }
        } catch (ClassNotFoundException e) {
            System.err.println("La classe spécifiée n'a pas été trouvée.");
        } catch (InstantiationException e) {
            System.err.println("Impossible de créer une instance de la classe.");
        } catch (IllegalAccessException e) {
            System.err.println("Accès illégal à la classe ou à son constructeur.");
        }
    }
}
