function setup()
{
	createCanvas(500, 500);
	background(150,150,200);
}

function draw()
{
	strokeWeight(2);

    line(240,0,390,500);
    fill(200,0,0);
    ellipse(100,100,100,100);
    fill(100,0,100);
    arc(200,85,80,80,-0.295,PI-0.29);
    line(150,200,275,63);
    line(393,500,500,0);
    line(0,140,500,0);
    fill(250,250,250);
    ellipse(375,125,150,150);
    fill(250,250,0);
    ellipse(375,125,140,140);
    fill(250,0,0);
    ellipse(375,125,130,130);
	fill(200,0,100);
	triangle(-50,250,550,200,550,300);
	fill(0,150,0);
	rect(150,200,150,100);
	fill(200,150,100);
	quad(150,233,150,267,300,280,300,220);
}