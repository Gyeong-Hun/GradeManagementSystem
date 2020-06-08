package GUI;

import javax.swing.JTable;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class GradeViewer extends JPanel{
	
	WindowFrame frame;

	public GradeViewer(WindowFrame frame) {
		this.frame = frame;
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("SubjectName");
		model.addColumn("ID");
		model.addColumn("Subjectcredit");
		model.addColumn("yourgrade");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
