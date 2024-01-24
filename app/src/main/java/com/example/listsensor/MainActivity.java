package com.example.listsensor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity  extends AppCompatActivity{
    private SensorManager senseMan;

    private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Map lv to resources lv
        lv=(ListView)findViewById(R.id.listview);
        //Get sensor Manager
        senseMan=(SensorManager) getSystemService(SENSOR_SERVICE);

        //Get sensor list and put inside ArrayList
        List<Sensor>sensorList=senseMan.getSensorList(Sensor.TYPE_ALL);
        //put sensor list into ListView
        lv.setAdapter(new ArrayAdapter<Sensor>(this, android.R.layout.simple_list_item_1,sensorList));


    }
}
