import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ProgressDemo extends JFrame implements ActionListener
{

JButton b1;
JProgressBar jbp;
int i=0;

  ProgressDemo()
   {
       setSize(600,400);
       setVisible(true);
        

      b1=new JButton("PRESS");
      b1.setBounds(200,200,100,45);
       add(b1);
      
	jbp=new JProgressBar();
         jbp.setBounds(100,100,300,15);
	add(jbp);
  setLayout(null);
   b1.addActionListener(this);
   }//end constructor


   public void actionPerformed(ActionEvent e)
      {
         if(e.getSource()==b1)
		{

              


		  jbp.setValue(i);
                  jbp.setStringPainted(true);
		  jbp.setBackground(Color.BLUE);
                  jbp.setForeground(Color.red);
		   i++;
                if(i%2==0)
                 b1.setBackground(Color.GREEN);
              if(i%2!=0)
              b1.setBackground(Color.RED);  
                 
                if(i==100)
			{
			 this.setVisible(false);
                         System.out.println("bas kar yaar");
                        }
                }
      }//end function


public static void main(String ar[])
{
new ProgressDemo();	
}
}//end class
           


