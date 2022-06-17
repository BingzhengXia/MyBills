package iot.b19060630.mybill.frag_chart;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import iot.b19060630.mybill.R;


public class OutcomChartFragment extends BaseChartFragment {
    int kind=0;
    @Override
    public void onResume() {
        super.onResume();
        loadData(year,month,kind);
    }


    @Override
    public void setDate(int year, int month) {
        super.setDate(year,month);
        loadData(year,month,kind);

    }
}