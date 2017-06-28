package utils.objects;

/**
 * Created by jhernandez on 6/9/2017.
 */

public class GenericObject {

    private String ID;
    private String name;

    public GenericObject(String id, String name){
        this.ID = id;
        this.name = name;
    }

    @Override
    public String toString() {

        return this.name;
    }

    public String getID() {
        return ID;
    }
}
