package IO;

import java.io.*;

public class FileTest {
    public static void main(String[] args) throws IOException {
        fileInputStreamTest();
//            fileOutputStreamTest();
//        writerTest();
    }


    public static void fileInputStreamTest() throws IOException {
        String path = "E:\\input\\aaa.txt";

        //选择一根IO管
        FileReader fileReader = new FileReader(path);
        System.out.println(fileReader.getEncoding());
        //开始读取
        int b = -1;
        while ((b = fileReader.read()) != -1) {
            System.out.print((char) b);
        }
        fileReader.close();
    }

    public static void fileOutputStreamTest() throws IOException {
        String fromPath = "E:\\input\\Inputfile.txt";
        String toPath = "E:\\input\\HelloWorld.java";
        FileInputStream fileInputStream = new FileInputStream(fromPath);
        FileOutputStream fileOutputStream = new FileOutputStream(toPath, true);
        int b;
        while ((b = fileInputStream.read()) != -1) {
            fileOutputStream.write(b);

        }
        fileInputStream.close();
        fileOutputStream.flush();
        fileOutputStream.close();
    }

    public static void writerTest() throws IOException {
        String path = "E:\\input\\unicode.dat";
        FileWriter fileWriter = new FileWriter(path);

        for (int i = 0; i < 65535; i++) {
            fileWriter.write(i);
        }
        fileWriter.flush();
        fileWriter.close();
    }
}
