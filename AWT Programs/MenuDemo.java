import java.awt.*;
import java.awt.event.*;

class Save extends Frame
{
Label l1;
Button b1;
Save()
{
setSize(200,200);
setVisible(true);
setResizable(true);
setBackground(Color.green);

l1=new Label("FILE NAME");
b1=new Button("OK");

setLayout(new FlowLayout(1,400,200));
add(l1);add(b1);
}
}




class Admin extends Frame
{
Label l1;
Admin()
{
setSize(500,500);
setVisible(true);
setResizable(true);
setBackground(Color.green);

l1=new Label("HELLO ABOUT US");
setLayout(new FlowLayout(1,400,200));
add(l1);
}
}


class MenuDemo extends Frame implements ActionListener
{


MenuBar mb;
Menu file,edit,help,tools;
MenuItem new_doc,save,save_as,undo,redo,about_us,font,format;
TextField t1;
 MenuDemo()
{
setSize(600,600);
setVisible(true);
setResizable(true);
setBackground(Color.yellow);

t1=new TextField(60);

//MENU BAR 
mb=new MenuBar();

//MENU
file=new Menu("FILE");
edit=new Menu("EDIT");
help=new Menu("HELP");
tools=new Menu("TOOLS");

//MENU ITEMS
new_doc=new MenuItem("NEW");
save=new MenuItem("SAVE");
save_as=new MenuItem("SAVE AS");
undo=new MenuItem("UNDO");
redo=new MenuItem("REDO");
about_us=new MenuItem("ABOUT US");
font=new MenuItem("FONT");
format=new MenuItem("FORMAT");
add(t1);
file.add(new_doc);file.add(save);file.add(save_as);
edit.add(undo);edit.add(redo);
help.add(about_us);
tools.add(font);tools.add(format);

mb.add(file);mb.add(edit);mb.add(help);mb.add(tools);

new_doc.addActionListener(this);
save.addActionListener(this);
save_as.addActionListener(this);
undo.addActionListener(this);
redo.addActionListener(this);
about_us.addActionListener(this);
font.addActionListener(this);
format.addActionListener(this);
setMenuBar(mb);

addWindowListener(new WindowAdapter()
{public void windowClosing(WindowEvent e)
{ 
System.exit(0);
}});




}//END OF FUNCTION

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==new_doc)
{
t1.setText(" ");
System.out.println("FILE MENU new document");
}
if(e.getSource()==save)
{
Save s=new Save();
System.out.println("FILE MENU to save");
  }  
if(e.getSource()==save_as)
System.out.println("FILE MENU to save as ");

if(e.getSource()==undo)
System.out.println("FILE MENU undo");

if(e.getSource()==redo)
System.out.println("FILE MENU redo");

if(e.getSource()==about_us)
{
Admin a=new Admin();
}


if(e.getSource()==font)
System.out.println("FILE MENU for font");
 
if(e.getSource()==format)
System.out.println("FILE MENU for format");

}//END OF FUNCTION

public static void main(String ar[])
{
MenuDemo md=new MenuDemo();
}
}//END OF CLASS