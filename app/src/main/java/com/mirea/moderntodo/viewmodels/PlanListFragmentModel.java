package com.mirea.moderntodo.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.mirea.moderntodo.items.ItemPlan;

import java.util.ArrayList;
import java.util.List;

public class PlanListFragmentModel extends ViewModel {
    private final MutableLiveData<List<ItemPlan>> listItemPlan = new MutableLiveData<>();

    private final List<ItemPlan> list = new ArrayList<>();

    public void init() {
        setList();
/*        if (listItemPlan != null)
            return;*/

        listItemPlan.setValue(list);

        // TODO Connect DB
    }

    public LiveData<List<ItemPlan>> getListItemPlan() {
        return listItemPlan;
    }

    //Example
    private void setList() {
        list.add(new ItemPlan("Plan bebra", "Выпить таблетки от деменции и шизофрении\nВыпить таблетки от деменции и шизофрени\nВыпить таблетки от деменции и шизофрении\nВыпить таблетки от деменции и шизофрении", "Today", "19:00"));
        list.add(new ItemPlan("Plan bebra", "desc", "Today", "19:00"));
        list.add(new ItemPlan("Plan bebra", "desc", "Today", "19:00"));
        list.add(new ItemPlan("Plan bebra", "desc", "Today", "19:00"));
        list.add(new ItemPlan("Plan bebra", "desc", "Today", "19:00"));
    }
}
