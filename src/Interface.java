import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
public class Interface extends JFrame implements ActionListener
{
	String pop,igd,/*mi,*/t;
	JLabel first,second,/*third,*/fourth;
	static JButton Add,/*DisMiss,*/Economy,Turn,Exit;
	static JPanel MainPanel,ButtonsPanel,LabelsPanel,ExitPanel;
	static JFrame Frame;
	static Object o;
	Interface(File f,String s) throws FileNotFoundException
	{
		referer(f);
		MainPanel=new JPanel(new BorderLayout());
		ButtonsPanel =new JPanel(new GridLayout(2,2));
		LabelsPanel=new JPanel(new GridLayout(1,4));
		first=new JLabel("Population: "+pop);
		second=new JLabel("IGD: "+igd);
		//third=new JLabel("Military Power: "+mi);
		fourth=new JLabel("Year: "+t);
		Add=new JButton("Add");
		Add.addActionListener(this);
		//DisMiss=new JButton("DissMiss");
		//DisMiss.addActionListener(this);
		Economy=new JButton("Economy");
		Economy.addActionListener(this);
		//War=new JButton("War");
		//War.addActionListener(this);
		Turn=new JButton("Turn");
		Turn.addActionListener(this);
		ButtonsPanel.add(Add);
		//ButtonsPanel.add(DisMiss);
		ButtonsPanel.add(Economy);
		Exit=new JButton("Exit");
		Exit.addActionListener(this);
		ExitPanel=new JPanel();
		ExitPanel.add(Exit);
		ButtonsPanel.add(ExitPanel);
		//ButtonsPanel.add(War);
		MainPanel.add(ButtonsPanel,new BorderLayout().CENTER);
		LabelsPanel.add(first);
		LabelsPanel.add(second);
		//LabelsPanel.add(third);
		LabelsPanel.add(fourth);
		MainPanel.add(LabelsPanel, new BorderLayout().NORTH);
		MainPanel.add(Turn, new BorderLayout().SOUTH);
		add(MainPanel);
		setSize(600,800);
		setTitle(s);
		setResizable(true);
		setUndecorated(true);
		setLocationRelativeTo(null);
		setVisible(true);
		o=this;
	}
	private void referer(File f) throws FileNotFoundException
	{
		BufferedReader b=new BufferedReader(new FileReader(f));
		String s ="";
		try
		{
			s=b.readLine();
		}catch (IOException e)
		{
			e.printStackTrace();
		}
		StringTokenizer st=new StringTokenizer(s,"$");
		ArrayList<String> p=new ArrayList<String>();
		while(st.hasMoreTokens())
			p.add(st.nextToken());
		pop=p.get(0);
		igd=p.get(1);
		//mi=p.get(2);
		t=p.get(2);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==Add)
			new Add();
		//else if(e.getSource()==DisMiss)
			//new Dismiss();
		else if(e.getSource()==Economy)
			new Economy();
		//else if(e.getSource()==War)
			//new War();
		else if(e.getSource()==Exit)
			Support.saver(getTitle(),pop,igd,t);
		else
			turn();
	}
	private void turn()
	{
		Support.array();
		pop=Support.changer("pop",pop);
		first.setText("Population: "+pop);
		igd=Support.changer("igd",igd);
		second.setText("IGD: "+igd);
		//mi=Support.changer("mi",mi);
		//third.setText("Military Power: "+mi);
		t=Support.changer("t",t);
		fourth.setText("Year: "+t);
		if(Integer.valueOf(pop)==0)
			System.exit(0);
		else if(Integer.valueOf(igd)==0)
			System.exit(0);
	}
}