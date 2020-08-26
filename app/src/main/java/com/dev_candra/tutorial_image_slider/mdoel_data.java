package com.dev_candra.tutorial_image_slider;

import java.util.ArrayList;
import java.util.List;

public class mdoel_data {
    private int [] gambar = {
            R.drawable.ic_error_outline_black_24dp,
            R.drawable.ic_bed,
            R.drawable.ic_bike,
            R.drawable.ic_book,
            R.drawable.ic_facebook,
            R.drawable.ic_instagram_sketched
    };

    private String [] message = {
            "image 1",
            "image 2",
            "image 3",
            "image 4",
            "image 5",
            "image 6"
    };

    public List<image_model> getModelList(){
        List<image_model> models = new ArrayList<>();
        for (int position = 0; position < message.length; position++){
            image_model mage = new image_model();
            mage.setImage(gambar[position]);
            mage.setMessage(message[position]);
            models.add(mage);
        }
        return models;
    }

}
