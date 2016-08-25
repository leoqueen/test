package com.bai.mall.testday5;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mbtn;
    private SurfaceView msf;
    private MediaPlayer mp;
    private SurfaceHolder hold;//创建一个媒体空间，播放载入媒体
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        mbtn= (Button) findViewById(R.id.btn);
        msf= (SurfaceView) findViewById(R.id.sf);
        msf.setKeepScreenOn(true);//播放过程中保持屏幕常亮
        hold=msf.getHolder();
        hold.addCallback(new HolderLisenter());
        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //开始播放视频

            }
        });
    }

    //sufaceholder初始化完成监听
    private class  HolderLisenter implements SurfaceHolder.Callback{

        @Override
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            Toast.makeText(MainActivity.this,"音乐播放初始化完成",Toast.LENGTH_LONG).show();
            msf.getHolder();

        }

        @Override
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {
//jhfjdshfjdsjjjs

        }

        @Override
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {

        }
    }


}
