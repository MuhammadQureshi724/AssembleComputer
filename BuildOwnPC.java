package AssembleComputer;

public class BuildOwnPC {
	public static void main(String[] args) {

        Sizes caseSize = new Sizes(9.06, 19.88, 18.90);
        Case myCase = new Case("CoolerMaster", caseSize, "Black");

        Motherboard myMB = new Motherboard("ASUS", "ROG STRIX B550-F", 4);

        Resolution res = new Resolution(1920, 1080);
        Monitors myMonitor = new Monitors("Dell", res, 24);

        PC myPC = new PC(myCase, myMB, myMonitor);

        System.out.println(myPC);
    }
}