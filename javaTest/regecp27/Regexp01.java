package com.javaTest.regecp27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author
 * @version 1.0
 * @date 2023/12/09 17:54
 * @Description 正则表达式，对文本处理带来那些便利
 */
public class Regexp01 {
    public static void main(String[] args) {
        /*String content = "Java是一种广泛使用的计算机编程语言，拥有跨平台、面向对象、泛型编程的特性，广泛应用于企业级Web应用开发和移动应用开发。" +
                "任职于Sun微系统的詹姆斯·高斯林等人于1990年代初开发Java语言的雏形，最初被命名为Oak，目标设置在家用电器等小型系统的编程语言，" +
                "应用在电视机、电话、闹钟、烤面包机等家用电器的控制和通信。由于这些智能化家电的市场需求没有预期的高，Sun微系统放弃了该项计划。" +
                "随着1990年代互联网的发展，Sun微系统看见Oak在互联网上应用的前景，于是改造了Oak，于1995年5月以Java的名称正式发布。" +
                "Java伴随着互联网的迅猛发展而发展，逐渐成为重要的网络编程语言。" +
                "Java编程语言的风格十分接近C++语言。继承了C++语言面向对象技术的核心，舍弃了容易引起错误的指针，以引用取代；移除了C++中的运算符重载和多重继承特性，" +
                "用接口取代；增加垃圾回收器功能。在Java SE 1.5版本中引入了泛型编程、类型安全的枚举、不定长参数和自动装/拆箱特性。Sun微系统对Java语言的解释是：" +
                "“Java编程语言是个简单、面向对象、分布式、解释性、健壮、安全、与系统无关、可移植、高性能、多线程和动态的语言”。" +
                "Java不同于一般的编译语言或解释型语言。它首先将源代码编译成字节码，再依赖各种不同平台上的虚拟机来解释执行字节码，从而具有“一次编写，" +
                "到处运行”的跨平台特性。在早期JVM中，这在一定程度上降低了Java程序的运行效率。但在J2SE1.4.2发布后，Java的执行速度有了大幅提升。" +
                "与传统类型不同，Sun微系统在推出Java时就将其作为开放的技术。全球的Java开发公司被要求所设计的Java软件必须兼容。“Java语言靠群体的力量而非公司的力量”是Sun微系统的口号之一，" +
                "并获得了广大软件开发商的认同。这与微软公司所倡导的注重精英和封闭式的模式完全不同，此外，微软公司后来推出了与之竞争的.NET平台以及模仿Java的C#语言。后来Sun微系统被甲骨文公司并购[14]，" +
                "Java也随之成为甲骨文公司的产品。目前，移动操作系统Android大部分的代码采用Java编程语言编程。";*/
        String content = "子网掩码一词仅用于IPv4地址中。但是，两个版本的IP地址都使用CIDR概念和符号。在此，" +
                "在IP地址后面加斜杠和用于标识网络部分的位数（十进制），" +
                "也称路由前缀。例如：IPv4地址及其子网掩码分别可以是 192.0.2.1 和 255.255.255.0 。" +
                "因为IP地址的前24位表示网络和子网，所以相同的IP地址和子网的CIDR表示法为192.0.2.1/24。";
        //1. 先创建一个 Pattern 对象 ， 模式对象, 可以理解成就是一个正则表达式对象
        //Pattern pattern = Pattern.compile("[a-zA-Z]+"); //提取文章中所有的英文字母
        //Pattern pattern = Pattern.compile("[0-9]+"); //提取文章中所有的数字
        //Pattern pattern = Pattern.compile("([0-9]+)|([a-zA-Z]+)"); //提取文章中所有的英文字母，数字
        //Pattern pattern = Pattern.compile("<a target=\"_blank\" title=\"(\\S*)\""); //提取文百度热榜标题
        Pattern pattern = Pattern.compile("\\d+\\.\\d+\\.\\d+\\.\\d+\\/\\d+"); //提取ip
        //Pattern pattern = Pattern.compile("<link rel=\".*\" hreflang=\".*\" href=\"(\\\\S*)\"");

        //2.创建一个匹配器
        //在matcher 匹配器按照 pattern（模式、样式），到content文本中去匹配
        //找不到就返回true，否则就返回false
        Matcher matcher = pattern.matcher(content);
        //3.可以开始循环匹配
        while (matcher.find()) {
            //匹配内容，文本，放到 m.group(0)
            System.out.println("找到：" + matcher.group(0));
        }
    }


}
