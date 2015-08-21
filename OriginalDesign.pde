// var spotX = 6;
// var spotY = 6;
// var numCircles = 0;

void setup()
{
	size(800,500);
	background(125, 221, 245);
}
void draw()
{
	cat();
}
void cat()
{
	fill(0,0,0);
	ellipse(mouseX,mouseY,50,50);
	// var randomSize=random(0,50);
    noStroke();
    fill(random(255),random(255),random(255));
    // ellipse(mouseX,mouseY,randomSize,randomSize);
    // numCircles++;
}




