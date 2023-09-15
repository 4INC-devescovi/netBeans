package indirizzoIp;
public class IndirizzoIpMain {
    public static void main(String[] args) {
        String ind = "192.168.1.1";
        String subM = "255.255.128.0";
        IndirizzoIp ip = new IndirizzoIp(ind, subM);

        System.out.println("stampa:\n"+ ip.stampa());
        System.out.println("classe:\n" + ip.classe());
        System.out.println("prefixLength:\n" + ip.prefixLength());
        System.out.println("indRete:\n" + ip.rete());
        System.out.println("indBroadcast:\n" + ip.broadcast());
    }
    
}
