package javaTest.houseRentSystem.view;

import javaTest.houseRentSystem.domain.House;

import java.util.Scanner;

public class HouseView {


    Scanner scanner = new Scanner(System.in);
    House house ;
    //House[] houses = new House[20];

    private boolean loop = true;
    private char key = ' ';
    public void mainMenu(){//显示主菜单
        do{
            System.out.println("------------------房屋出租系统菜单--------------------");
            System.out.println("\t\t\t\t1 新增房源");
            System.out.println("\t\t\t\t2 查找房屋");
            System.out.println("\t\t\t\t3 删除房屋信息");
            System.out.println("\t\t\t\t4 修改房屋信息");
            System.out.println("\t\t\t\t5 房屋列表");
            System.out.println("\t\t\t\t6 退    出");

            System.out.println("请输入选择的服务编号（1-6）:");
            key = com.hspedu.houserent.utils.Utility.readChar();

            switch (key){
                case 1:
                    System.out.println("1 新增房源");
                    house.printHouseInfo();
                    break;
                case 2:
                    System.out.println("2 查找房屋");

                    break;
                case 3:
                    System.out.println("3 删除房屋");

                    break;
                case 4:
                    System.out.println("4 修改房屋信息");

                    break;
                case 5:
                    System.out.println("5 房屋列表");

                    break;
                case 6:
                    System.out.println("6 退    出");

                    break;
            }

        }while(loop);

    }
    public void listHouse(){//房屋信息界面

        house.printHouseInfo();

    }
    public void addHouse(){//房屋信息界面
        System.out.println("----------------添加房屋信息----------------");
        for (int i = 0; i < houses.length; i++) {
            houses[i] = {house.setHouseNuM(), house.setName(), house.setTelnumber(), house.setAdress(),
                    house.setMonthRent(), house.getStatusHouse()};
        }
        for (int i = 0; i < houses.length; i++) {
            System.out.println("姓名：" + house[i].getName() + "\n电话：" + house.getTelnumber() + "\n地址:" + house.getAdress()
                    + "\t月租：" + adress + "\t" + monthRent + "\t" + statusHouse);
        }


    }
    public void delHouse(){//接收del用户输入ID


    }
    public void findHouse(){//接收查询用户输入ID


    }
    public void updateHouse(){//接收更新用户输入ID


    }

}
