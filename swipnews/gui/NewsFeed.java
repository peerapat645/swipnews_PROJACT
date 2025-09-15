
package gui;
import java.awt.event.*;
// NewsFeed now extends popup

import gui.set.popup;


public class NewsFeed extends popup implements MouseListener, MouseMotionListener {

    private int startX = 0;
    private int startY = 0;

    public NewsFeed() {
        super();
        setTitle("NewsFeed | SwipNews"); // ตั้งชื่อหน้าต่าง
        addMouseListener(this);
        addMouseMotionListener(this);
    }

 









    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'mouseDragged'");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
      //  throw new UnsupportedOperationException("Unimplemented method 'mouseMoved'");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
      //  throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
      //  throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        startX = e.getX();
        startY = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int endX = e.getX();
        int endY = e.getY();
        int deltaX = endX - startX;
        int deltaY = endY - startY;
        if (Math.abs(deltaX) > Math.abs(deltaY) && Math.abs(deltaX) > 50) {
            if (deltaX > 0) {
                onSwipeRight();
            } else {
                onSwipeLeft();
            }
        }
    }

    private void onSwipeLeft() {
        System.out.println("Swiped Left");
        // TODO: เพิ่มโค้ดเมื่อปัดซ้าย
    }

    private void onSwipeRight() {
        System.out.println("Swiped Right");
        // TODO: เพิ่มโค้ดเมื่อปัดขวา
    }



    }


    
    

