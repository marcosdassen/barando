package com.example.cucho.barando;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Bar bar1 = new Bar(1);
        bar1.setName("Ian\'s Pub");
        bar1.setDescription(getResources().getString(R.string.desc_bar1));
        bar1.setImgId(R.drawable.bar_artesanal);
        TimeRange bar1HappyHour = new TimeRange(18,00,20,30);
        TimeRange bar1OpenTime = new TimeRange(18,00,02,30);
        bar1.setHappyHour(bar1HappyHour);
        bar1.setOpenTime(bar1OpenTime);
        BarLocation bar1Address = new BarLocation("Honduras 5791, CABA");
        bar1.setLocation(bar1Address);

        System.out.println("BARLOCATION:"+(bar1.getLocation().getAddress()+":"));

        Bar bar2 = new Bar(2);
        bar2.setName("Cucho\'s Pub");
        bar2.setDescription(getResources().getString(R.string.desc_bar2));
        //bar2.setImgId(R.drawable.bar_artesanal);


        ImageView barPic1 = (ImageView) findViewById(R.id.imageViewBar1);
        barPic1.setImageResource(R.drawable.bar_artesanal);

        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();

        DatabaseReference reference = firebaseDatabase.getReference("bares");

        reference.push().setValue(bar1);
        reference.push().setValue(bar2);
    }
    public void goToBar(View v){
        Intent intent = new Intent (MainActivity.this, BarActivity.class);
        //intent.putExtra("dbid", new String = "-KmEFUuo-Wz7Qp-sZDQs");
        startActivity(intent);
    }
}
