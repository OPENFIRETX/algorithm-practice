package Test.JavaBasic.IO;

import java.io.*;

public class StringIO {

    public static void main(String[] args) {
        String filePath = "F:\\代码\\数据结构算法 java\\suanfa\\data\\word";

        //源文件
        java.io.File file = new java.io.File(filePath);
        //目标文件
        java.io.File destFile = new java.io.File("F:\\代码\\数据结构算法 java\\suanfa\\data\\word.copy");

        FileInputStream in = null;
        FileOutputStream out = null;

        //缓冲入流
        BufferedInputStream buffIn = null;
        //缓冲出流
        BufferedOutputStream buffOut = null;
//        缓冲区
        byte[] cache = new byte[1024];

        try {
            in = new FileInputStream(file);
            out = new FileOutputStream(destFile);

            buffIn = new BufferedInputStream(in);
            buffOut = new BufferedOutputStream(out);

            int data = -1;

//            while ((data = in.read()) != -1) {
//                out.write(data);
//            }

            while ((data = buffIn.read(cache)) != -1) {
                buffOut.write(cache, 0, data);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (buffIn != null) {
                try {
                    buffIn.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (buffOut != null) {
                try {
                    buffOut.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
