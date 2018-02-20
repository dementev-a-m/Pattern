package structural.facade.some_complex_media_library;

import java.io.File;

/**
 * Created by adementev on 14.02.2018.
 */
public class AudioMixer {
    public static File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
