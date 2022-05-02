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
    private String discountPrice;
    private String image;
    private String trade;
    private String Category;

    public void setImage(int image) {
        Image = image;
    }

    private int Image;

    public ItemProduct() {
    }

    public ItemProduct(String name, String description, String price, String discountPrice, int image, String trade, String category) {
        Name = name;
        Description = description;
        this.price = price;
        this.discountPrice = discountPrice;
        this.Image = image;
        this.trade = trade;
        Category = category;
    }


    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
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

    public String getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(String discountPrice) {
        this.discountPrice = discountPrice;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTrade() {
        return trade;
    }

    public void setTrade(String trade) {
        this.trade = trade;
    }


}
