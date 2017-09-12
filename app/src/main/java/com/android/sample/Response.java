package com.android.sample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by AbhishekDubey on 12-09-2017.
 */

public class Response {

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("id")
    @Expose
    private String id;


}
