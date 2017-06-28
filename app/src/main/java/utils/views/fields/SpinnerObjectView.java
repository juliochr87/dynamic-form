package utils.views.fields;

import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import utils.objects.GenericObject;
import utils.views.main.ObjectView;


/**
 * Created by jhernandez on 6/9/2017.
 */

public class SpinnerObjectView extends ObjectView {

    public SpinnerObjectView(Context context) {
        super(context);
    }

    public View addSpinner(String[][] arrayText, Boolean isDialog){

        List<GenericObject> listObject = new ArrayList<>();

        for (String[] data : arrayText) {
            GenericObject genericObject = new GenericObject(data[0],data[1]);
            listObject.add(genericObject);
        }

        int type = (isDialog) ? Spinner.MODE_DIALOG : Spinner.MODE_DROPDOWN;

        Spinner spinner = new Spinner(context,type);
        ArrayAdapter<GenericObject> dataAdapter = new ArrayAdapter(context,android.R.layout.simple_spinner_item,listObject);

        spinner.setAdapter(dataAdapter);

        return spinner;
    }

    public String getId(View spinnerView){

        Spinner spinner = (Spinner) spinnerView;

        GenericObject genericObject = (GenericObject) spinner.getSelectedItem();

        return genericObject.getID();
    }
}
