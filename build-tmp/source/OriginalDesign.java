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
	wallpaper();
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

int cSize = 20;

public void wallpaper(){
	stroke(0,0,0);
	noFill();
	frameRate(30);
	ellipse(400,250,cSize,cSize);
	cSize = cSize + 10;

	if(cSize==950)
	{
		cSize = 20;
		background(125, 221, 245);
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
