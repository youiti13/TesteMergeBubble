package view;


import controller.Teste;
public class Principal {

	public static void main (String[] Args) {
		
		int [] vetor = {74,20,74,87,81,16,25,99,44,58};
		int [] vetor2 = {44,43,42,41,40,39,38};
		int [] vetor3 = {101,102,103,125,124,123,104,105,106,122};
		
		System.out.println("Bubble");
		System.out.println("=================================");
		
		Teste testeBubble = new Teste();
		
		testeBubble.bubble(vetor);
		testeBubble.bubble(vetor2);
		testeBubble.bubble(vetor3);
		
		
		System.out.println("=================================");
		
		System.out.println("Merge"
				+ "");
		
		System.out.println("=================================");
		
		Teste testeMerge = new Teste();
		
		
		testeMerge.merge(vetor, 0, 9);
		testeMerge.merge(vetor2, 0, 6);
		testeMerge.merge(vetor3, 0, 9);
		
		System.out.println("=================================");
		
		
		
	
		
	
		
	}

}
