package utils.views.properties;

import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jhernandez on 6/12/2017.
 */

public class Properties {

    public void setLayoutMatchParentWidthHeight(View view){

        view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                                                        ViewGroup.LayoutParams.WRAP_CONTENT));
    }

    public void setPadding(View view){

       // view.setPadding(100,100,100,100);
    }


}
