package javaCMS;

import javax.swing.JPanel;


public abstract class HPanel extends JPanel
{
	public HPanel()
	{
		
	}
	
	public abstract String getText();
	
	public abstract void setText(String text);

}
