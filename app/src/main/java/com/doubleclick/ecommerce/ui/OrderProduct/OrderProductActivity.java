package com.doubleclick.ecommerce.ui.OrderProduct;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.doubleclick.ecommerce.R;
import com.doubleclick.ecommerce.model.ItemProduct;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

import java.util.HashMap;
import java.util.Map;

public class OrderProductActivity extends AppCompatActivity {


    TextView name, des, trad, price, pricsDis, pricantage, ProductQuntaty;
    ImageView image;
    Button plusone, minsone, addToCart;
    int order = 0;
    ItemProduct itemProduct;
    FirebaseAuth auth;

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_product);
        itemProduct = (ItemProduct) getIntent().getSerializableExtra("itemProduct");
        image = findViewById(R.id.imageProduct);
        auth = FirebaseAuth.getInstance();
        name = findViewById(R.id.name);
        des = findViewById(R.id.description_product);
        trad = findViewById(R.id.tardemarke);
        price = findViewById(R.id.price);
        pricsDis = findViewById(R.id.price_discount);
        pricantage = findViewById(R.id.precintage);
        plusone = findViewById(R.id.plusone);
        minsone = findViewById(R.id.minsone);
        ProductQuntaty = findViewById(R.id.ProductQuntaty);
        image.setImageDrawable(getResources().getDrawable(itemProduct.getImage()));
        des.setText(itemProduct.getDescription());
        trad.setText(itemProduct.getTrade());
        name.setText(itemProduct.getName());
        if (Double.valueOf(itemProduct.getPrice()).equals(Double.valueOf(itemProduct.getDiscountPrice()))) {
            pricsDis.setText(itemProduct.getPrice());
        } else {
            price.setText(itemProduct.getPrice());
            pricsDis.setText(itemProduct.getDiscountPrice());
            double l = Double.parseDouble(itemProduct.getPrice());
            double s = Double.valueOf(itemProduct.getDiscountPrice());
            double pricntag = ((l - s) / l) * 100.0;
            pricantage.setText("" + pricntag + "%");
            price.setVisibility(View.VISIBLE);
            pricantage.setVisibility(View.VISIBLE);
        }

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
    }

}