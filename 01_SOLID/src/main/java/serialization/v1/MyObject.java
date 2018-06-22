package serialization.v1;

import java.io.Serializable;

/**
 * Created by msibert on 3/5/18.
 */
public class MyObject implements Serializable {

    static final long serialVersionUID = 42L;

    String property = "value";



    @Override
    public String toString() {
        return this.property;
    }
}
