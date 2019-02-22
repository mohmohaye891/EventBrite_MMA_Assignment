package com.myapplication.eventbrite_mma_assignment.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myapplication.eventbrite_mma_assignment.R;
import com.myapplication.eventbrite_mma_assignment.views.holders.FollowUpDetailsViewHolder;

public class FollowUpDetailsAdapter extends RecyclerView.Adapter<FollowUpDetailsViewHolder> {

    @NonNull
    @Override
    public FollowUpDetailsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = layoutInflater.inflate(R.layout.view_item_follow_up, viewGroup, false);
        return new FollowUpDetailsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull FollowUpDetailsViewHolder followUpDetailsViewHolder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
