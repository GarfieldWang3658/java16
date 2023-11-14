package com.hspedu.draw;

import javax.swing.*;
import java.awt.*;
@SuppressWarnings({"all"})
public class DrawCircle extends JFrame{//JFrameは一つのフレームとして
    //パネルを定義します
    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();

    }
    public DrawCircle(){
        //パネルを初期化します
        mp = new MyPanel();
        //パネルをフレームに入れます。
        this.add(mp);
        //フレームのサイズを設定します。
        this.setSize(1000,900);
        //Xボタンを押すと、システムをログアウトします。
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//可視化にします。


    }
}
//1、まずMyPanelを定義します、JPanelクラスを継承します。
class MyPanel extends JPanel{
    @Override
    public void paint(Graphics g) {//ペイントのメソッド
        super.paint(g);//親クラスのメソッドを使用し、初期化
        //円形を描く
        //g.drawOval(10,10,100,100);

        //グラフィックスのメソッド
        //直線 drawLine(int x1，int y1，int x2，int y2)
 //       g.drawLine(10,10,100,100);
        //長方形の枠 drawRect(int x, int y, int width, int height)
//        g.drawRect(10,100,100,100);
        //楕円の枠 drawOval(int x, int y, int width, int height)
        //長方形を充填する　fillRect(int x int y , int width, int height)
        //楕円を充填する　fillOval(int x, int y, int width, int height)
        // g.setColor(Color.magenta);
        // g.fillRect(10,10,100,100);
        //画像 drawImage(Image imp, int x ,int y,..)
        //画像を取得する：
        //画像の保存場所：プロジェクトのルートディレクトリ
        //Toolkit.getDefaultToolkit().getImage(Panel.class.getResource())
        //画像のサイズを設定します。
        //g.drawImage(image,10,10,100,100,this);
        //文字列を描く　drawString(String str , int x int y,…)
        //ペンのカラー設定と文字設置 setColor(Color c)
        //g.setColor(Color.magenta);
        //文字の書体、太さ、大きさのサイズの設定
        //g.setFont(new Font("隶书",Font.BOLD,50));
        //文字列の内容と座標、座標の原点は左下
        //g.drawString("你好 ",100,100);

    }
}