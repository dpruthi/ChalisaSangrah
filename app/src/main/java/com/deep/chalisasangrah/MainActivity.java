package com.deep.chalisasangrah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ShareActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    private ShareActionProvider mShareActionProvider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void clickHandlerh(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }

    public void clickHandlers(View view) {
        Intent intent = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(intent);
    }

    public void clickHandlersar(View view) {
        Intent intent = new Intent(MainActivity.this, Main4Activity.class);
        startActivity(intent);
    }

    public void clickHandlersai(View view) {
        Intent intent = new Intent(MainActivity.this, Main5Activity.class);
        startActivity(intent);
    }

    public void clickHandlerd(View view) {
        Intent intent = new Intent(MainActivity.this, Main6Activity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        getMenuInflater().inflate(R.menu.menu_activityone, menu);

      /*  menu.add(0,101,4,"Share App");
        menu.add(0,102,1,"Setting");
        menu.add(0,103,2,"Rate us");
        menu.add(0,104,3,"About");
        */



        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


       int id = item.getItemId();

        switch (id){


            case R.id.About:
              Intent intent = new Intent(this,About.class);
                this.startActivity(intent);
                break;





        }


        return super.onOptionsItemSelected(item);
    }
}



