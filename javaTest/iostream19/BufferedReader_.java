package com.javaTest.iostream19;

/**
 * @author
 * @version 1.0
 * @date 2023/10/28 17:03
 * @Description 做成处理流、包装流
 */
public class BufferedReader_ extends Reader_{
    private Reader_ reader_;

    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }

    public  void readFile(){
        reader_.readFile();
    }

    @Override
    public void read() {
        if (reader_ instanceof FileReader_) {
            reader_.readFile();

        }else if (reader_ instanceof StringReader_) {
            reader_.readString();
        }
    }

    //让方法更加灵活，多次读取文件
    public void readFiles(int num){
        for (int i = 0; i < num; i++) {
            reader_.readFile();
        }
    }
    //扩展 readString（），批量处理字符串数据
    public void readStrings(int num){
        for (int i = 0; i < num; i++) {
            reader_.readString();
        }
    }
}
