package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class GradeAdder extends JPanel{
	
	WindowFrame frame;
	
	public GradeAdder(WindowFrame frame) {
		this.frame = frame;
		JPanel panel = new JPanel(new SpringLayout());
		panel.setLayout(new SpringLayout());
		
		JLabel labelsubjectName = new JLabel("SubjectName: ", JLabel.TRAILING);
		JTextField fieldsubjectName = new JTextField(10);
		labelsubjectName.setLabelFor(fieldsubjectName);
		panel.add(labelsubjectName);
		panel.add(fieldsubjectName);
		
		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelsubjectcredit = new JLabel("Subjectcredit: ", JLabel.TRAILING);
		JTextField fieldsubjectcredit = new JTextField(10);
		labelsubjectcredit.setLabelFor(fieldsubjectcredit);
		panel.add(labelsubjectcredit);
		panel.add(fieldsubjectcredit);
		
		JLabel labelyourgrade = new JLabel("yourgrade: ", JLabel.TRAILING);
		JTextField fieldyourgrade = new JTextField(10);
		labelyourgrade.setLabelFor(fieldyourgrade);
		panel.add(labelyourgrade);
		panel.add(fieldyourgrade);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		
		this.add(panel);
		this.setVisible(true);
	}
}
