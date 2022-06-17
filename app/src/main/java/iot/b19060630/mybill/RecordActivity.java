package iot.b19060630.mybill;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import iot.b19060630.mybill.adapter.RecordPagerAdapter;
import iot.b19060630.mybill.frag_record.IncomeFragment;
import iot.b19060630.mybill.frag_record.BaseRecordFragment;
import iot.b19060630.mybill.frag_record.OutcomeFragment;

public class RecordActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);
        tabLayout=findViewById(R.id.record_tabs);
        viewPager=findViewById(R.id.recorde_vp);
        initPager();
    }

    private void initPager() {
        //        初始化ViewPager页面的集合
        List<Fragment> fragmentList = new ArrayList<>();
//        创建收入和支出页面，放置在Fragment当中
        OutcomeFragment outFrag = new OutcomeFragment(); //支出
        IncomeFragment inFrag = new IncomeFragment(); //收入
        fragmentList.add(outFrag);
        fragmentList.add(inFrag);
        //        创建适配器
        RecordPagerAdapter pagerAdapter = new RecordPagerAdapter(getSupportFragmentManager(), fragmentList);
//        设置适配器
        viewPager.setAdapter(pagerAdapter);
        //将TabLayout和ViwePager进行关联
        tabLayout.setupWithViewPager(viewPager);
    }

    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.record_iv_back:
                finish();
                break;
        }
    }
}