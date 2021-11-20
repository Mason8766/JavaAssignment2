package com.example.javaassignment2;

import com.google.gson.annotations.SerializedName;

public class RAWGResponse {
    private int id;
    private String slug,name,released,background_image;
    private double rating;
    private String website = "blank";
    @SerializedName("description_raw")
    private String description;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getBackground_image() {
        return background_image;
    }

    public void setBackground_image(String background_image) {
        this.background_image = background_image;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    /*
    "id": 22508,
            "slug": "overwatch",
            "name": "Overwatch",

            "description": "<h3>The Legacy</h3>\n<p>Overwatch is a multiplayer first-person shooter from the company that gave players the saga of Azeroth, Starcraft and the Diablo universe. Despite these releases coming out years ago, they are still alive and actively updated. But the developers at Blizzard wanted something new: the company does not like to experiment with new settings, preferring to transfer existing characters to new genres, worlds, and situations. The exception, perhaps, can only be a game about the three Vikings—The Lost Vikings, but this, too, was a long time ago.</p>\n<h3>The story and setting</h3>\n<p>Anyway, the company Blizzard has approached the development of Overwatch with team-specific meticulousness to details and desire to create an elaborative game universe. The player faces a choice between 21 characters who were part of the elite Overwatch unit. The task of Overwatch soldiers is to protect the Earth from conflicts and external threats. But something goes wrong, and the team of heroes breaks up. Despite the multiplayer bias, the game has a full story, it combines all the characters and maps on which the battle takes place. Since the launch, seven new characters have been added to the hero pool. Blizzard tells the story of the world of Overwatch through their characters: almost everyone has an animated short film, comparable in quality to a full meter from, for example, Pixar.</p>\n<h3>Continuous support</h3>\n<p>The game won the hearts of players around the world immediately after the launch. The figures confirm this fact: more than half a million dollars from sales and more than 40 million players. Overwatch has become an anchor project for Activision Blizzard, and the company continues to develop the project two years later, constantly offering players new maps, new characters, new themed events, and new cosmetic skins.</p>",
            "metacritic": 91,

            "released": "2016-05-24",


            "background_image": "https://media.rawg.io/media/games/4ea/4ea507ceebeabb43edbc09468f5aaac6.jpg",

            "website": "https://playoverwatch.com",
            "rating": 4.24,
            "developers": [],*/

}
