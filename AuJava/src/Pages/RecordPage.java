package Pages;

import jComponents.MenuBar;

import java.util.Calendar;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.geom.Ellipse2D;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executor;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import jComponents.MenuBar;



public class RecordPage extends Page{

	

	//add date to filename to make them all different
	static Calendar cal = Calendar.getInstance();
	static Date timeNow = cal.getTime();
	static SimpleDateFormat ft = new SimpleDateFormat ("HH.mm.ss_dd:MM:yyyy");

	//end of date time now
	static String outputFilename = ft.format(timeNow) +"_AuJava"+".wav" ;


	SoundRecorder.Recorder rec = new SoundRecorder.Recorder(outputFilename);

	//to measure recording time, and give feedback to user that audio is beeing recorded
	long startTime = System.currentTimeMillis();


	private JTextField timerTextField;

	public RecordPage(){
		super("AuJava - Rec Page");


		MenuBar menuBar = new MenuBar("user");
		this.setJMenuBar(menuBar);

		JPanel recPanel = new JPanel();
		recPanel.setLayout(null);
		getContentPane().add(recPanel, BorderLayout.CENTER);
		getContentPane().add(recPanel);

		ImageIcon  recButtonIcon = new ImageIcon("img/rec.png");
		ImageIcon  stopButtonIcon = new ImageIcon("img/stop.png");

		JButton btnRec = new JButton(recButtonIcon);
		btnRec.setBounds(24, 90, 319, 281);
		recPanel.add(btnRec);

		JButton btnStop = new JButton(stopButtonIcon);
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnStop.setBounds(397, 90, 275, 281);
		recPanel.add(btnStop);
		System.out.println("rec");

		btnRec.setEnabled(true);
		btnStop.setEnabled(false);

		timerTextField = new JTextField();
		timerTextField.setBounds(306, 393, 134, 28);
		recPanel.add(timerTextField);
		timerTextField.setEditable(false);
		timerTextField.setColumns(10);

		


		ActionListener actListner = new ActionListener() {
			@Override

			public void actionPerformed(ActionEvent event) {

				long elapsedTime = System.currentTimeMillis() - startTime;
				
				long elapsedSeconds = elapsedTime / 1000;
				long elapsedMinutes = elapsedSeconds / 60;
				timerTextField.setText(Long.toString(elapsedMinutes)+":"+Long.toString(elapsedSeconds));
				
				System.out.print("Inside actListner action listener for timer  \t");
				System.out.println(Long.toString(elapsedMinutes)+":"+Long.toString(elapsedSeconds));
			}

		};

		Timer timer = new Timer(500, actListner);


		btnRec.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnRec.setEnabled(false);
				btnStop.setEnabled(true);
				rec.startRecording();
				
				timer.start();

			}
		});


		btnStop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnRec.setEnabled(true);
				btnStop.setEnabled(false);
				rec.stopRecording();
				
				 timer.stop();
			}

		});
	}//constructor




}
