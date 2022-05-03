package com.doubleclick.ecommerce;

import static com.doubleclick.ecommerce.BaseApplication.getCart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.doubleclick.ecommerce.Adapters.productAdapter;

public class CartActivity extends AppCompatActivity {

    RecyclerView All_product;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        All_product = findViewById(R.id.All_product);
        All_product.setAdapter(new productAdapter(getCart()));

    }
}