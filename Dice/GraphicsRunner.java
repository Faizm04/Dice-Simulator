//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;
import java.util.concurrent.ThreadLocalRandom;
public class GraphicsRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner()
	{
		super("Graphics Runner");
		
		setSize(WIDTH,HEIGHT);
      int x = ThreadLocalRandom.current().nextInt(1,7);
if(x==1){
		getContentPane().add(new Face1());}
   if(x==2){   
		
		getContentPane().add(new Face2());		}
      if(x==3){   
		
		getContentPane().add(new face3());		}
     if(x==4){   
		
		getContentPane().add(new face4());		}
     if(x==5){   
		
		getContentPane().add(new face5());	}

if(x==6){   
		
		getContentPane().add(new face6());		}


		System.out.println(x);
		//getContentPane().add(new Robot());
		
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner();
	}
}