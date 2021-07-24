import java.applet.*;
import java.awt.*;
public class RectangleApplet extends Applet
{
int a,b,c,d;
public void init()
{
a=Integer.parseInt( getParameter("aval")); //x coordinate
b=Integer.parseInt( getParameter("bval"));  // ycoordinate
c=Integer.parseInt( getParameter("cval"));   //width of rec
d=Integer.parseInt( getParameter("dval"));   //height of rec
}
public void paint(Graphics g)
{
g.drawRect(a,b,c,d);
}
}