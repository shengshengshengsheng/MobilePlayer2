package com.shengsheng.mobileplayer2.activity;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.FrameLayout;
import android.widget.RadioGroup;

import com.shengsheng.mobileplayer2.R;

public class MainActivity  extends Activity {
    private FrameLayout fl_main_content;
    private RadioGroup rg_bottom_tag;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fl_main_content=(FrameLayout)findViewById(R.id.fl_main_content);
        rg_bottom_tag=(RadioGroup) findViewById(R.id.rg_bottom_tag);
        rg_bottom_tag.check(R.id.rb_video);//默认选中本地视频为首页
    }

}
