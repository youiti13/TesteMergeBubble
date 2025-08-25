package controller;

import vitor.bubblesort.BubbleSort;
import vitor.mergesort.MergeSort;

public class Teste {

	public Teste() {
		
	}
	
	public void bubble(int [] vetor) {
		
		BubbleSort test = new BubbleSort();
		
		
		
		  test.bubbleSort(vetor);
		  System.out.print(" ");
	        for (int i = 0; i < vetor.length; i++) {
	            System.out.print(vetor[i]);
	            if (i < vetor.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println(" ");
	}
 
	 
	 public void merge(int[] vetor, int inicio, int fim) {
		 MergeSort test = new MergeSort();
		 
		 test.mergeSort(vetor, inicio, fim);
		 
		 System.out.print(" ");
	        for (int i = 0; i < vetor.length; i++) {
	            System.out.print(vetor[i]);
	            if (i < vetor.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println(" ");
	 }
	
}
