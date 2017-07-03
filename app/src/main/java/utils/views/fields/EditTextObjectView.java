package utils.views.fields;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.text.InputType;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import utils.views.main.ObjectView;

/**
 * Created by jhernandez on 6/10/2017.
 */

public class EditTextObjectView extends ObjectView {

    EditText editText;

    public EditTextObjectView(Context context) {
        super(context);
        editText = new EditText(context);
    }

    public View addEditText(String textHint, int lines){

        editText.setHint(textHint);
        editText.setLines(lines);
        editText.setInputType(InputType.TYPE_CLASS_TEXT);

        return editText;
    }

    public View addEditTextTypeNumber(String textHint, int lines){

        editText.setHint(textHint);
        editText.setLines(lines);
        editText.setInputType(InputType.TYPE_CLASS_NUMBER);

        return editText;
    }


    public View addEditTextTypeMail(String textHint){

        editText.setHint(textHint);
        editText.setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);

        return editText;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public View addEditTextTypeDate(String textHint){

        editText.setHint(textHint);
        editText.setInputType(InputType.TYPE_NULL);
        editText.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance(TimeZone.getDefault());

                DatePickerDialog dialog = new DatePickerDialog(context, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                        editText.setText(datePicker.getDayOfMonth() + "/" + datePicker.getMonth() + "/" + datePicker.getYear());
                    }
                }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
                dialog.show();
            }
        });

        return editText;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public View addEditTextTypeTime(String textHint){

        editText.setHint(textHint);
        editText.setInputType(InputType.TYPE_NULL);
        editText.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance(TimeZone.getDefault());

                TimePickerDialog dialog = new TimePickerDialog(context, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hour, int minute) {
                        editText.setText(timePicker.getHour() + ":" +timePicker.getMinute() +" " );
                    }
                },calendar.get(Calendar.HOUR),calendar.get(Calendar.MINUTE),true);
                dialog.show();
            }
        });

        return editText;
    }

    public String getText(View editTextView){

        EditText editText = (EditText) editTextView;

        return editText.getText().toString();
    }
}
