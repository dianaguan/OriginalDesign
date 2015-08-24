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

int rColor = (int) (Math.random() * (255 - 0)) + 0;
int gColor = (int) (Math.random() * (255 - 0)) + 0;
int bColor = (int) (Math.random() * (255 - 0)) + 0;

int fishX = 50;
int fishY = 400;

public void setup()
{
	size(800,500);
	background(125, 221, 245);
}
public void draw()
{
	cat();
	fishY = fishY + 1;
}
public void cat()
{
	fill(rColor,gColor,bColor);
	ellipse(mouseX,mouseY,50,50);
}
public void floatingFish()
{
	ellipse(fishX,fishY,30,30);
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
