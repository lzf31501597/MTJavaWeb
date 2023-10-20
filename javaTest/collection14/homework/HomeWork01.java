package com.javaTest.collection14.homework;

import java.util.ArrayList;

public class HomeWork01 {
    public static void main(String[] args) {

        News news1 = new News("新闻1:新冠确证病例超千万，数百万印度教信徒赴恒河\"圣浴\"，引民众担忧");
        News news2 = new News("新闻2:男子突然想起2个月前钓的鱼还在往兜里，搂起一看赶紧放生");

        ArrayList arrayList = new ArrayList();
        arrayList.add(news1);
        arrayList.add(news2);

        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            //System.out.println(arrayList.get(i));
            News news = (News) arrayList.get(i);
            System.out.println(processTitle(news.getTitle()));


        }


    }
    public static String processTitle(String title){
        if (title == null) {
            return "";
        }
        if (title.length() > 15 ) {
            return title.substring(0, 15) + "...";//[0,15]
        }else {
            return title;
        }
    }
}
class News{
    private String title;
    private String context;

    public News(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "title='" + title +"'";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}