package utils.views.alerts;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.View;

import utils.views.main.ObjectView;

/**
 * Created by jhernandez on 6/9/2017.
 */

public class SnackBarObjectView extends ObjectView {

    private View view;

    public SnackBarObjectView(Context context, View view) {
        super(context);
        
        this.view = view;
    }

    public void showSnackBar(String text, Boolean shortTime){

        int lenght = (shortTime) ? Snackbar.LENGTH_SHORT : Snackbar.LENGTH_LONG;
        Snackbar.make(view,text,lenght)
                .setAction("Action", null)
                .show();
    }
}
