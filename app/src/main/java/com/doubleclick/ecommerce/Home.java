package com.doubleclick.ecommerce;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.doubleclick.ecommerce.Adapters.productAdapter;
import com.doubleclick.ecommerce.model.ItemProduct;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class Home extends AppCompatActivity {


    RecyclerView All_product;
    ArrayList<ItemProduct> itemProducts = new ArrayList<>();
    FloatingActionButton card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        All_product = findViewById(R.id.All_product);
        card = findViewById(R.id.card);
        itemProducts.add(new ItemProduct("Dell Vostro 3501 Laptop", "Intel 10th Generation Core i3-1005G1, 4GB RAM, 1TB HDD, Intel Ultra HD Graphics Card, 15.6 Inch, Ubuntu", "6744", R.drawable.a1, "", ""));
        itemProducts.add(new ItemProduct("HP 255 G7 Laptop", "Ryzen 5 3500U, 8GB RAM, 1TB HDD, Radeon GPU, 15.6 Inch HD, DOS - Silver", "8823", R.drawable.a2, "", ""));
        itemProducts.add(new ItemProduct("Lenovo V15-ADA 82C7007YED Laptop", "15.6 Inch HD Screen, 1 TB HDD, 4 GB RAM, AMD Athlon 3020E, AMD Radeon Integrated Graphics, DOS - Iron Gray", "5344", R.drawable.a3, "", ""));
        itemProducts.add(new ItemProduct("81MX004QED IdeaPad S145", "5IGM Laptop - 15.6 Inch HD Screen, Intel Celeron N4000, 1 TB HDD, 4 GB RAM, Intel UHD Graphics 600, DOS - Granite Black from Lenovo", "6600", R.drawable.a4, "", ""));
        itemProducts.add(new ItemProduct("HP EliteBook 2018 Revolve 810 G3 Laptop", "Laptop 11.6 Inch HD Touch Screen, Intel Core i5-5200U up to 2.70GHz, 4GB RAM, 128GB SSD, USB 3.0 WLAN 802.11ac, Windows 10 Professional", "8225", R.drawable.a5, "", ""));

        All_product.setAdapter(new productAdapter(itemProducts));

        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, CartActivity.class));
            }
        });
    }


}