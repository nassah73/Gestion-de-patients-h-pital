import java.util.*;
public class Main {
    public static void main(String[] args) {
      
        Medecin medecin1 = new Medecin("Dr. Smith", "Cardiology");
        Hopital hopital = new Hopital();
        LinkedList<Medecin> medcin = new LinkedList<>();
        hopital.ajouterMedecin(medecin1, medcin);
        
       for (Medecin medecin : medcin) {
            System.out.println("Médecin: " + medecin.getName()+" Spécialité: " + medecin.getSpecialty());
        }   
   

        Pation pation1= new Pation("John Doe", 30, "Flu");
        LinkedList<Pation> pation = new LinkedList<>();
       // pation1.prend_un_rendez_vous();
         hopital.prendez_un_rendez_vous_medecin(medecin1, pation1);
        hopital.ajouterPation(pation1, pation);
        for (Pation pationn : pation) {
            System.out.println("Patient: " + pationn.getName()+" Age: " + pationn.getAge());
        }
   
    }
}
