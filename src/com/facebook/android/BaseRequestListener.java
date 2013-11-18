package com.facebook.android;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

import com.facebook.android.AsyncFacebookRunner.RequestListener;

public abstract class BaseRequestListener implements RequestListener {

    public void onFacebookError(FacebookError e, Object state) {
        e.printStackTrace();
    }

    public void onFileNotFoundException(FileNotFoundException e, Object state) {
        e.printStackTrace();
    }

    public void onIOException(IOException e, Object state) {
        e.printStackTrace();
    }

    public void onMalformedURLException(MalformedURLException e, Object state) {
        e.printStackTrace();
    }
    
}