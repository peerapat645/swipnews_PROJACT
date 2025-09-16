package gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import gui.set.*;
public class accountsingup extends popup implements ActionListener {

    private setJTextField user;          
    private setPasswordField pass , conpass;       
    private JLabel lbUser, lbPass, text   ;
    private JPanel panel;
    private JLabel imageUser, imageLockpass, imageLockconpass;
    private setRoundedbotton login;
    private JRadioButton showpass;
    
    
    public accountsingup() {
        super();

        setTitle("Authoraccount | SwipeNews");
        setBackground(Color.LIGHT_GRAY);
        setLayout(new GridBagLayout());         // จัด panel ให้อยู่กลาง

        panel = new setRoundedPanel(20);
        panel.setLayout(null);                  
        panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(320, 420));

        text = new JLabel("Please enter your username and password");
        text.setForeground(Color.RED);

        lbUser = new JLabel();
        lbUser.setFont(new Font("Leelawadee UI", Font.PLAIN, 14));

        lbPass = new JLabel();
        lbPass.setFont(new Font("Leelawadee UI", Font.PLAIN, 14));

      
        login = new setRoundedbotton("Login", 20,new Font("Leelawadee UI", Font.BOLD, 18));//ชื่อปุ่ม, ความโค้ง, ฟอนต์
       
        user = new setJTextField();
        user.setFont("Tahoma", Font.PLAIN, 16);
        user.setFieldSize(180, 28);

        pass = new setPasswordField();          
        pass.setFont("Tahoma", Font.PLAIN, 16);
        pass.setFieldSize(180, 28);
        pass.showPassword(false);  // เริ่มซ่อน 

        conpass = new setPasswordField();
        conpass.setFont("Tahoma", Font.PLAIN, 16);
        conpass.setFieldSize(180, 28);
        conpass.showPassword(false);  // เริ่มซ่อน           

        showpass = new JRadioButton("Show Password");
        showpass.setFont(new Font("Leelawadee UI", Font.PLAIN, 14));
        showpass.setBackground(Color.WHITE); 
        // การทำงานของปุ่ม Show Password
        showpass.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                pass.showPassword(showpass.isSelected());
                 conpass.showPassword(showpass.isSelected());
            }
            
        });
       
    login.addActionListener(this);
        // =====พิกัด=====
      
    imageUser = new JLabel(new ImageIcon("./icon/user.png"));
    imageLockpass = new JLabel(new ImageIcon("./icon/unlock.png"));
    imageLockconpass = new JLabel(new ImageIcon("./icon/unlock.png"));
       user.setBounds(70, 140, 180, 30);    

       lbPass.setBounds(110, 150, 100, 22); 
       pass.setBounds(70, 178, 180, 30);    

       conpass.setBounds(70, 216, 180, 30); 

       showpass.setBounds(80, 252, 160, 24); 

       login.setBounds(100, 296, 120, 40);   

         imageUser.setBounds(40, 140, 26, 26);
         imageLockpass.setBounds(40, 180, 26, 26);
         imageLockconpass.setBounds(40, 220, 26, 26);  

        panel.add(text);
        panel.add(lbUser);   panel.add(user);
        panel.add(lbPass);   panel.add(pass);
        panel.add(showpass);   panel.add(conpass);                 
        panel.add(login);
       panel.add(imageUser);   panel.add(imageLockpass);   panel.add(imageLockconpass);  
        text.setBounds(30, 30, 300, 30);
        add(panel);
    }
        
        
        

       
      

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = user.getText();
        String password = new String(pass.getPassword());
        String confirm = new String(conpass.getPassword());
        if (username.isEmpty() || password.isEmpty() || confirm.isEmpty()) {
            JOptionPane.showMessageDialog(panel, "กรุณากรอกข้อมูลให้ครบถ้วน", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!password.equals(confirm)) {
            JOptionPane.showMessageDialog(panel, "รหัสผ่านไม่ตรงกัน", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // บันทึกข้อมูลลงไฟล์ useraccount.scr
        try {
            java.io.FileWriter fw = new java.io.FileWriter("./File/accout/useraccount.scr");
            fw.write("\n"+username + "," + password );
            fw.close();
            JOptionPane.showMessageDialog(panel, "สมัครสมาชิกสำเร็จ!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panel, "เกิดข้อผิดพลาดในการบันทึกข้อมูล", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
