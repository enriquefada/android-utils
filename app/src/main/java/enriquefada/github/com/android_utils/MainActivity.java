package enriquefada.github.com.android_utils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import enriquefada.github.com.utilslib.uuid.UuidHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,
                "UUID: " + UuidHelper.getInstallUuid(getApplicationContext()),
                Toast.LENGTH_SHORT
        ).show();

    }

}
