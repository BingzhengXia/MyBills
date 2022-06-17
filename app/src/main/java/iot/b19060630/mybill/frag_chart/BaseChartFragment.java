package iot.b19060630.mybill.frag_chart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

import iot.b19060630.mybill.R;
import iot.b19060630.mybill.adapter.ChartItemAdapter;
import iot.b19060630.mybill.database.ChartItemBean;
import iot.b19060630.mybill.database.DBManager;


public abstract class BaseChartFragment extends Fragment {
    ListView chartLv;
    public int year,month;
    List<ChartItemBean>mDatas;
    private ChartItemAdapter itemAdapter;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

      View view= inflater.inflate(R.layout.fragment_incom_chart, container, false);
      chartLv=view.findViewById(R.id.frag_chart_lv);
      Bundle bundle=getArguments();
      year=bundle.getInt("year");
      month=bundle.getInt("month");
      mDatas=new ArrayList<>();
      itemAdapter=new ChartItemAdapter(getContext(),mDatas);
      chartLv.setAdapter(itemAdapter);


      return view;
    }
     public void setDate(int year,int month){
        this.year=year;
        this.month=month;
     }



    void loadData(int year, int month, int kind) {
        List<ChartItemBean> list=DBManager.getChartListFromAccounttb(year, month, kind);
        mDatas.clear();
        mDatas.addAll(list);
        itemAdapter.notifyDataSetChanged();
    }
}