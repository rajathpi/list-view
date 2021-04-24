package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lvProgram;

    String[] programName = {
            "Chicken",
            "Mutton",
            "Beef",
            "Pork",
            "Turkey",
            "Mackerel",
            "Whole egg",
            "Egg white",
            "Shrimp",
            "Crab",
            "Sea urchin",
            "Lobster",
            "Mussel",
            "Squid",
            "Sardines",
            "Clam",
            "Carp fish",
            "Galjoen fish",
            "Salmon",
            "Cod fish",
            "Flying fish",
            "Tuna",
            "Anchovy fish",
            "Marlin fish"
    };
    //copied from C:\Users\rajat\Pictures\non veg
    int[] programImages = {
            R.drawable.chicken,
            R.drawable.mutton,
            R.drawable.beef,
            R.drawable.pork,
            R.drawable.turkey,
            R.drawable.mackerel,
            R.drawable.whole,
            R.drawable.egg,
            R.drawable.shrimp,
            R.drawable.crab,
            R.drawable.seaurchin,
            R.drawable.lobster,
            R.drawable.mussel,
            R.drawable.squid,
            R.drawable.sardines,
            R.drawable.clam,
            R.drawable.carp,
            R.drawable.galjoen,
            R.drawable.salmon,
            R.drawable.cod,
            R.drawable.flying,
            R.drawable.tuna,
            R.drawable.anchovy,
            R.drawable.marlin
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvProgram = findViewById(R.id.lvProgram);

        //create a programAdapter Class by extending the arrayAdapter
        //right click on your package(eg: com.example.customlistview) -> goto new -> java class
        //Specify an adapter and pass context along with all arrays in constrcution
        ProgramAdapter programAdapter = new ProgramAdapter(this, programName, programImages);

        //now setting adapter with list view
        lvProgram.setAdapter(programAdapter);


    }
}