package com.example.pony.coordinatorlayoutdemo;

import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        CollapsingToolbarLayout toolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        toolbarLayout.setTitle("资易贷1601期");
        toolbarLayout.setCollapsedTitleGravity(Gravity.CENTER);
  //      toolbarLayout.setStatusBarScrim(getResources().getDrawable(R.mipmap.ic_launcher));  暂时没用
        toolbarLayout.setCollapsedTitleTextColor(Color.BLACK);
    }
}
