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

    public static ArrayList<Pic> pics = new ArrayList<>();

    public static ArrayList<String> urlList =new ArrayList<>();

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

        if (urlList.size()>0){
            recyclerView.setAdapter(new PicAdapter(getOldPics(), onItemClickListener));
        }else {
            recyclerView.setAdapter(new PicAdapter(generatePics(), onItemClickListener));

        }

    }

    public static int newDimension(){

        Random random=new Random();

        int a = 100 + random.nextInt(500-100);

        return a;
    }

    @NonNull
    public  static  List<Pic> generatePics() {



        for (int a = 0; a < 200; a++){

            Pic pic = new Pic("https://picsum.photos/" + newDimension() + "/" + newDimension() + "/?random");
            pics.add(a,pic);
            urlList.add(a, pic.getUrl());

        }

        return pics;
    }



    public  static List<Pic> getOldPics() {
        ArrayList<Pic>  oldPics = new ArrayList<>();
        for (int z = 0; z < urlList.size(); z++) {

            oldPics.add(new Pic(urlList.get(z)));

        }

        return oldPics;
    }


}
