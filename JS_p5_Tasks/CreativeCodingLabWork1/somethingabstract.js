function setup()
{
	//create a canvas for the robot
	createCanvas(500, 500);
	background(225,200,0);
}

function draw()
{
	strokeWeight(6);

    fill(0, 100, 100);
    rect(10,10,100,100);

    fill(0, 150, 100);
    rect(110,110,100,100);

    fill(0, 200, 100);
    rect(210,210,100,100);

    fill(250, 0, 250);
    rect(310,310,100,100);

    fill(250, 0, 250);
    rect(55,110,10,300);

    fill(250, 0, 250);
    rect(155,210,10,200);

    fill(250, 0, 250);
    rect(255,310,10,100);

    fill(250, 0, 250);
    rect(110,55,300,10);

    fill(250, 0, 250);
    rect(210,155,200,10);

    fill(250, 0, 250);
    rect(310,255,100,10);
}