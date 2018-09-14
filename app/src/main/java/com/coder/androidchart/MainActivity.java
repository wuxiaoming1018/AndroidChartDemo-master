package com.coder.androidchart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_linechart;
    private Button btn_barchart, btn_horizonalbarchart;
    private Button btn_combinedchart;
    private Button btn_piechart;
    private Button btn_scatterchart;
    private Button btn_candlechart;
    private Button btn_radarchart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_linechart = (Button) findViewById(R.id.btn_linechart);
        btn_barchart = (Button) findViewById(R.id.btn_barchart);
        btn_horizonalbarchart = (Button) findViewById(R.id.btn_horizontalchart);

        btn_combinedchart = (Button) findViewById(R.id.btn_combinedchart);

        btn_piechart = (Button) findViewById(R.id.btn_piechart);
        btn_scatterchart = (Button) findViewById(R.id.btn_scatterchart);
        btn_candlechart = (Button) findViewById(R.id.btn_candlechart);
        btn_radarchart = (Button) findViewById(R.id.btn_radarchart);

        btn_linechart.setOnClickListener(this);

        btn_barchart.setOnClickListener(this);
        btn_horizonalbarchart.setOnClickListener(this);
        btn_combinedchart.setOnClickListener(this);
        btn_piechart.setOnClickListener(this);
        btn_scatterchart.setOnClickListener(this);
        btn_candlechart.setOnClickListener(this);
        btn_radarchart.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        Intent intent = null;
        switch (view.getId()) {
            case R.id.btn_linechart:
                //线性表
                intent = new Intent(MainActivity.this, LineChartActivity.class);
                break;
            case R.id.btn_barchart:
                //柱状图
                intent = new Intent(MainActivity.this, BarChartActivity.class);
                break;
            case R.id.btn_horizontalchart:
                //水平柱状图
                intent = new Intent(MainActivity.this, HorizontalChart.class);
                break;
            case R.id.btn_combinedchart:
                //混合图表
                intent = new Intent(MainActivity.this, CombinedChartActivity.class);
                break;
            case R.id.btn_piechart:
                //饼图
                intent = new Intent(MainActivity.this, PieChartActivity.class);
                break;
            case R.id.btn_scatterchart:
                //散列图
                intent = new Intent(MainActivity.this, ScatterChartActivity.class);
                break;
            case R.id.btn_candlechart:
                //蜡烛图
                intent = new Intent(MainActivity.this, CandleChart.class);
                break;
            case R.id.btn_radarchart:
                //雷达海图
                intent = new Intent(MainActivity.this, RadarChartActivity.class);
                break;

        }
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        return super.onOptionsItemSelected(item);
    }


}
