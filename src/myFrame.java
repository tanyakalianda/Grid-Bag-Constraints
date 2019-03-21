import javax.swing.JFrame;

public class myFrame extends JFrame
{

	public myFrame()
	{
		myPanel panel = new myPanel();
		
		setBounds(200,200,800,600);
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
	
	

	public static void main(String[] args) 
	{
		new myFrame();

	}

}
