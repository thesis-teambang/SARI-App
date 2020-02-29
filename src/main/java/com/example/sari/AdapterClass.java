//package com.example.sari;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//import com.example.sari.ViewHolder;
//import com.example.sari.model.Meal;
//import com.example.sari.model.Product;
//
//import java.util.ArrayList;
//
//public class AdapterClass extends RecyclerView.Adapter<AdapterClass.MyViewHolder> {
//    ArrayList<Product> list;
//
//    public AdapterClass(ArrayList<Product> list){
//        this.list = list;
//    }
//    @NonNull
//    @Override
//    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_cgoods,viewGroup,false);
//        return new MyViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
//        myViewHolder.brand.setText(list.get(i).getBrand());
//        myViewHolder.type.setText(list.get(i).getType());
//        myViewHolder.type.setText(list.get(i).getAisleNumber());
//        myViewHolder.type.setText(list.get(i).getImage());
//    }
//
//    @Override
//    public int getItemCount() {
//        return list.size();
//    }
//
//    class MyViewHolder extends RecyclerView.ViewHolder {
//        TextView aisleNumber,brand,price, type;
//        public MyViewHolder(@NonNull View itemView) {
//            super(itemView);
//            aisleNumber = itemView.findViewById(R.id.aisleNumber);
//            brand = itemView.findViewById(R.id.brand);
//            price = itemView.findViewById(R.id.price);
//            type = itemView.findViewById(R.id.type);
//
//        }
//    }
//}
