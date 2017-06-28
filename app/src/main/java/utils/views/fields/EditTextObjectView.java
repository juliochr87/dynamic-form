package utils.views.fields;

import android.content.Context;
import android.view.View;
import android.widget.EditText;

import utils.views.main.ObjectView;

/**
 * Created by jhernandez on 6/10/2017.
 */

public class EditTextObjectView extends ObjectView {

    public EditTextObjectView(Context context) {
        super(context);
    }

    public View addEditText(String textHint, int lines, int inputType){

        EditText editText = new EditText(context);
        editText.setHint(textHint);
        editText.setLines(lines);
        editText.setInputType(inputType);

        return editText;
    }

    public String getText(View editTextView){

        EditText editText = (EditText) editTextView;

        return editText.getText().toString();
    }
}
