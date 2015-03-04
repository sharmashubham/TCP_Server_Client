package assignment3;


public  class Athlete implements Runnable
{	
	public Thread athlete;
public String name ;
public int ID;
public int leapCoverage;
public int leapFrequency;
public int strokeCoverage;
public int strokeFrequency;
public int pedalFrequency ;
public int bicycleCoverage;


public Athlete(String name,int ID,int leapCoverage,int leapFrequency,int strokeCoverage,int strokeFrequency,int pedalFrequency,int bicycleCoverage){
 
	this.name =name;
	this.ID = ID;
	this.leapCoverage = leapCoverage;
	this.leapFrequency = leapFrequency;
	this.strokeFrequency = strokeFrequency;
	this.strokeCoverage = strokeCoverage;
	this.bicycleCoverage = bicycleCoverage;
	this.pedalFrequency = pedalFrequency;
   }


         Track t = new Track();
       
      public void run(){

    	  int sum = 0;
   		
   		int dis1 = leapCoverage * leapFrequency ;
   	    int	temp1 = dis1;
         int run1 = 0;
   	    while(dis1<=t.runLength)
   		{
   	      run1 = run1 +1 ;
   		  dis1 = dis1 + temp1;
   		  sum = sum+1;
          }

   	    int dis2 = strokeFrequency * strokeCoverage;
   	    int	temp2 = dis2;
           
   	    int swim = 0;
   	    while(dis2<=t.swimLength){
   	    	dis2 = dis2+temp2;
   	    	sum=sum+1;
   	    	swim = swim +1;
   	    }

   	    
   	    int dis3 = pedalFrequency* bicycleCoverage;
   	    int temp3 = dis3;
   	    int cycle = 0;
   	    while(dis3 <= t.cycleLength){
   	    	dis3 = dis3+ temp3;
   	    	sum = sum+1;
   	    	cycle = cycle+1;
   	    }

           	     System.out.println("Running  time for "+name+" : "+run1);
		   	     System.out.println("Swimming time for "+name+" : "+ +swim);
		   	     System.out.println("Cycling time for "+name+" : " + cycle);
		   	     System.out.println(">>>>>TOTAL TIME FOR "+name+" <<<<<<: " + sum);
		   	     
		   	     
		   	  
      
   	}
      
     /*   public void start ()
	   {
	      if (athlete == null)
	      {
	         athlete = new Thread (this, name);
	         athlete.start ();
	      }
	   */

	

	
	}
         
    	       
      
         
	

