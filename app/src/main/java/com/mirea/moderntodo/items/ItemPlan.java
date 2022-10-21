package com.mirea.moderntodo.items;

import android.graphics.Color;

public class ItemPlan {
    private final String headerPlan;
    private final String descPlan;
    private final String timePlan;
    private final String dayPlan;

    public ItemPlan(String headerPlan, String descPlan, String timePlan, String dayPlan) {
        this.headerPlan = headerPlan;
        this.descPlan = descPlan;
        this.timePlan = timePlan;
        this.dayPlan = dayPlan;
    }

    public String getHeaderPlan() {
        return headerPlan;
    }

    public String getDescPlan() {
        return descPlan;
    }

    public String getTimePlan() {
        return timePlan;
    }

    public String getDayPlan() {
        return dayPlan;
    }
}
