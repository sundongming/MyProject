package com.sdm.java;

import java.util.Scanner;

/**
 * @author sundongming
 * @create 2019-04-03 10:48
 */
public class game01 {
    public static void main(String[] args) {
        System.out.println("*****欢迎来到猜拳小游戏*****");
        System.out.println("*****请出拳：1.剪刀2.石头3.布*****");
        Scanner in = new Scanner(System.in);//接收用户输入的值
        int num1 = in.nextInt();
        int num2 = ((int)(Math.random()*3));
        String str1 = "";
        String str2 = "";
        switch (num1)
        {
            case 1:
                str1 = "1.剪刀";
                break;
            case 2:
                str1 = "2.石头";
                break;
            case 3:
                str1 = "3.布";
                break;
            default:
                System.out.println("请输入正确的值！");
                break;
        }
        switch (num2)
        {
            case 1:
                str2 = "1.剪刀";
                break;
            case 2:
                str2 = "2.石头";
                break;
            case 3:
                str2 = "3.布";
                break;
        }
        if (num1==num2){
            System.out.println("平局：你出的是" + str1+"电脑出的是"+str2);
        }else if (num1==1&&num2==2||num1==2&&num2==3||num1==3&&num2==1){
            System.out.println("你输了：你出的是" + str1+"电脑出的是"+str2);
        }else {
            System.out.println("你赢了：你出的是" + str1+"电脑出的是"+str2);
        }

    }
}
