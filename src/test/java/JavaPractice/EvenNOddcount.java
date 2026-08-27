package JavaPractice;

public class EvenNOddcount {

        public static void main(String[] args) {
            String s="123456";
            int count=0;
            int even=0;
            int odd=0;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)%2==0)
                {
                    even++;
                }
                else
                {
                    odd++;
                }

            }
            System.out.print("No of odd" +odd);
            System.out.print("No of even" +even);

        }
    }

