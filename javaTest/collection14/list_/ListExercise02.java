package com.javaTest.collection14.list_;

import java.util.List;
import java.util.Vector;

public class ListExercise02 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //List list = new ArrayList();
        //List list = new LinkedList();
        List list = new Vector();
        list.add(new Book01("红楼梦", "曹雪芹", 100));
        list.add(new Book01("西游记", "吴承恩", 10));
        list.add(new Book01("水浒传", "施耐庵", 19));
        list.add(new Book01("三国志", "罗贯中", 80));
        list.add(new Book01("西游记", "吴承恩", 10));

        //如何对集合进行排序
        //遍历
        for (Object o : list) {
            System.out.println(o);
        }
        //冒泡排序
        sort(list);
        System.out.println("==排序后==");
        for (Object o : list) {
            System.out.println(o);
        }

    }
    public static void sort(List list){
        int listSize = list.size();
        for (int i = 0; i < listSize - 1; i++) {
            for (int j = 0; j < listSize - 1 - i; j++) {
                Book01 book01 = (Book01)list.get(j);
                Book01 book02 = (Book01)list.get(j + 1);
                if (book01.getPrivce() > book02.getPrivce()) {
                    list.set(j, book02);
                    list.set(j+1, book01);
                }
            }

        }
    }
}
class Book01 {
    private String name;
    private String authorr;
    private double privce;

    public Book01(String name, String authorr, double privce) {
        this.name = name;
        this.authorr = authorr;
        this.privce = privce;
    }


    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public double getPrivce() {
        return privce;
    }

    public void setPrivce(double privce) {
        this.privce = privce;
    }
    public String getAuthorr() {
        return authorr;
    }

    public void setAuthorr(String authorr) {
        this.authorr = authorr;
    }
    @Override
    public String toString() {
        return "名称:" + name +
                ",\t作者:" + authorr +
                ",\t价格:" + privce ;
    }
}