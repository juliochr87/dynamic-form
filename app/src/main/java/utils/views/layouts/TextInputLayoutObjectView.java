package utils.views.layouts;

import android.content.Context;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.LinearLayout;

import utils.views.main.ObjectView;

/**
 * Created by jhernandez on 6/10/2017.
 */

public class TextInputLayoutObjectView extends ObjectView {

    public TextInputLayoutObjectView(Context context) {
        super(context);
    }

    public View addTextInputLayout(View inputView, LinearLayout.LayoutParams layoutParams){

        TextInputLayout textInputLayout = new TextInputLayout(context);
        textInputLayout.setLayoutParams(layoutParams);

        textInputLayout.addView(inputView);

        return textInputLayout;
    }
}
