import java.util.Random;

public class RandomizerArray {
    Random rand = new Random();

    public RandomizerArray(int[] inArray, int bond){
        for (int i = 0; i < inArray.length; i++) {
            inArray[i]= rand.nextInt(bond);
        }
    }
}
