package com.jay.phonebook;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class MainActivity extends Activity implements RadioGroup.OnCheckedChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_group);
        radioGroup.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
        switch (checkedId) {
            case R.id.radio_tab_dialpad://拨号盘
                break;
            case R.id.radio_tab_call_record://通话记录
                break;
            case R.id.radio_tab_contacts://联系人

                break;
            case R.id.radio_tab_sms://短信
                break;
            default:
                break;
        }
    }
}
