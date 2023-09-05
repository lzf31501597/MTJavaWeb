package com.javaTest.houseRentSystem.view;

import com.javaTest.houseRentSystem.domain.House;
import com.javaTest.houseRentSystem.service.HouseService;
import com.javaTest.houseRentSystem.utils.Utility;

public class HouseView {

    private HouseService houseService = new HouseService(10);
    //Scanner scanner = new Scanner(System.in);
    //House house = new House();
    //House[] houses = new House[20];
    private boolean loop = true;
    private char key = ' ';
    public void mainMenu(){//显示主菜单
        //HouseService houseService = new HouseService();

        do{
            System.out.println("------------------房屋出租系统菜单--------------------");
            System.out.println("\t\t\t\t1 新增房源");
            System.out.println("\t\t\t\t2 查找房屋");
            System.out.println("\t\t\t\t3 删除房屋信息");
            System.out.println("\t\t\t\t4 修改房屋信息");
            System.out.println("\t\t\t\t5 房屋信息列表");
            System.out.println("\t\t\t\t6 退    出");

            System.out.println("请输入选择的租房服务编号（1-6）:");
            key = Utility.readChar();

            switch (key){
                case '1':
                    //System.out.println("1 新增房源");
                    addHouse();
                    break;
                case '2':
                    //System.out.println("2 查找房屋");
                    findHouse();
                    break;
                case '3':
                    //System.out.println("3 删除房屋");
                    delHouse();
                    break;
                case '4':
                    //System.out.println("4 修改房屋信息");
                    updateHouse();
                    break;
                case '5':
                    //System.out.println("5 房屋列表");
                    listHouse();
                    break;
                case '6':
                    //System.out.println("6 退    出");
                    exitHouse();
                    //loop = false;
                    break;
            }

        }while(loop);

        System.out.println("退出租房系统菜单！！！");

    }
    public void listHouse(){//房屋信息列表
        System.out.println("----------------------房屋列表--------------------");
        System.out.println("编号\t\t户主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] != null) {
                System.out.println(houses[i]);
            } else {
                break;
            }
        }
        System.out.println("--------------------房屋列表信息显示完成--------------------");

    }
    public void addHouse(){//房屋信息界面
        System.out.println("----------------添加房屋信息----------------");
        System.out.println("姓名：");
        String name = Utility.readString(8);

        System.out.println("电话：");
        String tel = Utility.readString(12);

        System.out.println("地址：");
        String adress = Utility.readString(16);

        System.out.println("月租：");
        double monthRent = Utility.readInt();

        System.out.println("状态：");
        String status = Utility.readString(3);

        //创建新House对象，注意ID是系统分配的
        House newHouse = new House(0, name, tel, adress, monthRent, status);
        if (houseService.add(newHouse)) {
            System.out.println("----------------添加房屋成功------------------");
        }else {
            System.out.println("----------------添加房屋失败------------------");
        }



    }
    public void delHouse(){//接收del用户输入ID
        System.out.println("----------------添加房屋信息------------------");
        System.out.println("请输入待删除房屋编号（-1退出):");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("----------------放弃删除房屋信息----------------");
            return;
        }
        //System.out.println("请确认是否删除（Y/N），小心选择：");
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {//真的删除房屋信息
            if (houseService.del(delId)) {
                System.out.println("----------------删除房屋信息----------------");
            }else {
                System.out.println("----------------房屋编号不存在，删除失败----------------");
            }
        }else {
            System.out.println("----------------放弃删除房屋信息----------------");
        }
    }

    public void exitHouse(){
        //使用Utility类的方法，完成确认
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }
    public void findHouse(){//接收查询用户输入ID
        System.out.println("----------------查找房屋信息------------------");
        System.out.println("请输入要查询房子ID：");
        int houseId = Utility.readInt();
        System.out.println("编号\t\t户主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House house = houseService.findById(houseId);
        if (house != null) {
            System.out.println(house.toString());
        }else {
            System.out.println("----------------查找房屋信息id不存在----------------");
        }
    }
    public void updateHouse(){//接收更新用户输入ID
        System.out.println("----------------更新房屋信息------------------");
        System.out.println("请输入待修改的房屋编号：");
        int houseId = Utility.readInt();
        if (houseId == -1) {
            System.out.println("---------------你放弃修改房屋信息----------------");
            return;
        }

        //返回的是引用类型：就是数组元素
        //通过调用House对象的setXXX（），就会修改HouseService，houses数组元素
        House house = houseService.updateById(houseId);
        if (house != null) {
            System.out.print("name("+house.getName()+"):");
            //这里如果用户直接回车表示不修改信息，按回车键返回
            String name = Utility.readString(8,"");
            if (!"".equals(name)) {
                house.setName(name);
            }

            System.out.print("telNumber("+house.getTelnumber()+"):");
            String telNumber = Utility.readString(12,"");
            if (!"".equals(telNumber)) {
                house.setTelnumber(telNumber);
            }

            System.out.print("adress("+house.getAdress()+"):");
            //这里如果用户直接回车表示不修改信息，按回车键返回
            String adress = Utility.readString(18,"");
            if (!"".equals(adress)) {
                house.setAdress(adress);
            }

            System.out.print("monthRent("+house.getMonthRent()+"):");
            //这里如果用户直接回车表示不修改信息，按回车键返回
            int monthRent = Utility.readInt(-1);
            if (monthRent != -1) {
                house.setMonthRent(monthRent);
            }

            System.out.print("statusHouse("+house.getStatusHouse()+"):");
            //这里如果用户直接回车表示不修改信息，按回车键返回
            String statusHouse = Utility.readString(3,"");
            if (!"".equals(statusHouse)) {
                house.setStatusHouse(statusHouse);
            }
            System.out.println("----------------修改房屋信息成功----------------");
        }else {
            System.out.println("----------------要修改的房屋编号不存在----------------");
            return;
        }

    }

}
