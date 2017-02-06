 import java.awt.*;
 import java.awt.event.*;

class LabelDemo extends Frame
    {
       Label l1,l2;
       LabelDemo()
 {
      setSize(500,500);
      setVisible(true);
      setBackground(Color.GREEN);
      
   l1=new Label("First Label");
   l2=new Label("Second Label");


   
       setLayout(new BorderLayout());
add(l1);add(l2);

}

public static void main(String a[])
    {
     LabelDemo ld=new LabelDemo();
}
}

