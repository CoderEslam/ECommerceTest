package com.doubleclick.ecommerce.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created By Eslam Ghazy on 12/13/2021
 */
public class ItemProduct implements Serializable {

    private String Name;
    private String Description;
    private String price;
    private int Image;
    private int quantity;



    public ItemProduct(String name, String description, String price, int image) {
        Name = name;
        Description = description;
        this.price = price;
        this.Image = image;
    }

    public ItemProduct(String name, String description, String price, int image, int quantity) {
        Name = name;
        Description = description;
        this.price = price;
        Image = image;
        this.quantity = quantity;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public String getPrice() {
        return price;
    }

    public int getImage() {
        return Image;
    }

    public int getQuantity() {
        return quantity;
    }
}
