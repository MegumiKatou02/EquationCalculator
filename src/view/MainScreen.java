package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ControllerKeyMain;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class MainScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField xframe1;
	private JTextField zframe1;
	private JTextField ans1;
	private JTextField yframe1;
	private JTextField tframe1;
	private JTextField xframe2;
	private JTextField yframe2;
	private JTextField zframe2;
	private JTextField tframe2;
	private JTextField ans2;
	private JTextField xframe3;
	private JTextField xframe4;
	private JTextField yframe3;
	private JTextField yframe4;
	private JTextField zframe3;
	private JTextField zframe4;
	private JTextField tframe3;
	private JTextField tframe4;
	private JTextField ans3;
	private JTextField ans4;
	public JTextField someField[][];
	public JButton calcuteButton;
	public JToggleButton Method2;
	public JToggleButton Method3;
	public JToggleButton Method4;
	public JPanel frame4;
	public JPanel frame3;
	public JPanel frame2;
	public JPanel frame1;
	public ArrayList<JPanel> framePanel;
	public ArrayList<JToggleButton> buttonMethod;

	public MainScreen() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainScreen.class.getResource("/image/math.png")));
		this.framePanel = new ArrayList<JPanel>();
		this.someField = new JTextField[20][20];
		this.buttonMethod = new ArrayList<JToggleButton>();
		
		setTitle("Ứng dụng tính toán hệ phương trình");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 466, 294);
		contentPane.add(panel);
		panel.setBackground(Color.decode("#77B0AA"));
		panel.setLayout(null);
		
		frame1 = new JPanel();
		frame1.setBounds(10, 5, 442, 50);
		panel.add(frame1);
		frame1.setLayout(null);
		
		xframe1 = new JTextField();
		xframe1.setHorizontalAlignment(SwingConstants.CENTER);
		xframe1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		xframe1.setBounds(0, 0, 62, 50);
		frame1.add(xframe1);
		xframe1.setColumns(10);
		
		zframe1 = new JTextField();
		zframe1.setHorizontalAlignment(SwingConstants.CENTER);
		zframe1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		zframe1.setColumns(10);
		zframe1.setBounds(172, 0, 62, 50);
		frame1.add(zframe1);
		
		ans1 = new JTextField();
		ans1.setHorizontalAlignment(SwingConstants.CENTER);
		ans1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		ans1.setColumns(10);
		ans1.setBounds(363, 0, 78, 50);
		frame1.add(ans1);
		
		yframe1 = new JTextField();
		yframe1.setHorizontalAlignment(SwingConstants.CENTER);
		yframe1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		yframe1.setColumns(10);
		yframe1.setBounds(86, 0, 62, 50);
		frame1.add(yframe1);
		
		tframe1 = new JTextField();
		tframe1.setHorizontalAlignment(SwingConstants.CENTER);
		tframe1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		tframe1.setColumns(10);
		tframe1.setBounds(258, 0, 62, 50);
		frame1.add(tframe1);
		
		frame2 = new JPanel();
		frame2.setBounds(10, 66, 442, 50);
		panel.add(frame2);
		frame2.setLayout(null);
		
		xframe2 = new JTextField();
		xframe2.setHorizontalAlignment(SwingConstants.CENTER);
		xframe2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		xframe2.setColumns(10);
		xframe2.setBounds(0, 0, 62, 50);
		frame2.add(xframe2);
		
		yframe2 = new JTextField();
		yframe2.setHorizontalAlignment(SwingConstants.CENTER);
		yframe2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		yframe2.setColumns(10);
		yframe2.setBounds(87, 0, 62, 50);
		frame2.add(yframe2);
		
		zframe2 = new JTextField();
		zframe2.setHorizontalAlignment(SwingConstants.CENTER);
		zframe2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		zframe2.setColumns(10);
		zframe2.setBounds(172, 0, 62, 50);
		frame2.add(zframe2);
		
		tframe2 = new JTextField();
		tframe2.setHorizontalAlignment(SwingConstants.CENTER);
		tframe2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		tframe2.setColumns(10);
		tframe2.setBounds(259, 0, 62, 50);
		frame2.add(tframe2);
		
		ans2 = new JTextField();
		ans2.setHorizontalAlignment(SwingConstants.CENTER);
		ans2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		ans2.setColumns(10);
		ans2.setBounds(364, 0, 78, 50);
		frame2.add(ans2);
		
		frame3 = new JPanel();
		frame3.setBounds(10, 127, 442, 50);
		panel.add(frame3);
		frame3.setLayout(null);
		
		xframe3 = new JTextField();
		xframe3.setHorizontalAlignment(SwingConstants.CENTER);
		xframe3.setFont(new Font("Tahoma", Font.PLAIN, 26));
		xframe3.setColumns(10);
		xframe3.setBounds(0, 0, 62, 50);
		frame3.add(xframe3);
		
		yframe3 = new JTextField();
		yframe3.setHorizontalAlignment(SwingConstants.CENTER);
		yframe3.setFont(new Font("Tahoma", Font.PLAIN, 26));
		yframe3.setColumns(10);
		yframe3.setBounds(87, 0, 62, 50);
		frame3.add(yframe3);
		
		zframe3 = new JTextField();
		zframe3.setHorizontalAlignment(SwingConstants.CENTER);
		zframe3.setFont(new Font("Tahoma", Font.PLAIN, 26));
		zframe3.setColumns(10);
		zframe3.setBounds(174, 0, 62, 50);
		frame3.add(zframe3);
		
		tframe3 = new JTextField();
		tframe3.setHorizontalAlignment(SwingConstants.CENTER);
		tframe3.setFont(new Font("Tahoma", Font.PLAIN, 26));
		tframe3.setColumns(10);
		tframe3.setBounds(260, 0, 62, 50);
		frame3.add(tframe3);
		
		ans3 = new JTextField();
		ans3.setHorizontalAlignment(SwingConstants.CENTER);
		ans3.setFont(new Font("Tahoma", Font.PLAIN, 26));
		ans3.setColumns(10);
		ans3.setBounds(364, 0, 78, 50);
		frame3.add(ans3);
		
		frame4 = new JPanel();
		frame4.setBounds(10, 188, 442, 50);
		panel.add(frame4);
		frame4.setLayout(null);
		
		xframe4 = new JTextField();
		xframe4.setHorizontalAlignment(SwingConstants.CENTER);
		xframe4.setFont(new Font("Tahoma", Font.PLAIN, 26));
		xframe4.setColumns(10);
		xframe4.setBounds(0, 0, 62, 50);
		frame4.add(xframe4);
		
		yframe4 = new JTextField();
		yframe4.setHorizontalAlignment(SwingConstants.CENTER);
		yframe4.setFont(new Font("Tahoma", Font.PLAIN, 26));
		yframe4.setColumns(10);
		yframe4.setBounds(89, 0, 62, 50);
		frame4.add(yframe4);
		
		zframe4 = new JTextField();
		zframe4.setHorizontalAlignment(SwingConstants.CENTER);
		zframe4.setFont(new Font("Tahoma", Font.PLAIN, 26));
		zframe4.setColumns(10);
		zframe4.setBounds(176, 0, 62, 50);
		frame4.add(zframe4);
		
		tframe4 = new JTextField();
		tframe4.setHorizontalAlignment(SwingConstants.CENTER);
		tframe4.setFont(new Font("Tahoma", Font.PLAIN, 26));
		tframe4.setColumns(10);
		tframe4.setBounds(260, 0, 62, 50);
		frame4.add(tframe4);
		
		ans4 = new JTextField();
		ans4.setHorizontalAlignment(SwingConstants.CENTER);
		ans4.setFont(new Font("Tahoma", Font.PLAIN, 26));
		ans4.setColumns(10);
		ans4.setBounds(364, 0, 78, 50);
		frame4.add(ans4);
		
		ControllerKeyMain keyH = new ControllerKeyMain(this);
		
		Method2 = new JToggleButton("2 ẩn");
		Method2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Method2.setBounds(10, 251, 105, 34);
		Method2.setSelected(true);
		Method2.addActionListener(keyH);
		panel.add(Method2);
		
		Method3 = new JToggleButton("3 ẩn");
		Method3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Method3.setBounds(125, 251, 105, 34);
		Method3.addActionListener(keyH);
		panel.add(Method3);
		
		Method4 = new JToggleButton("4 ẩn");
		Method4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Method4.setBounds(240, 251, 105, 34);
		Method4.addActionListener(keyH);
		panel.add(Method4);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(Method2);
		buttonGroup.add(Method3);
		buttonGroup.add(Method4);
		
		calcuteButton = new JButton("Tính");
		calcuteButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		calcuteButton.setBounds(355, 249, 101, 34);
		calcuteButton.addActionListener(keyH);
		calcuteButton.setFocusable(false);
		calcuteButton.setBackground(Color.decode("#003C43"));
		calcuteButton.setForeground(Color.white);
		panel.add(calcuteButton);
		
		AddMethod();
		AddField();
		AddFramePanel();
		defaultFrameInMethod2();
		for(JToggleButton x : this.buttonMethod) {
			x.setBackground(Color.decode("#135D66"));
			x.setForeground(Color.white);
			x.addActionListener(keyH);
			x.setFocusable(false);
		}
		
		for(JPanel x : this.framePanel) {
			x.setBackground(Color.decode("#77B0AA"));
		}	
		
		setVisible(true);
	}
	
	public void AddField() {
		this.someField[0][0] = this.xframe1;
		this.someField[0][1] = this.yframe1;
		this.someField[0][2] = this.zframe1;
		this.someField[0][3] = this.tframe1;
		this.someField[0][4] = this.ans1;
		
		this.someField[1][0] = this.xframe2;
		this.someField[1][1] = this.yframe2;
		this.someField[1][2] = this.zframe2;
		this.someField[1][3] = this.tframe2;
		this.someField[1][4] = this.ans2;
		
		this.someField[2][0] = this.xframe3;
		this.someField[2][1] = this.yframe3;
		this.someField[2][2] = this.zframe3;
		this.someField[2][3] = this.tframe3;
		this.someField[2][4] = this.ans3;
		
		this.someField[3][0] = this.xframe4;
		this.someField[3][1] = this.yframe4;
		this.someField[3][2] = this.zframe4;
		this.someField[3][3] = this.tframe4;
		this.someField[3][4] = this.ans4;
		
	}
	
	public void AddFramePanel() {
		this.framePanel.add(frame1);
		this.framePanel.add(frame2);
		this.framePanel.add(frame3);
		this.framePanel.add(frame4);
	}

	public void AddMethod() {
		this.buttonMethod.add(Method2);
		this.buttonMethod.add(Method3);
		this.buttonMethod.add(Method4);
	}

	public void defaultFrameInMethod2() {
		frame3.setVisible(false);
		frame4.setVisible(false);
		for(int i = 0; i <= 3; i++) {
			for(int j = 0; j <= 4; j++) {
				if(j == 2 || j == 3) {
					this.someField[i][j].setVisible(false);
				}
			}
		}
	}
}
