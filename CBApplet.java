import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code="CBApplet.class"width=300 height=300>
//</applet>
public class CBApplet extends Applet implements ItemListener
{
Choice c;
public void init()
{
Label l = new Label ("select any oneItem");
c = new Choice();
c.add("red");c.add("green");c.add("blue");
c.addItemListener(this);
add(l);add(c);
}
public void itemStateChanged(ItemEvent ae)
{
String  s = c.getSelectedItem();
if(s.equals("red"))
setBackground(Color.red);
else if(s.equals("green"))
setBackground(Color.green);
else
setBackground(Color.blue);
repaint();
}
}