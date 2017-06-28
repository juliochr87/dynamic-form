package utils.views.layouts;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;

import utils.views.main.ObjectView;

/**
 * Created by jhernandez on 6/19/2017.
 */

public class RelativeLayoutObjectView extends ObjectView {

    public RelativeLayoutObjectView(Context context) {
        super(context);
    }

    public View addRelativeLayout(){

        RelativeLayout relativeLayout = new RelativeLayout(context);

        return relativeLayout;
    }
}
