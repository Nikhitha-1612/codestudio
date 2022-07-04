//https://www.codingninjas.com/codestudio/problems/return-in-row-wave-form_893285
import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> rowWaveForm(ArrayList<ArrayList<Integer>> mat) {

		// Write your code here
        ArrayList<Integer> rowWaveForm = new ArrayList<>();
        for(int j=0;j<mat.size();j++){
            if(j%2==0){
                for(int i=0;i<mat.get(0).size();i++){
                    rowWaveForm.add(mat.get(j).get(i));
                }
            }
            else{
                for(int i=mat.get(0).size()-1;i>=0;i--){
                    rowWaveForm.add(mat.get(j).get(i));
                }
            }
        }
		return rowWaveForm;
	}
}
