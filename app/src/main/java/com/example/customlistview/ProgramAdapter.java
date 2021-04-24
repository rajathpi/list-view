package com.example.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;


//extend ArrayAdapter here
//press Alt + enter -> choose the first one
public class ProgramAdapter extends ArrayAdapter<String> {
    //creating a context
    Context context;
    int[] images;
    String[] programName;

    //public ProgramAdapter(Context context, int resource)  <- ORIGINAL
    //changed to public ProgramAdapter(Context context, String[] programName, int[] images)
    public ProgramAdapter(Context context, String[] programName, int[] images) {
        //super(context, resource); this will be here by default
        //change the resource to R.layout.single_item, R.id.textView1, programName
        super(context, R.layout.single_item, R.id.textView1, programName);

        this.context = context;
        this.images = images;
        this.programName = programName;
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        //the parameter ConverView is null when you are creating a new item for the first time
        //it's not null when recycling
        //assign the convertView into a view object
        View singleItem = convertView;

        //creating reference to program view and initilizing it to null
        ProgramViewHolder holder = null;
        //creating the ProgramViewHolder class

        /*
        Layout inflation is a very expensive task
        so we will inflate only when a new item
        the first time we are creating a new item , the convertView will be null
        the idea is when creating an item for the first time , we should perform the inflation and initilize the viewHolder
         */
        if(singleItem == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            singleItem = layoutInflater.inflate(R.layout.single_item, parent, false);
            holder = new ProgramViewHolder(singleItem);
            singleItem.setTag(holder);
        }
        else{
            holder = (ProgramViewHolder) singleItem.getTag();
        }
        holder.itemImage.setImageResource(images[position]);
        holder.programTitle.setText(programName[position]);
        singleItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "You clicked: "+programName[position],Toast.LENGTH_SHORT).show();
            }
        });
        return singleItem;
    }
}
