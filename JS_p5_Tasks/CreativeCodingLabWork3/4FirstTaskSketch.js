var groundHeight;
var mountain1;
var mountain2;

var tree;

var moon;
var sun;
var darkness;
var flag;

function setup()
{
	createCanvas(800, 600);
	//set the groundHeight proportional to the canvas size
	groundHeight = (height / 3) * 2;

	//initalise the mountain objects with properties to help draw them to the canvas
	mountain1 = {
		x: 400,
		y: groundHeight,
		height: 320,
		width: 230
	};
	mountain2 = {
		x: 550,
		y: groundHeight,
		height: 200,
		width: 130
	};

	//initalise the tree object
	tree = {
		x: 150,
		y: groundHeight + 20,
		trunkWidth: 40,
		trunkHeight: 150,
		canopyWidth: 120,
		canopyHeight: 100
	};

    //initalise the sun 
	sun = {
		x: 150,
		y: 70,
		diameter: 80,
	};
    
    //TASK: intialise a moon object with an extra property for brightness
    moon = {
        x: 650,
        y: 70,
        diameter: 80,
    }

    cloud = {
        x: 100,
        y: 110,
    }

    flag = false;
}

function draw()
{
	//TASK: update the values for the moons brightness, the sun's position and the darkness.
	//You can either map this to the mouse's location (i.e. the futher left the mouse is the more daylight) or you can just change the values gradually over time.
    darkness = map(mouseX,0,800,0,200);

    if (cloud.x!=850)
        {cloud.x++;}
    else
        {cloud.x = -50;}

	if (flag == true) {
	    background(150+map(mouseX,0,800,0,105), 200, 255);
	}
	else {
	    background(150, 200, 255);
	}

    noStroke();
	fill(255, 255, 0);
    if (flag == true) {ellipse(sun.x, sun.y+map(mouseX,0,800,sun.y,600), sun.diameter);}
    else {ellipse(sun.x, sun.y, sun.diameter);}

    fill(200,100,0);
    rect(100-tree.trunkWidth/2,groundHeight-tree.trunkHeight,tree.trunkWidth,tree.trunkHeight);
    fill(0,150,0);
    ellipse(100, groundHeight-tree.trunkHeight, tree.canopyWidth, tree.canopyHeight);

    
    //TASK: you'll need to draw the moon too. Make sure you use brightness to adjust the colour

	//draw the ground and make it green
	fill(70, 200, 0);
	rect(0, groundHeight, width, height - groundHeight);

	//draw the mountains
	fill(120);
	triangle(mountain1.x, mountain1.y,
		mountain1.x + mountain1.width, mountain1.y,
		mountain1.x + (mountain1.width / 2), mountain1.y - mountain1.height);

	triangle(mountain2.x, mountain2.y,
		mountain2.x + mountain2.width, mountain2.y,
		mountain2.x + (mountain2.width / 2), mountain2.y - mountain2.height);


	if (flag == true) {
	    fill(255,255,255,255-darkness);
	}
	else {
	    fill(255,255,255,255);
	}
	ellipse(cloud.x,cloud.y,80, 30);

    if(flag == true) {
    noStroke();
    fill(0,0,0,darkness);
    rect(0,0,800,600);
    fill(255,255,255,darkness);
    ellipse(moon.x,moon.y,moon.diameter,moon.diameter);
    }

    noStroke();
    if (flag == true) {
        fill(255,255,0,darkness);
    }
    else {
        fill(255,255,0,0);
    }
    rect(10,10,5,5);
    rect(140,10,5,5);
    rect(270,10,5,5);
    rect(310,10,5,5);
    rect(400,10,5,5);
    rect(550,10,5,5);
    rect(600,10,5,5);
    rect(720,10,5,5);
    rect(10,10,5,5);
    rect(110,50,5,5);
    rect(290,50,5,5);
    rect(350,50,5,5);
    rect(480,50,5,5);
    rect(580,50,5,5);
    rect(710,50,5,5);
    rect(780,50,5,5);
    rect(10,100,5,5);
    rect(120,100,5,5);
    rect(250,100,5,5);
    rect(300,100,5,5);
    rect(360,100,5,5);
    rect(580,100,5,5);
    rect(590,100,5,5);
    rect(790,100,5,5);

}

function mousePressed() {
    if (flag == true) {flag = false;}
    else if (flag == false) {flag = true;}
}