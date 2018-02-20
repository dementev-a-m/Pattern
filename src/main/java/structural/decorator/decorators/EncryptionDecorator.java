package structural.decorator.decorators;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

/**
 * Created by adementev on 14.02.2018.
 */
public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String decode(String data) {
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] result = null;
        try {
            result = decoder.decodeBuffer(data);
            for (int i = 0; i < result.length; i++)
                result[i] -= (byte) 1;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(result != null ? result : new byte[0]);
    }

    public String encode(String data) {
        BASE64Encoder encoder = new BASE64Encoder();
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++)
            result[i] += (byte) 1;
        return encoder.encode(result);
    }
}
