package josecamacho.magicball;

import android.content.Context;

import java.util.Random;

/**
 * Created by Jose on 15/12/15.
 */
public class MakePrediction {
    public static String getPrediction(Context context){
            String[] predictions = context.getResources().getStringArray(R.array.predictions);
               Random random = new Random();
            int aleatorio = random.nextInt(predictions.length);
              return predictions[aleatorio];
           }

}
