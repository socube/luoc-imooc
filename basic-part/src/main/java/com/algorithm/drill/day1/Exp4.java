package com.algorithm.drill.day1;

import javax.swing.*;

/**
 * 题目：将一个正整数分解质因数。例如：输入90，打印出90=2*3*3*5.
 * ***程序分析：对n进行分解质因数，应先找到一个最小的质数，然后按下述步骤完成。
 * （1）如果这个质数恰等于n，则说明分解质因数的过程以及结束，打印出结果即可。
 * （2）如果n<>k，但n能被k整除，则应打印出k的值，并用n除以k的商作为新的正整数，重复执行第一步。
 * （3）如果n不能被k整除，则用k+1作为k的值，重复执行第一步。
 *
 * @author Luo
 */
public class Exp4 {
    public static void main(String[] args) {
        String str = "";
        str = JOptionPane.showInputDialog("请输入N的值（输入exit退出）：");
        int N = 0;
        try {
            N = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("ERROR！\n" + "请输入正整数！");
            return;
        }
        System.out.print(N + "分解质因数：" + N + "=");
        fenjie(N);
    }

    public static void fenjie(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.print(i + "*");
                fenjie(n / i);
            }
        }
        System.out.print(n);
        System.exit(0);
    }

}
