//<applet code = "MeApplet.class" width=300 height=300>
//</applet>
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class MeApplet extends Applet implements MouseListener
{
public void init()
{
addMouseListener(this);
}
public void mouseClicked(MouseEvent me)
{
setBackground(Color.red);
repaint();
}
public void mouseEntered(MouseEvent me)
{
setBackground(Color.yellow);
repaint();
}
public void mouseExited(MouseEvent me)
{
setBackground(Color.green);
repaint();
}
public void mousePressed(MouseEvent me)
{
}
public void mouseReleased(MouseEvent me)
{
}
}

