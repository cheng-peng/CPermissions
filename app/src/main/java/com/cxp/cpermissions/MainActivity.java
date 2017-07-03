package com.cxp.cpermissions;

import android.Manifest;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    private TextView status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        status = (TextView) findViewById(R.id.main_status);

    }


    public void clickLis(View v) {
        switch (v.getId()) {
            case R.id.main_bt1:
                checkPermission(new CheckPermListener() {
                    @Override
                    public void superPermission() {
                        status.setText("成功获取到相机权限");
                    }
                }, 1, "用于拍照功能", Manifest.permission.CAMERA);
                break;
            case R.id.main_bt2:
                checkPermission(new CheckPermListener() {
                    @Override
                    public void superPermission() {
                        status.setText("成功获取到电话权限");
                    }
                }, 2, "用于电话功能", Manifest.permission.CALL_PHONE);
                break;
            case R.id.main_bt3:
                checkPermission(new CheckPermListener() {
                    @Override
                    public void superPermission() {
                        status.setText("成功获取到定位权限");
                    }
                }, 3, "用于定位功能", Manifest.permission.ACCESS_FINE_LOCATION);
                break;
            case R.id.main_bt4:
                checkPermission(new CheckPermListener() {
                    @Override
                    public void superPermission() {
                        status.setText("成功获取到存储权限");
                    }
                }, 4, "用于存储功能", Manifest.permission.WRITE_EXTERNAL_STORAGE);
                break;
            case R.id.main_bt5:
                checkPermission(new CheckPermListener() {
                    @Override
                    public void superPermission() {
                        status.setText("成功获取到发短信权限");
                    }
                }, 5, "用于发短信功能", Manifest.permission.SEND_SMS);
                break;
            case R.id.main_bt6:
                checkPermission(new CheckPermListener() {
                    @Override
                    public void superPermission() {
                        status.setText("成功获取到录音权限");
                    }
                }, 6, "用于录音功能", Manifest.permission.RECORD_AUDIO);
                break;
            case R.id.main_bt7:
                checkPermission(new CheckPermListener() {
                    @Override
                    public void superPermission() {
                        status.setText("成功获取到通讯录权限");
                    }
                }, 7, "用于通讯录功能", Manifest.permission.READ_CONTACTS);
                break;
            case R.id.main_all:
                checkPermission(new CheckPermListener() {
                    @Override
                    public void superPermission() {
                        status.setText("成功获取全部权限");
                    }
                }, 10, "获取全部权限", Manifest.permission.CAMERA,Manifest.permission.CALL_PHONE,
                        Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.SEND_SMS,
                        Manifest.permission.RECORD_AUDIO,Manifest.permission.READ_CALL_LOG,Manifest.permission.READ_CONTACTS);
                break;
        }
    }
}
