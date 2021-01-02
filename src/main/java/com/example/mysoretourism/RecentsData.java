package com.example.mysoretourism;


public class RecentsData {

    String placeName;
    Integer imageUrl;

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public RecentsData(String placeName, Integer imageUrl) {
        this.placeName = placeName;
        this.imageUrl = imageUrl;
    }

    public String getPlaceName() {
        return placeName;
    }

}

