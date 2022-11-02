package com.mirea.moderntodo.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;

import com.mirea.moderntodo.R;
import com.mirea.moderntodo.adapters.PlanListAdapter;
import com.mirea.moderntodo.databinding.FragmentPlanListBinding;
import com.mirea.moderntodo.viewmodels.PlanListFragmentModel;

public class PlanListFragment extends Fragment {
    public PlanListFragment() {
        super(R.layout.fragment_plan_list);
    }

    private FragmentPlanListBinding binding;

    private PlanListFragmentModel viewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentPlanListBinding.inflate(inflater, container, false);
        viewModel = new ViewModelProvider(this).get(PlanListFragmentModel.class);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewModel.init();

        // recyclerview
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        binding.planList.setLayoutManager(gridLayoutManager);
        PlanListAdapter adapter = new PlanListAdapter(viewModel.getListItemPlan().getValue());
        binding.planList.setAdapter(adapter);
//        viewModel.getListItemPlan().observe(getViewLifecycleOwner(), itemPlans -> adapter.notifyAll());

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
