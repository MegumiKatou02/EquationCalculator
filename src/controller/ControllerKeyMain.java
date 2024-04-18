package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

import model.Equation;
import model.Invalid.InvalidError;
import view.EqualScreen;
import view.MainScreen;

public class ControllerKeyMain implements ActionListener{
	private MainScreen main;
	private Equation equation;
	
	public ControllerKeyMain(MainScreen main) {
		this.main = main;
		this.equation = new Equation();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.main.Method2.isSelected()) {
			this.main.defaultFrameInMethod2();
		}
		if(this.main.Method3.isSelected()) {
			this.main.frame3.setVisible(true);
			this.main.frame4.setVisible(false);
			for(int i = 0; i <= 3; i++) {
				for(int j = 0; j <= 4; j++) {
					if(j == 2) {
						this.main.someField[i][j].setVisible(true);
					}
					if(j == 3) {
						this.main.someField[i][j].setVisible(false);
					}
				}
			}
		}
		if(this.main.Method4.isSelected()) {
			this.main.frame3.setVisible(true);
			this.main.frame4.setVisible(true);
			for(int i = 0; i <= 3; i++) {
				for(int j = 0; j <= 4; j++) {
					if(j == 3 || j == 2) {
						this.main.someField[i][j].setVisible(true);
					}
				}
			}
		}
		
		if(this.main.calcuteButton == e.getSource()) {
			if(!CheckFieldCharacter()) {
				System.out.println("No");
			}
			else {
				System.out.println("Yes");
				TruyenMang();
				if(this.equation.SolveSystem()) {
					int count = 1;
					for(JToggleButton x : this.main.buttonMethod) {
						count++;
						if(x.isSelected()) {
							break;
						}
					}
					for(int i = 0; i < 2; i++) {
						for(int j = 0; j < 2 + 1; j++) {
							System.out.print(this.equation.getContains()[i] + " ");
						}
						System.out.println();
					}
					new EqualScreen(count, this.equation.getContains());
				}
				else {
					JOptionPane.showMessageDialog(this.main, "Hệ phương trình vô nghiệm hoặc vô số nghiệm !");
				}
				
			}
		}
	}
	// kiểm tra đồng bộ chữ số
	public boolean CheckFieldCharacter() {
		int rangeRow = 0;
		if(this.main.Method2.isSelected()) {
			rangeRow = 1;
		}
		if(this.main.Method3.isSelected()) {
			rangeRow = 2;
		}
		if(this.main.Method4.isSelected()) {
			rangeRow = 3;
		}
		final int boundCol = 3;
		for(int i = 0; i <= rangeRow; i++) {
			for(int j = 0; j <= 4; j++) {
				JTextField textField = this.main.someField[i][j];
				if(j >= rangeRow + 1 && j <= boundCol) {
					//System.out.println(i + " " + j);
					continue;
				}
				// calculate
				if(!InvalidCaseField(textField)) {
					return false;
				}
			}
		}
		return true;
	}
	//truyền mọi thứ vào Equation class
	public void TruyenMang() {
		if(this.main.Method2.isSelected()) {
			this.equation.setN(2);
		}
		else if(this.main.Method3.isSelected()) {
			this.equation.setN(3);
		}
		else if(this.main.Method4.isSelected()) {
			this.equation.setN(4);
		}
		int N = this.equation.getN();
		for(int i = 0; i < N; i++) {
			int jdx = N;
			for(int j = 0; j < N + 1; j++) {
				if(!this.main.someField[i][j].isVisible()) {
					jdx = j;
					break;
				}
				String query = this.main.someField[i][j].getText();
				int num = NumInQuery(query);
				this.equation.getArr()[i][j]  = num;
			}
			String ans = this.main.someField[i][4].getText();
			int num2 = NumInQuery(ans);
			this.equation.getArr()[i][jdx] = num2;
		}
	}
	
	public int NumInQuery(String query) {
		int num = 0;
		boolean checkSign = false;
		if(query.charAt(0) == '-') {
			checkSign = true;
			query = query.substring(1);
		}
		num = Integer.parseInt(query);
		if(checkSign) {
			num = -num;
		}
		return num;
	}
	
	public boolean InvalidCaseField(JTextField textField) {
		String query = textField.getText();
		if(query.isEmpty()) {
			return false;
		}
		if(query.length() >= 2) {
			if(query.charAt(0) == '-') {
				query = query.substring(1);
			}
		}
		return InvalidError.getInstance().isDigit(query);
	}
}	
