package com.doubleclick.ecommerce;

import android.app.Application;

import com.doubleclick.ecommerce.model.ItemProduct;

import java.util.ArrayList;

/**
 * Created By Eslam Ghazy on 5/3/2022
 */
public class BaseApplication extends Application {

    public static ArrayList<ItemProduct> itemProducts;

    @Override
    public void onCreate() {
        super.onCreate();
        itemProducts = new ArrayList<>();
    }

    public static void addToCard(ItemProduct itemProduct) {
        itemProducts.add(itemProduct);
    }

    public static ArrayList<ItemProduct> getCart() {
        return itemProducts;
    }
}
