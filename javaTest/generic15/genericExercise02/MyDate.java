package com.javaTest.generic15.genericExercise02;

import java.util.Objects;

class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return Objects.equals(year, myDate.year) &&
                Objects.equals(month, myDate.month) &&
                Objects.equals(day, myDate.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                '}';
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(MyDate o) {//比较 年月日
        //如果name相同， 就比较 birthday：year
        int yearMinus = year - o.getYear();
        if (yearMinus != 0) {
            return yearMinus;
        }

        //
        //如果year相同，就比较month
        int monthMinus = month - o.getMonth();
        if (monthMinus != 0) {
            return monthMinus;
        }

        //如果month相同，就比较day
        return day - o.getDay();
    }


}