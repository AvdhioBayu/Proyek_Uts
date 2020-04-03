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
    private GameLogo item;
    private TextView detail;
    private TextView spec;
    private ArrayList<GameLogo> list = new ArrayList<>();
    CarouselView carouselView;
    int[] sampleImages = {R.drawable.pubg};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        detail = findViewById(R.id.detail);
        spec = findViewById(R.id.spec);



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

        };


