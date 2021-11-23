package com.example.javaassignment2;

import com.google.gson.annotations.SerializedName;

import java.time.LocalDate;
import java.time.Year;

public class RAWGResponse {
    private int id;
    private String slug, name, released, background_image;
    private double rating;
    private String website = "blank";
    @SerializedName("description_raw")
    private String description;


    public RAWGResponse(int id, String slug, String name, String released, String background_image, double rating, String website, String description) {
        setId(id);
        setSlug(slug);
        setName(name);
        setReleased(released);
        setBackground_image(background_image);
        setRating(rating);
        setWebsite(website);
        setDescription(description);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0)
            this.id = id;
        else
            throw new IllegalArgumentException("Id must be bigger than 1 ");
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        if (slug.length() > 0)
            this.slug = slug;
        else
            throw new IllegalArgumentException("The slug must be longer than 1 ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 0)
            this.name = name;
        else
            throw new IllegalArgumentException("The name must be longer than 1 ");
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {//no validation, some games may not have a description
        this.description = description;
    }

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {

        if (released == null ||released.length() == 0 ){
            this.released = "";
        }
        else{

            LocalDate date = LocalDate.parse(released);
            LocalDate oldDate = LocalDate.parse("1950-01-01");
            if (date.isAfter(oldDate) && date.isBefore(LocalDate.now()))
                this.released = released;
            else
                throw new IllegalArgumentException("The date cannot be before 1950, and cannot be after the current date");

      }
    }



    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        if (website.contains("https") == true)
            this.website = website;
        else
            this.website = "";

    }

    public String getBackground_image() {
        return background_image;
    }

    public void setBackground_image(String background_image) {
        if (background_image.contains("https") == true)
            this.background_image = background_image;
        else
            this.background_image = "";
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {

        if(rating>0 && rating <=5)
            this.rating = rating;
        else
            throw new IllegalArgumentException("The rating must be greater than zero, and no bigger than 5");
    }

}
