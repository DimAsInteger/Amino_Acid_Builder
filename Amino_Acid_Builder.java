package Amino_Acid_Builder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.apache.commons.lang3.ArrayUtils;

public class Amino_Acid_Builder {
    public static void main(String args[]) throws FileNotFoundException {
 
        File importText = new File(""); //!!NOTE:  INSERT $FILEPATH to DNA_sequence.seq!!
        Scanner importSeq = new Scanner(importText);

        int lineNum = 1;
        	
        	while(importSeq.hasNextLine()){
        		String line = importSeq.nextLine();
        		System.out.println("DNA Sequence: \n" + line);
        		lineNum++;
        		
        		 	String frame1 = line;
        		 	String frame2 = line.substring(1);
        		 	String frame3 = line.substring(2);
        		 
        		 	String codons1 = frame1.replaceAll("\\s*(..[^ ])\\s*", "$1 ");
        		 	String codons2 = frame2.replaceAll("\\s*(..[^ ])\\s*", "$1 ");
        		 	String codons3 = frame3.replaceAll("\\s*(..[^ ])\\s*", "$1 ");

        		 	String [] felement1 = codons1.split(" ");
        		 	String [] f1 = ArrayUtils.remove(felement1, 16);
        		 	String [] felement2 = codons2.split(" ");
        		 	String [] f2 = ArrayUtils.remove(felement2, 16);
        		 	String [] f3 = codons3.split(" ");

        		System.out.println("\nDNA Sequence Frame 1: ");
        	 		for (int input = 0; input < f1.length; input++) {
        	 			System.out.print(f1[input] + " ");
        	 		}
        	 			System.out.print("\n");
        	 			
        		ascannerdarkly: for (int input = 0; input < f1.length; input++) {
        			    StringBuilder f1builder = new StringBuilder();
        			    
        			    switch (f1[input]) {
        			    
        			    case "GCT":
        			    case "GCC":
        			    case "GCA":
        			    case "GCG":
        			    	f1builder.append("A");
        			    break;
        			   
        			    case "CGT":
        			    case "CGC":
        			    case "CGA":
        			    case "CGG":
        			    case "AGA":
        			    case "AGG":
        			    	f1builder.append("R");
        			    break;

        			    case "AAT":
        			    case "AAC":
        			    	f1builder.append("N");
        			    break;
        			    
        			    case "GAT":
        			    case "GAC":
        			    	f1builder.append("D");
        			    break;
        			    
        			    case "TGT":
        			    case "TGC":
        			    	f1builder.append("C");
        			    break;
        			    
        			    case "CAA":
        			    case "CAG":
        			    	f1builder.append("Q");
        			    break;
        			    
        			    case "GAA":
        			    case "GAG":
        			    	f1builder.append("E");
        			    break;
        			    
        			    case "GGT":
        			    case "GGC":
        			    case "GGA":
        			    case "GGG":
        			    	f1builder.append("G");
        			    break;
        			    
        			    case "CAT":
        			    case "CAC":
        			    	f1builder.append("H");
        			    break;
        			    
        			    case "ATT":
        			    case "ATC":
        			    case "ATA":
        			    	f1builder.append("I");
        			    break;
        			    
        			    case "TTA":
        			    case "TTG":
        			    case "CTT":
        			    case "CTC":
        			    case "CTA":
        			    case "CTG":
        			    	f1builder.append("L");
        			    break;
        			    	
        			    case "AAA":
        			    case "AAG":
        			    	f1builder.append("K");
        			    break; 
        			    
        			    case "ATG":
        			    	f1builder.append("M");
        			    break;
        			    
        			    case "TTT":
        			    case "TTC":
        			    	f1builder.append("F");
        			    break; 

        			    case "CCT":
        			    case "CCC":
        			    case "CCA":
        			    case "CCG":

        			    	f1builder.append("P");
        			    break;

        			    case "TCT":
        			    case "TCC":
        			    case "TCA":
        			    case "TCG":
        			    case "AGT":
        			    case "AGC":
        			    	f1builder.append("S");
        			    break;
        			    
        			    case "ACT":
        			    case "ACC":
        			    case "ACA":
        			    case "ACG":
        			    	f1builder.append("T");
        			    break;
        			    
        			    case "TGG":
        			    	f1builder.append("W");
        			    break;
        			    
        			    case "TAT":
        			    case "TAC":
        			    	f1builder.append("Y");
        			    break;

        			    case "GTT":
        			    case "GTC":
        			    case "GTA":
        			    case "GTG":
        			    	f1builder.append("V");
        			    break;

        			    default:

        			    	break ascannerdarkly;
        			    }
        			    System.out.print(f1builder + "   ");
        			}
        			System.out.print(" (Amino Acids Found In DNA Sequence Frame 1)\n");
        			
        			
            	System.out.println("\nDNA Sequence Frame 2: ");
        		 	for (int input = 0; input < f2.length; input++) {
        		 		System.out.print(f2[input] + " ");
        		 	}
        		 		System.out.print("\n");
        			
        			ascannerclearly: for (int input = 0; input < f2.length; input++) {
        			    StringBuilder f2builder = new StringBuilder();
        			    
        			    switch (f2[input]) {
        			    case "GCT":
        			    case "GCC":
        			    case "GCA":
        			    case "GCG":
        			    	f2builder.append("A");
        			    break;
        			   
        			    case "CGT":
        			    case "CGC":
        			    case "CGA":
        			    case "CGG":
        			    case "AGA":
        			    case "AGG":
        			    	f2builder.append("R");
        			    break;

        			    case "AAT":
        			    case "AAC":
        			    	f2builder.append("N");
        			    break;
        			    
        			    case "GAT":
        			    case "GAC":
        			    	f2builder.append("D");
        			    break;
        			    
        			    case "TGT":
        			    case "TGC":
        			    	f2builder.append("C");
        			    break;
        			    
        			    case "CAA":
        			    case "CAG":
        			    	f2builder.append("Q");
        			    break;
        			    
        			    case "GAA":
        			    case "GAG":
        			    	f2builder.append("E");
        			    break;
        			    
        			    case "GGT":
        			    case "GGC":
        			    case "GGA":
        			    case "GGG":
        			    	f2builder.append("G");
        			    break;
        			    
        			    case "CAT":
        			    case "CAC":
        			    	f2builder.append("H");
        			    break;
        			    
        			    case "ATT":
        			    case "ATC":
        			    case "ATA":
        			    	f2builder.append("I");
        			    break;
        			    
        			    case "TTA":
        			    case "TTG":
        			    case "CTT":
        			    case "CTC":
        			    case "CTA":
        			    case "CTG":
        			    	f2builder.append("L");
        			    break;
        			    
        			    case "AAA":
        			    case "AAG":
        			    	f2builder.append("K");
        			    break; 
        			    
        			    case "ATG":
        			    	f2builder.append("M");
        			    break;
        			    
        			    case "TTT":
        			    case "TTC":
        			    	f2builder.append("F");
        			    break; 

        			    case "CCT":
        			    case "CCC":
        			    case "CCA":
        			    case "CCG":

        			    	f2builder.append("P");
        			    break;

        			    case "TCT":
        			    case "TCC":
        			    case "TCA":
        			    case "TCG":
        			    case "AGT":
        			    case "AGC":
        			    	f2builder.append("S");
        			    break;
        			    
        			    case "ACT":
        			    case "ACC":
        			    case "ACA":
        			    case "ACG":
        			    	f2builder.append("T");
        			    break;
        			    
        			    case "TGG":
        			    	f2builder.append("W");
        			    break;
        			    
        			    case "TAT":
        			    case "TAC":
        			    	f2builder.append("Y");
        			    break;

        			    case "GTT":
        			    case "GTC":
        			    case "GTA":
        			    case "GTG":
        			    	f2builder.append("V");
        			    break;

        			    	
        			    default:
        			    	
        			    	break ascannerclearly;
        			    }
        			    
        			    System.out.print(f2builder + "   ");
        			}
        			System.out.print(" (Amino Acids Found In DNA Sequence Frame 2)\n");
        	
        			
            System.out.println("\nDNA Sequence Frame 3: ");
        		 for (int input = 0; input < f3.length; input++) {
        		 	System.out.print(f3[input] + " ");
        		 }
        		 	System.out.print("\n");	
        			
        	ascannermurky: for (int input = 0; input < f3.length; input++) {
			    StringBuilder f3builder = new StringBuilder();
			    
			    switch (f3[input]) {
			    case "GCT":
			    case "GCC":
			    case "GCA":
			    case "GCG":
			    	f3builder.append("A");
			    break;
			   
			    case "CGT":
			    case "CGC":
			    case "CGA":
			    case "CGG":
			    case "AGA":
			    case "AGG":
			    	f3builder.append("R");
			    break;

			    case "AAT":
			    case "AAC":
			    	f3builder.append("N");
			    break;
			    
			    case "GAT":
			    case "GAC":
			    	f3builder.append("D");
			    break;
			    
			    case "TGT":
			    case "TGC":
			    	f3builder.append("C");
			    break;
			    
			    case "CAA":
			    case "CAG":
			    	f3builder.append("Q");
			    break;
			    
			    case "GAA":
			    case "GAG":
			    	f3builder.append("E");
			    break;
			    
			    case "GGT":
			    case "GGC":
			    case "GGA":
			    case "GGG":
			    	f3builder.append("G");
			    break;
			    
			    case "CAT":
			    case "CAC":
			    	f3builder.append("H");
			    break;
			    
			    case "ATT":
			    case "ATC":
			    case "ATA":
			    	f3builder.append("I");
			    break;
			    
			    case "TTA":
			    case "TTG":
			    case "CTT":
			    case "CTC":
			    case "CTA":
			    case "CTG":
			    	f3builder.append("L");
			    break;
			    
			    case "AAA":
			    case "AAG":
			    	f3builder.append("K");
			    break; 
			    
			    case "ATG":
			    	f3builder.append("M");
			    break;
			    
			    case "TTT":
			    case "TTC":
			    	f3builder.append("F");
			    break; 

			    case "CCT":
			    case "CCC":
			    case "CCA":
			    case "CCG":

			    	f3builder.append("P");
			    break;

			    case "TCT":
			    case "TCC":
			    case "TCA":
			    case "TCG":
			    case "AGT":
			    case "AGC":
			    	f3builder.append("S");
			    break;
			    
			    case "ACT":
			    case "ACC":
			    case "ACA":
			    case "ACG":
			    	f3builder.append("T");
			    break;
			    
			    case "TGG":
			    	f3builder.append("W");
			    break;
			    
			    case "TAT":
			    case "TAC":
			    	f3builder.append("Y");
			    break;

			    case "GTT":
			    case "GTC":
			    case "GTA":
			    case "GTG":
			    	f3builder.append("V");
			    break;

			    	
			    default:
			    	
			    	break ascannermurky;
			    }
			    
			    System.out.print(f3builder + "   ");
			}
			System.out.print(" (Amino Acids Found In DNA Sequence Frame 3)\n");
        }	
    }
}

/*References: 
 * www.tutorialspoint.com/java/java_arrays.htm
 * http://java67.blogspot.com/2012/11/how-to-read-file-in-java-using-scanner-example.html#ixzz3oxtRN3VS
 * http://java67.blogspot.com/2012/11/how-to-read-file-in-java-using-scanner-example.html
 * http://javadevnotes.com/java-split-string-into-arraylist-examples
 * stackoverflow.com/questions/6681704/how-to-remove-elements-from-an-array-in-java-even-if-we-have-to-iterate-over-arr
 * http://stackoverflow.com/questions/23522446/efficient-way-of-converting-rna-sequence-to-protein-in-java-and-arrayoutofbound
 */
