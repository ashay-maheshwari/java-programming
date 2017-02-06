import java.awt.*;
import java.awt.event.*;

class ChoiceDemo extends Frame implements ItemListener,ActionListener
{
  Button b1;
Label l1;
Checkbox c1,c2,c3,c4,c5;
List list;

ChoiceDemo()
   {
       setSize(600,600);
       setVisible(true);
       setBackground(Color.GREEN);
       setResizable(true);
      
    l1=new Label("Degree");
    b1=new Button("Submit");
   list=new List(7);

c1=new Checkbox("Phd");
c2=new Checkbox("MTech");
c3=new Checkbox("BTech");
c4=new Checkbox("Intermediate");
c5=new Checkbox("Matric");

setLayout(new FlowLayout());
add(l1);add(c1);add(c2);add(c3);add(c4);add(c5);
add(list);add(b1);

b1.addActionListener(this);
}//END OF CONSTRUCTOR

public void itemStateChanged(ItemEvent e)
{
   if(e.getSource()==c1)
     {
     if(c1.getState()==true)
             list.addItem(c1.getText());
     }

 if(e.getSource()==c2)
     {
     if(c2.getState()==true)
             list.addItem(c2.getText());
     }
if(e.getSource()==c3)
     {
     if(c3.getState()==true)
             list.addItem(c3.getText());
     }

if(e.getSource()==c4)
     {
     if(c4.getState()==true)
             list.addItem(c4.getText());
     }

if(e.getSource()==c5)
     {
     if(c5.getState()==true)
             list.addItem(c5.getText());
     }
 }//END OF FUNCTION


public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
  {
     String s[]=list.getSelectedItems();
     for(int i=0;i<s.length;i++)
      System.out.println(s[i]);
list.removeAll();
}
}//END OF FUNCTION

public static void main(String ar[])
  {
     ChoiceDemo cd=new ChoiceDemo();
}
}//END OF CLASS   
