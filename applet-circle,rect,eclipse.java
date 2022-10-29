import java.applet.Applet;
import java.awt.*;
public class program13 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.drawString("welcome",150,150);
		g.drawRect(70,100,80,100);
		g.setColor(Color.blue);
		g.fillRect(30,30,50,50);
		int xpoints[]={350,500,350,500,350};
		int ypoints[]={30,30,200,200,30};
		int num=5;
		g.drawPolygon(xpoints,ypoints,num);
		g.fillPolygon(xpoints,ypoints,num);
		g.drawOval(70,250,30,30);
		g.drawOval(70,300,100,45);
		g.fillArc(270,150,30,30,0,180);
	}
}

/*
<applet code="program13.class" width="300" height="300">
</applet>
*/
	
		
 