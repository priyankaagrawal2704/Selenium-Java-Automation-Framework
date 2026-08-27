package JavaPrograms;

public class NoofThe {
    public static void main(String[] args)
    {
        String text="A massive war of words has erupted in Telangana after Chief Minister A Revanth Reddy made controversial remarks about Bharat Rashtra Samithi (BRS) leaders over the state's irrigation crisis, prompting the opposition to accuse him of using inflammatory language instead of addressing farmers' concerns. The controversy unfolded when a journalist asked the Chief Minister how farmers would cope if drought-like conditions persisted and irrigation water remained unavailable for crops.";
        text = text.toLowerCase();
        String[] str= text.split("[^a-z]+");

        int count=0;
        for(String s:str)
        {
            if(s.equals("the"))
            {
                count++;
            }
        }
       System.out.print("COunt of the "+ count);





    }
}
