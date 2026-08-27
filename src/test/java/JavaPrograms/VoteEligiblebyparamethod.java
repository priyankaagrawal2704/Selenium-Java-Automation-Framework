package JavaPrograms;

public class VoteEligiblebyparamethod {
    public static void checkvote(int age, char gender) {
        if (age >= 18 && gender == 'f') {
            System.out.println("Female: eligible to vote");
        } else if (age >= 21 && gender == 'm') {
            System.out.println("Male:eligible to vote");
        } else {
            System.out.println("not Eligible to vote");
        }
    }


    public static void main(String[] args) {
        checkvote(15, 'f');

    }
}

