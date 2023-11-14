package com.hspedu.event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallMove extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();

    }
    //コンストラクタ
    public BallMove(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        //窗口JFrame 对象可以监听键盘时间，即可以监听到面板发生的键盘事件
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
class MyPanel extends JPanel implements KeyListener {
    //为了染小球可以移动，把他的左上角的坐标（x,y）设置变量。
    int x = 10;
    int y = 10;


    //有字符输出时，该方法就会触发
    @Override
    public void keyTyped(KeyEvent e) {

    }
    //当某个键被按下了，该方法会触发
    @Override
    public void keyPressed(KeyEvent e){
        //System.out.println((char)e.getKeyCode()+"被按下...");
        //根据用户按下的不同键，来处理小球的移动（上下左右的键）
        //在java中，会给每一个键，分配一个值（int）
        if (e.getKeyCode()==KeyEvent.VK_DOWN) {//KeyEvent.VK_DOWN就是向下的箭头对应的code
            y++;
        }else if(e.getKeyCode()==KeyEvent.VK_UP){
            y--;
        }else if (e.getKeyCode()==KeyEvent.VK_LEFT){
            x--;
        }else if (e.getKeyCode()==KeyEvent.VK_RIGHT){
            x++;
        }
        //让面板重绘
        this.repaint();
    }
    //当某个键（释放）松开了，该方法会触发
    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,20,20);
    }
}

