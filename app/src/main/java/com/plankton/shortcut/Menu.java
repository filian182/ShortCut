package com.plankton.shortcut;

import  androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);



        CardView menu1 = (CardView) findViewById(R.id.menu1Card);
        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Menu.this, MainActivity.class); //SIPBJ
                startActivity(i);
            }
        });

        CardView menu2 = (CardView) findViewById(R.id.menu2Card);
        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Menu.this, MainActivity2.class); //SIKOMPAK
                startActivity(i);
            }
        });

        CardView menu3 = (CardView) findViewById(R.id.menu3Card);
        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Menu.this, MainActivity3.class); //SIMKOMPETEN
                startActivity(i);
            }
        });

        CardView menu4 = (CardView) findViewById(R.id.menu4Card);
        menu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Menu.this, MainActivity4.class); //SIMPK
                startActivity(i);
            }
        });

        CardView menu5 = (CardView) findViewById(R.id.menu5Card);
        menu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Menu.this, MainActivity5.class); //SIMPAN
                startActivity(i);
            }
        });

        CardView menu6 = (CardView) findViewById(R.id.menu6Card);
        menu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Menu.this, MainActivity6.class); //SIKI
                startActivity(i);
            }
        });

        CardView menu7 = (CardView) findViewById(R.id.menu7Card);
        menu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Menu.this, MainActivity7.class); //
                startActivity(i);
            }
        });

        CardView menu8 = (CardView) findViewById(R.id.menu8Card);
        menu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Menu.this, MainActivity8.class); //SIKAP
                startActivity(i);
            }
        });

    }


    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.ii)
                .setTitle("AKU PUPR")
                .setMessage("Anda yakin ingin keluar?")
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }

                })
                .setNegativeButton("Tidak", null)
                .show();
    }
}