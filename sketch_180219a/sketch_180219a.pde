 int randomNumber = (int) random(width);
 int change = 0;
 int score = 0;
 void setup()
{
 size(1000,1000);
}
 void draw()
{
  checkCatch(randomNumber);
 background(255,255,255);
 drawFish();
 fill(0,0,0);
 noStroke();
 ellipse(randomNumber,change,50,45);
 change++;
if(change>=height){
change = 0;
randomNumber = (int) random(width);
}
}
 void drawFish(){
 background(141,233,237);
 noStroke();
 fill(255,255,255);
 ellipse(mouseX-17,mouseY-17,20,20); //back side eye
 fill(255,200,88);
  ellipse(mouseX,mouseY,90,50); //body
  triangle(mouseX+30,mouseY,mouseX+70,mouseY+30,mouseX+70,mouseY-30); //tail
  stroke(0);
  triangle(mouseX,mouseY,mouseX+15,mouseY+10,mouseX+15,mouseY-10); //side fin
  noStroke();
  fill(255,200,88);
  ellipse(mouseX,mouseY,15,15); //side fin cover
  noStroke();
  fill(255,255,255);
  ellipse(mouseX-25,mouseY-15,20,20); //front eye
  fill(0,0,0);
  ellipse(mouseX-25,mouseY-15,5,5); //pupil
  fill(141,233,237);
  ellipse(mouseX-45,mouseY,25,25); //mouth
}
   void checkCatch(int x){
if (x > mouseX && x < mouseX+100)
                  score++;
         else if (score > 0)
                 score--;
println("Your score is now: " + score);
fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);


}