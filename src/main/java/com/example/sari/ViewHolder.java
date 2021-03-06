package com.example.sari;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//import com.example.sari.AdapterClass;
import com.squareup.picasso.Picasso;


public class ViewHolder extends RecyclerView.ViewHolder{
    View mview;


    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        mview = itemView;

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            mClickListener.onItemClick(view,getAdapterPosition());
            }
        });

        itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                mClickListener.onItemLongClick(view,getAdapterPosition());
                return true;
            }
        });
    }
    public void setDetails(Context ctx, String aisle_number, String brand, Double price, String type, String image) {


        TextView mAisleNumber = mview.findViewById(R.id.aisleNumber);
        TextView mBrand = mview.findViewById(R.id.brand);
        ImageView mImage = mview.findViewById(R.id.rImage);
        TextView mPrice = mview.findViewById(R.id.price);
        TextView mType = mview.findViewById(R.id.type);

        
        mAisleNumber.setText(aisle_number);
        mBrand.setText(brand);
        mPrice.setText(String.format("Php %.2f", price));
        mType.setText(type);
        Picasso.get().load(image).into(mImage);

    }

    private ViewHolder.ClickListener mClickListener;
    public interface ClickListener {
        void onItemClick(View view, int position);
        void onItemLongClick(View view, int position);
    }
    public void setOnClickListener(ViewHolder.ClickListener clickListener){
        mClickListener = clickListener;
    }

}
