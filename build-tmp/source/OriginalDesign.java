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

/*int rColor = (int) (Math.random() * (255));
int gColor = (int) (Math.random() * (255));
int bColor = (int) (Math.random() * (255));*/

/*int fishX = 50;
int fishY = 400;*/


public void setup()
{
	size(800,500);
	background(125, 221, 245);
}

public void draw()
{
	bubbles();

}

public void bubbles()
{
	int rColor = (int) (Math.random() * 255);
	int gColor = (int) (Math.random() * 255);
	int bColor = (int) (Math.random() * 255);
	fill(rColor,gColor,bColor);
	int wSize = (int)((Math.random()*100)+50);
	int hSize = (int)((Math.random()*100)+50);
	ellipse(mouseX,mouseY,wSize,hSize);
}
/*void floatingFish()
{
	fill(rColor,gColor,bColor);
	ellipse(fishX,fishY,30,30);
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
