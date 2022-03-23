//Š A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class Face1 extends Canvas
{
   public Face1()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
      
   }

   public void Face( Graphics window )
   {
     setBackground(Color.BLACK);

      window.setColor(Color.WHITE);
      window.fillRect( 210, 100, 400, 400 );
      window.setColor(Color.BLACK);
      window.fillOval(380,270,50,50);

		//add more code here


   }
      public void diceFace2( Graphics window )
   {
     setBackground(Color.BLACK);

      window.setColor(Color.WHITE);
      window.fillRect( 210, 100, 400, 400 );
      window.setColor(Color.BLACK);
      window.fillOval(220,110,50,50);

		//add more code here


   }
}
