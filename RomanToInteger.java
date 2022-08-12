/*
 * For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.
 */
package practice;

public class RomanToInteger{
	    public static int romanToInt(String s) {
	        int num = 0;
	        boolean stop = false;
	        int n = s.length();
	        System.out.println(n);
	        for(int i=0; i < n;i++){
	            char c = s.charAt(i);
	            System.out.println(c);
	            if(!stop){
	                switch(c){
	                    case 'I':
	                        if(i < n-1 && s.charAt(i+1) == 'V' ){
	                            num = num + 4;
	                            System.out.println(num+"iv");
	                            stop = true;
	                        }
	                        else if(i < n-1 && s.charAt(i+1) == 'X'){
	                            num = num + 9;
	                            System.out.println(num+"ix");
	                            stop = true;
	                        }
	                        else{num = num + 1;
                            System.out.println(num);}
	                        break;
	                    case 'X':
	                        if(i < n-1 && s.charAt(i+1) == 'L'){
	                            num = num + 40;
	                            System.out.println(num+"xl");
	                            stop = true;
	                        }
	                        else if(i < n-1 && s.charAt(i+1) == 'C'){
	                            num = num + 90;
	                            System.out.println(num+"xc");
	                            stop = true;
	                        }
	                        else{num = num + 10;System.out.println(num+"x");}
	                        break;
	                    case 'C':
	                        if(i < n-1 && s.charAt(i+1) == 'D'){
	                            num = num + 400;
	                            System.out.println(num+"cd");
	                            stop = true;
	                        }
	                        else if(i < n-1 && s.charAt(i+1) == 'M'){
	                            num = num + 900;
	                            System.out.println(num+"cm");
	                            stop = true;
	                        }
	                        else{num = num + 100;System.out.println(num+"c");}
	                        break;
	                    case 'V':
	                        num = num + 5;
	                        System.out.println(num+"v");
	                        break;
	                    case 'L':
	                        num = num + 50;
	                        System.out.println(num+"l");
	                        break;
	                    case 'D':
	                        num = num + 500;
	                        System.out.println(num+"d");
	                        break;
	                    case 'M':
	                        num = num + 1000;
	                        System.out.println(num+"m");
	                        break;
	                }
	            }else{
	                stop = false;
	            }
	            
	                
	        }
	        return num;
	            
	    }
	public static void main(String args[]) {
		try {
			int a = romanToInt("III");
			System.out.print(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}