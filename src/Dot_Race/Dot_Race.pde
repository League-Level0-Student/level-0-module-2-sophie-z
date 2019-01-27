int x=0;
void setup(){
  size(800, 200);
}
void draw(){
  background(255);
ellipse(x, 100, 100, 100);
fill(#0300FF);
if(mousePressed){
x=x+4;
}
if(x>800){
  playSound();
}
}
import ddf.minim.*;
boolean soundPlayed = false;
void playSound(){
if(!soundPlayed){
  Minim minim = new Minim(this);
  AudioSample sound = minim.loadSample("yay.mp3");
  sound.trigger();
  soundPlayed = true;
}
}