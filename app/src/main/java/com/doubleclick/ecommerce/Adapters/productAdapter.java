package com.doubleclick.ecommerce.Adapters;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.doubleclick.ecommerce.R;
import com.doubleclick.ecommerce.model.ItemProduct;
import com.doubleclick.ecommerce.ui.OrderProduct.OrderProductActivity;

import java.util.ArrayList;

/**
 * Created By Eslam Ghazy on 12/16/2021
 */
public class productAdapter extends RecyclerView.Adapter<productAdapter.ProdactViewHolder> {

    ArrayList<ItemProduct> itemProducts = new ArrayList<>();

    public productAdapter(ArrayList<ItemProduct> itemProducts) {
        this.itemProducts = itemProducts;
    }


    @NonNull
    @Override
    public productAdapter.ProdactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product, parent, false);
        return new ProdactViewHolder(view);
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    public void onBindViewHolder(@NonNull productAdapter.ProdactViewHolder holder, int position) {

        holder.name.setText(itemProducts.get(position).getName());
        holder.price.setText(itemProducts.get(position).getPrice() + "EGP");
        holder.product_image.setImageDrawable(holder.itemView.getContext().getResources().getDrawable(itemProducts.get(position).getImage()));
        if (itemProducts.get(position).getQuantity() != 0) {
            holder.quntity.setVisibility(View.VISIBLE);
            holder.quntity.setText(itemProducts.get(position).getQuantity() + "");
        } else {
            holder.quntity.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return itemProducts.size();
    }


    public class ProdactViewHolder extends RecyclerView.ViewHolder {
        ImageView product_image;
        TextView name, price, quntity;

        public ProdactViewHolder(@NonNull View view) {
            super(view);
            product_image = view.findViewById(R.id.product_image);
            name = view.findViewById(R.id.name);
            price = view.findViewById(R.id.price);
            quntity = view.findViewById(R.id.quntity);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(view.getContext(), OrderProductActivity.class);
                    intent.putExtra("itemProduct", itemProducts.get(getAdapterPosition()));
                    view.getContext().startActivity(intent);
                }
            });
        }
    }
}
