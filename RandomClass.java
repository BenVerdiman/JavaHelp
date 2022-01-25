//Remove the package
package tk.jangis.firstplugin;

import java.util.Random;

//Add this class to your project. 
public class RandomClass {
   public int randomInt(int min, int max){
        //Implementing Random function
        Random random = new Random();
        //returning value as Integer
        return random.ints(min, max).findFirst().getAsInt();
    }
}
