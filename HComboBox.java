package javaCMS;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class HComboBox extends JComboBox
{
	ArrayList IDandName;
	
	public HComboBox()
	{
		IDandName = new ArrayList();
	}
	
	/*public void setIds(int[] ids)
	{
		this.ids = ids;
	}*/
	
	public void populateBox(ArrayList items)
	{
		for(Object item : items)
		{
			addItem((String)item);
		}
	}
	
	public void populateBoxFrData(ArrayList items)
	{
		for(Object ob : items)
		{
			IDandName.add((String[]) ob);
			addItem(((String[])ob)[1]);
		}
		
		for(Object s : IDandName)
		{
			System.out.println(((String[])s)[0].toString());
		}
	}
	
	public int getSelectedItemID()
	{
		String item = (String) getSelectedItem();
		for(Object ob : IDandName)
		{
			if(((String[])ob)[1].equals(item))
			{
				return Integer.parseInt(((String[])ob)[0]);
			}
		}
		
		return -200;
	}

}
