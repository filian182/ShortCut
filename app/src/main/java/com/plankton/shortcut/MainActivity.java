package com.plankton.shortcut;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

    Toast toast; // instance dari kelas Toast

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv = (TextView) this.findViewById(R.id.marqueeText);
        tv.setSelected(true);

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast,
                (ViewGroup)findViewById(R.id.toast_layout));

        TextView text =layout.findViewById(R.id.t1);
        text.setText("Maaf, Layanan belum tersedia.");

        toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);



        CardView menu1 = (CardView) findViewById(R.id.menu1Card);
        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WebView.url = "https://simkompetensi.com/";
                Intent i = new Intent(MainActivity.this, WebView.class);
                startActivity(i);
            }
        });

        CardView menu2 = (CardView) findViewById(R.id.menu2Card);
        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WebView.url = "https://simpk.pu.go.id/";
                Intent i = new Intent(MainActivity.this, WebView.class);
                startActivity(i);
            }
        });

        CardView menu3 = (CardView) findViewById(R.id.menu3Card);
        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WebView.url = "https://simpan.pu.go.id/";
                Intent i = new Intent(MainActivity.this, WebView.class);
                startActivity(i);
            }
        });

        CardView menu4 = (CardView) findViewById(R.id.menu4Card);
        menu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WebView.url = "https://siki.pu.go.id/";
                Intent i = new Intent(MainActivity.this, WebView.class);
                startActivity(i);

            }
        });

        CardView menu5 = (CardView) findViewById(R.id.menu5Card);
        menu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                toast.show();


            }
        });

        CardView menu6 = (CardView) findViewById(R.id.menu6Card);
        menu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WebView.url = "https://www.sikompak.xyz/#";
                Intent i = new Intent(MainActivity.this, WebView.class);
                startActivity(i);

            }
        });

        CardView menu7 = (CardView) findViewById(R.id.menu7Card);
        menu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WebView.url = "https://sipbj.pu.go.id/2022/";
                Intent i = new Intent(MainActivity.this, WebView.class);
                startActivity(i);


            }
        });

        CardView menu8 = (CardView) findViewById(R.id.menu8Card);
        menu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WebView.url = "https://sikap.lkpp.go.id/";
                Intent i = new Intent(MainActivity.this, WebView.class);
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
