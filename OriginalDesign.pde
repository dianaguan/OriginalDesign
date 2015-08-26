void setup()
{
	size(800,500);
	background(125, 221, 245);
}

void draw()
{
	bubbles();
	//notSoCoolCircle();
	//wallpaper();
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