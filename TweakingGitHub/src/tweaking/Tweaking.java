package tweaking;

public class Tweaking {

    public static void main(final String[] args) {
        final String in = "wpsport:1/2/L4A";
        final ProtectionSwitchEntity p = new ProtectionSwitchEntity(in);
        System.out.println("p.getShelfIdx = " + p.getShelfIdx());
        System.out.println("p.getSlotIdx = " + p.getSlotIdx());
        System.out.println("p.getPortIdx = " + p.getId());
        System.out.println("p.toString = " + p.toString());
        
        final String group = "wpsgroup:1/2/4";
        final ProtectionSwitchEntity g = new ProtectionSwitchEntity(group);
        System.out.println("g.getShelfIdx = " + g.getShelfIdx());
        System.out.println("g.getSlotIdx = " + g.getSlotIdx());
        System.out.println("g.getPortIdx = " + g.getId());
        System.out.println("g.toString = " + g.toString());
        
        final String portId = "L3B";
        System.out.println("out = " + portId.substring(1, 2));
    }
    

    private static class ProtectionSwitchEntity {

        private final int shelfIdx;
        private final int slotIdx;
        private final String id;

        public ProtectionSwitchEntity(final String fullPortName) {
            final String fullId = extractFullId(fullPortName);
            this.shelfIdx = Integer.parseInt(fullId.substring(0, fullId.indexOf('/')));
            this.slotIdx = Integer.parseInt(fullId.substring(fullId.indexOf('/') + 1, fullId.lastIndexOf('/')));
            this.id = fullId.substring(fullId.lastIndexOf('/') + 1);
        }
        
        private static String extractFullId(final String fullName) {
            return fullName.substring(fullName.indexOf(':') + 1);
        }

        public int getShelfIdx() {
            return shelfIdx;
        }

        public int getSlotIdx() {
            return slotIdx;
        }

        public String getId() {
            return id;
        }
        
        @Override
        public String toString() {
            return String.format("%d/%d/%s", shelfIdx, slotIdx, id);
        }

    }

}
