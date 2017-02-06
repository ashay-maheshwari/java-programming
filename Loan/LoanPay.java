import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class LoanPay extends JFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5;
JButton bCompute,bClear,bExit;
JTextField t1,t2,t3,t4;

Double prin,rate;
int time;


LoanPay()
{
setSize(700,550);
setVisible(true);
setResizable(true);
setTitle("LOAN PAYMENT COMPUTATION");

l1=new JLabel("Compute Monthly Loan Payments");
l1.setBounds(20,50,400,35);
l1.setForeground(Color.BLUE);

l2=new JLabel("Principal");
l2.setForeground(Color.RED);
l2.setBounds(50,120,200,35);
 
t1=new JTextField(10);
t1.setBounds(255,120,355,35);

l3=new JLabel("Years");
l3.setForeground(Color.RED);
l3.setBounds(50,180,200,35);

t2=new JTextField(10);
t2.setBounds(255,180,355,35);

l4=new JLabel("Interest Rate");
l4.setForeground(Color.RED);
l4.setBounds(50,240,200,35);

t3=new JTextField(10);
t3.setBounds(255,240,355,35);

l5=new JLabel("Monthly Payments");
l5.setForeground(Color.RED);
l5.setBounds(50,300,355,35);

t4=new JTextField(10);
t4.setBounds(255,300,355,35);



bCompute=new JButton("Compute",new ImageIcon("c.png"));
bCompute.setBounds(150,420,130,35);


bClear=new JButton("Clear",new ImageIcon("empty.png"));
bClear.setBounds(300,420,100,35);

bExit=new JButton("Exit",new ImageIcon("remove.png"));
bExit.setBounds(430,420,100,35);

setLayout(null);

add(l1);add(l2);add(l3);add(l4);add(l5);
add(t1);add(t2);add(t3);add(t4);
add(bCompute);add(bClear);add(bExit);

bCompute.addActionListener(this);
bClear.addActionListener(this);
bExit.addActionListener(this);

addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent w)
{
System.exit(0);
}});


}//END OF CONSTRUCTOR 

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==bCompute)
{
prin=Double.parseDouble(t1.getText());
time=Integer.parseInt(t2.getText());
rate=Double.parseDouble(t3.getText());

t4.setText(""+((prin*rate*time)/1200));
}

if(e.getSource()==bClear)
{
t1.setText("");t2.setText("");t3.setText("");t4.setText("");
}

if(e.getSource()==bExit)
System.exit(0);

}

public static void main(String ar[])
{
LoanPay lp=new LoanPay();
}
} //END OF CLASS