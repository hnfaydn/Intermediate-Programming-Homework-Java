import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
abstract public class Meta extends JFrame implements Ex 
{
	Meta(int i)
	{
		JPanel mp,bp,lp,ip,sp,pp;
		JLabel p1,s1,i1;
		JButton sob,shb;
		mp=new JPanel(new BorderLayout());
		lp=new JPanel(new GridLayout(3, 1));
		bp=new JPanel(new GridLayout(1, 2));
		p1=new JLabel("Population:");
		s1=new JLabel("SOLDIER POWER");
		i1=new JLabel("IGD");
		pp=new JPanel(new FlowLayout(FlowLayout.CENTER));
		sp=new JPanel(new FlowLayout(FlowLayout.CENTER));
		ip=new JPanel(new FlowLayout(FlowLayout.CENTER));
		pp.add(p1);
		sp.add(s1);
		ip.add(i1);
		lp.add(pp);
		lp.add(sp);
		lp.add(ip);
		sob=new JButton("Soldier");
		/*shb=new JButton("ship");
		shb.addActionListener(this);
		bp.add(shb);*/
		bp.add(sob);
		mp.add(lp,BorderLayout.NORTH);
		mp.add(bp,BorderLayout.NORTH);
		add(mp);
		if(i>0)
		{
			sob.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					Add.refer("so");
				}
			});
			/*shb.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					Add.refer("sh");
				}
			});*/
		}
		/*else
		{
			sob.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					Dismiss.refer("so");
				}
			});
			shb.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					Dismiss.refer("sh");
				}
			});
		}*/
		setSize(600,600);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	abstract void so();
	//abstract void sh();
}