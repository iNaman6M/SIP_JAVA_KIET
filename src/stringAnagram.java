import java.util.Scanner;
public class stringAnagram {

	    static boolean isAnagram(String a, String b) {
	        // Convert String to lowercase
	        a = a.toLowerCase();
	        b = b.toLowerCase();
	        
	        //check length
	        if(a.length() != b.length()){
	            return false;
	        }
	        
	        //initilising array
	            int arr[] = new int[26];
	            
	            //entering loop for a
	            for(int i = 0; i<a.length(); i++){
	                int index = a.charAt(i)-'a';
	                arr[index]++;
	            }
	            //entering loop for b
	            for(int i = 0; i<b.length(); i++){
	                int index = b.charAt(i)-'a';
	                arr[index]--;
	            }
	            //checking for anagram word by word
	                for(int i=0; i<=6; i++){
	                    if(arr[i] != 0){
	                        return false;
	                    }
	                }
	            return true;
	        
	    }

	    public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	}

