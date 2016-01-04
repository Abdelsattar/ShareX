package com.example.abdelsattar.sharex;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.abdelsattar.adapters.tabsPagerAdapter;
import com.com.java.taps.dislikeTap;
import com.com.java.taps.favoriteTap;
import com.com.java.taps.likeTap;


public class home extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        /*
        Fragment likeFragment       = new likeTap();
        Fragment dislikeFragment    = new dislikeTap();
        Fragment favoriteFragment   = new favoriteTap();
        Fragment[] fragments = {likeFragment,dislikeFragment,favoriteFragment};

        tabsPagerAdapter tabsAdapter = new tabsPagerAdapter(getSupportFragmentManager(),fragments);

        final ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(tabsAdapter);

        final ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.TabListener tabListener = new ActionBar.TabListener() {

            @Override
            public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
                pager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {


            }

            @Override
            public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

            }
        };

        actionBar.addTab(actionBar.newTab().setText("LOOL").setTabListener(tabListener));
        actionBar.addTab(actionBar.newTab().setText("White").setTabListener(tabListener));


        pager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener(){
            @Override
            public void onPageSelected(int position) {
                actionBar.setSelectedNavigationItem(position);
            }
        });
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
