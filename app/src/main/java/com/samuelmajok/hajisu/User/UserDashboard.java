package com.samuelmajok.hajisu.User;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
//import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

//import com.google.android.material.navigation.NavigationView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.samuelmajok.hajisu.ExploreActivity;
import com.samuelmajok.hajisu.FavoriteActivity;
import com.samuelmajok.hajisu.MessageActivity;
import com.samuelmajok.hajisu.R;

public class UserDashboard extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_user_dashboard);


        bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.home);

        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {

               switch (item.getItemId()){

                   case R.id.home:
                       return true;

                   case R.id.explore:
                       startActivity(new Intent(getApplicationContext(),ExploreActivity.class));
                       overridePendingTransition(0,0);
                       return true;

                   case R.id.message:
                       startActivity(new Intent(getApplicationContext(),MessageActivity.class));
                       overridePendingTransition(0,0);
                       return true;

                   case R.id.favorite:
                       startActivity(new Intent(getApplicationContext(),FavoriteActivity.class));
                       overridePendingTransition(0,0);
                       return true;


               }

               return false;
           }
       });

    }
}