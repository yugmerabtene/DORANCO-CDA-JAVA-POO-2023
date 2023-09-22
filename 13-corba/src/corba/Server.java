import omg.CORBA.*;
import omg.CosNaming.*;

public class Server {
    public static void main(String[] args) {
        try {
            // Initialisation de l'ORB (Object Request Broker)
            ORB orb = ORB.init(args, null);

            // Cr�ation de l'objet CORBA
            HelloImpl helloImpl = new HelloImpl();

            // R�cup�ration de la r�f�rence de l'objet de service de nommage
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");

            // Conversion de la r�f�rence � un contexte de nommage
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // Nom sous lequel l'objet sera enregistr� dans le service de nommage
            String name = "Hello";

            // Cr�ation du chemin (NameComponent) pour l'enregistrement
            NameComponent path[] = ncRef.to_name(name);

            // Enregistrement de l'objet CORBA dans le service de nommage
            ncRef.rebind(path, helloImpl);

            // D�marrage du serveur CORBA pour attendre les appels clients
            orb.run();
        } catch (Exception e) {
            System.err.println("Erreur : " + e);
            e.printStackTrace(System.out);
        }
    }
}
