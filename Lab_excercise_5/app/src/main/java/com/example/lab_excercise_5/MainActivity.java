package com.example.lab_excercise_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.nio.InvalidMarkException;

public class MainActivity extends AppCompatActivity {
    boolean isEgg=true;
    public void change(View view){
        ImageView ImageView=findViewById(R.id.imageView);
        ImageView ImageView2=findViewById(R.id.imageView2);

        if(isEgg){
            ImageView.animate().alpha(1).setDuration(3000);
            ImageView2.animate().alpha(0).setDuration(3000);
            isEgg=false;
        }
        else{
            ImageView.animate().alpha(0).setDuration(3000);
            ImageView2.animate().alpha(1).setDuration(3000);
            isEgg=true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ImageView ImageView=findViewById(R.id.imageView);

//        ImageView.animate().setDuration(3000).translationX(150);
//        ImageView.animate().setDuration(3000).translationY(150);
//        ImageView.animate().setDuration(3000).translationX(-150);
//        ImageView.animate().setDuration(3000).translationY(-150);
//
//        ImageView.animate().setDuration(3000).rotationX(360);
//        ImageView.animate().setDuration(3000).rotationY(360);
//        ImageView.animate().setDuration(3000).rotation(360);
//
//        ImageView.animate().setDuration(3000).alpha(0);
    }
}