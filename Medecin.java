public class Medecin {
    private String name;
    private String specialty;
    public Medecin(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }
    public void prend_un_rendez_vous(){
        System.out.println("Le médecin " + name + " spécialisé en " + specialty + " a pris un rendez-vous.");
    }
    public String getName() {
        return name;
    }
    public String getSpecialty() {
        return specialty;
    }
}
