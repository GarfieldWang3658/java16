package com.hspedu.tankganme2;

import com.hspedu.tankgame.HspTankGame01;

import javax.swing.*;
import java.awt.event.KeyListener;


//为了监听 键盘事件，实现接口KeyListener
public class HspTankGame02 extends JFrame  {
    MyPanel mp = null;
    public static void main(String[] args) {
        HspTankGame02 hspTankGame02 = new HspTankGame02();
    }
    public HspTankGame02(){
        mp = new MyPanel();
        this.add(mp);//パネルをaddします、ゲームフィールド
        this.setSize(1000,750);
        this.addKeyListener(mp);//JFrameでキーボードイベントをリッスンします。
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//可視化
    }
}
