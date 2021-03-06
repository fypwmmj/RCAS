package com.example.rcas;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class SDashBoardActivity extends AppCompatActivity {
public BottomNavigationView S_dash_BottomNavBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sdash_board);
        BottomNavigationView S_dash_BottomNavBar = (BottomNavigationView) findViewById(R.id.S_dash_BottomNavBar);
        //BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        S_dash_BottomNavBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId())
                {
                    case R.id.ic_item_home:
//                        TODO: logic to choose intent based on userType.
                        Intent intent1 = new Intent(SDashBoardActivity.this, SDashBoardActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.ic_item_notifications:
                        Intent intent2 = new Intent(SDashBoardActivity.this, SNotifActivity.class);
                        startActivity(intent2);


                        break;
                    case R.id.ic_item_settings:
                        Intent intent3 = new Intent(SDashBoardActivity.this, SettingsActivity.class);
                        startActivity(intent3);

                        break;

                }

                return false;
            }
        });
    }
    }

