package javaCMS;


import javax.swing.*;
import java.awt.*;

public class LabelTextBox extends HPanel
{
	JLabel label;
	JTextField textbox;

	LabelTextBox()
	{
		setPreferredSize(new Dimension(300, 25));
		label = new JLabel();
		textbox = new JTextField(8);
	    add(label);
		add(textbox);
		label.setPreferredSize(new Dimension(250, 25));
	}

	LabelTextBox(String labelText)
	{
		setPreferredSize(new Dimension(300, 25));
		label = new JLabel();
		textbox = new JTextField(16);
		add(label);
		add(textbox);
		label.setPreferredSize(new Dimension(250,25));
		label.setText(labelText);
		System.out.println("it got here");
	}

	public String getText()
	{
		String text = this.textbox.getText();
		return text;
	}

	public void setText(String text)
	{
	   this.textbox.setText(text);
    }

}