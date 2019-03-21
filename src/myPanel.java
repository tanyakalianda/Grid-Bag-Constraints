import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class myPanel extends JPanel
{

	public myPanel()
	{
		setLayout(new GridBagLayout());      //don't need to store in a variable b/c don't need to access it later
		GridBagConstraints gbc = new GridBagConstraints();  //tells computer how to add objects to the grid
		
		JButton button1 = new JButton("Hello");
		gbc.gridx = 0;  //x value of grid that you want to add the object  
		gbc.gridy = 0;  //y value of grid where you want to add the object
		///button1.setSize(300,600);      //BUT cannot use setSize method b/c gridbag constraint packs everything into as small it can be -> won't get a big button
		button1.setPreferredSize(new Dimension(300,600));    //use setPreferredSize method instead - only work sfor dimension objects
		
		add(button1, gbc);    //tells computer where to add it -> how you want to add button1 to the grid
								//uses info from gridbagconstraints to set the button -> extracts the value stored in it to place button on grid
								//can use the same gridbagconstraint for other buttons b/c previous info was extracted
		
		
		
		
	}
	
}
