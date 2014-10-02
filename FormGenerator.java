package javaCMS;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class FormGenerator extends JPanel
{
	HPanel[] components;
	JButton[] buttons;
	String[][] comIDandName;
	String[][] butIDandName;
	
	int indexL = 0;
	int indexB = 0;
	
	public FormGenerator()
	{
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setPreferredSize(new Dimension(450, 150));
	}
	
	public FormGenerator(String[] names)
	{
		for(String name : names)
		{
			add(new LabelTextBox(name));
		}
	}
	
	public FormGenerator(int hcNum, int jbNum)
	{
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setPreferredSize(new Dimension(450, 150));
		components = new HPanel[hcNum];
		buttons = new JButton[jbNum];
		comIDandName = new String[hcNum][2];
		butIDandName = new String[jbNum][2];
	}
	
	public void addLabelTextBox(String name)
	{
		LabelTextBox ltb = new LabelTextBox(name);
		components[indexL] = ltb;
		comIDandName[indexL][0] = "" + indexL;
		comIDandName[indexL][1] = name;
		indexL++;
		add(ltb);
	}
	
	public void addLabelComboBox(String name)
	{
		LabelComboBox lcb = new LabelComboBox(name);
		components[indexL] = lcb;
		comIDandName[indexL][0] = "" + indexL;
		comIDandName[indexL][1] = name;
		indexL ++;
		add(lcb);
	}
	
	public void addButton(String name)
	{
	    JButton jb = new JButton(name);
	    buttons[indexB] = jb;
	    butIDandName[indexB][0] = "" + indexB;
		butIDandName[indexB][1] = name;
	    indexB++;
		add(jb);
	}
	
	public LabelTextBox getLTB(String componentName)
	{
		int index = 0;
		for(HPanel hp : components)
		{
			if((comIDandName[index][1] == componentName))
			{
				return (LabelTextBox)hp;
			}
			index++;
		}
		
		return null;
	}
	
	public LabelComboBox getLCB(String componentName)
	{
		int index = 0;
		for(HPanel hp : components)
		{
			if((comIDandName[index][1] == componentName))
			{
				return (LabelComboBox)hp;
			}
			index++;
		}
		
		return null;
	}
	
	
	public JButton getButton(String componentName)
	{
		int index = 0;
		for(JButton jb : buttons)
		{
			if((butIDandName[index][1] == componentName))
			{
				return (JButton)jb;
			}
			index++;
		}
		
		return null;	
	}
	
	public String getCompText(String componentName)
	{
		int index = 0;
		for(HPanel hc : components)
		{
			if((comIDandName[index][1] == componentName))
			{
				return hc.getText();
			}
			index++;
		}
		
		return null;
	}
	
	public void setCompText(String componentName, String text)
	{
		int index = 0;
		for(HPanel hc : components)
		{
			if((comIDandName[index][1] == componentName))
			{
	
			    hc.setText(text);
			    break;
			}
			index++;
		}
	}
}
