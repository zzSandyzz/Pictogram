package ru.sasha.spb.Pictogram;

import android.support.annotation.NonNull;

public class Pic {

    @NonNull
    private final String url;

    public Pic(@NonNull String url) {
        this.url = url;
    }

    @NonNull
    public  String getUrl() { return url; }
}
