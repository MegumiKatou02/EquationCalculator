package view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class EqualScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private int size;
	private JPanel contentPane;
	private JLabel answerNumX;
	private JLabel answerNumY;
	private JLabel answerNumZ;
	private JLabel answerNumT;
	private JLabel[] equalAns;
	private JLabel numX;
	private JLabel numY;
	private JLabel numZ;
	private JLabel numT;
	private double[] contains;
	private JPanel[] panelTotal;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	//private double[] contains;

	public EqualScreen(int size, double[] contains) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(EqualScreen.class.getResource("/image/math.png")));
		this.size = size;
		this.contains = contains;
		this.equalAns = new JLabel[10];
		this.panelTotal = new JPanel[10];
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(600, 100, 224, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel1 = new JPanel();
		panel1.setBounds(10, 11, 194, 52);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		JLabel answerX = new JLabel("x =");
		answerX.setBounds(0, 0, 55, 52);
		panel1.add(answerX);
		answerX.setHorizontalAlignment(SwingConstants.LEFT);
		answerX.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		numX = new JLabel("");
		numX.setHorizontalAlignment(SwingConstants.LEFT);
		numX.setFont(new Font("Tahoma", Font.PLAIN, 25));
		numX.setBounds(54, 0, 140, 52);
		panel1.add(numX);
		
		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(10, 74, 194, 52);
		contentPane.add(panel2);
		
		JLabel answerY = new JLabel("y =");
		answerY.setHorizontalAlignment(SwingConstants.LEFT);
		answerY.setFont(new Font("Tahoma", Font.PLAIN, 25));
		answerY.setBounds(0, 0, 55, 52);
		panel2.add(answerY);
		
		numY = new JLabel("");
		numY.setHorizontalAlignment(SwingConstants.LEFT);
		numY.setFont(new Font("Tahoma", Font.PLAIN, 25));
		numY.setBounds(54, 0, 140, 52);
		panel2.add(numY);
		
		panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBounds(10, 137, 194, 52);
		contentPane.add(panel3);
		
		JLabel answerZ = new JLabel("z =");
		answerZ.setHorizontalAlignment(SwingConstants.LEFT);
		answerZ.setFont(new Font("Tahoma", Font.PLAIN, 25));
		answerZ.setBounds(0, 0, 55, 52);
		panel3.add(answerZ);
		
		numZ = new JLabel("");
		numZ.setHorizontalAlignment(SwingConstants.LEFT);
		numZ.setFont(new Font("Tahoma", Font.PLAIN, 25));
		numZ.setBounds(54, 0, 140, 52);
		panel3.add(numZ);
		
		panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setBounds(10, 200, 194, 52);
		contentPane.add(panel4);
		
		JLabel answerT = new JLabel("t =");
		answerT.setHorizontalAlignment(SwingConstants.LEFT);
		answerT.setFont(new Font("Tahoma", Font.PLAIN, 25));
		answerT.setBounds(0, 0, 55, 52);
		panel4.add(answerT);
		
		numT = new JLabel("");
		numT.setHorizontalAlignment(SwingConstants.LEFT);
		numT.setFont(new Font("Tahoma", Font.PLAIN, 25));
		numT.setBounds(54, 0, 140, 52);
		panel4.add(numT);
		
		addEqualAns();
		AddPanelTotal();
		printEquals();
		
		setVisible(true);
	}

	public void addEqualAns() {
		this.equalAns[0] = this.numX;
		this.equalAns[1] = this.numY;
		this.equalAns[2] = this.numZ;
		this.equalAns[3] = this.numT;
	}
	
	public JLabel getAnswerNumX() {
		return answerNumX;
	}

	public void setAnswerNumX(JLabel answerNumX) {
		this.answerNumX = answerNumX;
	}

	public JLabel getAnswerNumY() {
		return answerNumY;
	}

	public void setAnswerNumY(JLabel answerNumY) {
		this.answerNumY = answerNumY;
	}

	public JLabel getAnswerNumZ() {
		return answerNumZ;
	}

	public void setAnswerNumZ(JLabel answerNumZ) {
		this.answerNumZ = answerNumZ;
	}

	public JLabel getAnswerNumT() {
		return answerNumT;
	}

	public void setAnswerNumT(JLabel answerNumT) {
		this.answerNumT = answerNumT;
	}

	public void printEquals() {
		for(int i = 0; i < this.size; i++) {
			this.panelTotal[i].setVisible(true);
			this.equalAns[i].setText(contains[i] + "");
		}
		for(int i = this.size; i <= 3; i++) {
			this.panelTotal[i].setVisible(false);
		}
	}
	
	public void AddPanelTotal() {
		this.panelTotal[0] = this.panel1;
		this.panelTotal[1] = this.panel2;
		this.panelTotal[2] = this.panel3;
		this.panelTotal[3] = this.panel4;
	}
}
