import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tela implements ActionListener {
	JLabel label;

	public Tela () {
		JFrame frame = new JFrame("Radio Button");
		frame.setSize(240, 180);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		frame.setVisible(true);

		JRadioButton radio1 = new JRadioButton("Facebook");
		radio1.setActionCommand("Facebook");
		radio1.addActionListener(this);

		JRadioButton radio2 = new JRadioButton("Instagram");
		radio2.setActionCommand("Instagram");
		radio2.addActionListener(this);

		JRadioButton radio3 = new JRadioButton("Twitter");
		radio3.setActionCommand("Twitter");
		radio3.addActionListener(this);

		JRadioButton radio4 = new JRadioButton("Youtube");
		radio4.setActionCommand("Youtube");
		radio4.addActionListener(this);

		ButtonGroup group = new ButtonGroup();
		group.add(radio1);
		group.add(radio2);
		group.add(radio3);
		group.add(radio4);

		label = new JLabel();
		frame.add(label, BorderLayout.CENTER);
		
		JPanel panel = new JPanel(new GridLayout(4, 1));
		panel.add(radio1);
		panel.add(radio2);
		panel.add(radio3);
		panel.add(radio4);
		frame.add(panel, BorderLayout.EAST);
	}

	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand().toString();
		label.setIcon(new ImageIcon("img/" +str.toLowerCase() +".png"));
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Tela();
			}
		});
	}
}