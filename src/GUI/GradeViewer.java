package GUI;

import javax.swing.JTable;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import grade.GradeInput;
import manager.GradeManager;

public class GradeViewer extends JPanel{
	
	WindowFrame frame;
	
	GradeManager gradeManager;

	public GradeViewer(WindowFrame frame, GradeManager gradeManager) {
		this.frame = frame;
		this.gradeManager = gradeManager;
		
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("SubjectName");
		model.addColumn("ID");
		model.addColumn("Subjectcredit");
		model.addColumn("yourgrade");
		
		for (int i=0; i<gradeManager.size(); i++) {
			Vector row = new Vector();
			GradeInput gi = gradeManager.get(i);
			row.add(gi.getSubjectname());
			row.add(gi.getSubjectid());
			row.add(gi.getSubjectcredit());
			row.add(gi.getYourgrade());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
