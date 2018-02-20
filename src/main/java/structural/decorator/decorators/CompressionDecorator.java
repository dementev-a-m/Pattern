package structural.decorator.decorators;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/**
 * Created by adementev on 14.02.2018.
 */
public class CompressionDecorator extends DataSourceDecorator {
    private int compLevel = 2;

    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    public int getCompLevel() {
        return compLevel;
    }

    public void setCompLevel(int compLevel) {
        this.compLevel = compLevel;
    }

    @Override
    public void writeData(String data) {
        super.writeData(compress(data));
    }

    private String compress(String data) {
        byte[] resultData = data.getBytes();
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
             DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, new Deflater(compLevel))) {
            BASE64Encoder encoder = new BASE64Encoder();
            deflaterOutputStream.write(resultData);
            return encoder.encode(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String readData() {
        try {
            return decompress(super.readData());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String decompress(String data) throws IOException {
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] result = decoder.decodeBuffer(data);
        try (InputStream inputStream = new ByteArrayInputStream(result);
             InflaterInputStream inflaterInputStream = new InflaterInputStream(inputStream);
             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512)) {
            int b;
            while ((b = inflaterInputStream.read()) != -1)
                byteArrayOutputStream.write(b);
            return new String(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
