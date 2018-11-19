package com.example.diego.notebook_pg_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //Elementos
        Spinner spinner = (Spinner) findViewById(R.id.spinner);


        //Drop Down Spinner Elements
        List<String> categories = new ArrayList<>();
        categories.add("automobile");
        categories.add("Education");
        categories.add("Personal");
        categories.add("Travel");

        //Creating adapter
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, categories);


        //Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);

        //attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);


    }


    public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
        //On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        //Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }


}







