package iot.b19060630.mybill;

import android.app.Application;



import iot.b19060630.mybill.database.DBManager;

/* 表示全局应用的类*/
public class   UniteApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化数据库
        DBManager.initDB(getApplicationContext());
    }
}
