package LinkedList;

import java.util.LinkedList;

public class InitLinkedList {
    public static void main(String[] args) {
        // Création d'une liste chaînée (LinkedList)
        LinkedList<String> linkedList = new LinkedList<>();

        // Ajout d'éléments à la liste
        linkedList.add("Élément 1");
        linkedList.add("Élément 2");
        linkedList.add("Élément 3");

        // Affichage de la liste
        System.out.println("Liste chaînée initiale : " + linkedList);

        // Ajout d'un élément à la première position
        linkedList.addFirst("Nouvel élément en premier");

        // Ajout d'un élément à la dernière position
        linkedList.addLast("Nouvel élément en dernier");

        // Suppression du deuxième élément
        linkedList.remove(1);

        // Affichage de la liste mise à jour
        System.out.println("Liste chaînée après modifications : " + linkedList);

        // Accès à un élément par son indice
        String element = linkedList.get(2);
        System.out.println("Élément à l'indice 2 : " + element);
    }
}
