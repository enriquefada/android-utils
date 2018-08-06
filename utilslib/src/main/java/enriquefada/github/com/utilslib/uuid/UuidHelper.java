package enriquefada.github.com.utilslib.uuid;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;

import java.util.UUID;

public class UuidHelper {

    private static final String PREFS_UUID = "HELPER_PREFS_UUID";

    private static String uuid = null;

    public synchronized static String getInstallUuid(Context context) {
        if (uuid == null) {
            SharedPreferences sp = context.getSharedPreferences(PREFS_UUID, Context.MODE_PRIVATE);
            uuid = sp.getString(PREFS_UUID, null);
            if (uuid == null) {
                uuid = UUID.randomUUID().toString();
                SharedPreferences.Editor editor = sp.edit();
                editor.putString(PREFS_UUID, uuid);
                editor.commit();
            }
        }
        return uuid;
    }

}
