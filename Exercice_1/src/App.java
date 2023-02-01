import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
            System.out.println("entrez les 3 valeurs d'un triangle suivit d'un espace");
            System.out.println("entre le premier angle de votre triangle");
            double angle1 = scanner.nextDouble();
            System.out.println("entre le deuxieme angle de votre triangle");
            double angle2 = scanner.nextDouble();
            System.out.println("entre le troisieme angle de votre triangle");
            double angle3 = scanner.nextDouble();
            Double somme = angle3 + angle2 + angle1;
            
            if (somme == 180) {
                System.out.println("It is a valid triangle");
                
                
            }else {
                System.out.println("It is not a valid triangle.");
            }
        }
    }

