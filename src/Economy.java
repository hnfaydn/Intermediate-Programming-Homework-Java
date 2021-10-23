import java.awt.*;
import java.io.File;
import java.util.*;

import javax.swing.*;
import javax.swing.event.*;
public class Economy extends JFrame implements ListSelectionListener
{
	static double z=1.0;
	static boolean s;
	JList<String> list;
	JTextArea  ta; 
	JPanel  main1,main2;
	JLabel  lagal,lainfo;
	JButton  attack;
	Economy()
	{
		pack();
		main1 = new JPanel(new GridLayout(2,2));
		main2 = new JPanel(new GridLayout(1,1));
		ta=new JTextArea();
		lagal=new JLabel("Galaxies");
		main1.add(lagal,BorderLayout.WEST);
		lainfo=new JLabel("Info");
		main1.add(lainfo,BorderLayout.EAST);
		ArrayList<String> s=enlistment();
		String[] k=new String[s.size()];
		for(int i=0;i<s.size();i++)
		{
			k[i]=s.get(i);
		}
		list=new JList<String>(k);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(this);
		main1.add(new JScrollPane(list));
		main1.add(ta);
		attack=new JButton("Deal");
		main2.add(attack);
		add(main1,BorderLayout.NORTH);
		add(main2,BorderLayout.SOUTH);
		setLocationRelativeTo(null);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Economy");
		pack();
		setVisible(true);
	}
	private ArrayList<String> enlistment()
	{
		Support.array();
		ArrayList<String> s=new ArrayList<String>();
		File f=new File("str");
		File[] c=f.listFiles();
		int j=0;
		for(File i:c)
		{
			s.add(i.getPath().substring(4,i.getPath().length()-4)+"      "+Support.gdp.get(j));
			j++;
		}
		return s;
	}
	@Override
	public void valueChanged(ListSelectionEvent arg0)
	{
		String s=list.getSelectedValue();
		deal(s);
	}
	private void deal(String k)
	{
		((Interface)Interface.o).igd=String.valueOf((int)(Integer.valueOf(((Interface)Interface.o).igd)*Economy.z+k.length()*100));
		if(s)
			((Interface)Interface.o).igd=String.valueOf((int)(Integer.valueOf(((Interface)Interface.o).igd)*Math.random()-k.length()*500*Math.random()));
	}
}