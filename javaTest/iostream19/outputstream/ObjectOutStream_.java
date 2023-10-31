package com.javaTest.iostream19.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author
 * @version 1.0
 * @date 2023/10/31 10:43
 * @Description ObjectOutputStream 的使用，完成数据的序列化
 */
public class ObjectOutStream_ {
    public static void main(String[] args) {
        //序列化后，保存的文件格式，不是存文本，而是按照他的格式来保存
        String filePath = "./javaFile/data.dat";
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
            objectOutputStream.writeInt(100);
            objectOutputStream.writeBoolean(true);
            objectOutputStream.writeChar('a');
            objectOutputStream.writeDouble(99.9);
            objectOutputStream.writeUTF("韩顺平EDU");

            objectOutputStream.writeObject(new Dog("xiaohuang", 3, "asdad", "yello"));

            objectOutputStream.close();
            System.out.println("数据序列化形式，已保存完毕。。。。。");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
