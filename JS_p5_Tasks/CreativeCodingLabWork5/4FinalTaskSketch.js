cloud = {
    x: 200,
    y: 100,
    diameter: 30
}

mountain = {
    x: 300,
    y_ground: 432,
    y_height: 300
}

tree = {
    x: 850,
    y_ground: 433,
    y_height: 380,
    sticks_diameter: 30
}

canyon = {
    x: 100,
    y_ground: 432,
    y_deep: 576
}

coin = {
    x: 440,
    y: 420,
    diameter: 30
}

var cloudsX = new Array();
var cloudsY = new Array();
var treesX = new Array();
var canyonsX = new Array();
var coinsX = new Array();
var mountainsX = new Array();

var leftFlagX;
var rightFlagX;
var jumpFlagY;
var isTrapped;
var coinCount = 0;
var coinExst1 = 255;
var coinExst2 = 255;
var coinExst3 = 255;
var coinFlag1 = false;
var coinFlag2 = false;
var coinFlag3 = false;

var gameChar_x = 300;
var gameChar_y = 432;

function setup()
{
	createCanvas(1024, 576);
	leftFlagX = false;
	rightFlagX = false;
	jumpFlagY = false;
	downFlagY = false;
	isTrapped = false;
	var randClouds = random(2,9);
	for (var i = 0; i < randClouds; i++) {
	    var offsetX = 200;
	    cloudsX[i] = offsetX*i+1 + random(0,50);
	    var offsetY = 100;
	    cloudsY[i] = offsetY + random(0,50);
	}
	var randTrees = random(2,9);
    for (var i = 0; i < randTrees; i++) {
        var offsetX = 150;
        treesX[i] = offsetX*i+1 + random(0,90);
    }
    var randCanyons = random(2,7);
    for (var i = 0; i < randCanyons; i++) {
        var offsetX = 300;
        canyonsX[i] = offsetX*i+1 + random(0,90);
    }
    coinsX = [100+random(-50,50) | 0,300+random(-50,50) | 0,700+random(-50,50) | 0];
    var randMountains = random(1,4);
    for (var i = 0; i < randMountains; i++) {
        var offsetX = 300;
        mountainsX[i] = offsetX*i+1 + random(0,50);
    }
}

function draw()
{

	background(50, 50, 100);
	translate(-gameChar_x+400,0);

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
	rect(-500, 432, 2024, 144);

    noStroke();
    fill(255);
    for (var i = 0;i<cloudsX.length;i++) {
        ellipse(cloudsX[i],cloudsY[i],cloud.diameter,cloud.diameter);
        ellipse(cloudsX[i]+20,cloudsY[i]+10,cloud.diameter,cloud.diameter);
        ellipse(cloudsX[i]+15,cloudsY[i]-10,cloud.diameter,cloud.diameter);
        ellipse(cloudsX[i]+45,cloudsY[i]+5,cloud.diameter,cloud.diameter);
        ellipse(cloudsX[i]+30,cloudsY[i]-5,cloud.diameter,cloud.diameter);
    }

	noStroke();
	fill(150);
	for (var i = 0;i<mountainsX.length;i++) {
	    triangle(mountainsX[i],mountain.y_ground,mountainsX[i]+70,mountain.y_ground,mountainsX[i]+35,mountain.y_height);
        triangle(mountainsX[i]+50,mountain.y_ground,mountainsX[i]+180,mountain.y_ground,mountainsX[i]+120,mountain.y_height-50);
        triangle(mountainsX[i]+80,mountain.y_ground,mountainsX[i]+300,mountain.y_ground,mountainsX[i]+200,mountain.y_height-100);
        triangle(mountainsX[i]+200,mountain.y_ground,mountainsX[i]+400,mountain.y_ground,mountainsX[i]+300,mountain.y_height);
	}


	noStroke();

	for (var i = 0;i<treesX.length;i++) {
	    fill(150,50,30);
        quad(treesX[i]-30,tree.y_ground,treesX[i]+15,tree.y_ground,treesX[i]+10,tree.y_height,treesX[i]-20,tree.y_height);
        fill(0,150,20);
        ellipse(treesX[i],tree.y_height,tree.sticks_diameter,tree.sticks_diameter);
        ellipse(treesX[i]-20,tree.y_height,tree.sticks_diameter,tree.sticks_diameter);
        ellipse(treesX[i]+15,tree.y_height-25,tree.sticks_diameter,tree.sticks_diameter);
        ellipse(treesX[i]+20,tree.y_height-10,tree.sticks_diameter,tree.sticks_diameter);
        ellipse(treesX[i]-20,tree.y_height-20,tree.sticks_diameter+20,tree.sticks_diameter+20);
        ellipse(treesX[i]-20,tree.y_height-40,tree.sticks_diameter,tree.sticks_diameter);
        ellipse(treesX[i],tree.y_height-40,tree.sticks_diameter+10,tree.sticks_diameter+10);
	}

	noStroke();
	for (var i = 0;i<canyonsX.length;i++){
	    fill(100,50,100);
	    triangle(canyonsX[i],canyon.y_ground,canyonsX[i]+100,canyon.y_ground,canyonsX[i]+50,canyon.y_deep);
        triangle(canyonsX[i],canyon.y_deep,canyonsX[i]+50,canyon.y_deep,canyonsX[i]+50,canyon.y_deep-76);
        triangle(canyonsX[i]+100,canyon.y_deep,canyonsX[i]+50,canyon.y_deep,canyonsX[i]+50,440);
        fill(0,0,50);
        triangle(canyonsX[i]+10,canyon.y_ground,canyonsX[i]+90,canyon.y_ground,canyonsX[i]+50,canyon.y_deep);
        triangle(canyonsX[i]+10,canyon.y_deep,canyonsX[i]+90,canyon.y_deep,canyonsX[i]+50,canyon.y_deep-76);
        if ((gameChar_x > canyonsX[i]) && (gameChar_x<canyonsX[i] + 80) && (gameChar_y == 432)) {
            isTrapped = true;
        }
	}

    console.log(coinsX[0]);
	noStroke();
	if (coinFlag1) {
	    coinExst1 = 0;
	}
	if (coinFlag2) {
        coinExst2 = 0;
    }
    if (coinFlag3) {
        coinExst3 = 0;
    }
	fill(250,250,0,coinExst1);
    ellipse(coinsX[0],coin.y,coin.diameter,coin.diameter);
    fill(200,200,0,coinExst1);
    ellipse(coinsX[0],coin.y,coin.diameter-10,coin.diameter-10);
    fill(250,250,0,coinExst2);
    ellipse(coinsX[1],coin.y,coin.diameter,coin.diameter);
    fill(200,200,0,coinExst2);
    ellipse(coinsX[1],coin.y,coin.diameter-10,coin.diameter-10);
    fill(250,250,0,coinExst3);
    ellipse(coinsX[2],coin.y,coin.diameter,coin.diameter);
    fill(200,200,0,coinExst3);
    ellipse(coinsX[2],coin.y,coin.diameter-10,coin.diameter-10);


    if (gameChar_y <  432 && frameCount%2==0) {
        gameChar_y += 1;
    }
    if (leftFlagX) {
        gameChar_x -= 1.2;

        noStroke();

        fill(230,150,100);
        rect(gameChar_x,gameChar_y,30,30); //head

        fill(155,55,155);
        triangle(gameChar_x,gameChar_y,gameChar_x+30,gameChar_y+10,gameChar_x+40,gameChar_y-25); //hat

        fill(155,55,155);
        rect(gameChar_x+15,gameChar_y+25,20,10);
        rect(gameChar_x,gameChar_y+30,30,30); //body

        rect(gameChar_x+5,gameChar_y+60,20,20); //leg

        fill(200);
        rect(gameChar_x,gameChar_y+75,20,5); //shoe

        fill(155,55,120);
        rect(gameChar_x+10,gameChar_y+35,10,30); //arm

        fill(230,150,100);
        ellipse(gameChar_x+15,gameChar_y+65,10,10); //hand

        fill(200);
        rect(gameChar_x,gameChar_y+10,10,20);
        triangle(gameChar_x+10,gameChar_y+30,gameChar_x,gameChar_y+30,gameChar_x+10,gameChar_y+40); //beard

        fill(0);
        rect(gameChar_x,gameChar_y+10,5,5); //eye

        fill(255,0,0);
        rect(gameChar_x,gameChar_y+20,5,5); //mouth
    }
    else if (rightFlagX) {
        gameChar_x += 1.2;

        noStroke();

        fill(230,150,100);
        rect(gameChar_x,gameChar_y,30,30); //head

        fill(155,55,155);
        triangle(gameChar_x,gameChar_y+10,gameChar_x+30,gameChar_y,gameChar_x-10,gameChar_y-25); //hat

        fill(155,55,155);
        rect(gameChar_x-5,gameChar_y+25,20,10);
        rect(gameChar_x,gameChar_y+30,30,30); //body

        rect(gameChar_x+5,gameChar_y+60,20,20); //leg

        fill(200);
        rect(gameChar_x+10,gameChar_y+75,20,5); //shoe

        fill(155,55,120);
        rect(gameChar_x+10,gameChar_y+35,10,30); //arm

        fill(230,150,100);
        ellipse(gameChar_x+15,gameChar_y+65,10,10); //hand

        fill(200);
        rect(gameChar_x+20,gameChar_y+10,10,20);
        triangle(gameChar_x+20,gameChar_y+30,gameChar_x+30,gameChar_y+30,gameChar_x+20,gameChar_y+40); //beard

        fill(0);
        rect(gameChar_x+25,gameChar_y+10,5,5); //eye

        fill(255,0,0);
        rect(gameChar_x+25,gameChar_y+20,5,5); //mouth
    }
    else if (jumpFlagY) {
        gameChar_y -= 70;
        jumpFlagY = false;

        noStroke();
        fill(230,150,100);
        rect(gameChar_x,gameChar_y,30,30); //head

        fill(155,55,155);
        rect(gameChar_x-5,gameChar_y+30,40,30); //body
        rect(gameChar_x-10,gameChar_y+10,10,30); //left arm
        rect(gameChar_x+30,gameChar_y+10,10,30); //right arm

        fill(230,150,100);
        ellipse(gameChar_x-5,gameChar_y+10,10,10); //left hand
        ellipse(gameChar_x+35,gameChar_y+10,10,10); //right hand

        fill(155,55,120);
        rect(gameChar_x+2,gameChar_y+60,26,20); //legs

        fill(200);
        rect(gameChar_x,gameChar_y+75,10,5); //left shoe
        rect(gameChar_x+20,gameChar_y+75,10,5);//right shoe

        fill(200);
        rect(gameChar_x,gameChar_y+10,30,20);
        triangle(gameChar_x,gameChar_y+30,gameChar_x+30,gameChar_y+30,gameChar_x+15,gameChar_y+40); //beard

        fill(0);
        rect(gameChar_x+8,gameChar_y+10,5,5);
        rect(gameChar_x+20,gameChar_y+10,5,5); //eyes

        fill(255,0,0);
        rect(gameChar_x+10,gameChar_y+20,10,5); //mouth

        fill(155,55,155);
        triangle(gameChar_x, gameChar_y, gameChar_x+30, gameChar_y, gameChar_x+15, gameChar_y-25); //hat
    }
    else if (isTrapped) {
        leftFlagX = false;
        rightFlagX = false;
        jumpFlagY = false;
        gameChar_y+=5;
        noStroke();
        fill(230-map(gameChar_y,432,500,0,230),150-map(gameChar_y,432,500,0,150),100-map(gameChar_y,432,500,0,100));
        rect(gameChar_x,gameChar_y,30,30); //head

        fill(155-map(gameChar_y,432,500,0,155),55-map(gameChar_y,432,500,0,55),155-map(gameChar_y,432,500,0,155));
        rect(gameChar_x-5,gameChar_y+30,40,30); //body
        rect(gameChar_x-10,gameChar_y+10,10,30); //left arm
        rect(gameChar_x+30,gameChar_y+10,10,30); //right arm

        fill(230-map(gameChar_y,432,500,0,230),150-map(gameChar_y,432,500,0,150),100-map(gameChar_y,432,500,0,100));
        ellipse(gameChar_x-5,gameChar_y+10,10,10); //left hand
        ellipse(gameChar_x+35,gameChar_y+10,10,10); //right hand

        fill(155-map(gameChar_y,432,500,0,155),55-map(gameChar_y,432,500,0,55),120-map(gameChar_y,432,500,0,120));
        rect(gameChar_x+2,gameChar_y+60,26,20); //legs

        fill(200-map(gameChar_y,432,500,0,200));
        rect(gameChar_x,gameChar_y+75,10,5); //left shoe
        rect(gameChar_x+20,gameChar_y+75,10,5);//right shoe

        fill(200-map(gameChar_y,432,500,0,200));
        rect(gameChar_x,gameChar_y+10,30,20);
        triangle(gameChar_x,gameChar_y+30,gameChar_x+30,gameChar_y+30,gameChar_x+15,gameChar_y+40); //beard

        fill(0);
        rect(gameChar_x+8,gameChar_y+10,5,5);
        rect(gameChar_x+20,gameChar_y+10,5,5); //eyes

        fill(255-map(gameChar_y,432,500,0,255),0,0);
        rect(gameChar_x+10,gameChar_y+20,10,5); //mouth

        fill(155-map(gameChar_y,432,500,0,155),55-map(gameChar_y,432,500,0,55),155-map(gameChar_y,432,500,0,155));
        triangle(gameChar_x, gameChar_y, gameChar_x+30, gameChar_y, gameChar_x+15, gameChar_y-25); //hat
    }
    else {
        noStroke();
        fill(230,150,100);
        rect(gameChar_x,gameChar_y,30,30); //head

        fill(155,55,155);
        rect(gameChar_x-5,gameChar_y+30,40,30); //body
        rect(gameChar_x-10,gameChar_y+35,10,30); //left arm
        rect(gameChar_x+30,gameChar_y+35,10,30); //right arm

        fill(230,150,100);
        ellipse(gameChar_x-3,gameChar_y+65,10,10); //left hand
        ellipse(gameChar_x+33,gameChar_y+65,10,10); //right hand

        fill(155,55,120);
        rect(gameChar_x+2,gameChar_y+60,26,20); //legs

        fill(200);
        rect(gameChar_x,gameChar_y+75,10,5); //left shoe
        rect(gameChar_x+20,gameChar_y+75,10,5);//right shoe

        fill(200);
        rect(gameChar_x,gameChar_y+10,30,20);
        triangle(gameChar_x,gameChar_y+30,gameChar_x+30,gameChar_y+30,gameChar_x+15,gameChar_y+40); //beard

        fill(0);
        rect(gameChar_x+8,gameChar_y+10,5,5);
        rect(gameChar_x+20,gameChar_y+10,5,5); //eyes

        fill(255,0,0);
        rect(gameChar_x+10,gameChar_y+20,10,5); //mouth

        fill(155,55,155);
        triangle(gameChar_x, gameChar_y, gameChar_x+30, gameChar_y, gameChar_x+15, gameChar_y-25); //hat
    }

    if(gameChar_x > coinsX[0]-5 && gameChar_x < coinsX[0]+5 && coinExst1 == 255) {
        coinFlag1 = true;
        coinCount++;
    }
    if(gameChar_x > coinsX[1]-5 && gameChar_x < coinsX[1]+5 && coinExst2 == 255) {
        coinFlag2 = true;
        coinCount++;
    }
    if(gameChar_x > coinsX[2]-5 && gameChar_x < coinsX[2]+5 && coinExst3 == 255) {
        coinFlag3 = true;
        coinCount++;
    }

    fill(0,0,0);
    textSize(30);
    text(`Coins: ${coinCount}`,30,30);
}

function keyPressed() {
    if (keyCode == 65) {
        leftFlagX = true;
        if(keyCode == 87) {
            jumpFlagY = true;
        }
    }
    else if (keyCode == 68) {
        rightFlagX = true;
    }
    else if (keyCode == 87 && gameChar_y == 432) {
        jumpFlagY = true;
    }
}

function keyReleased() {
    if (keyCode == 65) {
    leftFlagX = false;
    }
    else if (keyCode == 68) {
    rightFlagX = false;
    }
    else if (keyCode == 87) {
    jumpFlagY = false;
    }
}
