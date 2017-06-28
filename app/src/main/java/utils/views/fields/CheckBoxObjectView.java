package utils.views.fields;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;

import utils.views.main.ObjectView;

/**
 * Created by jhernandez on 6/8/2017.
 */

public class CheckBoxObjectView extends ObjectView {

    public CheckBoxObjectView(Context context) {
        super(context);
    }

    public View addCheckBox(String text, Boolean checked) {

        CheckBox checkBox = new CheckBox(super.context);
        checkBox.setText(text);
        checkBox.setChecked(checked);

        return checkBox;
    }

    public boolean isChecked(View checkBoxView){

        CheckBox checkBox = (CheckBox) checkBoxView;

        return checkBox.isChecked();
    }
}
