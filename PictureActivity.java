package ru.androidacademy.spb.gallerylist;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.ImageButton;


import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by vadim on 25.04.18.
 */

public class PictureActivity extends  AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.picture_activity);

         ImageView imageView = findViewById(R.id.imageView);
       // ImageButton backButton = findViewById(R.id.backButton);



       /* backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go back and destroy the ChangeCityController
                finish();
            }
        });*/
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);




            if (resultCode == RESULT_OK) {
                String position = data.getStringExtra("cat");

                ImageView imageView =findViewById(R.id.imageView);

                Cat cat = new Cat(position);

                Picasso.get().load(cat.getUrl()).into(imageView);

                /*
                   Cat cat = cats.get(position);
        holder.catImage.setOnClickListener(internalClickListener);
        holder.catImage.setTag(cat);
        Picasso.get().load(cat.getUrl()).into(holder.catImage);
                 */






            }

    }
}
