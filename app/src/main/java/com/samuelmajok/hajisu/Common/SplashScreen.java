package com.samuelmajok.hajisu.Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
//import android.view.animation.Animation;
//import android.view.animation.AnimationUtils;
import android.widget.ImageView;

//import com.samuelmajok.hajisu.Common.OnBoarding;
import com.samuelmajok.hajisu.ExploreActivity;
import com.samuelmajok.hajisu.FavoriteActivity;
import com.samuelmajok.hajisu.MessageActivity;
import com.samuelmajok.hajisu.R;
import com.samuelmajok.hajisu.User.UserDashboard;

public class SplashScreen extends AppCompatActivity {


    //variables
    ImageView backgroundImage;

    //Animations
    //Animation sideAnim ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_screen);



        //hooks
      backgroundImage = findViewById(R.id.background_image)  ;

      //animation hooks
       // sideAnim = AnimationUtils.loadAnimation(this, R.anim.side_anim);

        //assign animations on elements

       // backgroundImage.setAnimation(sideAnim);


        int SPLASH_TIMER = 5000;
        new Handler().postDelayed(() -> {

Intent intent = new Intent(SplashScreen.this, UserDashboard.class);
startActivity(intent);
finish();

        }, SPLASH_TIMER);

    }
}

