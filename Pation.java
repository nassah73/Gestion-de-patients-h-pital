public class Pation{
    private String name;
    private int age;
    private  String Illness;
    public Pation(String name, int age, String Illness) {
        this.name = name;
        this.age = age;
        this.Illness = Illness;
    }

public void prend_un_rendez_vous(){
    System.out.println("Le patient " + name + " a pris un rendez-vous pour " + Illness);
}
}