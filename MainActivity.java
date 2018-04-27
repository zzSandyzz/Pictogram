package ru.androidacademy.spb.gallerylist;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // RecyclerView recyclerView = findViewById(R.id.recyclerView);
      //  recyclerView.setLayoutManager(new LinearLayoutManager(this));


        //recyclerView.setAdapter(new CatsAdapter(generateCats()));

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager;

            layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);


        CatsAdapter.OnItemClickListener onItemClickListener = new CatsAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(@NonNull Cat cat, int position) {

                Intent catBlowUpIntent = new Intent(MainActivity.this,PictureActivity.class);

                catBlowUpIntent.putExtra("cat", position);

                setResult(Activity.RESULT_OK, catBlowUpIntent);






               // String newCity = editTextField.getText().toString();
               // Intent newCityIntent = new Intent(ChangeCityController.this, WeatherController.class);

                // Adds what was entered in the EditText as an extra to the intent.
               // newCityIntent.putExtra("City", newCity);

                // We started this activity for a result, so now we are setting the result.
                //setResult(Activity.RESULT_OK, newCityIntent);

                // This destroys the ChangeCityController.
                finish();
                //return true;







            }
        };
        recyclerView.setAdapter(new CatsAdapter(generateCats(), onItemClickListener));

    }




    @NonNull
    public static List<Cat> generateCats() {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("https://picsum.photos/200/300/?random"));
        cats.add(new Cat("https://picsum.photos/300/400/?random"));
        cats.add(new Cat("https://picsum.photos/400/500/?random"));
        cats.add(new Cat("https://picsum.photos/500/600/?random"));
        cats.add(new Cat("https://picsum.photos/600/700/?random"));
        cats.add(new Cat("https://picsum.photos/700/600/?random"));
        cats.add(new Cat("https://picsum.photos/600/500/?random"));
        cats.add(new Cat("https://picsum.photos/500/400/?random"));
        cats.add(new Cat("https://picsum.photos/400/300/?random"));
        cats.add(new Cat("https://picsum.photos/300/200/?random"));
        cats.add(new Cat("https://picsum.photos/200/100/?random"));
        cats.add(new Cat("https://picsum.photos/200/300/?random"));
        return cats;
    }
}
