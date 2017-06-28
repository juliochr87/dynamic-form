package utils.views.fields;

import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;

import utils.views.main.ObjectView;

/**
 * Created by jhernandez on 6/25/2017.
 */

public class FloatingActionButtonObjectView extends ObjectView {

    public FloatingActionButtonObjectView(Context context) {
        super(context);
    }

    public View addFloatingActionButton(View view, final String actionText){

        FloatingActionButton floatingActionButton = (FloatingActionButton) view;

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, actionText, Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        return floatingActionButton;
    }
}
