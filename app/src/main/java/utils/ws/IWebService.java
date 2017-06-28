package utils.ws;

import java.util.List;

import utils.objects.GenericObject;
import utils.objects.User;

/**
 * Created by jhernandez on 6/27/2017.
 */

public interface  IWebService {

    List<GenericObject> getTabs();
    List<GenericObject> getForms();
    User getUser(String userName, String password);

}
