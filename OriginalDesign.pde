/*int rColor = (int) (Math.random() * (255));
int gColor = (int) (Math.random() * (255));
int bColor = (int) (Math.random() * (255));*/

/*int fishX = 50;
int fishY = 400;*/


void setup()
{
	size(800,500);
	background(125, 221, 245);
}

void draw()
{
	bubbles();

}

void bubbles()
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


