package com.marce.alert_webv_piccaso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Picass extends AppCompatActivity {
ImageView img1, img2,img3,img4,img5,img6,img7,img8,img9,img10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picass);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);
        img7 = findViewById(R.id.img7);
        img8 = findViewById(R.id.img8);

        Picasso.get()
                .load("https://th.bing.com/th/id/R.1a8755f8924e0e0dfd2c6290212ebbe5?rik=HaXvpM5EH0mdXQ&riu=http%3a%2f%2fconestilotv.com%2fwp-content%2fuploads%2f2015%2f08%2fgWoqTgx.jpg&ehk=GuicEi%2fL26tJamk2jELpTmZOYuMjaNIxOLNKXZDmHeo%3d&risl=&pid=ImgRaw&r=0")
                .resize(550,550)
                .into(img1);

        Picasso.get()
                .load("https://k31.kn3.net/taringa/D/4/F/4/F/1/cardagra/C19.jpg")
                .resize(550, 550)
                .into(img2);

        Picasso.get()
                .load("https://st3.depositphotos.com/30061814/36046/i/1600/depositphotos_360464066-stock-photo-musicians-cubism-portrait-picasso-style.jpg")
                .resize(550,580)
                .into(img3);

        Picasso.get()
                .load("https://k30.kn3.net/taringa/A/7/0/C/A/C/cardagra/9B7.jpg")
                .resize(528, 570)
                .into(img4);

        Picasso.get()
                .load("https://s03.s3c.es/imag/efe/2012/03/20/20120320-4455088w.jpg")
                .resize(590,500)
                .into(img5);

        Picasso.get()
                .load("https://i.pinimg.com/474x/f5/44/3d/f5443d8142b39427d2d3f84541800107--portrait-picasso-abstract-portrait.jpg")
                .resize(550, 550)
                .into(img6);
        Picasso.get()
                .load("https://i.pinimg.com/originals/10/9f/d6/109fd6ee5f3efd3729943290f7e72748.jpg")
                .resize(550,500)
                .into(img7);

        Picasso.get()
                .load("https://static01.nyt.com/images/2018/02/27/science/18PICASSO/18PICASSO-superJumbo.jpg?quality=90&auto=webp")
                .resize(550, 550)
                .into(img8);
    }
    }
