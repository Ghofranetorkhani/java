

import entities.*;
import java.util.*;



public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        Departement dep1 = new Departement(1, "IT", 50);
        Departement dep2 = new Departement(2, "HR", 30);
        Departement dep3 = new Departement(3, "Finance", 40);

        DepartementHashSet departementHashSet = new DepartementHashSet();

        departementHashSet.ajouterDepartement(dep1);
        departementHashSet.ajouterDepartement(dep2);
        departementHashSet.ajouterDepartement(dep3);

        System.out.println("Liste des départements :");
        departementHashSet.displayDepartement();

        System.out.println("Recherche du département 'HR' : " + departementHashSet.rechercherDepartement("HR"));

        // Test rechercherDepartement avec un objet
        System.out.println("Recherche du département 'dep1' : " + departementHashSet.rechercherDepartement(dep1));


        System.out.println("Liste des départements triés par ID :");
        TreeSet<Departement> sortedDepartements = departementHashSet.trierDepartementById();
        for (Departement d : sortedDepartements) {
            System.out.println(d);
        }

        departementHashSet.supprimerDepartement(dep2);

        System.out.println("Liste des départements après suppression du département 'HR' :");
        departementHashSet.displayDepartement();


    }




    }
}
