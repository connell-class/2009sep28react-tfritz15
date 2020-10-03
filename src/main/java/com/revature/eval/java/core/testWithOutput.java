package com.revature.eval.java.core;

import static org.junit.Assert.assertEquals;

import com.revature.eval.java.core.EvaluationService.AtbashCipher;

public class testWithOutput {
	public static void main(String[] args) {
		/*EvaluationService.RotationalCipher rotationalCipher = new EvaluationService.RotationalCipher(13);
		System.out.println("This character should be 'a': " + rotationalCipher.rotate("n"));
		
		rotationalCipher = new EvaluationService.RotationalCipher(5);
		System.out.println("This string should be TRL: " + rotationalCipher.rotate("OMG"));
		
		rotationalCipher = new EvaluationService.RotationalCipher(21);
		//assertEquals("Gzo'n zvo, Bmviyhv!", rotationalCipher.rotate("Let's eat, Grandma!"));
		System.out.println("This string should be Gzo'n, zvo Bmviyhv!: " + rotationalCipher.rotate("Let's, eat Grandma!"));*/
		
		/*EvaluationService evaluationService = new EvaluationService();
		//assertThat(evaluationService.calculateNthPrime(1), is(2)
		System.out.println("Number should be 13: " + evaluationService.calculateNthPrime(6));*/
		
		//assertEquals("nrmwy oldrm tob", EvaluationService.AtbashCipher.encode("mindblowingly"));
		AtbashCipher eval = new EvaluationService.AtbashCipher();
		//System.out.println("Should be nrmwy oldrm tob: " + eval.encode("mindblowingly") );
		
		//assertEquals("gvhgr mt123 gvhgr mt", EvaluationService.AtbashCipher.encode("Testing,1 2 3, testing."));
		//System.out.println("gvhgr mt123 gvhgr mt: " + eval.encode("Testing,1 2 3, testing.") );
		
		//assertEquals("exercism", EvaluationService.AtbashCipher.decode("vcvix rhn"));
		System.out.println("Should be exercism: " + eval.decode("vcvix rhn") );
		
	}

}
