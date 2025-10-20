import java.util.LinkedList;
public class Hopital {
    public Hopital(){
        var medecins = new LinkedList<Medecin>();
        var pations = new LinkedList<Pation>();

    }
    public void ajouterMedecin(Medecin medecin, LinkedList<Medecin> medecins){
        medecins.add(medecin);
    }
    public void ajouterPation(Pation pation, LinkedList<Pation> pations){
        pations.add(pation);
    }
    public void prendez_un_rendez_vous_medecin(Medecin medecin,Pation pation){
       if (pation.prend_un_rendez_vous()) {
        System.out.println("Le patient " + pation.getName() + " prend un rendez-vous avec le médecin " + medecin.getName());
       
       }
       
    }
}
