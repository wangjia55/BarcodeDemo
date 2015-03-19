package me.dm7.barcodescanner.zbar.sample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import me.dm7.barcodescanner.R;


public class SimpleScannerFragmentActivity extends ActionBarActivity {
    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        setContentView(R.layout.activity_simple_scanner_fragment);
    }
}