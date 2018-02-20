package structural.facade;

import structural.facade.some_complex_media_library.facade.VideoConversionFacade;

import java.io.File;


public class Main {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");

    }
}
