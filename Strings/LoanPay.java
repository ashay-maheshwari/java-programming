import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class LoanPay extends JFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5;
JButton bCompute,bClear;
JTextField t1,t2,t3,t4;

LoanPay()
{
setSize(500,500);
setVisible(true);
setResizable(true);
setTitle("LOAN PAYMENT COMPUTATION");

l1=new JLabel("Compute Monthly Loan Payments");
l1.setBounds(20,10,400,35);

l2=new JLabel("Principal");
l2.setBounds(50,50,200,35);
 
t1=new JTextField(10);
t1.setBounds(255,50,355,35);

l3=new JLabel("Years");
l3.setBounds(50,110,200,35);

t2=new JTextField(10);
t2.setBounds(255,110,355,35);

l4=new JLabel("Interest Rate");
l4.setBounds(50,170,200,35);

t3=new JTextField(10);
t3.setBounds(255,170,355,35);

l5=new JLabel("Monthly Payments");
l5.setBounds(50,230,355,35);

t4=new JTextField(10);
t4.setBounds(255,230,355,35);



bCompute=new JButton("Compute");
bCompute.setBounds(100,250,200,35);


bClear=new JButton("Clear");
bClear.setBounds(230,250,330,35);

setLayout(null);

add(l1);add(l2);add(l3);add(l4);add(l5);
add(t1);add(t2);add(t3);add(t4);
add(bCompute);add(bClear);

//bCompute.addActionListener(this);
//bClear.addActionListener(this);

}//END OF CONSTRUCTOR 

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==bCompute)
System.out.println("Hello1");

if(e.getSource()==bClear)
System.out.println("Hello2");
}

public static void main(String ar[])
{
LoanPay lp=new LoanPay();
}
} 