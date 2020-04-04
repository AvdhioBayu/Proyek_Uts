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
    CarouselView carouselView;
    int[] sampleImages = {R.drawable.pubg1,R.drawable.pubg2,};

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
        }

        carouselView = findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);
    }
    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };

        }


