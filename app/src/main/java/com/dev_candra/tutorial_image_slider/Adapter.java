package com.dev_candra.tutorial_image_slider;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.List;

public class Adapter extends SliderViewAdapter<Adapter.ViewHoler> {

    private Context context;
    private List<image_model> models;

    public Adapter(Context context, List<image_model> models){
        this.context = context;
        this.models = models;
    }

    @Override
    public ViewHoler onCreateViewHolder(ViewGroup parent) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_slider,null);

        return new ViewHoler(v);
    }

    @Override
    public void onBindViewHolder(ViewHoler viewHolder, int position) {
        image_model model = models.get(position);
        viewHolder.text1.setText(model.getMessage());
        Glide.with(viewHolder.itemView.getContext())
                .load(model.getImage())
                .fitCenter()
                .into(viewHolder.iamge1);
    }


    @Override
    public int getCount() {
        return models.size();
    }

     class ViewHoler extends SliderViewAdapter.ViewHolder{
         TextView text1;
        ImageView iamge1;

        public ViewHoler(View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.text1);
            iamge1 = itemView.findViewById(R.id.iamge1);
        }
    }
}

