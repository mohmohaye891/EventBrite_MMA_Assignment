package com.myapplication.eventbrite_mma_assignment.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.myapplication.eventbrite_mma_assignment.R;
import com.myapplication.eventbrite_mma_assignment.adapters.FollowUpAdapter;
import com.myapplication.eventbrite_mma_assignment.delegates.FollowUpItemDelegate;

public class MainActivity extends AppCompatActivity implements FollowUpItemDelegate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

       RecyclerView rvFollowUp = findViewById(R.id.rv_follow_up);
       rvFollowUp.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
               LinearLayoutManager.VERTICAL, false));

       FollowUpAdapter followUpAdapter = new FollowUpAdapter(this);
       rvFollowUp.setAdapter(followUpAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override
    public void onTapFollowUpItem() {

        Intent intent = FollowUpItemDetailsActivity.newIntent(getApplicationContext());
        startActivity(intent);
    }
}
