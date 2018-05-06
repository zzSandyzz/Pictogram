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
    public static ArrayList<Pic>  oldPics = new ArrayList<>();
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

       if (savedInstanceState!=null){
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


      /*  pics.add(new Pic("https://picsum.photos/" + newDimension() + "/" + newDimension() + "/?random"));
       // urlList.add( Pic.getUrl());
        pics.add(new Pic("https://picsum.photos/" + newDimension() + "/" + newDimension() + "/?random"));
      //  urlList.add( Pic.getUrl());
        pics.add(new Pic("https://picsum.photos/" + newDimension() + "/" + newDimension() + "/?random"));
       // urlList.add( Pic.getUrl());
        pics.add(new Pic("https://picsum.photos/" + newDimension() + "/" + newDimension() + "/?random"));
       // urlList.add( Pic.getUrl());
        pics.add(new Pic("https://picsum.photos/" + newDimension() + "/" + newDimension() + "/?random"));
        //urlList.add( Pic.getUrl());*/

        // }
        for (int a = 0; a < 2; a++){

            Pic pic = new Pic("https://picsum.photos/" + newDimension() + "/" + newDimension() + "/?random");
            pics.add(a,pic);
            urlList.add(a, pic.getUrl());

        }


        return pics;
    }



    public  static List<Pic> getOldPics() {

        for (int i = 0; i < urlList.size(); i++) {


           oldPics.add(new Pic(urlList.get(i)));


        }

       return oldPics;
    }




   @Override
    protected void onSaveInstanceState(Bundle outState){
      super.onSaveInstanceState(outState);
        outState.putStringArrayList("listofUrls", urlList);


}



}
