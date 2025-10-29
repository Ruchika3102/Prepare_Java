//invite people in party in single or pair
public class InvitePeopleInParty {
    public static void main(String[] args) {
        int n = 3; // number of people
        System.out.println(invitePeople(n));
    }

    private static int invitePeople(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1; // only one way to invite 0 or 1 person
        }

        // person stays single
        int singleWays = invitePeople(n - 1);
        // person pairs up
        int pairWays = (n - 1) * invitePeople(n - 2);

        return singleWays + pairWays;
    }
}
