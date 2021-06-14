package question2;


/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
      *
      *  @param args ...
      */
     public static void main(String[] args){
        int fahrenheit = 0;
        float celsius = 0;
        for (int x=0; x<args.length; x++) {
            try{
            fahrenheit = Integer.parseInt(args[x]);
            celsius = fahrenheitEnCelsius(fahrenheit);
            System.out.println(fahrenheit + "\u00B0F -> " + String.format("%.1f",celsius) + "\u00B0C"); // ligne,
           }catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       }
    }
} 
     
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     public static float fahrenheitEnCelsius( int f){
       return ((float)f-32)*5/9;    // à compléter    en remplaçant la valeur retournée par la fonction de conversion
     }

}
