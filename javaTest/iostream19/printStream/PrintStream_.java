package com.javaTest.iostream19.printStream;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @author
 * @version 1.0
 * @date 2023/10/31 14:18
 * @Description PrintStream (字节打印流、输出流)
 */
public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        //默认情况下， PrintStream输出数据的位置是 标准输出，及显示器
        out.print("john, hello");
        /*public void print(String s) {
        if (s == null) {
            s = "null";
        }
        write(s);
        }*/
        /*private void write(String s) {
        try {
            synchronized (this) {
                ensureOpen();
                textOut.write(s);
                textOut.flushBuffer();
                charOut.flushBuffer();
                if (autoFlush && (s.indexOf('\n') >= 0))
                    out.flush();
            }
        }
        catch (InterruptedIOException x) {
            Thread.currentThread().interrupt();
        }
        catch (IOException x) {
            trouble = true;
        }
        }*/
        //因为print底层使用的是write，所以我们可以直接调用write
        out.write("john, hello".getBytes());
        out.close();

        //可以修改打印流输出的位置、设备
        //1.输出修改成到 "./javaFile/f1.txt"
        //2. "hello hspEDU~" 就会输入到"./javaFile/f1.txt"
        System.setOut(new PrintStream("./javaFile/f1.txt"));
        System.out.println("hello hspEDU~");
    }
}
