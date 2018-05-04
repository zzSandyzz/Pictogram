package ru.sasha.spb.Pictogram;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager;

        layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);

        PicAdapter.OnItemClickListener onItemClickListener = new PicAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(@NonNull Pic pic, int position) {

                Intent picBlowUpIntent = new Intent(MainActivity.this,PictureActivity.class);

                picBlowUpIntent.putExtra("pic", pic.getUrl());

                startActivity(picBlowUpIntent);

            }
        };
        recyclerView.setAdapter(new PicAdapter(generatePics(), onItemClickListener));

    }

    public static int newDimension(){

       Random random=new Random();

       int a = 100 + random.nextInt(600-200);

        return a;
    }


    @NonNull
    public static List<Pic> generatePics() {
        List<Pic> pics = new ArrayList<>();
        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));
        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));
        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));
        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));
        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));
        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));
        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));
        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));
        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));
        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));
        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));
        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));
        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));
        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));
        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));
        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));
        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));
        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));
        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));
        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));

        pics.add(new Pic("https://picsum.photos/"+newDimension()+"/"+newDimension()+"/?random"));
        return pics;
    }


}
