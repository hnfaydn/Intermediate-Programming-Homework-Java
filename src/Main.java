import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
public class Main extends JFrame implements ActionListener,ListSelectionListener
{
	static File f;
	boolean x=false;
	JPanel mp,cp,tp,lp,rp,up,bp;
	JButton bu;
	JList<String> list;
	JLabel lb1,lb2;
	JTextField fi;
	String s;
	static ArrayList<String> u;
	public static void main(String[] args) throws IOException 
	{
		new Main();
	}
	public Main() throws IOException
	{
		mp=new JPanel(new BorderLayout());
		cp=new JPanel(new GridLayout(1,2));
		tp=new JPanel(new GridLayout(1,2));
		lp=new JPanel();
		rp=new JPanel(new GridLayout(3,1));
		up=new JPanel();
		bp=new JPanel();
		bu=new JButton("Start");
		bu.addActionListener(this);
		lb1=new JLabel("You can choose your galaxy from the list.");
		lb2=new JLabel("Enter the name of your galactic empire.");
		tp.add(lb1);
		tp.add(lb2);
		u=enlistment();
		String[] k=new String[u.size()];
		for(int i=0;i<u.size();i++)
			k[i]=u.get(i);
		list=new JList<String>(k);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(this);
		fi=new JTextField();
		lp.add(list);
		rp.add(up);
		rp.add(fi);
		rp.add(bp);
		cp.add(lp);
		cp.add(rp);
		mp.add(tp,BorderLayout.NORTH);
		mp.add(bu,BorderLayout.SOUTH);
		mp.add(cp,BorderLayout.CENTER);
		add(mp);
		setSize(600,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	private ArrayList<String> enlistment() throws IOException
	{
		ArrayList<String> s=new ArrayList<String>();
		File f=new File("str");
		File[] c=f.listFiles();
		for(File i:c)
			s.add(i.getPath().substring(4,i.getPath().length()-4));
		return s;
	}
	@Override
	public void actionPerformed(ActionEvent a)
	{
		if(a.getSource()==bu)
		{
			if(x)
			{
				setVisible(false);
				try
				{
					new Interface(f,s);
				}catch (FileNotFoundException e)
				{
					e.printStackTrace();
				}
			}
			else if(!fi.getText().equals(""))
			{
				boolean y=true;
				for(int i=0;i<u.size()&&y;i++)
				{
					if(u.get(i).equalsIgnoreCase(fi.getText()))
						y=false;
				}
				if(y)
				{
					Support.create(fi.getText());
					try
					{
						new Interface(new File("str/"+fi.getText()+".txt"),fi.getText());
					}catch (FileNotFoundException e)
					{
						e.printStackTrace();
					}
				}
			}
		}
	}
	@Override
	public void valueChanged(ListSelectionEvent e)
	{
		s=list.getSelectedValue();
		f=new File("str/"+s+".txt");
		x=true;
	}
}