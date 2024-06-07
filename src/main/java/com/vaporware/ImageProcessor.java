package com.vaporware;

import java.awt.image.BufferedImage;
import java.util.List;

public class ImageProcessor {
    public static void main(String[] args) {
        final int WIDTH = 128;
        final int HEIGHT = 128;

        //Storage
        String[] urls = new List<String>();

        for (String url : urls) {

        try {
            //establish a random point on the image, monitor for grandient change
            //isolate each island
            //process
            BufferedImage sizedImage = resizeImage(pullImage(url, WIDTH, HEIGHT));
        } catch {
            throw new IllegalArgumentException();
            }

        //storage buffer(file)

    }
}
