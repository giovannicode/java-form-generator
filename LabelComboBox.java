package javaCMS;
import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

public class LabelComboBox extends HPanel
{
   JLabel label;
   HComboBox comboBox;
   
	LabelComboBox()
	{
		setPreferredSize(new Dimension(300, 25));
		label = new JLabel();
		comboBox = new HComboBox();
	    add(label);
		add(comboBox);
		label.setPreferredSize(new Dimension(250, 25));
	}
	
	LabelComboBox(String labelText)
	{
		setPreferredSize(new Dimension(300, 25));
		label = new JLabel();
	    comboBox = new HComboBox();
		add(label);
		add(comboBox);
		label.setPreferredSize(new Dimension(250,25));
		label.setText(labelText);
	}
	
	public void addItem(Object object)
	{
		comboBox.addItem(object);
	}
	
	public void populateBox(ArrayList items)
	{
		comboBox.populateBox(items);
	}
	
	public void populateBoxFrData(ArrayList items)
	{
		comboBox.populateBoxFrData(items);
	}
	
	public int getSelectedItemID()
	{
		return comboBox.getSelectedItemID();
	}
	
	public void removeAllItems()
	{
		comboBox.removeAllItems();
	}
	
	public String getText()
	{
		return (String) comboBox.getSelectedItem();
	}
	
	public void setText(String text)
	{
	}
}
