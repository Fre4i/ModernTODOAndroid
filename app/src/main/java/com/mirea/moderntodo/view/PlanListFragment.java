package com.mirea.moderntodo.view;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mirea.moderntodo.R;
import com.mirea.moderntodo.adapters.PlanListAdapter;
import com.mirea.moderntodo.items.ItemPlan;

import java.util.ArrayList;
import java.util.List;

public class PlanListFragment extends Fragment {
    public PlanListFragment() {
        super(R.layout.fragment_plan_list);
    }

    private RecyclerView planList;

    private final List<ItemPlan> list = new ArrayList<>();


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        int someInt = requireArguments().getInt("some_int");
        super.onViewCreated(view, savedInstanceState);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
        planList = view.findViewById(R.id.planList);
        planList.setLayoutManager(gridLayoutManager);
        setList();
        PlanListAdapter adapter = new PlanListAdapter(list);
        planList.setAdapter(adapter);
    }

    private void setList() {
        list.add(new ItemPlan("Plan bebra", "Выпить таблетки от деменции и шизофрении\nВыпить таблетки от деменции и шизофрени\nВыпить таблетки от деменции и шизофрении\nВыпить таблетки от деменции и шизофрении", "Today", "19:00"));
        list.add(new ItemPlan("Plan bebra", "desc", "Today", "19:00"));
        list.add(new ItemPlan("Plan bebra", "desc", "Today", "19:00"));
        list.add(new ItemPlan("Plan bebra", "desc", "Today", "19:00"));
        list.add(new ItemPlan("Plan bebra", "desc", "Today", "19:00"));
    }

}
