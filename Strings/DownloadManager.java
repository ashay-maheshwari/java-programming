import awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.net.*;
import javax.swing.event.*;
import java.util.*;

//The Download Manager

class DownloadManager extends JFrame
implements Observer
{

//Add DownLoad Textfield
private JTextField addTextField;

//Download Tabels data model
private JTable table;

//These are the buttons for managing the selected download
private JButton pauseButton,resumeButton;
private JButton camcelButton,clearButton;

//Currently selected download
private Download selectedDownload;

//Flag for weather or not table selection is being cleared
private boolean clearing;

//Constructo for download

public DownloadManager()
{
setTitle("DOWNLOAD MANAGER");

setSize(640,480);
addWindowListener(new  WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
actionExit();
}});

JMenuBar menuBar=new JMenuBar();
JMenu fileMenu=new JMenu("FILE");
fileMenu.setMnemonic(KeyEvent.VK_F);

JMenuItemfileExitMenuItem=new JMenuItem("Exit",KeyEvent.VK_X);

fileExitMenuItem.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
actionExit();
}});

fileMenu.add(fileExitMenuItem);
menuBar.add(fileMenu);
setJMenuBar(menuBar);


//set up to add panel

JPanel addPanel=new JPanel();
addTextField=new JTextField(30);

addPanel.add(addTextField);

JButton addButton=new JButton("Add Download");
addButton.addactionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
actionAdd();
}});

addPanel.add(addButton);

//set up Download table

tableModel=new DownloadsTableModel();
table=new JTable(tableModel);
table.getSeletionModel().addListSelectionListener(new 
ListSelectionListener(){
public void valueChanged(ListSelectionEvent e)
{
tableSelectionChanged();
}});


//Allow only one row at a time to be selected
table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

//set up progress bar as a render for progress column
ProgressRenderer renderer=new ProgressRenderer(0,100);
renderer.setStringPainted(true);
table.setDefaultRenderer(JProgressBar.class,renderer);

//set tables row height
table.setRowHeight(
(int) renderer.getPreferredSize().getHeight());

//sets download panel

JPanel downloadsPanel=new JPanel();
downloadsPanel.setBorder(
BorderFactory.createTitleBorder("DOWNLOADS"));
downloadsPanel.setLayout(new BorderLayout());
downloadsPanel.add(new JScrollPane(table),BorderLayout.CENTRE);

//set up Buttons Panel 
 