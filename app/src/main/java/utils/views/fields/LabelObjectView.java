package utils.views.fields;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import utils.views.main.ObjectView;

/**
 * Created by jhernandez on 6/8/2017.
 */

public class LabelObjectView extends ObjectView {

    public LabelObjectView(Context context) {
        super(context);
    }

    public View addLabel(String text){

        TextView textView = new TextView(super.context);
        textView.setText(text);

        return textView;
    }
}
