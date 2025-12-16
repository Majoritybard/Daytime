public class Main {
    public static void main(String[] args){
        Connection c = new Connection("timr-b.timefreq.bld.gov", 13);
        String serverTime = c.receive();
        System.out.println("Serverzeit: " + serverTime);
    }
}
