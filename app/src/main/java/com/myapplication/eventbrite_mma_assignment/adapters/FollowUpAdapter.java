package com.myapplication.eventbrite_mma_assignment.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myapplication.eventbrite_mma_assignment.R;
import com.myapplication.eventbrite_mma_assignment.delegates.FollowUpItemDelegate;
import com.myapplication.eventbrite_mma_assignment.views.holders.FollowUpViewHolder;

public class FollowUpAdapter extends RecyclerView.Adapter<FollowUpViewHolder> {

    private FollowUpItemDelegate mfollowUpItemDelegate;

    public FollowUpAdapter(FollowUpItemDelegate followUpItemDelegate) {
        mfollowUpItemDelegate = followUpItemDelegate;
    }

    @NonNull
    @Override
    public FollowUpViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = layoutInflater.inflate(R.layout.view_item_follow_up, viewGroup, false);
        return new FollowUpViewHolder(itemView, mfollowUpItemDelegate);
    }

    @Override
    public void onBindViewHolder(@NonNull FollowUpViewHolder followUpViewHolder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
