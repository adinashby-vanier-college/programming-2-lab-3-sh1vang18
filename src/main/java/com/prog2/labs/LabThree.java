package com.prog2.labs;
/**
 * @author adinashby
 *
 */
public class LabThree {

	/**
	 * Write your test code below in the main (optional).
	 *
	 */
	public static void main(String[] args) {
		
	}
	
	/**
	 * Please refer to the README file for question(s) description
	 */
	
	public static int[] rotateTheArray(int arraySize, int startingInteger) {

        int[] size = new int[arraySize];
        for(int i = 0; i < size.length; i++){ 
            arraySize -= 1 ;  
            size[arraySize] = startingInteger;
            startingInteger += 3;
        }

       for(int i = 0; i < size.length -1 ; i++){
                    
           if(i % 2 == 0){
              int temp = size[i];
              size[i] = size[i + 2];
              size[i +2]= temp;
                
             }
            
        }

		return size;
	}
	
	
	public static int jumpGame(int[] nums) {

        int [] input = nums;
        int goalIndex = input.length - 1;
        int jumps = 1;
        for (int i = 0; i < input.length; i++){  
            for (int j = 0; j <= input[i]; j++)
            if(input[i] + input[j] == goalIndex){   
                jumps++;              
            }
            break;
            
        }
		return jumps;
	}
}
