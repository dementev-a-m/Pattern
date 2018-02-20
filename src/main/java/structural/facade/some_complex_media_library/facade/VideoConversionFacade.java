package structural.facade.some_complex_media_library.facade;

import structural.facade.some_complex_media_library.*;

import java.io.File;

/**
 * Created by adementev on 14.02.2018.
 */
public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec = null;
        if (format.equals("mp4"))
            destinationCodec = new MPEG4CompressionCodec();
        else if (format.equals("ogg"))
            destinationCodec = new OggCompressionCodec();
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer,destinationCodec);
        File result = AudioMixer.fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;



    }
}
