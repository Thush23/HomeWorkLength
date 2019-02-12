package com.example.longestlength;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView tvBiggestArray;
    List<String> VortexPokemon = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvBiggestArray = findViewById(R.id.tvBiggestArray);


        VortexPokemon.add("Ash Kechum");
        VortexPokemon.add("Wringly Weezel");
        VortexPokemon.add("Ashley The Bashley");
        VortexPokemon.add("Rambo The Mambo");
        VortexPokemon.add("Drilla AKA Gorilla");
        VortexPokemon.add("MikeDucklinWheelan");
        VortexPokemon.add("MarveyMartinMitchell");
        VortexPokemon.add("GimmeARasclartName");

        getShitz(VortexPokemon);
    }

    private void getShitz(List<String> VortexPokemon) {
        int biggestString = VortexPokemon.get(0).length();
        int index = 0;

        for (int i = 0; i < VortexPokemon.size(); i++) {
            if (VortexPokemon.get(i).length() > biggestString) {
                biggestString = VortexPokemon.get(i).length();
                index = i;
            }//if
            String vortexPokemon = ("This item is an index of: " + index + "\n" +
                    VortexPokemon.get(index) + ":" + "\n"
                    + "After running, the biggest string is shown and it consists of: " + biggestString + "\n" + "Characters");
            tvBiggestArray.setText(vortexPokemon);

        }//for

    }//method
}
