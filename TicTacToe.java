import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
//import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTacToe{

	private JFrame frmTictactoe;
	private JTextField cntofx;
	private JTextField cntofo;
	private int cntofx1=0;
	private int cntofo1=0;
	private String StartGame="X";
	private int b1=20;
	private int b2=20;
	private int b3=20;
	private int b4=20;
	private int b5=20;
	private int b6=20;
	private int b7=20;
	private int b8=20;
	private int b9=20;
	private int i=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
					window.frmTictactoe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TicTacToe() {
		initialize();
	}
	
	private void winner()
	{
	if(b1==1&&b2==1&&b3==1)
	{
		JOptionPane.showMessageDialog(frmTictactoe, "Hurray!!! X wins...(:","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		cntofx1++;
		cntofx.setText(String.valueOf(cntofx1));
	}
	else if(b4==1&&b5==1&&b6==1)
	{
		JOptionPane.showMessageDialog(frmTictactoe, "Hurray!!! X wins...(:","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		cntofx1++;
		cntofx.setText(String.valueOf(cntofx1));
	}
	else if(b7==1&&b8==1&&b9==1)
	{
		JOptionPane.showMessageDialog(frmTictactoe, "Hurray!!! X wins...(:","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		cntofx1++;
		cntofx.setText(String.valueOf(cntofx1));
	}
	else if(b1==1&&b4==1&&b7==1)
	{
		JOptionPane.showMessageDialog(frmTictactoe, "Hurray!!! X wins...(:","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		cntofx1++;
		cntofx.setText(String.valueOf(cntofx1));
	}
	else if(b2==1&&b5==1&&b8==1)
	{
		JOptionPane.showMessageDialog(frmTictactoe, "Hurray!!! X wins...(:","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		cntofx1++;
		cntofx.setText(String.valueOf(cntofx1));
	}
	else if(b3==1&&b6==1&&b9==1)
	{
		JOptionPane.showMessageDialog(frmTictactoe, "Hurray!!! X wins...(:","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		cntofx1++;
		cntofx.setText(String.valueOf(cntofx1));
	}
	else if(b1==1&&b5==1&&b9==1)
	{
		JOptionPane.showMessageDialog(frmTictactoe, "Hurray!!! X wins...(:","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		cntofx1++;
		cntofx.setText(String.valueOf(cntofx1));
	}
	else if(b3==1&&b5==1&&b7==1)
	{
		JOptionPane.showMessageDialog(frmTictactoe, "Hurray!!! X wins...(:","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		cntofx1++;
		cntofx.setText(String.valueOf(cntofx1));
	}
	
	
	
	else if(b1==0&&b2==0&&b3==0)
	{
		JOptionPane.showMessageDialog(frmTictactoe, "Hurray!!! O wins...(:","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		cntofo1++;
		cntofo.setText(String.valueOf(cntofo1));
	}
	else if(b4==0&&b5==0&&b6==0)
	{
		JOptionPane.showMessageDialog(frmTictactoe, "Hurray!!! O wins...(:","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		cntofo1++;
		cntofo.setText(String.valueOf(cntofo1));
	}
	else if(b7==0&&b8==0&&b9==0)
	{
		JOptionPane.showMessageDialog(frmTictactoe, "Hurray!!! O wins...(:","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		cntofo1++;
		cntofo.setText(String.valueOf(cntofo1));
	}
	else if(b1==0&&b4==0&&b7==0)
	{
		JOptionPane.showMessageDialog(frmTictactoe, "Hurray!!! O wins...(:","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		cntofo1++;
		cntofo.setText(String.valueOf(cntofo1));
	}
	else if(b2==0&&b5==0&&b8==0)
	{
		JOptionPane.showMessageDialog(frmTictactoe, "Hurray!!! O wins...(:","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		cntofo1++;
		cntofo.setText(String.valueOf(cntofo1));
	}
	else if(b3==0&&b6==0&&b9==0)
	{
		JOptionPane.showMessageDialog(frmTictactoe, "Hurray!!! O wins...(:","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		cntofo1++;
		cntofo.setText(String.valueOf(cntofo1));
	}
	else if(b1==0&&b5==0&&b9==0)
	{
		JOptionPane.showMessageDialog(frmTictactoe, "Hurray!!! O wins...(:","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		cntofo1++;
		cntofo.setText(String.valueOf(cntofo1));
	}
	else if(b3==0&&b5==0&&b7==0)
	{
		JOptionPane.showMessageDialog(frmTictactoe, "Hurray!!! O wins...(:","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		cntofo1++;
		cntofo.setText(String.valueOf(cntofo1));
	}
	
	else if(i==9)
	{
		JOptionPane.showMessageDialog(frmTictactoe, "No one wins!! ):","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
	
	}
		
		
		
		
		
	}
    
	private void Player()
	{
		if(StartGame.equalsIgnoreCase("X"))
		{
			StartGame="O";
		}
		else
		{
			StartGame="X";
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTictactoe = new JFrame();
		frmTictactoe.setFont(new Font("Arial", Font.BOLD, 18));
		frmTictactoe.setTitle("TicTacToe");
		frmTictactoe.setBounds(100, 100, 830, 522);
		frmTictactoe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTictactoe.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frmTictactoe.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 5, 2, 2));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btn1 = new JButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(StartGame);
				if(StartGame.equalsIgnoreCase("X"))
				{
					btn1.setForeground(Color.RED);
					b1=1;
					i++;
				}
				else
				{
					btn1.setForeground(Color.BLUE);
					b1=0;
					i++;
				}
				Player();
				winner();
			}
		});
		btn1.setForeground(new Color(0, 128, 192));
		btn1.setFont(new Font("Arial Black", Font.BOLD, 60));
		panel_1.add(btn1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JButton btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn2.setText(StartGame);
				if(StartGame.equalsIgnoreCase("X"))
				{
					btn2.setForeground(Color.RED);
					b2=1;
					i++;
				}
				else
				{
					btn2.setForeground(Color.BLUE);
					b2=0;
					i++;
				}
				Player();
				winner();
			}
		});
		btn2.setForeground(new Color(0, 128, 192));
		btn2.setFont(new Font("Arial Black", Font.BOLD, 60));
		panel_2.add(btn2, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JButton btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn3.setText(StartGame);
				if(StartGame.equalsIgnoreCase("X"))
				{
					btn3.setForeground(Color.RED);
					b3=1;
					i++;
				}
				else
				{
					btn3.setForeground(Color.BLUE);
					b3=0;
					i++;
				}
				Player();
				winner();
			}
		});
		btn3.setForeground(new Color(0, 128, 192));
		btn3.setFont(new Font("Arial Black", Font.BOLD, 60));
		panel_3.add(btn3, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("         X");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 25));
		panel_4.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		cntofx = new JTextField();
		cntofx.setHorizontalAlignment(SwingConstants.CENTER);
		cntofx.setFont(new Font("Arial Black", Font.BOLD, 30));
		cntofx.setText("0");
		panel_5.add(cntofx, BorderLayout.CENTER);
		cntofx.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JButton btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn4.setText(StartGame);
				if(StartGame.equalsIgnoreCase("X"))
				{
					btn4.setForeground(Color.RED);
					b4=1;
					i++;
				}
				else
				{
					btn4.setForeground(Color.BLUE);
					b4=0;
					i++;
				}
				Player();
				winner();
			}
		});
		btn4.setFont(new Font("Arial Black", Font.BOLD, 60));
		panel_6.add(btn4, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JButton btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn5.setText(StartGame);
				if(StartGame.equalsIgnoreCase("X"))
				{
					btn5.setForeground(Color.RED);
					b5=1;
					i++;
				}
				else
				{
					btn5.setForeground(Color.BLUE);
					b5=0;
					i++;
				}
				Player();
				winner();
			}
		});
		btn5.setFont(new Font("Arial Black", Font.BOLD, 60));
		panel_7.add(btn5, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JButton btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn6.setText(StartGame);
				if(StartGame.equalsIgnoreCase("X"))
				{
					btn6.setForeground(Color.RED);
					b6=1;
					i++;
				}
				else
				{
					btn6.setForeground(Color.BLUE);
					b6=0;
					i++;
				}
				Player();
				winner();
			}
		});
		btn6.setForeground(new Color(0, 128, 192));
		btn6.setFont(new Font("Arial Black", Font.BOLD, 60));
		panel_8.add(btn6, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("         O");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 25));
		panel_9.add(lblNewLabel_1, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		cntofo = new JTextField();
		cntofo.setHorizontalAlignment(SwingConstants.CENTER);
		cntofo.setFont(new Font("Arial Black", Font.BOLD, 30));
		cntofo.setText("0");
		panel_10.add(cntofo, BorderLayout.CENTER);
		cntofo.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JButton btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn7.setText(StartGame);
				if(StartGame.equalsIgnoreCase("X"))
				{
					btn7.setForeground(Color.RED);
					b7=1;
					i++;
				}
				else
				{
					btn7.setForeground(Color.BLUE);
					b7=0;
					i++;
				}
				Player();
				winner();
			}
		});
		btn7.setFont(new Font("Arial Black", Font.BOLD, 60));
		panel_11.add(btn7, BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JButton btn8 = new JButton("");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn8.setText(StartGame);
				if(StartGame.equalsIgnoreCase("X"))
				{
					btn8.setForeground(Color.RED);
					b8=1;
					i++;
				}
				else
				{
					btn8.setForeground(Color.BLUE);
					b8=0;
					i++;
				}
				Player();
				winner();
			}
		});
		btn8.setFont(new Font("Arial Black", Font.BOLD, 60));
		panel_12.add(btn8, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JButton btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn9.setText(StartGame);
				if(StartGame.equalsIgnoreCase("X"))
				{
					btn9.setForeground(Color.RED);
					b9=1;
					i++;
				}
				else
				{
					btn9.setForeground(Color.BLUE);
					b9=0;
					i++;
				}
				Player();
				winner();
			}
		});
		btn9.setFont(new Font("Arial Black", Font.BOLD, 60));
		panel_13.add(btn9, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JButton resetbtn = new JButton("RESET");
		resetbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(null);
				btn2.setText(null);
				btn3.setText(null);
				btn4.setText(null);
				btn5.setText(null);
				btn6.setText(null);
				btn7.setText(null);
				btn8.setText(null);
				btn9.setText(null);
				 b1=20;
				 b2=20;
				 b3=20;
				 b4=20;
				 b5=20;
				 b6=20;
				 b7=20;
				 b8=20;
				 b9=20;
				 i=0;
				
			}
		});
		resetbtn.setFont(new Font("Arial", Font.BOLD, 23));
		panel_14.add(resetbtn, BorderLayout.CENTER);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JButton exitbtn = new JButton("EXIT");
		exitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTictactoe=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frmTictactoe, "Do you really wish to exit?","Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		exitbtn.setFont(new Font("Arial", Font.BOLD, 23));
		panel_15.add(exitbtn, BorderLayout.CENTER);
	}

}
