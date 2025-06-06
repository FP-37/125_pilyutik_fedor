/*

The Game Project

2 - Game character

Use p5 drawing functions such as rect, ellipse, line, triangle and
point to draw the different states of your game character.

Write the code so that your character appears inside the box for each
state.

IMPORTANT: For each box the variables gameChar_x & gameChar_y are set to the bottom
center of the box. You must combine these variables with arithmetic to
determine the position of each shape that you draw. This will later allow
you to adjust the position of your game character.

Each state is worth two marks:

//standing front facing = 2
//jumping facing forwards = 2
//walking left = 2
//walking right = 2
//jumping left and jumping right = 2

0 marks = not a reasonable attempt
1 mark = attempted but it lacks detail and you didn't use gameChar_x and gameChar_y correctly
2 marks = you've used a selction of shape functions and made consistent use of gameChar_x and gameChar_y

WARNING: Do not get too carried away. If you're character takes more than 5 lines
of code to draw then you've probably over done it.

** Only submit your sketch.js **

*/

var gameChar_x = 0;
var gameChar_y = 0;

function setup()
{
	createCanvas(400, 600);
}

function draw()
{
	background(255);

	//Standing, facing frontwards

	stroke(100);
	noFill();
	rect(20, 60, 50, 80);
	noStroke();
	fill(0);
	text("1. standing front facing", 20, 160);

	gameChar_x = 30;
	gameChar_y = 60;
	//Add your code here ...
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


	//Jumping facing forwards
	stroke(100);
	noFill();
	rect(220, 60, 50, 80);
	noStroke();
	fill(0);
	text("2. jumping facing forwards", 220, 160);

	gameChar_x = 230;
	gameChar_y = 60;
	//Add your code here ...
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


	//Walking, turned left
	stroke(100);
	noFill();
	rect(20, 260, 50, 80);
	noStroke();
	fill(0);
	text("3. Walking left", 20, 360);

	gameChar_x = 30;
	gameChar_y = 260;
	//Add your code here ...
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


	//Walking, turned right
	stroke(100);
	noFill();
	rect(220, 260, 50, 80);
	noStroke();
	fill(0);
	text("4. Walking right", 220, 360);

	gameChar_x = 230;
	gameChar_y = 260;
	//Add your code here ...
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


	//Jumping right
	stroke(100);
	noFill();
	rect(20, 460, 50, 80);
	noStroke();
	fill(0);
	text("5. Jumping to the right", 20, 560);

	gameChar_x = 30;
	gameChar_y = 460;
	//Add your code here ...
    noStroke();

    fill(230,150,100);
    rect(gameChar_x,gameChar_y,30,30); //head

    fill(155,55,155);
    triangle(gameChar_x,gameChar_y,gameChar_x+30,gameChar_y-10,gameChar_x-10,gameChar_y-35); //hat

    fill(155,55,155);
    rect(gameChar_x-5,gameChar_y+25,20,10);
    rect(gameChar_x,gameChar_y+30,30,30); //body

    rect(gameChar_x+5,gameChar_y+60,20,20); //leg

    fill(200);
    rect(gameChar_x+10,gameChar_y+75,20,5); //shoe

    fill(155,55,120);
    rect(gameChar_x+10,gameChar_y+10,10,30); //arm

    fill(250,170,140);
    ellipse(gameChar_x+15,gameChar_y+5,10,10); //hand

    fill(200);
    rect(gameChar_x+20,gameChar_y+10,10,20);
    triangle(gameChar_x+20,gameChar_y+30,gameChar_x+30,gameChar_y+30,gameChar_x+20,gameChar_y+40); //beard

    fill(0);
    rect(gameChar_x+25,gameChar_y+10,5,5); //eye

    fill(255,0,0);
    rect(gameChar_x+25,gameChar_y+20,5,5); //mouth

	//Jumping to the left
	stroke(100);
	noFill();
	rect(220, 460, 50, 80);
	noStroke();
	fill(0);
	text("6. Jumping to the left", 220, 560);

	gameChar_x = 230;
	gameChar_y = 460;
	//Add your code here ...
	noStroke();

    fill(230,150,100);
    rect(gameChar_x,gameChar_y,30,30); //head

    fill(155,55,155);
    triangle(gameChar_x,gameChar_y-10,gameChar_x+30,gameChar_y,gameChar_x+40,gameChar_y-35); //hat

    fill(155,55,155);
    rect(gameChar_x+15,gameChar_y+25,20,10);
    rect(gameChar_x,gameChar_y+30,30,30); //body

    rect(gameChar_x+5,gameChar_y+60,20,20); //leg

    fill(200);
    rect(gameChar_x,gameChar_y+75,20,5); //shoe

    fill(155,55,120);
    rect(gameChar_x+10,gameChar_y+10,10,30); //arm

    fill(250,170,140);
    ellipse(gameChar_x+15,gameChar_y+5,10,10); //hand

    fill(200);
    rect(gameChar_x,gameChar_y+10,10,20);
    triangle(gameChar_x+10,gameChar_y+30,gameChar_x,gameChar_y+30,gameChar_x+10,gameChar_y+40); //beard

    fill(0);
    rect(gameChar_x,gameChar_y+10,5,5); //eye

    fill(255,0,0);
    rect(gameChar_x,gameChar_y+20,5,5); //mouth

}
