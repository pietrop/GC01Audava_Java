/**
 * 
 */
package SoundRecorder;

/**
 * @author Pietro
 *
 * @version 18 Nov 2014 
 * @time 16:51:37
 */
public class ThreadTest extends Thread{
	public static boolean condition = false;
	/**
	 * @param args
	 */
	
	public void run(){
		while (condition) {
		try{
			System.out.println(" print from the thread ");
			
		}catch( Exception e ){
			e.printStackTrace();
			
		}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" print from main");
		condition = true;
		ThreadTest t = new ThreadTest();
		
		System.out.println(t);
		}

}
