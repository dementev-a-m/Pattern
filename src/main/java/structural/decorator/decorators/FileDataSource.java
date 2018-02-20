package structural.decorator.decorators;

import java.io.*;

/**
 * Created by adementev on 13.02.2018.
 */
public class FileDataSource implements DataSource {
    private String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) {
        File file = new File(name);
        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(), 0, data.length());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String readData() {
        StringBuilder data = new StringBuilder();
        File file = new File(name);
        try (FileReader reader = new FileReader(file); BufferedReader buffer = new BufferedReader(reader)) {
            String sCurrentLine;
            while ((sCurrentLine = buffer.readLine()) != null)
                data.append(sCurrentLine);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data.toString();
    }
}
