import ddf.minim.*; 
AudioSample sound1; 
AudioSample sound2;
boolean drawTail = false;
int saveX;
int saveY;
PImage tail;
PImage donkey;
void setup() {
  tail = loadImage("DonkeyTail.png");
  donkey = loadImage("Donkey.jpg");  
  size(612, 467);
  background(donkey);
  Minim minim = new Minim(this);
  sound1 = minim.loadSample("DonkeyNoise.wav"); 
  sound2 = minim.loadSample("Claps.wav");
  
}

void mousePressed() {
  if (mouseX<526 && mouseY<203 && mouseX>510 && mouseY>180) {
    saveX=mouseX-100;
    saveY=mouseY-25;
    drawTail=true;
    sound2.trigger();
  } else{
   drawTail=false; 
   sound1.trigger();
  }
}


void draw() {
  println(mouseX, mouseY);
  tail.resize(200, 200);
  if (mouseY<40 && mouseX<40) {
    background(donkey);
  } else {
    background(0, 0, 0);
  }
  if (drawTail==true) {
    background(donkey);
    image(tail, saveX, saveY);
  }
}

