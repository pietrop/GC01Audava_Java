package Pages;

import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Timer;
import javax.swing.JTextField;

import AlbumHierarchy.AlbumOrTrack;
import AlbumHierarchy.Track;



public class RecordPage extends Page{

	//to measure recording time, and give feedback to user that audio is beeing recorded
	long startTime = System.currentTimeMillis();

	public static SoundRecorder.Recorder rec ;
	
	private JTextField timerTextField;
	
	private static Calendar cal;
	 private static Date timeNow ;
	private static SimpleDateFormat ft ;
	static String outputFilename;
	public static Track recordedTrack;

	public RecordPage(){
		

		ImageIcon  recButtonIcon = new ImageIcon("img/rec.png");
		ImageIcon  stopButtonIcon = new ImageIcon("img/stop.png");
		setLayout(null);

		JButton btnRec = new JButton(recButtonIcon);
		btnRec.setBounds(36, 58, 258, 260);
		add(btnRec);

		JButton btnStop = new JButton(stopButtonIcon);
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnStop.setBounds(365, 58, 258, 260);
		add(btnStop);


		btnRec.setEnabled(true);
		btnStop.setEnabled(false);

		timerTextField = new JTextField();
		timerTextField.setBounds(264, 414, 134, 28);
		add(timerTextField);
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
				
				//add date to filename to make them all different
				 Calendar cal = Calendar.getInstance();
				 Date timeNow = cal.getTime();
				 SimpleDateFormat ft = new SimpleDateFormat ("HH.mm.ss_dd:MM:yyyy");
				
				
				btnRec.setEnabled(false);
				btnStop.setEnabled(true);
				//end of date time now
				outputFilename = ft.format(timeNow) +"_AuJava"+".wav" ;
				
				rec = new SoundRecorder.Recorder(outputFilename);
				
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
				/* creating a track object with the audio file name constructor*/
				Track recordedTrack = new Track(outputFilename);
				System.out.println("--");
				System.out.println(recordedTrack.getTitle().toString());
				System.out.println(recordedTrack.getDescription().toString());
			}

		});
	}//constructor




}