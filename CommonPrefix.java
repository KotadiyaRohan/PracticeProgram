/*Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
*/
package practice;


class CommonPrefix{
	public static String longestCommonPrefix(String[] strs) {
		String smallest = strs[0];
        for(int i = 1; i < strs.length; i++){
            if(strs[i].length() < smallest.length()){
                smallest = strs[i];
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("");
        boolean stop = false;
        for(int j = 0; j < smallest.length(); j++) {
        	char c = smallest.charAt(j);
        	for(int k = 0; k < strs.length; k++) {
        		if(c == strs[k].charAt(j) ) {
        			continue;
        		}else {
        			stop = true;
        			break;
        		}
        	}
        	if(!stop) {
            	sb.append(c);
        	}
        }
       
        
        return sb.toString();
    }
	public static void main(String args[]) {
		String[] str = {"reflower","flow","flight"};
		System.out.println(longestCommonPrefix(str));
	}
}
