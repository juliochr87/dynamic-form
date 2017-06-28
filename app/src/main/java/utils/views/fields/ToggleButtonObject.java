package utils.views.fields;

import android.content.Context;
import android.view.View;
import android.widget.ToggleButton;

import utils.views.main.ObjectView;

/**
 * Created by jhernandez on 6/8/2017.
 */

public class ToggleButtonObject extends ObjectView {

    public ToggleButtonObject(Context context) {
        super(context);
    }

    public View addToggleButton(String text, String textOn, String textOff, Boolean checked){

        ToggleButton toggleButton = new ToggleButton(super.context);

        toggleButton.setChecked(checked);
        toggleButton.setText(text);
        toggleButton.setTextOff(textOff);
        toggleButton.setTextOn(textOn);

        return  toggleButton;
    }
}
