package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


import gui.set.popup;
import gui.set.setRoundedPanel;

public class userDashboard extends popup  implements MouseListener {

    private JLabel backicon ;
    private setRoundedPanel panel;

    public userDashboard() {
        super();
        setTitle("userDashboard | SwipNews"); // ตั้งชื่อหน้าต่าง
        getContentPane().setBackground(Color.LIGHT_GRAY); // เปลี่ยนสีพื้นหลังของ login panel หลัก
        setLayout(new GridBagLayout()); // ให้อยู่กลางหน้าต่าง
        panel = new setRoundedPanel(20); // 20 คือความโค้งของมุม
        panel.setLayout(null); // ใช้ null layout เพื่อกำหนดตำแหน่งเอง
        panel.setBackground(Color.WHITE); // เปลี่ยนสีพื้นหลังของ panel
        panel.setPreferredSize(new Dimension(550, 600)); // กำหนดขนาด panel

        //เพิ่มรูป
        backicon = new JLabel(new ImageIcon("./icon/back.png"));//เพิ่มรูปภาพล็อก

        //กำหนดตำแหน่ง
        backicon.setBounds(10, 565, 30, 30); // x, y, width, height
        
        //เพิ่มปุ่ม
        panel.add(backicon);

        add(panel); // เพิ่ม panel หลักเข้าไปในหน้าต่าง
        backicon.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
    }
    
}
