import java.util.Scanner;
public class Pation{
 Scanner input = new Scanner(System.in);
    private String name;
    private int age;
    private  String Illness;
    public Pation(String name, int age, String Illness) {
        this.name = name;
        this.age = age;
        this.Illness = Illness;
    }

public boolean prend_un_rendez_vous(){
    System.out.println("vous vollez prendre un rendez-vous true/false");
     boolean reponse = input.nextBoolean();
     input.nextLine();
     if(reponse){
             System.out.println("Le patient " + name + " a pris un rendez-vous pour " + Illness);
          return true;
          
            }else{
             System.out.println("Le patient " + name + " n'a pas pris de rendez-vous.");
            
            }
            return reponse;
        }

public String getName() {
    return name;
}
public int getAge() {
    return age;
}}