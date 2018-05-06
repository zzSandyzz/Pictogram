package ru.sasha.spb.Pictogram;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

public class PictureActivity extends  AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.picture_activity);

        ImageView imageView = findViewById(R.id.imageView);

        String position = getIntent().getStringExtra("pic");

        Pic pic = new Pic(position);

        Picasso.get().load(pic.getUrl()).into(imageView);
    }

}
