package utils.views.fields;

import android.content.Context;
import android.view.View;
import android.widget.Switch;

import utils.views.main.ObjectView;

/**
 * Created by jhernandez on 6/8/2017.
 */

public class SwitchObjectView extends ObjectView {

    public SwitchObjectView(Context context) {
        super(context);
    }

    public View addSwith(String text, String textOn, String textOff, Boolean checked){

        Switch switchForm = new Switch(super.context);

        switchForm.setChecked(checked);
        switchForm.setText(text);
        switchForm.setTextOff(textOff);
        switchForm.setTextOn(textOn);

        return switchForm;
    }

}
