void setup(){
size(1000,1000);
}

void draw(){
println(mouseX,mouseY);
int NWX;
int NWY;
int NEX;
int NEY;
int SWX;
int SWY;
int SEX;
int SEY;
NWX=286;
NWY=409;
NEX=400;
NEY=409;
SWX=286;
SWY=486;
SEX=400;
SEY=486;
fill(255,255,255);
ellipse(350,450,210,160);
fill(255,255,255);
ellipse(650,450,210,160);

if(mouseY<400){
fill(0,0,0);
ellipse(mouseX,400,50,50);
fill(0,0,0);
ellipse(mouseX+300,400,50,50);
}
else{
  fill(0,0,0);
ellipse(mouseX,mouseY,50,50);
fill(0,0,0);
ellipse(mouseX+300,mouseY,50,50);
}
if(mouseY>486){
  fill(0,0,0);
ellipse(mouseX,486,50,50);
fill(0,0,0);
ellipse(mouseX+300,486,50,50);
}
else{
  fill(0,0,0);
ellipse(mouseX,mouseY,50,50);
fill(0,0,0);
ellipse(mouseX+300,mouseY,50,50);
}
if(mouseX<286){
   fill(0,0,0);
ellipse(286,mouseY,50,50);
fill(0,0,0);
ellipse(286+300,mouseY,50,50);
}
else{
  fill(0,0,0);
ellipse(mouseX,mouseY,50,50);
fill(0,0,0);
ellipse(mouseX+300,mouseY,50,50);
}
if(mouseX>409){
   fill(0,0,0);
ellipse(409,mouseY,50,50);
fill(0,0,0);
ellipse(409+300,mouseY,50,50);
}
else{
  fill(0,0,0);
ellipse(mouseX,mouseY,50,50);
fill(0,0,0);
ellipse(mouseX+300,mouseY,50,50);
}
}