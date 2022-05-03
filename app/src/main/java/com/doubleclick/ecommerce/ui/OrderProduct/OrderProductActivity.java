package com.doubleclick.ecommerce.ui.OrderProduct;

import static com.doubleclick.ecommerce.BaseApplication.addToCard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.doubleclick.ecommerce.R;
import com.doubleclick.ecommerce.model.ItemProduct;


public class OrderProductActivity extends AppCompatActivity {


    TextView name, des, trad, price, pricsDis, pricantage, ProductQuntaty;
    ImageView image;
    Button plusone, minsone, addToCart;
    int order = 0;
    ItemProduct itemProduct;
    Button addtoCard;

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_product);
        itemProduct = (ItemProduct) getIntent().getSerializableExtra("itemProduct");
        addtoCard = findViewById(R.id.addtoCard);
        image = findViewById(R.id.imageProduct);
        name = findViewById(R.id.name);
        des = findViewById(R.id.description_product);
        trad = findViewById(R.id.tardemarke);
        price = findViewById(R.id.price);
        plusone = findViewById(R.id.plusone);
        minsone = findViewById(R.id.minsone);
        ProductQuntaty = findViewById(R.id.ProductQuntaty);
        image.setImageDrawable(getResources().getDrawable(itemProduct.getImage()));
        des.setText(itemProduct.getDescription());
        trad.setText(itemProduct.getTrade());
        name.setText(itemProduct.getName());
        price.setText(itemProduct.getPrice());
        plusone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                order++;
                ProductQuntaty.setText(String.valueOf(order));

            }
        });

        minsone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProductQuntaty.setText(String.valueOf(order));
                if (order < 0) {
                    order = 0;
                    ProductQuntaty.setText(String.valueOf(order));
                    return;
                } else {
                    order--;
                }
            }
        });

        addtoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addToCard(itemProduct);
            }
        });
    }

}