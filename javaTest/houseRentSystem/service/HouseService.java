package javaTest.houseRentSystem.service;

import javaTest.houseRentSystem.domain.House;
/*
*
*/
public class HouseService {

    private House[] houses;//
    private int houseNums = 1;
    private int idCounter = 1;
    public HouseService(int size) {//保存House对象
        houses = new House[size];
        houses[0] = new House(1, "jack", "111", "海淀区", 2000, "未出租");
       // houses[1] = new House(2, "king", "112", "通州区", 2500, "未出租");
    }

    public House[] list(){//返回所有房屋的信息

        return houses;
    }
    public boolean add(House newHouse){//添加新租用户信息
        //判断是否还可以添加新租户信息（暂时不考虑数组扩容问题）
        if (houseNums >= houses.length) {//不能添加
            System.out.println("数组已满，不能添加新租户信息！！！！");
            return false;
        }

        houses[houseNums++] = newHouse;
        //设计一个id自增的机制，然后更新newHouse Id
        newHouse.setHouseNuM(++idCounter);
        return true;

    }
    public boolean del(int delId){//删除用户信息
        //首先找到要删除的房屋的数组下标
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getHouseNuM()) {//要删除的房屋id，是数组下标为i的元素
                index = i; //用index记录下标值
            }
        }
        if (index == -1) {//说明delId在数组当中不存在
            return false;
        }

        //数组下标减一位==也就是删除了一条房屋信息
        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i+1];//后面一位下标的值，往前面一位下标前移一位
        }
        houses[--houseNums] = null;//删除要求的值
        return true;
    }
    public House findById(int findId){//查找用户信息
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getHouseNuM() == findId) {
                return houses[i];
            }
        }
        return null;
    }
    public House findByAdress(String adress){//查找用户信息
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getAdress() == adress) {
                //System.out.println(houses[i].toString());
                return houses[i];
            }
        }
        return null;
    }
    public House updateById(int findId){//查找用户信息
        for (int i = 0; i < houses.length; i++) {
            if(houses[i].getHouseNuM() == findId){
                return houses[i];
            }
        }
        return null;
    }
}
