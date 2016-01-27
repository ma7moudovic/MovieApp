package com.smartware.sharkawy.myapplication.model;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Mahmoud on 1/26/2016.
 */
public class Movie {

    private int id;
    private String title; // original_title
    private String image_path; // poster_path
    private String image_detailed_path; //movie_details_image
    private String overview; // over_view_Movie
    private int rating; // vote_average
    private String date; // release_date

    public Movie() {

    }
    public Movie(JSONObject movie) throws JSONException {
        this.id = movie.getInt("id");
        this.title = movie.getString("original_title");
        this.image_path = movie.getString("poster_path");
        this.image_detailed_path = movie.getString("backdrop_path");
        this.overview = movie.getString("overview");
        this.rating = movie.getInt("vote_average");
        this.date = movie.getString("release_date");
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImage_path() {
        return image_path;
    }

    public String getImage_detailed_path() {
        return image_detailed_path;
    }

    public String getOverview() {
        return overview;
    }

    public int getRating() {
        return rating;
    }

    public String getDate() {
        return date;
    }

}
