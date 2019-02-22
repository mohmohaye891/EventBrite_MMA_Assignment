package com.myapplication.eventbrite_mma_assignment.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.myapplication.eventbrite_mma_assignment.R;
import com.myapplication.eventbrite_mma_assignment.adapters.FollowUpDetailsAdapter;

public class FollowUpItemDetailsActivity extends AppCompatActivity {

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, FollowUpItemDetailsActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_item_details);

        RecyclerView rvItemDetail = findViewById(R.id.rv_follow_up_details);
        rvItemDetail.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL, false));

        FollowUpDetailsAdapter adapter = new FollowUpDetailsAdapter();
        rvItemDetail.setAdapter(adapter);


    }
}
