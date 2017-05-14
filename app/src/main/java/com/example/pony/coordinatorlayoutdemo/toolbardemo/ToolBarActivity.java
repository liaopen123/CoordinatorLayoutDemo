package com.example.pony.coordinatorlayoutdemo.toolbardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.pony.coordinatorlayoutdemo.R;

public class ToolBarActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tool_bar);
        toolbar = ((Toolbar) findViewById(R.id.tool_bar));
        initView();
    }

    private void initView() {
        //点击左侧的返回键
        toolbar.setNavigationOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                finish();
            }
        });

        //设置menu
        toolbar.inflateMenu(R.menu.menu_item);
        //设置 溢出菜单的图标
        toolbar.setOverflowIcon(getResources().getDrawable(R.mipmap.headc));
        //设置menu item的点击事件
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_settings:
                        Toast.makeText(ToolBarActivity.this, "设置", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_email:
                        Toast.makeText(ToolBarActivity.this, "邮箱", Toast.LENGTH_SHORT).show();
                        break;
                    
                    
                }
                
                return false;
            }
        });
        
    }
}
