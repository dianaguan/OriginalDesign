void setup()
{
	size(800,500);
	background(125, 221, 245);
}

void draw()
{
	bubbles();
	wallpaper();
}

void bubbles()
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

void wallpaper(){
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