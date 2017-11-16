package transformation;

import cucumber.api.Transformer;

public class EmailTransform extends Transformer<String> {

    /**
     * This concept can be used for Integer, String, etc.
     * In this specific class, adding '@gmail.com' to the end of username.
     * So it is not neccessary to define '@gmail.com' in 'login.feature'.
     * Instead simply writing the name is enough. This class handles the rest.
     */

    @Override
    public String transform(String username) {
        return username.concat("@gmail.com");
    }
}
