void setup(){
size(600,600);
PImage pvz =loadImage ("pvz.png");
pvz.resize(800,800);
image(pvz, 0, 0);
}
void draw(){
fill(250,250,250);
ellipse(318,175,159,97);
fill(250,250,250);
ellipse(69,187,105,63);
fill(mouseX,mouseY,mouseX);
ellipse(69,187,45,45);
fill(mouseX,mouseY,mouseX);
ellipse(318,175,50,50);
fill(0,0,0);
ellipse(69,187,15,15);
fill(0,0,0);
ellipse(mouseX,mouseY,15,15);
}