package com.hspedu.tankgame;


import com.hspedu.tankganme2.MyPanel;

import javax.swing.*;

public class HspTankGame01 extends JFrame {

    //パネルを定義します
    MyPanel mp = null;
    public static void main(String[] args) {
        HspTankGame01 hspTankGame01 = new HspTankGame01();

    }
    public HspTankGame01(){
        MyPanel mp = new MyPanel();
        this.add(mp);//パネルをaddします、ゲームフィールド
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//可視化

    }
}
