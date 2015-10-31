import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;
/*
 * Created by JFormDesigner on Tue May 19 17:28:39 EDT 2015
 */



/**
 * @author Cameron Kelliher
 */
public class Design extends JPanel {
	public Design() {
		initComponents();
	}

	private void polygonSolve(ActionEvent e) {
		// TODO add your code here
	}

	private void pressureSolve(ActionEvent e) {
		// TODO add your code here
	}

	private void solveforXSolve(ActionEvent e) {
		// TODO add your code here
	}

	private void motionSolve(ActionEvent e) {
		// TODO add your code here
	}

	private void quadraticSolve(ActionEvent e) {
		// TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Cameron Kelliher
		frame1 = new JFrame();
		title = new JLabel();
		polygon = new JPanel();
		label16 = new JLabel();
		label17 = new JLabel();
		sidelength = new JTextField();
		label18 = new JLabel();
		sides = new JTextField();
		button10 = new JButton();
		textField21 = new JTextField();
		pressure = new JPanel();
		label8 = new JLabel();
		label9 = new JLabel();
		textField9 = new JTextField();
		label10 = new JLabel();
		textField11 = new JTextField();
		label11 = new JLabel();
		textField10 = new JTextField();
		button8 = new JButton();
		textField12 = new JTextField();
		solveforx = new JPanel();
		label1 = new JLabel();
		textField1 = new JTextField();
		label2 = new JLabel();
		textField2 = new JTextField();
		label3 = new JLabel();
		textField3 = new JTextField();
		button6 = new JButton();
		textField4 = new JTextField();
		motion = new JPanel();
		label12 = new JLabel();
		label13 = new JLabel();
		textField14 = new JTextField();
		textField13 = new JTextField();
		label14 = new JLabel();
		textField15 = new JTextField();
		textField17 = new JTextField();
		label15 = new JLabel();
		button9 = new JButton();
		textField18 = new JTextField();
		quadratic = new JPanel();
		label4 = new JLabel();
		textField5 = new JTextField();
		label5 = new JLabel();
		textField6 = new JTextField();
		label6 = new JLabel();
		textField7 = new JTextField();
		label7 = new JLabel();
		button7 = new JButton();
		textField8 = new JTextField();

		//======== frame1 ========
		{
			Container frame1ContentPane = frame1.getContentPane();
			frame1ContentPane.setLayout(new FormLayout(
				"4*(default, $lcgap), default",
				"4*(default, $lgap), default"));

			//---- title ----
			title.setText("The Super Solver 1000");
			title.setFont(title.getFont().deriveFont(title.getFont().getSize() + 20f));
			title.setEnabled(false);
			frame1ContentPane.add(title, CC.xy(5, 1));

			//======== polygon ========
			{

				// JFormDesigner evaluation mark
				polygon.setBorder(new javax.swing.border.CompoundBorder(
					new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
						"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
						javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
						java.awt.Color.red), polygon.getBorder())); polygon.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

				polygon.setLayout(new FormLayout(
					"47dlu, 27dlu, 4dlu, 22dlu, 30dlu, $lcgap, 36dlu",
					"41dlu, $lgap, 43dlu, $lgap, 37dlu, $lgap, default"));

				//---- label16 ----
				label16.setText("Polygon Area Calculator");
				label16.setFont(label16.getFont().deriveFont(label16.getFont().getSize() + 10f));
				polygon.add(label16, CC.xywh(1, 1, 7, 1));

				//---- label17 ----
				label17.setText("  Side Length");
				polygon.add(label17, CC.xy(1, 3, CC.DEFAULT, CC.CENTER));
				polygon.add(sidelength, CC.xy(2, 3));

				//---- label18 ----
				label18.setText("Sides");
				polygon.add(label18, CC.xy(4, 3, CC.DEFAULT, CC.CENTER));
				polygon.add(sides, CC.xy(5, 3));

				//---- button10 ----
				button10.setText("SOLVE");
				button10.addActionListener(e -> polygonSolve(e));
				polygon.add(button10, CC.xywh(1, 5, 3, 1));
				polygon.add(textField21, CC.xywh(5, 5, 3, 1));
			}
			frame1ContentPane.add(polygon, CC.xy(9, 1));

			//======== pressure ========
			{
				pressure.setLayout(new FormLayout(
					"20dlu, 27dlu, 11dlu, 32dlu, 20dlu, $lcgap, 50dlu",
					"41dlu, $lgap, 43dlu, $lgap, 37dlu, $lgap, default"));

				//---- label8 ----
				label8.setText("Pressure Calculator (gas)");
				label8.setFont(label8.getFont().deriveFont(label8.getFont().getSize() + 10f));
				pressure.add(label8, CC.xywh(1, 1, 7, 1));

				//---- label9 ----
				label9.setText("      P");
				pressure.add(label9, CC.xy(1, 3, CC.DEFAULT, CC.CENTER));
				pressure.add(textField9, CC.xy(2, 3));

				//---- label10 ----
				label10.setText(" = ");
				pressure.add(label10, CC.xy(3, 3, CC.DEFAULT, CC.CENTER));
				pressure.add(textField11, CC.xy(4, 3));

				//---- label11 ----
				label11.setText("    R");
				pressure.add(label11, CC.xy(5, 3));
				pressure.add(textField10, CC.xy(7, 3));

				//---- button8 ----
				button8.setText("SOLVE");
				button8.addActionListener(e -> pressureSolve(e));
				pressure.add(button8, CC.xywh(1, 5, 3, 1));
				pressure.add(textField12, CC.xywh(5, 5, 3, 1));
			}
			frame1ContentPane.add(pressure, CC.xy(5, 3));

			//======== solveforx ========
			{
				solveforx.setLayout(new FormLayout(
					"30dlu, 14dlu, 30dlu, 32dlu, 30dlu, $lcgap, 36dlu",
					"41dlu, $lgap, 43dlu, $lgap, 37dlu"));

				//---- label1 ----
				label1.setText("Solve for X");
				label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 10f));
				solveforx.add(label1, CC.xywh(1, 1, 5, 1));
				solveforx.add(textField1, CC.xy(1, 3));

				//---- label2 ----
				label2.setText(" =");
				solveforx.add(label2, CC.xy(2, 3, CC.DEFAULT, CC.CENTER));
				solveforx.add(textField2, CC.xy(3, 3));

				//---- label3 ----
				label3.setText("     X +");
				solveforx.add(label3, CC.xy(4, 3, CC.DEFAULT, CC.CENTER));
				solveforx.add(textField3, CC.xy(5, 3));

				//---- button6 ----
				button6.setText("SOLVE");
				button6.addActionListener(e -> solveforXSolve(e));
				solveforx.add(button6, CC.xywh(1, 5, 3, 1));
				solveforx.add(textField4, CC.xywh(5, 5, 3, 1));
			}
			frame1ContentPane.add(solveforx, CC.xy(9, 3));

			//======== motion ========
			{
				motion.setLayout(new FormLayout(
					"30dlu, 27dlu, 5dlu, 25dlu, 20dlu, 25dlu, 5dlu, 25dlu, 48dlu",
					"41dlu, $lgap, 43dlu, $lgap, 37dlu, $lgap, default"));

				//---- label12 ----
				label12.setText("Newtons Second Law");
				label12.setFont(label12.getFont().deriveFont(label12.getFont().getSize() + 10f));
				motion.add(label12, CC.xywh(1, 1, 8, 1));

				//---- label13 ----
				label13.setText("     D =");
				motion.add(label13, CC.xy(1, 3, CC.DEFAULT, CC.CENTER));
				motion.add(textField14, CC.xy(2, 3));
				motion.add(textField13, CC.xy(4, 3));

				//---- label14 ----
				label14.setText("+ 1/2");
				motion.add(label14, CC.xy(5, 3, CC.DEFAULT, CC.CENTER));
				motion.add(textField15, CC.xy(6, 3));
				motion.add(textField17, CC.xy(8, 3));

				//---- label15 ----
				label15.setText("^2");
				motion.add(label15, CC.xy(9, 3));

				//---- button9 ----
				button9.setText("SOLVE");
				button9.addActionListener(e -> motionSolve(e));
				motion.add(button9, CC.xywh(1, 5, 4, 1));
				motion.add(textField18, CC.xywh(6, 5, 3, 1));
			}
			frame1ContentPane.add(motion, CC.xy(5, 5));

			//======== quadratic ========
			{
				quadratic.setLayout(new FormLayout(
					"30dlu, 27dlu, 30dlu, 32dlu, 30dlu, $lcgap, 36dlu",
					"41dlu, $lgap, 43dlu, $lgap, 37dlu, $lgap, default"));

				//---- label4 ----
				label4.setText("Quadratic Solver");
				label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 10f));
				quadratic.add(label4, CC.xywh(1, 1, 5, 1));
				quadratic.add(textField5, CC.xy(1, 3));

				//---- label5 ----
				label5.setText(" x^2 + ");
				quadratic.add(label5, CC.xy(2, 3, CC.DEFAULT, CC.CENTER));
				quadratic.add(textField6, CC.xy(3, 3));

				//---- label6 ----
				label6.setText("     X +");
				quadratic.add(label6, CC.xy(4, 3, CC.DEFAULT, CC.CENTER));
				quadratic.add(textField7, CC.xy(5, 3));

				//---- label7 ----
				label7.setText("= 0");
				quadratic.add(label7, CC.xy(7, 3));

				//---- button7 ----
				button7.setText("SOLVE");
				button7.addActionListener(e -> quadraticSolve(e));
				quadratic.add(button7, CC.xywh(1, 5, 3, 1));
				quadratic.add(textField8, CC.xywh(5, 5, 3, 1));
			}
			frame1ContentPane.add(quadratic, CC.xy(9, 5));
			frame1.pack();
			frame1.setLocationRelativeTo(frame1.getOwner());
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Cameron Kelliher
	private JFrame frame1;
	private JLabel title;
	private JPanel polygon;
	private JLabel label16;
	private JLabel label17;
	private JTextField sidelength;
	private JLabel label18;
	private JTextField sides;
	private JButton button10;
	private JTextField textField21;
	private JPanel pressure;
	private JLabel label8;
	private JLabel label9;
	private JTextField textField9;
	private JLabel label10;
	private JTextField textField11;
	private JLabel label11;
	private JTextField textField10;
	private JButton button8;
	private JTextField textField12;
	private JPanel solveforx;
	private JLabel label1;
	private JTextField textField1;
	private JLabel label2;
	private JTextField textField2;
	private JLabel label3;
	private JTextField textField3;
	private JButton button6;
	private JTextField textField4;
	private JPanel motion;
	private JLabel label12;
	private JLabel label13;
	private JTextField textField14;
	private JTextField textField13;
	private JLabel label14;
	private JTextField textField15;
	private JTextField textField17;
	private JLabel label15;
	private JButton button9;
	private JTextField textField18;
	private JPanel quadratic;
	private JLabel label4;
	private JTextField textField5;
	private JLabel label5;
	private JTextField textField6;
	private JLabel label6;
	private JTextField textField7;
	private JLabel label7;
	private JButton button7;
	private JTextField textField8;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
