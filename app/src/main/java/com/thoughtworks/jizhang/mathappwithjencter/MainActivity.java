package com.thoughtworks.jizhang.mathappwithjencter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.thoughtworks.jizhang.math.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 可以引用啦
        int sum = com.thoughtworks.jizhang.math.Math.sum(4, 9);
        Log.d("MainActivity:", "求和:" + sum);
    }
}
