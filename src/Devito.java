import java.util.Scanner;

public class Devito {
    static int health;
    static int slash = (int)(Math.random()*(6-1+1)+1);
    static int stab = (int)(Math.random()*(8-1+1)+1);
    static String name = "DeVito";
    Scanner sc = new Scanner(System.in);
    String userInput = sc.next();


   public static void slashAttack(){
       System.out.println(name + " uses slash attack and does " + slash + " damage");
   }

    public static void stabAttack(){
        System.out.println(name + " uses stab attack and does " + stab + " damage");
    }



    public static void main(String[] args) {
        slashAttack();
        stabAttack();
    }

}
