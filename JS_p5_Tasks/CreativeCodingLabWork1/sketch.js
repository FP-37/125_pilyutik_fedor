function setup()
{
	//create a canvas for the robot
	createCanvas(500, 500);
}

function draw()
{
	strokeWeight(6);

	//robots head
	fill(150,230,200);
	rect(100, 100, 300, 300, 90);


	//robots antenna
	fill(250, 100, 100);
	rect(240, 10, 20, 100);

	fill(50, 200, 300);
	rect(210, 80, 80, 30);

	//robots eyes
	fill(255);
	ellipse(175, 200, 80, 80);
	fill(0,100,0);
	quad(175, 220, 150, 200, 175, 180, 200, 200);
	fill(255);
	ellipse(325, 200, 80, 80);
	fill(0,100,0);
	quad(325, 220, 300, 200, 325, 180, 350, 200);


	//robots nose
	fill(255, 0, 0);
	quad(240, 220, 230, 280, 270, 280, 260, 220);

	//robots ears
	triangle(100, 200, 80, 250, 100, 300);
	triangle(400, 200, 420, 250, 400, 300);

	//robots mouth
	noFill();
	beginShape();
	vertex(150, 340);
	vertex(300, 370);
	vertex(325, 250);
	endShape();
}