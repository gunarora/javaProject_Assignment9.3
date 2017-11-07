//Package Declaration is necessary
package javaProject_Assignment9;

/*Write a program to create a class HDTV with the properties:
• Brandname
• Size
Create Another class having an ArrayList and add 3 objects of HDTV into it.
Display HDTV objects in sorted order of size (Use Comparator) */

//including packages
import java.util.*;

public class HDTV {
	//properties declare 
	String Brandname;
	public String getBrandname() {
		return Brandname;
	}

	public void setBrandname(String brandname) {
		Brandname = brandname;
	}

	int Size;
	
	public int getSize() {
		return Size;
	}

	public void setSize(int size) {
		Size = size;
	}

	//declare parameterized constructor 
	public HDTV(String Brandname, int Size)
	{
		this.Brandname = Brandname;
		this.Size = Size;
	}
}


class DerivedHDTV implements Comparator<HDTV>
{
	   //implementing comparator
		@Override
		public int compare(HDTV o1, HDTV o2) {
			// TODO Auto-generated method stub
			//creating object of class
			 HDTV s1=(HDTV)o1;  
			 HDTV s2=(HDTV)o2; 
			
			 //logic applied
			 if(s1.Size==s2.Size)
			 {							   
				 return 0; 
			 }
			 else if(s1.Size>s2.Size) 
			 {
				 return 1;
			 }
			 else
			 {				 
				 return -1;
			 }
		}
	
	}


//call 
class CompratorUsed{	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//creating ArrayList and adding values
		ArrayList<HDTV> al = new ArrayList<HDTV>();
		al.add(new HDTV("Star Plus", 19));
		al.add(new HDTV("Star Sports", 29));
		al.add(new HDTV("Sony", 22));		 
		//printing values
	      System.out.println("\nSorted by Size");
	      //sorting collections
	      Collections.sort(al,new DerivedHDTV());  
	      @SuppressWarnings("rawtypes")
	      //Iterator
		Iterator itr2=al.iterator();  
	      //looping
	      while(itr2.hasNext()){  
	    	  HDTV st=(HDTV)itr2.next();  
	    	  //printing values
	    	  System.out.println(st.Size+" "+st.Brandname);  
	    	  } 
	}
	
}
