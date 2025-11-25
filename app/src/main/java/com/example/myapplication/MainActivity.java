package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button losujB, zapiszB, resetujB;
    private ImageButton kosc1, kosc2, kosc3, kosc4, kosc5;
    private ArrayList kosci = new ArrayList<>();
    private int ilosc1 = 0, ilosc2 = 0, ilosc3 = 0, ilosc4 = 0, ilosc5 = 0, ilosc6 = 0;
    private Random rd = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        losujB = findViewById(R.id.losujB);
        zapiszB = findViewById(R.id.zapisz);
        resetujB = findViewById(R.id.resetujB);

        kosc1 = findViewById(R.id.kosc1);
        kosc2 = findViewById(R.id.kosc2);
        kosc3 = findViewById(R.id.kosc3);
        kosc4 = findViewById(R.id.kosc4);
        kosc5 = findViewById(R.id.kosc5);

        kosci.add(kosc1);
        kosci.add(kosc2);
        kosci.add(kosc3);
        kosci.add(kosc4);
        kosci.add(kosc5);

        losujB.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        for (int i = 0; i < kosci.size(); i++) {
                            losowanie((ImageButton) kosci.get(i));
                        }

                    }
                }
        );
    }
    private void losowanie(ImageButton kosc){
        int wylosowana = rd.nextInt(6) + 1;

        switch(wylosowana){
            case 1:
                kosc.setImageResource(R.drawable.a);
                ilosc1++;
                break;
            case 2:
                kosc.setImageResource(R.drawable.b);
                ilosc2++;
                break;
            case 3:
                kosc.setImageResource(R.drawable.c);
                ilosc3++;
                break;
            case 4:
                kosc.setImageResource(R.drawable.d);
                ilosc4++;
                break;
            case 5:
                kosc.setImageResource(R.drawable.e);
                ilosc5++;
                break;
            case 6:
                kosc.setImageResource(R.drawable.f);
                ilosc6++;
                break;
        }
    }
    private void sprawdzaj(){

    }
}