package algorithms;

public class GradientStudents {

	public static int[] breakingRecords(int[] scores) {
		
	
		
		Integer maxScore = scores[0], minScore = scores[0];
		Integer qtdMaxScore = 0, qtdMinScore = 0;
		
		for(int i = 0 ; i < scores.length ; i++) {
			
		
			
			if(scores[i] > maxScore) {
				maxScore = scores[i];
				qtdMaxScore++;
			}
			 if(minScore > scores[i]) {
				 minScore = scores[i];
				 qtdMinScore++;
			 }
		}
		
		int [] result = {qtdMaxScore,qtdMinScore};
	
	
		return result;

    }
	
	
	public static void main(String[] args) {
		

		int[] arr2 = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
		
		int[] arr3 = breakingRecords(arr2);
		
		for(int n : arr3)
			System.out.print(n+" ");

	}
}
