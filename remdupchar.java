import java.util.*;
class remdupchar
{
    public static void main(String args[])
    {
	String s,ans="";
	char ch	;
	int l,i=0;
	Scanner sc=new Scanner(System.in);
        System.out.print("Enter any string: "); // Inputting the word
        s = sc.nextLine();
	l=s.length();
	s+=" ";			// *Adding extra space at the end because last character is compared with something else index out of bound error.
	ch=s.charAt(0);	// taking ch as first character
	while(i<l)
	{
		ans= ans+ ch;  // adding each individual character to the answer string or output string without repeated characters

		while(s.charAt(++i)==ch && i<l)
		{}
	ch=s.charAt(i);	// **to store the previously last character in ch
	}

	System.out.println("String after removing repeated characters : \n"+ans); // Printing the string without duplicate characters
	}
    }
