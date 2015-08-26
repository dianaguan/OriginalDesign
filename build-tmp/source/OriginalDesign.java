import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

public void setup()
{
	size(800,500);
	background(125, 221, 245);
}

public void draw()
{
	bubbles();
	//notSoCoolCircle();
	//wallpaper();
}

public void bubbles()
{
	noStroke();
	int rColor = (int) (Math.random() * 255);
	int gColor = (int) (Math.random() * 255);
	int bColor = (int) (Math.random() * 255);
	fill(rColor,gColor,bColor);
	int wSize = (int)((Math.random()*100)+10);
	ellipse(mouseX,mouseY,wSize,wSize);
}

/*void wallpaper(){
	ellipse(20,20,);
}*/
/*void notSoCoolCircle()
{
	noFill();
	stroke(255,25,35);
	int wCircle = (int) ((Math.random()*50)+10);
	ellipse(400,250,wCircle,200);

}*/
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
