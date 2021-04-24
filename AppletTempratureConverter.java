import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code = "AppletTempratureConverter.class"width=320 height=120>
//</applet>
public class AppletTempratureConverter extends Applet implements ActionListener
{
Label l1,l2;TextField tf1,tf2;
public void init()
{
l1 = new Label("celsius:");
l2 = new Label("fahrenhit:");
tf1= new TextField();
tf2 = new TextField();
tf1.addActionListener(this);
setLayout(new GridLayout(2,2));
add(l1);add(tf1);
add(l2);add(tf2);
}
public void actionPerformed(ActionEvent ae)
{
String s = ae.getActionCommand();
float n1 = Float.parseFloat(tf1.getText());
tf2.setText(Float.toString((n1*9/5)+32));
}
}