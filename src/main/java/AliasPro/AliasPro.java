package AliasPro;

import AliasPro.Handler.DatabaseHandler;

public class AliasPro {

    public static String getAlias(String uuid) {
        return DatabaseHandler.query(uuid, "uuid").getString("alias");
    }

    public static String getNick(String uuid) {
        return DatabaseHandler.query(uuid, "uuid").getString("alias");
    }

}