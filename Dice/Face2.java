//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class Face2 extends Canvas
{
   public Face2()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      
      diceFace2(window);
   }

		//add more code here
      public void diceFace2( Graphics window )
   {
     setBackground(Color.BLACK);

      window.setColor(Color.WHITE);
      window.fillRect( 210, 100, 400, 400 );
      window.setColor(Color.BLACK);
      window.fillOval(220,110,50,50);
            window.setColor(Color.BLACK);
      window.fillOval(550,440,50,50);

		//add more code here


   }
}