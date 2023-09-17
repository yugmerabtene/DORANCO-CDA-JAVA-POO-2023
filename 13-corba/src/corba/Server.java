package corba;

import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import HelloWorld.Hello;
import HelloWorld.HelloHelper;

public class Server {
    public static void main(String[] args) {
        try {
            ORB orb = ORB.init(args, null);

            // Création de l'objet CORBA
            HelloImpl helloImpl = new HelloImpl();

            // Enregistrement de l'objet CORBA auprès du service de nommage
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
            String name = "Hello";
            NameComponent path[] = ncRef.to_name(name);
            ncRef.rebind(path, helloImpl);

            // Démarrage du serveur CORBA
            orb.run();
        } catch (Exception e) {
            System.err.println("Erreur : " + e);
            e.printStackTrace(System.out);
        }
    }
}

