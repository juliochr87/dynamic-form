package utils.views.layouts;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

import java.util.List;

import utils.views.main.ObjectView;

/**
 * Created by jhernandez on 6/10/2017.
 */

public class LinearLayoutObjectView extends ObjectView {

    public LinearLayoutObjectView(Context context) {
        super(context);
    }

    public View addLinearLayout(Boolean isHorizontal){

        int type = (isHorizontal) ? LinearLayout.HORIZONTAL : LinearLayout.VERTICAL;

        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(type);

        return linearLayout;
    }

    public void addViewsToLinearLayout(List<View> listViews, View linearLayoutView){

        LinearLayout linearLayout = (LinearLayout) linearLayoutView;

        for (View view: listViews) {

            linearLayout.addView(view);
        }
    }
}
