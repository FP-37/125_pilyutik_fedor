function setup()
{
	createCanvas(1024, 576);
}

let cloud_x = 200;
let cloud_y = 100;

let tree_x = 850;

function draw()
{
	background(50, 50, 100);

	noStroke(); fill(225,225,225); rect(10,10,5,5);
	noStroke(); fill(225,225,225); rect(240,10,5,5);
    noStroke(); fill(225,225,225); rect(750,10,5,5);
    noStroke(); fill(225,225,225); rect(50,50,5,5);
    noStroke(); fill(225,225,225); rect(200,50,5,5);
    noStroke(); fill(225,225,225); rect(370,50,5,5);
    noStroke(); fill(225,225,225); rect(600,70,5,5);
    noStroke(); fill(225,225,225); rect(800,70,5,5);
    noStroke(); fill(225,225,225); rect(900,50,5,5);
    noStroke(); fill(225,225,225); rect(10,100,5,5);
    noStroke(); fill(225,225,225); rect(240,100,5,5);
    noStroke(); fill(225,225,225); rect(750,100,5,5);
    noStroke(); fill(225,225,225); rect(55,150,5,5);
    noStroke(); fill(225,225,225); rect(210,150,5,5);
    noStroke(); fill(225,225,225); rect(450,150,5,5);
    noStroke(); fill(225,225,225); rect(610,170,5,5);
    noStroke(); fill(225,225,225); rect(810,170,5,5);
    noStroke(); fill(225,225,225); rect(890,150,5,5);

	noStroke();
	fill(0,155,0);
	rect(0, 432, 1024, 144);

	noStroke();
	fill(255); ellipse(cloud_x,cloud_y,30,30);
	fill(255); ellipse(cloud_x+20,cloud_y+10,30,30);
	fill(255); ellipse(cloud_x+15,cloud_y-10,30,30);
    fill(255); ellipse(cloud_x+45,cloud_y+5,30,30);
    fill(255); ellipse(cloud_x+30,cloud_y-5,30,30);

	noStroke();
	fill(150); triangle(300,432,370,432,350,300);
	fill(150); triangle(350,432,480,432,420,250);
	fill(150); triangle(380,432,600,432,500,200);
	fill(150); triangle(500,432,700,432,600,300);


	noStroke();
	fill
	fill(150,50,30);
	quad(tree_x-30,433,tree_x+15,433,tree_x+10,380,tree_x-20,380);
	fill(0,150,20);
	ellipse(tree_x,380,30,30);
	ellipse(tree_x-20,380,30,30);
	ellipse(tree_x+15,355,30,30);
	ellipse(tree_x+20,370,30,30);
	ellipse(tree_x-20,360,50,50);
	ellipse(tree_x-20,340,30,30);
	ellipse(tree_x,340,40,40);

	noStroke();
	fill(100,50,100);
	triangle(100,432,200,432,150,576);
	triangle(100,576,150,576,150,500);
	triangle(200,576,150,576,150,440);
	fill(0,0,50);
	triangle(110,432,190,432,150,576);
	triangle(110,576,190,576,150,500);


	noStroke();
	fill(250,250,0);
	ellipse(440,420,30,30);
	fill(200,200,0);
    ellipse(440,420,20,20);

}
