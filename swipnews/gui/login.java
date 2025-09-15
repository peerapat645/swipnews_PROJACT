package gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import gui.set.popup;
// import RoundedButton จากไฟล์ใหม่ (อยู่ใน package เดียวกัน)
import gui.set.setRoundedPanel;
import gui.set.setRoundedbotton;

public class login extends popup implements MouseListener {


    private setRoundedPanel panel;
    private setRoundedbotton button1;
    private setRoundedbotton button2;
    private JLabel label_login;
    private JLabel label_admin;


    public login() {
        super();
        setTitle("Login | SwapNews"); // ตั้งชื่อหน้าต่าง
        setBackground(Color.LIGHT_GRAY); // เปลี่ยนสีพื้นหลังของ login panel หลัก
        setLayout(new GridBagLayout()); // ให้อยู่กลางหน้าต่าง
        panel = new setRoundedPanel(20); // 20 คือความโค้งของมุม
        panel.setLayout(null); // ใช้ null layout เพื่อกำหนดตำแหน่งเอง
        panel.setBackground(Color.WHITE); // เปลี่ยนสีพื้นหลังของ panel
        panel.setPreferredSize(new Dimension(300, 400)); // กำหนดขนาด panel
        //สร้างปุ่มทั้งสอง
        button1 = new setRoundedbotton("Readers", 20, new Font("Leelawadee UI", Font.BOLD, 18));//ชื่อปุ่ม, ความโค้ง, ฟอนต์
        button2 = new setRoundedbotton("Author", 20, new Font("Leelawadee UI", Font.BOLD, 18));//ชื่อปุ่ม, ความโค้ง, ฟอนต์
        //สร้าง label
        label_login = new JLabel("   Login");
        label_login.setFont(new Font("Leelawadee UI", Font.BOLD, 28)); // เปลี่ยนฟอนต์ไทยและขนาด
    label_admin = new JLabel("<html><u>Login as admin</u></html>");
        
        //ปรับตำแหน่งปุ่ม
        button1.setBounds(75, 190, 150, 40); // x, y, width, height
        button2.setBounds(75, 250, 150, 40);// x, y, width, height
        label_login.setBounds(90, 35, 150, 40); // x, y, width, height 
        label_admin.setBounds(180, 360, 150, 30); // x, y, width, height
        label_admin.setFont(new Font("Leelawadee UI", Font.PLAIN, 14)); // เปลี่ยนฟอนต์ไทยและขนาด
        //เพิ่มปุ่มลงใน panel
        panel.add(label_login);
        panel.add(button1);
        panel.add(button2);
        panel.add(label_admin);
        add(panel); // เพิ่ม panel ที่มีปุ่มทั้งสองเข้าไปใน login panel หลัก


        // เพิ่ม MouseListener ให้ปุ่ม
        button1.addMouseListener(this);
        button2.addMouseListener(this);
        label_admin.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object g = e.getSource(); 
        Object h = e.getSource(); 
        if (h == label_admin ) {
            new Authoraccountsingup().setVisible(true);
            this.dispose();
        }
        if (g == button1 ) {
            new NewsFeed().setVisible(true);
            this.dispose();
        }
        if (g == button2 ) {
            new AuthorLogin().setVisible(true);
            this.dispose();
        }
    }






    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
       //throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
    }






    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
      //  throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
    }






    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
    }






    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
    }


    }

