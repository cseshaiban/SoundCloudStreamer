package com.neelraj.soundcloudstreamer.soundcloud;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Neel Raj on 18-08-2015.
 */
public class Track {

    @SerializedName("title")
    private String mTitle;

    @SerializedName("stream_url")
    private String mStreamURL;

    @SerializedName("id")
    private int mID;

    @SerializedName("artwork_url")
    private String artworkURL;

    public String getTitle() {
        return mTitle;
    }

    public String getStreamURL() {
        return mStreamURL;
    }

    public int getID() {
        return mID;
    }

    public String getArtworkURL() {
        return artworkURL;
    }

    public String getAvatarURL() {
        String avatarURL = artworkURL;
        if(avatarURL != null) {
            avatarURL = avatarURL.replace("large", "badge");
        }
        return avatarURL;
    }
}
