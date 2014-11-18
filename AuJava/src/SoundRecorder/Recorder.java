package SoundRecorder;
import javax.sound.sampled.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * from http://www.informit.com/guides/content.aspx?g=java&seqNum=375
 */
public class Recorder extends Thread{
	
	
	/**
	 * The TargetDataLine that we’ll use to read data from
	 */
	private TargetDataLine line;

	/**
	 * The audio format type that we’ll encode the audio data with
	 */
	private AudioFileFormat.Type targetType = AudioFileFormat.Type.WAVE;

	/**
	 * The AudioInputStream that we’ll read the audio data from
	 */
	private AudioInputStream inputStream;

	/**
	 * The file that we’re going to write data out to
	 */
	private File file;

	/**
	 * Creates a new Audio Recorder
	 */

	private boolean recording = false;

	long startTime;



	//constructor
	public Recorder(String outputFilename){

		{
			try
			{
				// Create an AudioFormat that specifies how the recording will be performed
				// In this example we’ll 44.1Khz, 16-bit, stereo
				AudioFormat audioFormat = new AudioFormat(
						AudioFormat.Encoding.PCM_SIGNED,    // Encoding technique
						44100.0F,                           // Sample Rate
						16,                                 // Number of bits in each channel
						2,                                  // Number of channels (2=stereo)
						4,                                  // Number of bytes in each frame
						44100.0F,                            // Number of frames per second
						false );                            // Big-endian (true) or little-
				// endian (false)

				// Create our TargetDataLine that will be used to read audio data by first 
				// creating a DataLine instance for our audio format type
				DataLine.Info info = new DataLine.Info( TargetDataLine.class, audioFormat );

				// Next we ask the AudioSystem to retrieve a line that matches the 
				// DataLine Info
				this.line = ( TargetDataLine )AudioSystem.getLine( info );

				// Open the TargetDataLine with the specified format
				this.line.open( audioFormat );

				// Create an AudioInputStream that we can use to read from the line
				this.inputStream = new AudioInputStream( this.line );

				// Create the output file
				this.file = new File( outputFilename );
			}
			catch( Exception e )
			{
				e.printStackTrace();
			}
		}
	}//end of constructor

	public void startRecording(){
		recording = true;
		// Start the TargetDataLine
		this.line.start();
		
		// Start our thread
		start();
		System.out.println("started recording");
		long startTime = System.currentTimeMillis();
		//		System.out.println(startTime);
		

	}

	public void stopRecording()
	{
		// Stop and close the TargetDataLine
		this.line.stop();
		this.line.close();
		System.out.println("Stoped recording button");
		recording = false;
		
	}
	
	public void writeAudio(){
		try {
			AudioSystem.write( this.inputStream, this.targetType, this.file );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			System.out.println("problem with writing audio");
			
		}
	}
	
	//this is a runnable method, to make a thread, for multitasking. 
	public void run(){
		while (recording) {
			try
			{
				// Ask the AudioSystem class to write audio data from the audio input stream
				// to our file in the specified data type (PCM 44.1Khz, 16-bit, stereo)
				writeAudio();
				
				System.out.println("thread recording running-writing file");
			
//				long estimatedTime = System.currentTimeMillis() - startTime;
				//			System.out.println(estimatedTime);	

			}
			catch( Exception e )
			{
//				e.printStackTrace();
				
			}

		}
	}

	//////////////////////
	//	public static void main( String[] args ){
	//		//add date to filename to make them all different
	//		Calendar cal = Calendar.getInstance();
	//		Date timeNow = cal.getTime();
	//		SimpleDateFormat ft = new SimpleDateFormat ("HH.mm.ss_dd:MM:yyyy");
	//
	//		//end of date time now
	//		String outputFilename = ft.format(timeNow) +"_AuJava"+".wav" ;
	//
	//
	//
	//		try{
	//			// Create a recorder that writes WAVE data to the specified filename
	//			Recorder r = new Recorder(outputFilename);
	//			System.out.println( "Press ENTER to start recording" );
	//			System.in.read();
	//
	//			// Start the recorder
	//			r.startRecording();
	//
	//			System.out.println( "Press ENTER to stop recording" );
	//			System.in.read();
	//
	//			// Stop the recorder
	//			r.stopRecording();
	//
	//			System.out.println( "Recording complete" );
	//		}
	//		catch( Exception e )
	//		{
	//			e.printStackTrace();
	//		}
	//	}
	//////////////////////
}