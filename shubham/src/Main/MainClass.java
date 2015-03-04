package Main;

import assignment3.Athlete;
import assignment3.Track;

public class MainClass {
	
		static Track t = new Track();
		public static void main(String[] args){
				
		final Athlete a1 = new Athlete("Rajesh",1,3,20,4,25,12,3);
		final Athlete a2 = new Athlete("Shubham",2,4,22,5,22,11,2);
		final Athlete a3 = new Athlete("Suresh",2,3,21,4,20,12,3);
		final Athlete a4 = new Athlete("Nilesh",5,3,23,5,27,10,2);
		final Athlete a5 = new Athlete("Mahesh",2,5,26,3,21,16,8);
		final Athlete a6 = new Athlete("Nitesh",1,2,25,2,21,12,4);
		final Athlete a7 = new Athlete("Subodh",4,3,20,4,20,12,3);
		final Athlete a8 = new Athlete("Saransh",2,3,30,1,21,12,3);
		final Athlete a9 = new Athlete("Nantesh",2,6,30,1,25,11,3);
		final Athlete a10 = new Athlete("Dracula",3,6,20,4,20,12,3);

		Thread t1 =new Thread(a1);
		Thread t2 =new Thread(a2);
		Thread t3 =new Thread(a3);
		Thread t4 =new Thread(a4);
		Thread t5 =new Thread(a5);
		Thread t6 =new Thread(a6);
		Thread t7 =new Thread(a7);
		Thread t8 =new Thread(a8);
		Thread t9 =new Thread(a9);
		Thread t10 =new Thread(a10);
		
		
		System.out.println(" name " + "\t"+" id"+"\t"+" Leap Coverage"+"\t"+" Leap Frequency "+"\t"+" Stroke Coverage"+"\t"+" Stroke Frequency"+"\t"+" Pedal Frequency"+"\t"+" Bicycle coverage"+"\t");
		System.out.println( a1.name  + "\t"+ a1.ID +"\t\t"+ a1.leapCoverage+"\t\t" +a1.leapFrequency +"\t\t"+ a1.strokeCoverage +"\t\t\t"+a1.strokeFrequency+"\t\t\t"+ a1.pedalFrequency+"\t\t\t"+ a1.bicycleCoverage+"\t");
		System.out.println( a2.name  + "\t"+ a2.ID +"\t\t"+ a2.leapCoverage+"\t\t" +a2.leapFrequency +"\t\t"+ a2.strokeCoverage +"\t\t\t"+a2.strokeFrequency+"\t\t\t"+ a2.pedalFrequency+"\t\t\t"+ a2.bicycleCoverage+"\t");
		System.out.println( a3.name  + "\t"+ a3.ID +"\t\t"+ a3.leapCoverage+"\t\t" +a3.leapFrequency +"\t\t"+ a3.strokeCoverage +"\t\t\t"+a3.strokeFrequency+"\t\t\t"+ a3.pedalFrequency+"\t\t\t"+ a3.bicycleCoverage+"\t");
		System.out.println( a4.name  + "\t"+ a4.ID +"\t\t"+ a4.leapCoverage+"\t\t" +a4.leapFrequency +"\t\t"+ a4.strokeCoverage +"\t\t\t"+a4.strokeFrequency+"\t\t\t"+ a4.pedalFrequency+"\t\t\t"+ a4.bicycleCoverage+"\t");
		System.out.println( a5.name  + "\t"+ a5.ID +"\t\t"+ a5.leapCoverage+"\t\t" +a5.leapFrequency +"\t\t"+ a5.strokeCoverage +"\t\t\t"+a5.strokeFrequency+"\t\t\t"+ a5.pedalFrequency+"\t\t\t"+ a5.bicycleCoverage+"\t");
		System.out.println( a6.name  + "\t"+ a6.ID +"\t\t"+ a6.leapCoverage+"\t\t" +a6.leapFrequency +"\t\t"+ a6.strokeCoverage +"\t\t\t"+a6.strokeFrequency+"\t\t\t"+ a6.pedalFrequency+"\t\t\t"+ a6.bicycleCoverage+"\t");
		System.out.println( a7.name  + "\t"+ a7.ID +"\t\t"+ a7.leapCoverage+"\t\t" +a7.leapFrequency +"\t\t"+ a7.strokeCoverage +"\t\t\t"+a7.strokeFrequency+"\t\t\t"+ a7.pedalFrequency+"\t\t\t"+ a7.bicycleCoverage+"\t");
		System.out.println( a8.name  + "\t"+ a8.ID +"\t\t"+ a8.leapCoverage+"\t\t" +a8.leapFrequency +"\t\t"+ a8.strokeCoverage +"\t\t\t"+a8.strokeFrequency+"\t\t\t"+ a8.pedalFrequency+"\t\t\t"+ a8.bicycleCoverage+"\t");
		System.out.println( a9.name  + "\t"+ a9.ID +"\t\t"+ a9.leapCoverage+"\t\t" +a9.leapFrequency +"\t\t"+ a9.strokeCoverage +"\t\t\t"+a9.strokeFrequency+"\t\t\t"+ a9.pedalFrequency+"\t\t\t"+ a9.bicycleCoverage+"\t");
		System.out.println( a10.name  + "\t"+ a10.ID +"\t\t"+ a10.leapCoverage+"\t\t" +a10.leapFrequency +"\t\t"+ a10.strokeCoverage +"\t\t\t"+a10.strokeFrequency+"\t\t\t"+ a10.pedalFrequency+"\t\t\t"+ a10.bicycleCoverage+"\t");

		System.out.println("\n"+"RACE BEGINS:");
		System.out.println("\n"+"Running Length " +t.runLength + "ft");
	    System.out.println("Swimming Length "+t.swimLength + "ft");
	    System.out.println("Cycling Length " +t.cycleLength + "ft"+"\n");
	   
	    t1.start();
	    t2.start();
	    t3.start();
	    t4.start();
	    t5.start();
	    t6.start();
	    t7.start();
	    t8.start();
	    t9.start();
	    t10.start();
	   
	    try {
	            t1.join();
	            t2.join();
	            t3.join();
	            t4.join();
	            t5.join();
	            t6.join();
	            t7.join();
	            t8.join();
	            t9.join();
	            t10.join();
	            
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 ;    
	    
		
		

		
		
		
		
		
		}
	}

