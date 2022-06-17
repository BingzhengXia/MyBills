package iot.b19060630.mybill.frag_chart;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import iot.b19060630.mybill.R;
import iot.b19060630.mybill.adapter.ChartItemAdapter;
import iot.b19060630.mybill.database.ChartItemBean;
import iot.b19060630.mybill.database.DBManager;


public class IncomChartFragment extends BaseChartFragment {
    int kind=1;
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