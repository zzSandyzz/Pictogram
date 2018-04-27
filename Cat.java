package ru.androidacademy.spb.gallerylist;

import android.support.annotation.NonNull;

public class Cat {

    @NonNull
    private final String url;

    public Cat(@NonNull String url) {
        this.url = url;
    }

    @NonNull
    public String getUrl() {
        return url;
    }
}
