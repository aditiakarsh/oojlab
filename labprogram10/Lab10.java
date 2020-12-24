import java.awt.*;
import java.awt.event.*;
public class Divisions extends Frame implements ActionListener
{
Dialog d;
TextField Num1,Num2,result;
Button Divide;
public Divisions()
{
setLayout(new FlowLayout());
setSize(500,500);
Num1=new TextField(10);
Num2=new TextField(10);
result=new TextField(10);
Divide=new Button("DIVIDE ");
add(new Label("Enter 1st number : "));
add(Num1);
add(new Label("Enter 2nd nummber: "));
add(Num2);
add(new Label("Result : "));
add(result);
add(Divide);
Divide.addActionListener(this);
setVisible(true);
addWindowListener(new MyWindowAdapter());
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==Divide)
{ try
{
result.setText(Integer.toString((Integer.parseInt(Num1.getText().trim()))/(Integer.parseInt(Num2.
getText().trim()))));
}
catch(ArithmeticException aex)
{ Dia d1=new Dia("Arithmetic Exception");
d1.setVisible(true);
}
catch(NumberFormatException nfe)
{
Dia d2=new Dia("Number Format Exception ");
d2.setVisible(true);
}
}
}
public static void main(String args[])
{
new Divisions();
}
}
class Dia extends Dialog implements ActionListener
{
Button ok;
Dia(String str)
{
super(new Frame(),str,true);
ok=new Button("OK");
setLayout(new FlowLayout());
setSize(300,200);
add(ok);
ok.addActionListener(this);
addWindowListener(new MyWindowAdapter());
}
public void actionPerformed(ActionEvent ae)
{
setVisible(true);
}
class MyWindowAdapter extends WindowAdapter{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
}
}
