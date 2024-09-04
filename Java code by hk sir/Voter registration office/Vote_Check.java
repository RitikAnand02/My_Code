public class Vote_Check {
    public static void main(String[] args) {
        try {
            // Voter_registration_office.registerforvoting(25);
            Voter_registration_office.registerforvoting(16);
        } catch (IllegalAccessException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

}
