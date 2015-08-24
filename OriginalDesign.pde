int rColor = (int) (Math.random() * (255 - 0)) + 0;
int gColor = (int) (Math.random() * (255 - 0)) + 0;
int bColor = (int) (Math.random() * (255 - 0)) + 0;

int fishX = 50;
int fishY = 400;

void setup()
{
	size(800,500);
	background(125, 221, 245);
}
void draw()
{
	cat();
	fishY = fishY + 1;
}
void cat()
{
	fill(rColor,gColor,bColor);
	ellipse(mouseX,mouseY,50,50);
}
void floatingFish()
{
	fill(rColor,gColor,bColor);
	ellipse(fishX,fishY,30,30);
}



