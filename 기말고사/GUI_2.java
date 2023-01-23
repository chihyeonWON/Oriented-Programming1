import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI_2
{
	public static void main(String[] args) {


		class clickListener implements ActionListener {
			JTextField txt;
			int nc1 = 0, nc2 = 0;
			
			clickListener(JTextField txt) {
				this.txt = txt;
			}
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("btn_click"))
					if(e.getActionCommand() == "click")
						txt.setText("Count : " + ++nc1);
					else
						txt.setText("Count : " + ++nc2);
			}
		}

		class endListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		}
		
		JFrame frame = new JFrame("GUI_2");
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.gray);
		panel.setPreferredSize(new Dimension(400, 400));

		JTextField txt = new JTextField("Click count : " +0);
		txt.setBounds(100, 100, 200, 30);
				
		JButton btn_click = new JButton("Click");
		btn_click.setBounds(150, 200, 80, 30);
		clickListener at1_click = new clickListener(txt);
		btn_click.addActionListener(at1_click);

		JButton btn_end = new JButton("End");
		btn_end.setBounds(150, 300, 80, 30);	
		btn_end.addActionListener(new endListener());

		JButton down = new JButton("Down");
		down.setBounds(250, 200 , 80, 30);
		clickListener at2_click = new clickListener(txt);
		down.addActionListener(at2_click);
		
		panel.setLayout(null);
		panel.add(txt);
		panel.add(btn_click);
		panel.add(btn_end);
		panel.add(down);

		frame.getContentPane().add(panel);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		System.out.println("Console thread is going out !!!");
	}
}