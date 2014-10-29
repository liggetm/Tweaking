package tweaking;

import org.apache.commons.lang.StringUtils;

public class Tweaking {

    public static void main(String[] args) {

        final String sourceBicPath = "1.2.3.4 7/8/9";
        final String deviceIp = StringUtils.split(sourceBicPath, ' ')[0];
        final String[] bicPathComponents = StringUtils.split(sourceBicPath.substring(sourceBicPath.lastIndexOf(' ') + 1), '/');

        final int shelfIdx = Integer.parseInt(bicPathComponents[0]);
        final int slotIdx = Integer.parseInt(bicPathComponents[1]);
        final int bicIdx = Integer.parseInt(bicPathComponents[2]);
        
        System.out.println("deviceIp = " + deviceIp);
        System.out.println("shelf = " + shelfIdx);
        System.out.println("slot = " + slotIdx);
        System.out.println("bic = " + bicIdx);
    }

}
