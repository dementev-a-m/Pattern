package structural.facade.some_complex_media_library;

/**
 * Created by adementev on 14.02.2018.
 */
public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        } else if (type.equals("ogg")) {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();

        }
        return null;
    }
}
