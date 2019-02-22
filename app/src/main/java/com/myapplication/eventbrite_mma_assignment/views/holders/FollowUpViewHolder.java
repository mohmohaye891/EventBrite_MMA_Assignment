package com.myapplication.eventbrite_mma_assignment.views.holders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.myapplication.eventbrite_mma_assignment.delegates.FollowUpItemDelegate;

public class FollowUpViewHolder extends RecyclerView.ViewHolder {

    private FollowUpItemDelegate mFollowUpItemDelegate;

    public FollowUpViewHolder(@NonNull View itemView, FollowUpItemDelegate followUpItemDelegate) {
        super(itemView);
        mFollowUpItemDelegate = followUpItemDelegate;
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFollowUpItemDelegate.onTapFollowUpItem();
            }
        });
    }
}
