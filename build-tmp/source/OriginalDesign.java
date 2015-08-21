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

// var spotX = 6;
// var spotY = 6;
// var numCircles = 0;

public void setup()
{
	size(800,500);
	background(125, 221, 245);
}
public void draw()
{
	cat();
}
public void cat()
{
	fill(0,0,0);
	ellipse(mouseX,mouseY,50,50);
	// var randomSize=random(0,50);
    noStroke();
    fill(random(255),random(255),random(255));
    // ellipse(mouseX,mouseY,randomSize,randomSize);
    // numCircles++;
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
