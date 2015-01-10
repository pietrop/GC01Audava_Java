package Pages;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.Timer;

import sound.Recorder;
import AlbumHierarchy.Track;

/**
 * 
 * @author Pietro Passarelli
 *
 */
public class RecordPage extends Page{
	

	//to measure recording time, and give feedback to user that audio is beeing recorded
	long startTime = System.currentTimeMillis();

	public static Recorder rec ;
	
	private JTextField timerTextField;
	
	private static Calendar cal;
	private static Date timeNow ;
	private static SimpleDateFormat ft ;
	static String outputFilename;
//	

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
				Track.loadTracks();
				//add date to filename to make them all different
				 Calendar cal = Calendar.getInstance();
				 Date timeNow = cal.getTime();
				 SimpleDateFormat ft = new SimpleDateFormat ("HH.mm.ss_dd:MM:yyyy");
				
				
				btnRec.setEnabled(false);
				btnStop.setEnabled(true);
				//end of date time now
				outputFilename = ft.format(timeNow) +"_AuJava"+".wav" ;
//				String outputFilenameWithFilePath =  "audio/" + outputFilename ;
//				String outputFilenameWithFilePath =  "audio/" + RecordPage.recordedTrack.getPicFileLocation().toString() ;
				rec = new sound.Recorder(outputFilename);
				
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
				
				/* creating track page that takes the newly recorded track in as an argument*/
				 TrackPage trackCard = new TrackPage(recordedTrack);
				 /*adding track page to cards group*/
				 TrackView.cards.add(TrackView.TRACKPAGE, trackCard);
				 /*defining card layout var card layout from TrackView */
				 CardLayout cardLayout = (CardLayout) TrackView.cards.getLayout();
				 /*show/change to the newly created Track page*/
				 cardLayout.show( TrackView.cards, TrackView.TRACKPAGE);	
				 Track.saveTracks();
				 TrackSPage tracksCard = new TrackSPage(Track.getAllTracks());
				 TrackView.cards.add(TrackView.TRACKSPAGE, tracksCard);
//				 cardLayout.show( TrackView.cards, TrackView.TRACKSPAGE);
						
				 
//				 Track.saveTracks();
			}

		});
	}//constructor
}