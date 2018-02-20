package structural.facade.some_complex_media_library;

/**
 * Created by adementev on 14.02.2018.
 */
public class VideoFile {
    private String name;
    private String codecType;

    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf('.')+1,name.length());
    }

    public String getName() {
        return name;
    }

    public String getCodecType() {
        return codecType;
    }
}
