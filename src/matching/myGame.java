package matching;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class myGame
extends JFrame
implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Container C;
	private JLabel title;
	private JLabel score;
	private int nscore;
	private JButton a;
	private JButton b;
	private JButton c;
	private JButton d;
	private JButton e;
	private JButton f;
	private JButton g;
	private JButton h;
	private JButton i;
	private JButton j;
	private JButton k;
	private JButton l;
	private JButton sub;
	private numbers gen;
	private int store[];
	private int track[];
	private int matches;
	
	public myGame(){
		setTitle("Matching Game");
		setBounds(300, 90, 405, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
		
		C = getContentPane();
		C.setLayout(null);
		Font F = new Font("Arial", Font.PLAIN, 15);
		
		matches = 0;
		nscore = 0;
		track = new int[2];
		
		gen = new numbers();
		gen.shuffle();
		store = gen.numlist;
		
		title = new JLabel("Find the matching cards!");
		title.setFont(new Font("Arial", Font.ITALIC, 25));
		title.setSize(300,30);
		title.setLocation(50,20);
		C.add(title);
		
		score = new JLabel("Score = 0");
		score.setFont(F);
		score.setSize(150,20);
		score.setLocation(50,50);
		C.add(score);
		
		sub = new JButton("Submit pair");
		sub.setFont(F);
		sub.setSize(150,20);
		sub.setLocation(150,50);
		sub.addActionListener(this);
		C.add(sub);
		
		a = new JButton("  : )  ");
		a.setFont(F);
		a.setSize(100,50);
		a.setLocation(40,80);
		a.addActionListener(this);
		C.add(a);
		
		b = new JButton("  : )  ");
		b.setFont(F);
		b.setSize(100,50);
		b.setLocation(150,80);
		b.addActionListener(this);
		C.add(b);
		
		c = new JButton("  : )  ");
		c.setFont(F);
		c.setSize(100,50);
		c.setLocation(260,80);
		c.addActionListener(this);
		C.add(c);
		
		d = new JButton("  : )  ");
		d.setFont(F);
		d.setSize(100,50);
		d.setLocation(40,150);
		d.addActionListener(this);
		C.add(d);
		
		e = new JButton("  : )  ");
		e.setFont(F);
		e.setSize(100,50);
		e.setLocation(150,150);
		e.addActionListener(this);
		C.add(e);
		
		f = new JButton("  : )  ");
		f.setFont(F);
		f.setSize(100,50);
		f.setLocation(260,150);
		f.addActionListener(this);
		C.add(f);
		
		g = new JButton("  : )  ");
		g.setFont(F);
		g.setSize(100,50);
		g.setLocation(40,220);
		g.addActionListener(this);
		C.add(g);
		
		h = new JButton("  : )  ");
		h.setFont(F);
		h.setSize(100,50);
		h.setLocation(150,220);
		h.addActionListener(this);
		C.add(h);
		
		i = new JButton("  : )  ");
		i.setFont(F);
		i.setSize(100,50);
		i.setLocation(260,220);
		i.addActionListener(this);
		C.add(i);
		
		j = new JButton("  : )  ");
		j.setFont(F);
		j.setSize(100,50);
		j.setLocation(40,290);
		j.addActionListener(this);
		C.add(j);
		
		k = new JButton("  : )  ");
		k.setFont(F);
		k.setSize(100,50);
		k.setLocation(150,290);
		k.addActionListener(this);
		C.add(k);
		
		l = new JButton("  : )  ");
		l.setFont(F);
		l.setSize(100,50);
		l.setLocation(260,290);
		l.addActionListener(this);
		C.add(l);
	}
	
	public void actionPerformed(ActionEvent x) {
		//collects button click 
		if (x.getSource()==a) {
			a.setText("  "+Integer.toString(store[0])+"  ");
			if(track[0]==0)track[0]=store[0];
			else track[1]=store[0];
		}
		else if(x.getSource()==b) {
			b.setText("  "+Integer.toString(store[1])+"  ");
			if(track[0]==0)track[0]=store[1];
			else track[1]=store[1];
		}
		else if(x.getSource()==c) {
			c.setText("  "+Integer.toString(store[2])+"  ");
			if(track[0]==0)track[0]=store[2];
			else track[1]=store[2];
		}
		else if(x.getSource()==d) {
			d.setText("  "+Integer.toString(store[3])+"  ");
			if(track[0]==0)track[0]=store[3];
			else track[1]=store[3];
		}
		else if(x.getSource()==e) {
			e.setText("  "+Integer.toString(store[4])+"  ");
			if(track[0]==0)track[0]=store[4];
			else track[1]=store[4];
		}
		else if(x.getSource()==f) {
			f.setText("  "+Integer.toString(store[5])+"  ");
			if(track[0]==0)track[0]=store[5];
			else track[1]=store[5];
		}
		else if(x.getSource()==g) {
			g.setText("  "+Integer.toString(store[6])+"  ");
			if(track[0]==0)track[0]=store[6];
			else track[1]=store[6];
		}
		else if(x.getSource()==h) {
			h.setText("  "+Integer.toString(store[7])+"  ");
			if(track[0]==0)track[0]=store[7];
			else track[1]=store[7];
		}
		else if(x.getSource()==i) {
			i.setText("  "+Integer.toString(store[8])+"  ");
			if(track[0]==0)track[0]=store[8];
			else track[1]=store[8];
		}
		else if(x.getSource()==j) {
			j.setText("  "+Integer.toString(store[9])+"  ");
			if(track[0]==0)track[0]=store[9];
			else track[1]=store[9];
		}
		else if(x.getSource()==k) {
			k.setText("  "+Integer.toString(store[10])+"  ");
			if(track[0]==0)track[0]=store[10];
			else track[1]=store[10];
		}
		else if(x.getSource()==l) {
			l.setText("  "+Integer.toString(store[11])+"  ");
			if(track[0]==0)track[0]=store[11];
			else track[1]=store[11];
		}
		else if(x.getSource()==sub) {
		// Checks to see if a match was made after two integers are stored.
		
		if(track[0]!=0 && track[1]!=0) {
			if(track[0]==track[1]) {
				//match
				matches++;
				if(track[0]==store[0]) a.setBackground(Color.cyan);
				if(track[0]==store[1]) b.setBackground(Color.cyan);
				if(track[0]==store[2]) c.setBackground(Color.cyan);
				if(track[0]==store[3]) d.setBackground(Color.cyan);
				if(track[0]==store[4]) e.setBackground(Color.cyan);
				if(track[0]==store[5]) f.setBackground(Color.cyan);
				if(track[0]==store[6]) g.setBackground(Color.cyan);
				if(track[0]==store[7]) h.setBackground(Color.cyan);
				if(track[0]==store[8]) i.setBackground(Color.cyan);
				if(track[0]==store[9]) j.setBackground(Color.cyan);
				if(track[0]==store[10]) k.setBackground(Color.cyan);
				if(track[0]==store[11]) l.setBackground(Color.cyan);
				
				nscore = nscore+12;
				score.setText("Score: " + Integer.toString(nscore));
			}
			else if(track[0]!=track[1]){
				//no match
				nscore = nscore - 2;
				score.setText("Score: " + Integer.toString(nscore));
				
				if(track[0]==store[0]) a.setText("  : )  ");
				if(track[0]==store[1]) b.setText("  : )  ");
				if(track[0]==store[2]) c.setText("  : )  ");
				if(track[0]==store[3]) d.setText("  : )  ");
				if(track[0]==store[4]) e.setText("  : )  ");
				if(track[0]==store[5]) f.setText("  : )  ");
				if(track[0]==store[6]) g.setText("  : )  ");
				if(track[0]==store[7]) h.setText("  : )  ");
				if(track[0]==store[8]) i.setText("  : )  ");
				if(track[0]==store[9]) j.setText("  : )  ");
				if(track[0]==store[10]) k.setText("  : )  ");
				if(track[0]==store[11]) l.setText("  : )  ");
				
				
				if(track[1]==store[0]) a.setText("  : )  ");
				if(track[1]==store[1]) b.setText("  : )  ");
				if(track[1]==store[2]) c.setText("  : )  ");
				if(track[1]==store[3]) d.setText("  : )  ");
				if(track[1]==store[4]) e.setText("  : )  ");
				if(track[1]==store[5]) f.setText("  : )  ");
				if(track[1]==store[6]) g.setText("  : )  ");
				if(track[1]==store[7]) h.setText("  : )  ");
				if(track[1]==store[8]) i.setText("  : )  ");
				if(track[1]==store[9]) j.setText("  : )  ");
				if(track[1]==store[10]) k.setText("  : )  ");
				if(track[1]==store[11]) l.setText("  : )  ");
				
			}
			
			
			track[0]=track[1]=0;
		}
		}
		
		//Checks to see if the board has been cleared.
		if(matches==6) {
			
			title.setText("Congratulations!");
			sub.setVisible(false);   
			score.setText("FINAL SCORE: " + Integer.toString(nscore));
		}
	}

	public static void main(String[] args) {
		myGame g = new myGame();
		g.setVisible(true);
		

	}

}
