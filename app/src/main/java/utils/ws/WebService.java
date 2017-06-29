package utils.ws;

import java.util.ArrayList;
import java.util.List;

import utils.objects.GenericObject;
import utils.objects.User;

/**
 * Created by jhernandez on 6/27/2017.
 */

public class WebService implements IWebService {

    @Override
    public List<GenericObject> getTabs(){

        List<GenericObject> tabList = new ArrayList<>();

        for(int i = 1; i<=10; i++){
            GenericObject genericObject = new GenericObject(Integer.toString(i),"Sección " + i);
            tabList.add(genericObject);
        }

        return tabList;
    }

    @Override
    public List<GenericObject> getForms() {
        List<GenericObject> tabList = new ArrayList<>();

        for(int i = 1; i<=10; i++){
            GenericObject genericObject = new GenericObject(Integer.toString(i),"Formulario " + i);
            tabList.add(genericObject);
        }

        return tabList;
    }

    @Override
    public User getUser(String userName, String password) {
        return null;
    }
}
