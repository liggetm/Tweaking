package tweaking;

public class Tweaking {

    public static void main(String[] args) {

//        final String sourceBicPath = "1.2.3.4 7/8/9";
//        final String deviceIp = StringUtils.split(sourceBicPath, ' ')[0];
//        final String[] bicPathComponents = StringUtils.split(sourceBicPath.substring(sourceBicPath.lastIndexOf(' ') + 1), '/');
//
//        final int shelfIdx = Integer.parseInt(bicPathComponents[0]);
//        final int slotIdx = Integer.parseInt(bicPathComponents[1]);
//        final int bicIdx = Integer.parseInt(bicPathComponents[2]);
//        
//        System.out.println("deviceIp = " + deviceIp);
//        System.out.println("shelf = " + shelfIdx);
//        System.out.println("slot = " + slotIdx);
//        System.out.println("bic = " + bicIdx);
        final String out = generateDolMuxPort("md:0/99", "L1");
        System.out.println("out = " + out);
        
    }
    
    private static String generateDolMuxPort(final String muxEquipment, final String muxPort) {
        final String santitizedEquipment = muxEquipment.substring(muxEquipment.indexOf(':'));
        return "port" + santitizedEquipment + "/0/" + muxPort;
    }

}
