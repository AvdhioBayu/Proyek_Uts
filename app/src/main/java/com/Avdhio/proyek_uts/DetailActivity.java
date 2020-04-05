package com.Avdhio.proyek_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.Avdhio.proyek_uts.Model.GameLogo;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    private TextView detailgame;
    private TextView specgame;
    private String namagame;

    CarouselView carouselView;
    int[] imagePubg = {R.drawable.pubg1,R.drawable.pubg2,R.drawable.pubg3};
    int[] imageR6 = {R.drawable.r6_1,R.drawable.r6_2,R.drawable.r6_3};
    int[] imageDota2 = {R.drawable.dota2_1,R.drawable.dota2_2,R.drawable.dota2_3};
    int[] imageCodw = {R.drawable.codw1,R.drawable.codw2,R.drawable.codw3};
    int[] imageApex = {R.drawable.apex1,R.drawable.apex2,R.drawable.apex3};
    int[] imageWd = {R.drawable.watchdog_1,R.drawable.watchdog_2,R.drawable.watchdog_3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        detailgame = findViewById(R.id.detail);
        specgame = findViewById(R.id.spec);

        Bundle extras = getIntent().getExtras();
        if(extras != null){

            detailgame.setText(extras.getString("Data Detail"));
            specgame.setText(extras.getString("Data Spec"));
            namagame = extras.getString("Nama Game");
        }
        carouselView = findViewById(R.id.carouselView);
        carouselView.setPageCount(imagePubg.length);
        carouselView.setImageListener(imageListener);
    }
    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            if (namagame.equals("PlayerUnkown's Battlegrounds")) {
                imageView.setImageResource(imagePubg[position]);
            }
            if (namagame.equals("Tom Clancy's Rainbow Six Siege")) {
                imageView.setImageResource(imageR6[position]);
            }
            if (namagame.equals("Dota 2")) {
                imageView.setImageResource(imageDota2[position]);
            }
            if (namagame.equals("Call Of Duty : Warzone")) {
                imageView.setImageResource(imageCodw[position]);
            }
            if (namagame.equals("Apex Legends")) {
                imageView.setImageResource(imageApex[position]);
            }
            if (namagame.equals("Watch_Dogs™")) {
                imageView.setImageResource(imageWd[position]);
            }
        }
    };


        }


