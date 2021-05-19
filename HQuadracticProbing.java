public class HQuadracticProbing {
    
}
/*
Input:
2
11 4
21 10 32 43
11 4
880 995 647 172 

Output:
10 -1 -1 32 -1 -1 -1 -1 43 -1 21
880 -1 -1 -1 -1 995 -1 172 -1 647 -1 

Explanation:
Testcase1: 21%11=10 so 21 goes into hashTable[10] position. 10%11=10. hashTable[10] is already filled so we try for (10+1)%11=0 position. hashTable[0] is empty so we put 10 there. 32%11=10. hashTable[10] is filled. We try (32+1)%11=0. But hashTable[0] is also already filled. We try (32+4)%11=3. hashTable[3] is empty so we put 32 in hashTable[3] position. 43 uses (43+9)%11=8. We put it in hashTable[8].

Testcase2: Using the similar approach as used in above explanation we will get the output like 880 -1 -1 -1 -1 995 -1 172 -1 647 -1 .
*/