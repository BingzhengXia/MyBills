package iot.b19060630.mybill.frag_record;

import java.util.List;

import iot.b19060630.mybill.R;
import iot.b19060630.mybill.database.DBManager;
import iot.b19060630.mybill.database.TypeBean;

public class OutcomeFragment extends BaseRecordFragment{
    // 重写
    @Override
    public void loadDataToGV() {
        super.loadDataToGV();
        //获取数据库当中的数据源
        List<TypeBean> outlist = DBManager.getTypeList(0);
        typeList.addAll(outlist);
        adapter.notifyDataSetChanged();
        typeTv.setText("其他");
        typeIv.setImageResource(R.mipmap.ic_qita_fs);
    }

    @Override
    public void saveAccountToDB() {
        accountBean.setKind(0);
        DBManager.insertItemToAccounttb(accountBean);
    }
}
