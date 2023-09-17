package corba;

import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import HelloWorld.Hello;
import HelloWorld.HelloHelper;

public class Client {
    public static void main(String[] args) {
        try {
            ORB orb = ORB.init(args, null);

            // R�cup�ration de l'objet CORBA � partir du service de nommage
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
            String name = "Hello";
            Hello hello = HelloHelper.narrow(ncRef.resolve_str(name));

            // Appel de la m�thode sayHello
            String message = hello.sayHello();
            System.out.println("Message du serveur : " + message);
        } catch (Exception e) {
            System.err.println("Erreur : " + e);
            e.printStackTrace(System.out);
        }
    }
}

