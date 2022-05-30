package com.example.lab_excercise_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // 1st part : Button and TextView
    public void load(View view){
        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textview);
        button.setText(textView.getText().toString());
    }

    // 2nd part : LOG and TOAST
    public void disp(View view){
        Log.i("disp","There is an error found it using LOG");
        Toast.makeText(this,"Ashutosh Program\n",Toast.LENGTH_LONG).show();
    }

    // 3rd part : Working with ImageView
    boolean isEgg = true;

    public void change(View view){
        ImageView iv = findViewById(R.id.imageView);
        if(isEgg){
            iv.setImageResource(R.drawable.unnamed2);
            isEgg=false;
        }
        else{
            iv.setImageResource(R.drawable.unnamed);
            isEgg=true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}