package utils.views.fields;

import android.content.Context;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import utils.views.main.ObjectView;


/**
 * Created by jhernandez on 6/9/2017.
 */

public class RadioGroupObjectView extends ObjectView {

    public RadioGroupObjectView(Context context) {
        super(context);
    }

    public View addRadioGroup(String[] textList){

        RadioGroup radioGroup = new RadioGroup(context);

        for (String text: textList) {
            RadioButton radioButton = new RadioButton(context);
            radioButton.setText(text);

            radioGroup.addView(radioButton);
        }

        return radioGroup;
    }
}
