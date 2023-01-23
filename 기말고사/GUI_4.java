import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI_4 implements ActionListener {
	JButton btn_yes;
	JButton btn_no;
	JTextField txt;

	GUI_4() {
		JFrame frame = new JFrame("GUI_4");
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.gray);
		panel.setPreferredSize(new Dimension(300, 300));
		txt = new JTextField("Click count : " + 0);
		txt.setBounds(50, 50, 200, 30);
		btn_yes = new JButton("Yes");
		btn_yes.setBounds(100, 100, 80, 30);
		btn_no = new JButton("No");
		btn_no.setBounds(100, 150, 80, 30);
		btn_yes.addActionListener(this);
		btn_no.addActionListener(this);
		JButton btn_end = new JButton("End");
		btn_end.setBounds(100, 250, 80, 30);
		btn_end.addActionListener(new ActionListener() {
			int i = 0;
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		panel.setLayout(null);
		panel.add(txt);
		panel.add(btn_yes);
		panel.add(btn_no);
		panel.add(btn_end);
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	int nc1 = 0, nc2 = 0;
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Yes"))
			txt.setText("Yes Count : " + ++nc1);
		else
			txt.setText("No Count : " + ++nc2);
	}
	public static void main(String args[]) {
		GUI_4 main = new GUI_4();
		System.out.println("Console thread is going out !!!");
	}
}