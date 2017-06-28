package utils.views.alerts;

import android.content.Context;
import android.widget.Toast;

import utils.views.main.ObjectView;

/**
 * Created by jhernandez on 6/9/2017.
 */

public class ToastObjectView extends ObjectView {

    public ToastObjectView(Context context) {
        super(context);
    }

    public void showToast(String text, Boolean shortTime){

        int lenght = (shortTime) ? Toast.LENGTH_SHORT : Toast.LENGTH_LONG;
        Toast.makeText(super.context, text, lenght).show();

    }

}
