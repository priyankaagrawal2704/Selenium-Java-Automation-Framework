package JavaPrograms;

public class Primenumberscount {
    public static void main(String[] args) {

        int primecount=0;
        for( int i=2; i<=1000;i++)
        {
            int factorscount=0;
            for (int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                  factorscount++;
                }
            }
            if(factorscount==2) {
                primecount++;       //print prime no count between 1 to 1000
                System.out.println(i);   //print prime no between 1 to 1000
                primecount=primecount+i;  //print prime no total between 1 to 1000
            }
        }
        System.out.println(primecount);
    }
}
