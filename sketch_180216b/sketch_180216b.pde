PImage rainbow;
PImage unicorn;
void setup(){
size(700,359);
rainbow = loadImage("Rainbow.png");
background(rainbow);
unicorn= loadImage("Unicorn_dab.jpg");
}
void draw(){
if(mousePressed){
background(rainbow);
image(unicorn,mouseX,mouseY);
}
}