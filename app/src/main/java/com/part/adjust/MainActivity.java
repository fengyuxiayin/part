package com.part.adjust;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.blankj.utilcode.util.BarUtils;
import com.part.adjust.databinding.ActivityMainBinding;
import com.part.adjust.view.LoadingDialog;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setContentView(R.layout.activity_main);
        BarUtils.transparentStatusBar(this);
        LoadingDialog.getInstance(this).show();
    }
}