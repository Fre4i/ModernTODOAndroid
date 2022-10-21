package com.mirea.moderntodo.adapters;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.mirea.moderntodo.R;
import com.mirea.moderntodo.items.ItemPlan;

import java.util.List;
import java.util.Random;

public class PlanListAdapter extends RecyclerView.Adapter<PlanListAdapter.ViewHolder> {

    private final List<ItemPlan> list;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final CardView cardView;

        private final TextView planHeader;
        private final TextView planDesc;
        private final TextView planDate;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.planItem);
            planHeader = itemView.findViewById(R.id.planHeader);
            planDesc = itemView.findViewById(R.id.planDesc);
            planDate = itemView.findViewById(R.id.planDate);
        }

        public TextView getPlanHeader() {
            return planHeader;
        }

        public TextView getPlanDesc() {
            return planDesc;
        }

        public TextView getPlanDate() {
            return planDate;
        }

        public CardView getCardView() {
            return cardView;
        }
    }

    public PlanListAdapter(List<ItemPlan> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_plan, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String header = list.get(position).getHeaderPlan();
        String desc = list.get(position).getDescPlan();
        String time = list.get(position).getTimePlan();
        String day = list.get(position).getDayPlan();

        holder.getPlanHeader().setText(header);
        holder.getPlanDesc().setText(desc);
        holder.getPlanDate().setText(day + ", " + time);

        final Random random = new Random();
        String[] colors = {
                "#FFA348",
                "#7ECCFF",
        };
        holder.cardView.setCardBackgroundColor(Color.parseColor(colors[random.nextInt(2)]));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
