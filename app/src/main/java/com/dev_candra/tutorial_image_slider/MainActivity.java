package com.dev_candra.tutorial_image_slider;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private Adapter adapter;
    private List<image_model> modelList;
    private SliderView view,view1,view2;
    private mdoel_data data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        modelList = new ArrayList<>();
        view = findViewById(R.id.Slider1);
        view1 = findViewById(R.id.Slider2);
        view2 = findViewById(R.id.imageSlider);
        data = new mdoel_data();
        modelList.addAll(data.getModelList());
        adapter = new Adapter(this,modelList);
        adapter.notifyDataSetChanged();
        setSlider1();
        setSlider2();
        setSlider3();
    }

    private void setSlider1(){
        view.setSliderAdapter(adapter);
        view.setIndicatorAnimation(IndicatorAnimationType.WORM);
        view.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        view.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        view.setIndicatorSelectedColor(Color.RED);
        view.setIndicatorUnselectedColor(Color.WHITE);
        view.setScrollTimeInSec(4);
        view.startAutoCycle();
    }

    private void setSlider2(){
        view1.setSliderAdapter(adapter);
        view1.setIndicatorAnimation(IndicatorAnimationType.SCALE_DOWN);
        view1.setSliderTransformAnimation(SliderAnimations.POPTRANSFORMATION);
        view1.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_LEFT);
        view1.setIndicatorSelectedColor(Color.RED);
        view1.setIndicatorUnselectedColor(Color.WHITE);
        view1.setScrollTimeInSec(4);
        view1.startAutoCycle();
    }

    private void setSlider3(){
        view2.setSliderAdapter(adapter,true);
        view2.setIndicatorAnimation(IndicatorAnimationType.WORM); //set indicator animation by using IndicatorAnimationType. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        view2.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        view2.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        view2.setIndicatorSelectedColor(Color.RED);
        view2.setIndicatorUnselectedColor(Color.GRAY);
        view2.setScrollTimeInSec(4); //set scroll delay in seconds :
        view2.startAutoCycle();
    }
}
