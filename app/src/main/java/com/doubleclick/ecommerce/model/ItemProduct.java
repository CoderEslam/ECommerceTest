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
    private String trade;
    private String Category;
    private int Image;
    private int quantity;

    public ItemProduct() {
    }

    public ItemProduct(String name, String description, String price, int image, String trade, String category) {
        Name = name;
        Description = description;
        this.price = price;
        this.Image = image;
        this.trade = trade;
        Category = category;
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

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTrade() {
        return trade;
    }

    public void setTrade(String trade) {
        this.trade = trade;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
