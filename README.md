# Amino_Acid_Builder


NOTE:  import Apached Commons Lang 3.7 here and add to Java Build Path, if needed:  https://commons.apache.org/proper/commons-lang/download_lang.cgi

Amino_Acid_Builder splits input DNA into 3 forward and 3 reverse frames. These frames are then fed into a series of switchs within the code that allows them to be translated into
amino acids/proteins. Using this code results in an output similar to what is listed below:

DNA Sequence: 
TCAGCGAGATGGGAAAGATCACCTTCTTCGAGGACCGAGGCTTCCAGGGC

DNA Sequence Frame 1: 
TCA GCG AGA TGG GAA AGA TCA CCT TCT TCG AGG ACC GAG GCT TCC AGG 
S   A   R   W   E   R   S   P   S   S   R   T   E   A   S   R    (Amino Acids Found In DNA Sequence Frame 1)

DNA Sequence Frame 2: 
CAG CGA GAT GGG AAA GAT CAC CTT CTT CGA GGA CCG AGG CTT CCA GGG 
Q   R   D   G   K   D   H   L   L   R   G   P   R   L   P   G    (Amino Acids Found In DNA Sequence Frame 2)

DNA Sequence Frame 3: 
AGC GAG ATG GGA AAG ATC ACC TTC TTC GAG GAC CGA GGC TTC CAG GGC 
S   E   M   G   K   I   T   F   F   E   D   R   G   F   Q   G    (Amino Acids Found In DNA Sequence Frame 3)


