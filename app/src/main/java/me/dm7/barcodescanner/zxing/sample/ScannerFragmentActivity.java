package me.dm7.barcodescanner.zxing.sample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import me.dm7.barcodescanner.R;


public class ScannerFragmentActivity extends ActionBarActivity {
    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        setContentView(R.layout.activity_scanner_fragment);
    }
}