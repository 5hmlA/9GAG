package me.storm.ninegag.model;

import android.database.Cursor;
import android.media.Image;

import java.util.ArrayList;

/**
 * Created by storm on 14-3-25.
 */
public class Feed extends BaseModel {
    public String id;
    public String caption;
    public String link;
    public Image images;
    public Vote votes;

    public class Image {
        public String small;
        public String normal;
        public String large;
    }

    private class Vote {
        public int count;
    }

    public static Feed fromCursor(Cursor cursor) {
        return null;
    }

    public static class FeedRequestData {
        public ArrayList<Feed> data;
    }
}