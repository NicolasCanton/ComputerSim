public class Main {
    public static void main(String[] args) {
        Computer1 c1 = new Computer1(" Juan ", 500, 8, " Windows ");
        System.out.println(c1.getName() + c1.getHardDisk() + c1.getRamMemory() + c1.getOperativeSystem());

        OperatingSystem os = new OperatingSystem(" Windows ", " 2.0 ", " 64 bits ", true, 20 , 2);
        System.out.println(os.getOsName() + "" + os.getOsVersion() + "" + os.getOsArchitecture() + "" + os.getOsSpaceRequirement() + "" + os.getOsRamMemoryRequirement());

        Software sw1 = new Software(" Discord ", " 64 bits ", 2 , 1);
        System.out.println(sw1.getSoftwareName() + "" + sw1.getSoftwareVersion() + "" + sw1.getSoftwareSpaceRequirement() + "" + sw1.getSoftwareRamMemoryRequierement());

        Software sw2 = new Software(" Skype ", " 64 bits ", 1 , 1);
        System.out.println(sw2.getSoftwareName() + "" + sw2.getSoftwareVersion() + "" + sw2.getSoftwareSpaceRequirement() + "" + sw2.getSoftwareRamMemoryRequierement());
        c1.installOs(os);
        c1.format(os);
        System.out.println("Queda "+c1.getHardDisk()+" GB de disco duro y queda "+c1.getRamMemory()+" GB de memoria RAM");
    }
}
