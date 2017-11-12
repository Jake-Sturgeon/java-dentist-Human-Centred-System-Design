package COM2002;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.DropMode;
import javax.swing.JDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class HealthcarePlanEditor extends JDialog {
	
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HealthcarePlanEditor frame = new HealthcarePlanEditor();
					frame.setModal(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HealthcarePlanEditor() {
		setTitle("Healthcare Plan Editor");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		NumberFormat integerNumberInstance = NumberFormat.getIntegerInstance();
		integerNumberInstance.setMaximumIntegerDigits(13);
		integerNumberInstance.setGroupingUsed(false);
		NumberFormat moneyNumberInstance = NumberFormat.getIntegerInstance();
		moneyNumberInstance.setMaximumIntegerDigits(13);
		moneyNumberInstance.setMinimumFractionDigits(2);
		moneyNumberInstance.setMaximumFractionDigits(2);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblPlanName = new JLabel("Plan Name:");
		GridBagConstraints gbc_lblPlanName = new GridBagConstraints();
		gbc_lblPlanName.anchor = GridBagConstraints.EAST;
		gbc_lblPlanName.insets = new Insets(0, 0, 5, 5);
		gbc_lblPlanName.gridx = 1;
		gbc_lblPlanName.gridy = 1;
		panel.add(lblPlanName, gbc_lblPlanName);
		
		JFormattedTextField planName = new JFormattedTextField();
		GridBagConstraints gbc_planName = new GridBagConstraints();
		gbc_planName.insets = new Insets(0, 0, 5, 5);
		gbc_planName.fill = GridBagConstraints.HORIZONTAL;
		gbc_planName.gridx = 2;
		gbc_planName.gridy = 1;
		panel.add(planName, gbc_planName);
		
		JLabel lblCost = new JLabel("Cost:");
		GridBagConstraints gbc_lblCost = new GridBagConstraints();
		gbc_lblCost.insets = new Insets(0, 0, 5, 5);
		gbc_lblCost.anchor = GridBagConstraints.EAST;
		gbc_lblCost.gridx = 1;
		gbc_lblCost.gridy = 3;
		panel.add(lblCost, gbc_lblCost);
		
		JFormattedTextField cost = new JFormattedTextField(moneyNumberInstance);
		cost.setColumns(10);
		GridBagConstraints gbc_cost = new GridBagConstraints();
		gbc_cost.anchor = GridBagConstraints.WEST;
		gbc_cost.insets = new Insets(0, 0, 5, 5);
		gbc_cost.gridx = 2;
		gbc_cost.gridy = 3;
		panel.add(cost, gbc_cost);
		
		JLabel lblCheckUp = new JLabel("Check Up:");
		GridBagConstraints gbc_lblCheckUp = new GridBagConstraints();
		gbc_lblCheckUp.insets = new Insets(0, 0, 5, 5);
		gbc_lblCheckUp.anchor = GridBagConstraints.EAST;
		gbc_lblCheckUp.gridx = 1;
		gbc_lblCheckUp.gridy = 5;
		panel.add(lblCheckUp, gbc_lblCheckUp);
		
		JFormattedTextField checkUp = new JFormattedTextField(integerNumberInstance);
		checkUp.setColumns(5);
		GridBagConstraints gbc_checkUp = new GridBagConstraints();
		gbc_checkUp.anchor = GridBagConstraints.WEST;
		gbc_checkUp.insets = new Insets(0, 0, 5, 5);
		gbc_checkUp.gridx = 2;
		gbc_checkUp.gridy = 5;
		panel.add(checkUp, gbc_checkUp);
		
		JLabel lblHygienevisit = new JLabel("Hygiene Visit:");
		GridBagConstraints gbc_lblHygienevisit = new GridBagConstraints();
		gbc_lblHygienevisit.insets = new Insets(0, 0, 5, 5);
		gbc_lblHygienevisit.anchor = GridBagConstraints.EAST;
		gbc_lblHygienevisit.gridx = 1;
		gbc_lblHygienevisit.gridy = 6;
		panel.add(lblHygienevisit, gbc_lblHygienevisit);
		
		JFormattedTextField hygieneVisit = new JFormattedTextField(integerNumberInstance);
		hygieneVisit.setColumns(5);
		GridBagConstraints gbc_hygieneVisit = new GridBagConstraints();
		gbc_hygieneVisit.anchor = GridBagConstraints.WEST;
		gbc_hygieneVisit.insets = new Insets(0, 0, 5, 5);
		gbc_hygieneVisit.gridx = 2;
		gbc_hygieneVisit.gridy = 6;
		panel.add(hygieneVisit, gbc_hygieneVisit);
		
		JLabel lblRepairWork = new JLabel("Repair Work:");
		GridBagConstraints gbc_lblRepairWork = new GridBagConstraints();
		gbc_lblRepairWork.insets = new Insets(0, 0, 5, 5);
		gbc_lblRepairWork.anchor = GridBagConstraints.EAST;
		gbc_lblRepairWork.gridx = 1;
		gbc_lblRepairWork.gridy = 7;
		panel.add(lblRepairWork, gbc_lblRepairWork);
		
		JFormattedTextField repairVisit = new JFormattedTextField(integerNumberInstance);
		repairVisit.setColumns(5);
		GridBagConstraints gbc_repairVisit = new GridBagConstraints();
		gbc_repairVisit.anchor = GridBagConstraints.WEST;
		gbc_repairVisit.insets = new Insets(0, 0, 5, 5);
		gbc_repairVisit.gridx = 2;
		gbc_repairVisit.gridy = 7;
		panel.add(repairVisit, gbc_repairVisit);
		
		GridBagConstraints gbc_frmtdtxtfldJjj = new GridBagConstraints();
		gbc_frmtdtxtfldJjj.insets = new Insets(0, 0, 0, 5);
		gbc_frmtdtxtfldJjj.fill = GridBagConstraints.HORIZONTAL;
		gbc_frmtdtxtfldJjj.gridx = 2;
		gbc_frmtdtxtfldJjj.gridy = 8;
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton doneButton = new JButton("Done");
		doneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	            Component[] components = panel.getComponents();
	            for (Component comp : components) {
	                // Cast comp to JComboBox / JTextField to get the values
	                if (comp instanceof JTextField) {
	                    JTextField textField = (JTextField) comp;
	                    JOptionPane.showMessageDialog(null,textField.getText());
	                }
	            }
			}
	        /**
			      try {
			          int testInt = Integer.parseInt(test.getText());
			      }
			      catch (Exception f)
			      {
			          JOptionPane.showMessageDialog(null,"Please Enter Correct Values");
			      }
			}
	         **/
		});
		panel_1.add(doneButton);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		panel_1.add(cancelButton);
	}

}
