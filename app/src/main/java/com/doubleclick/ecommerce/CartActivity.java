package com.doubleclick.ecommerce;

import static com.doubleclick.ecommerce.BaseApplication.getCart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.doubleclick.ecommerce.Adapters.productAdapter;
import com.doubleclick.ecommerce.model.ItemProduct;

public class CartActivity extends AppCompatActivity {

    RecyclerView All_product;
    TextView totalprice;
    int totalPrice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        All_product = findViewById(R.id.All_product);
        totalprice = findViewById(R.id.totalprice);
        All_product.setAdapter(new productAdapter(getCart()));
        for (ItemProduct itemProduct : getCart()) {
            totalPrice = totalPrice + (itemProduct.getQuantity() * Integer.parseInt(itemProduct.getPrice()));
            totalprice.setText(String.valueOf(totalPrice));
        }
    }
}