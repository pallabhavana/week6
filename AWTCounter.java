import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//</applet code="AWTCounter.class"width="320" height="120">
//</applet>
public class AWTCounter extends Applet implements ActionListener
{
int count=0;
Label l;TextField tf;Button b;
public void init()
{
l = new Label("counter");
tf = new TextField();
b = new Button("count");
b.addActionListener(this);
tf.addActionListener(this);
add(l);add(tf);add(b);
}
public void actionPerformed(ActionEvent ae)
{
String s = ae.getActionCommand();
if(s.equals("count"))
{
count = count+1;
tf.setText(Integer.toString(count));
}
}
}

