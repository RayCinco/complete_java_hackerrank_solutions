//JAVA METHOD OVERRIDING
package Java47;
class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberofTeamMembers(){
        System.out.println("Each team has n players in " + getName());
    }
}
class Soccer extends Sports{
    @Override
    String getName() {
        return "Soccer Class";
    }

    @Override
    void getNumberofTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }
}
public class Java47 {
    public static void main(String[] args) {
        Sports sport = new Sports();
        System.out.println(sport.getName());
        sport.getNumberofTeamMembers();
        Soccer soccer = new Soccer();
        System.out.println(soccer.getName());
        soccer.getNumberofTeamMembers();
    }
}
