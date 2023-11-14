package com.hspedu.tankgame;
/*
ゲームフィールドの設定
 */

import javax.swing.*;
import java.awt.*;

public class MyPanel  extends JPanel {
    //Heroを定義します
    Hero hero = null;
    public MyPanel(){
        hero = new Hero(100,100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);//長方形を充填します、初期化カラーは黒

        //
        drawTank(hero.getX(),hero.getY(),g,0,0);
        drawTank(hero.getX(),hero.getY()+60,g,0,1);

    }
    //
    /*
    X　左上のX座標
    Y　左上のY座標
    g　ペン
    driect　進行方向
    type 　種類
     */
    public void drawTank(int x,int y,Graphics g,int direct,int type){
        switch (type){
            case 0://味方
                g.setColor(Color.cyan);
                break;
            case 1://敵
                g.setColor(Color.yellow);
                break;
        }
        //進行方向で戦車を描く
        switch (direct){
            case 0://上に進行
                g.fill3DRect(x,y,10,60,false);//左の車輪
                g.fill3DRect(x+30,y,10,60,false);//右の車輪
                g.fill3DRect(x+10,y+10,20,45,false);//車体
                g.fillOval(x+10,y+20,20,20);//蓋
                g.drawLine(x+20,y+30,x+20,y);//主砲

                break;
            default:
        }


    }
}
