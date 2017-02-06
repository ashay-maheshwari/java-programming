import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class Login extends JFrame
{
Image img;
Login()
{
setSize(400,400);
setVisible(true);

img=Toolkit.getDefaultToolkit().getImage("remove.png");
setIconImage(img);
}
public static void main(String ar[])
{
Login l=new Login();
}
}