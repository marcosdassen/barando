package com.example.cucho.barando;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by Cucho on 26-May-17.
 */

public class BarActivity extends Activity {

    Bar bar;
    ProgressDialog dialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.bar_activity_layout);
        //String dbid = getIntent().getIntExtra("bdid",-1);
        dialog.show(this,"Espere por favor","Descargando");

        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();

        DatabaseReference reference = firebaseDatabase.getReference("bares/-KmncT0atjooRvRs4kON");

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                bar = dataSnapshot.getValue(Bar.class);
                System.out.println(bar);

                TextView barNameText = (TextView) findViewById(R.id.textViewBarName);
                barNameText.setText(bar.getName());

                ImageView barBannerView = (ImageView) findViewById(R.id.imageViewBar);
                barBannerView.setImageResource(bar.getImgId());

                TextView descriptionTextView = (TextView) findViewById(R.id.textViewDesc);
                descriptionTextView.setText(bar.getDescription());

                TextView openTimeTextView = (TextView) findViewById(R.id.textViewOpenHours);
                openTimeTextView.setText(bar.openTime.getStartTime()+" - "+bar.openTime.getEndTime());

                TextView barLocationTextView = (TextView) findViewById(R.id.textViewLocation);
                barLocationTextView.setText(bar.location.getAddress());

                barLocationTextView.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Uri uri = Uri.parse("https://www.google.com/maps/place/" + bar.location.getAddress());
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                    }
                });
                dialog.dismiss();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getCode());
            }

        });
    }
}
