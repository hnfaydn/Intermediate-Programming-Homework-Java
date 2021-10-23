/*import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
public class War extends JFrame implements ListSelectionListener
{
	JList<String> list;
	JTextArea  ta; 
	JPanel  main1,main2;
	JLabel  lagal,lainfo;
	JButton  attack;
	War()
	{
		System.out.println(enlistment());
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
		list = new JList<String>(k);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(this);
		main1.add(new JScrollPane(list));
		main1.add(ta);
		attack=new JButton("ATTACK");
		main2.add(attack);
		add(main1,BorderLayout.NORTH);
		add(main2,BorderLayout.SOUTH);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("War");
		pack();
		setVisible(true);
	}
	private ArrayList<String> enlistment()
	{
		ArrayList<String> s=new ArrayList<String>();
		File f=new File("str");
		File[] c=f.listFiles();
		for(File i:c)
			s.add(i.getPath().substring(4,i.getPath().length()-4));
		return s;
	}
	@Override
	public void valueChanged(ListSelectionEvent amq)
	{
		String s=list.getSelectedValue();
		fight(s);
	}
	private void fight(String s)
	{
		
	}
}*/