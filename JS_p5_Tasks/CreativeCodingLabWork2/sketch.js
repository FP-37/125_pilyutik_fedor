function setup()
{
	//create a canvas for the robot
	createCanvas(1000, 700);
}

function draw()
{
	strokeWeight(2);

	//robot body 1 - delete this code and make your own robot body
	fill(0,150,0);
	triangle(100, 200, 200, 200, 150, 330);
	fill(0,200,0);
	quad(100, 200, 111, 230, 111, 300, 100, 300);
	quad(200, 200, 189, 230, 189, 300, 200, 300);
	quad(150, 330, 90, 350, 110, 460, 105, 360);
	quad(150, 330, 210, 350, 190, 460, 195, 360);

	//robot body 2 - delete this code and make your own robot body
	fill(150,0,0);
	ellipse(450, 280, 100, 100);
	rect(430, 200, 40, 30);
	rect(300, 265, 100, 30);
	rect(500, 265, 100, 30);
	rect(420, 330, 30, 110);
	rect(450, 330, 30, 110);


	//robot body 3 - delete this code and make your own robot body
	fill(240,240,150);
	arc(750, 200, 100, 260, 0, PI);
	rect(670, 200, 30, 100);
	rect(800, 200, 30, 100);
	rect(720, 330, 30, 110);
	rect(750, 330, 30, 110);


	// !!! Draw the robot heads - You shouldn't need to change this code !!!

	//robot head 1
	fill(200,50,100);
	ellipse(150,150,100,100);
    //robot head 2
	rect(400, 100, 100, 100, 10);
    //robot head 3
	rect(700, 100, 100, 100, 45);

	//ears
	fill(255, 0, 0);

	//robot ears 1
	rect(93, 130, 10, 33);
	rect(197, 130, 10, 33);

	//robot ears 2
	rect(393, 130, 10, 33);
	rect(497, 130, 10, 33);

	//robot ears 3
	rect(693, 130, 10, 33);
	rect(797, 130, 10, 33);



	//robots' antennas
	fill(250, 250, 0);
    // robot antenna 1
	ellipse(150, 93, 10, 10);
    // robot antenna 1
	ellipse(450, 93, 10, 10);
    // robot antenna 1
	ellipse(750, 93, 10, 10);

    //robots' antennas
	fill(200, 0, 200);
    // robot antenna 1
	rect(140, 97, 20, 10);
    // robot antenna 2
	rect(440, 97, 20, 10);
    // robot antenna 3
	rect(740, 97, 20, 10);


	//robot 1's eyes
	fill(255);
	ellipse(125, 130, 26, 26);
	point(125, 130);
	ellipse(175, 130, 26, 26);
	point(175, 130);

	//robot 2's eyes
	ellipse(425, 130, 26, 26);
	point(425, 130);
	ellipse(475, 130, 26, 26);
	point(475, 130);

	//robot 3's eyes
	ellipse(725, 130, 26, 26);
	point(725, 130);
	ellipse(775, 130, 26, 26);
	point(775, 130);


	//robots' noses
	fill(255, 0, 0);
    //robot 1 nose
	triangle(150, 135, 135, 160, 165, 160);
    //robot 2 nose
	triangle(450, 135, 435, 160, 465, 160);
    //robot 3 nose
	rect(745, 140, 10, 20);

	//robot 1 mouth
	noFill();
	beginShape();
	vertex(125,175);
	vertex(175,175);
	endShape();

	//robot 2 mouth
	beginShape();
	vertex(425,175);
	vertex(450,185);
	vertex(475,175);
	endShape();

	//robot 3 mouth
	beginShape();
	vertex(728, 175);
	vertex(736, 185);
	vertex(742, 175);
	vertex(750, 185);
	vertex(758, 175);
	vertex(766, 185);
	vertex(774, 175);
	endShape();
}