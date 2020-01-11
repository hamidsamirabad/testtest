package artmis.org.calculator;

import android.content.Context;
import android.widget.Toast;

public class HamidMessage {

    public void show(Context context,String str){

        Toast.makeText(context,"Message= " + str,Toast.LENGTH_SHORT).show();

    }

}
