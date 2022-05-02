package com.doubleclick.ecommerce;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.TextView;

import com.doubleclick.ecommerce.Adapters.productAdapter;
import com.doubleclick.ecommerce.model.ItemProduct;
import com.doubleclick.ecommerce.ui.signin.MainActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.squareup.picasso.Picasso;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class Home extends AppCompatActivity {


    RecyclerView All_product;
    ArrayList<ItemProduct> itemProducts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        All_product = findViewById(R.id.All_product);

        itemProducts.add(new ItemProduct("svdsv", "fff", "100", "90", R.drawable.ss, "", ""));
        itemProducts.add(new ItemProduct("svdad", "fddf", "30", "30", R.drawable.dd, "", ""));
        itemProducts.add(new ItemProduct("sVds", "rwgrw", "60", "59", R.drawable.ss, "", ""));
        itemProducts.add(new ItemProduct("VDadV", "grwags", "90", "89", R.drawable.dd, "", ""));
        itemProducts.add(new ItemProduct("fbfs", "ragr", "58", "55", R.drawable.ss, "", ""));
        itemProducts.add(new ItemProduct("sdgsf", "arwgg", "22", "20", R.drawable.dd, "", ""));
        itemProducts.add(new ItemProduct("sgsgvs", "args", "15", "15", R.drawable.ss, "", ""));
        itemProducts.add(new ItemProduct("sgrwasgv", "graafg", "69", "69", R.drawable.dd, "", ""));
        itemProducts.add(new ItemProduct("sdvds", "asgdv", "24", "24", R.drawable.ss, "", ""));
        itemProducts.add(new ItemProduct("svgsfgrws", "asrg", "28", "28", R.drawable.dd, "", ""));
        itemProducts.add(new ItemProduct("yfukyuktuf", "sadgvsda", "18", "18", R.drawable.ss, "", ""));
        itemProducts.add(new ItemProduct("tdkuycjg", "sadvgsda", "49", "45", R.drawable.dd, "", ""));
        itemProducts.add(new ItemProduct("yfjdy", "adsvd", "20", "20", R.drawable.ss, "", ""));
        itemProducts.add(new ItemProduct("dfkymcgk", "dsv", "17", "17", R.drawable.dd, "", ""));
        itemProducts.add(new ItemProduct("djryjyh", "vsd", "200", "199", R.drawable.ss, "", ""));

        All_product.setAdapter(new productAdapter(itemProducts));
    }


}