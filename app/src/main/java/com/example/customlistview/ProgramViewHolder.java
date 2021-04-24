package com.example.customlistview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgramViewHolder {

    //declaring the object references for our views
    ImageView itemImage;
    TextView programTitle;

    //get the handle by calling findViewById on the view object inside the constructor
    //creating constructor
    ProgramViewHolder(View v){
        itemImage = v.findViewById(R.id.imageView);
        programTitle = v.findViewById(R.id.textView1);
    }
}
