package com.asmit.googlemap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import com.asmit.googlemap.Model.latLang;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.Marker;

import java.util.List;

public class searchActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private AutoCompleteTextView etCity;
    private Button btnSearch;
    private List<latLang> latLangList;
    Marker markerName;
    CameraUpdate  center, zoom;


    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
