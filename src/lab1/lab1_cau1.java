
package lab1;
//1. import thu vien
import java.awt.*;
public class lab1_cau1 extends Frame{
    
    public lab1_cau1(){
        
        //2. tao tieu de
        setTitle("ps21795_TheHuy");
        
        //3. tao 2 button va 1 label
        Button btn1 = new Button("red");
        Button btn2 = new Button("green");
        
        Label lbl = new Label("Nhan");
        
        //4.set layout 
        setLayout(new FlowLayout());
        
        //5. gan 2 button va 1 label len frame
        add(btn1);
        add(btn2);
        add(lbl);
    }
    
    public static void main(String[] args) {
        
        // 6. tao 1 doi tuong
        lab1_cau1 a = new lab1_cau1();
        
        //7. kich thuoc 
        a.setSize(500, 350);
        a.show();
        
    }
    
}
