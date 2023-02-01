import java.util.*;  

public class Scrable {
// methode 1
private Map<String,Integer> letterScrable =new HashMap<String,Integer>(); 

public Scrable() {
letterScrable.put("A", 1);
letterScrable.put("E", 1);
letterScrable.put("I", 1);
letterScrable.put("O", 1);
letterScrable.put("U", 1);
letterScrable.put("L", 1);
letterScrable.put("N", 1);
letterScrable.put("R", 1);
letterScrable.put("S", 1);
letterScrable.put("D", 2);
letterScrable.put("G", 2);
letterScrable.put("B", 3);
letterScrable.put("C", 3);
letterScrable.put("M", 3);
letterScrable.put("P", 3);
letterScrable.put("F", 4);
letterScrable.put("H", 4);
letterScrable.put("V", 4);
letterScrable.put("W", 4);
letterScrable.put("Y", 4);
letterScrable.put("K", 5);
letterScrable.put("J", 8);
letterScrable.put("X", 8);
letterScrable.put("Q", 10);
letterScrable.put("Z", 10);

}
public static void main(String[] args)  {
new Scrable().getScore("saccable");
}
public void getScore(String word) {
    int score =0;

    for (int i = 0; i < word.length(); i++) {
        //on parcourt la chaine de caractere et on convertit la lettre en majuscule 
        String key = (word.charAt(i)+"").toUpperCase();
        //si la lettre est une clée du dictionnaire alors on recupere la valeur associé et on fait la somme des valeurs associés a la clée
        if (letterScrable.containsKey(key)) {
            score +=letterScrable.get(key);     
        }
    }
    System.out.println("le score est :"+score);
}
}