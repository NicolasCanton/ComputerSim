public class Main {
    public static void main(String[] args) {
        Computer1 c1 = new Computer1(" Juan ", 500, 8);
        System.out.println("El nombre del PC es " + c1.getName() + " " + c1.getHardDisk() + " GB de disco duro " + c1.getRamMemory() + " GB de RAM " + " El Sistema Operativo es " + c1.getso());

        OperatingSystem os = new OperatingSystem(" Windows ", " 2.0 ", " 64 bits ", true, 20, 2);
        System.out.println( "El nombre del SO es " + os.getOsName() + " " + os.getOsVersion() + " " + os.getOsArchitecture() + " " + os.getOsSpaceRequirement() + " GB de disco duro " + os.getOsRamMemoryRequirement() + " GB de RAM ");

        Software sw1 = new Software(" Discord ", " 64 bits ", 1, 1);
        System.out.println("El Sw1 es" + sw1.getSoftwareName() + " " + sw1.getSoftwareVersion() + " " + sw1.getSoftwareSpaceRequirement() + " GB de disco duro " + sw1.getSoftwareRamMemoryRequierement() + " GB de RAM ");

        Software sw2 = new Software(" Skype ", " 64 bits ", 1, 1);
        System.out.println("El Sw2 es " + sw2.getSoftwareName() + " " + sw2.getSoftwareVersion() + " " + sw2.getSoftwareSpaceRequirement() + " GB de disco duro " + sw2.getSoftwareRamMemoryRequierement() + " GB de RAM ");
        c1.install(os);
        System.out.println("Actualmente hay " + c1.getHardDisk() + " GB de disco duro y " + c1.getRamMemory() + " GB de RAM ");
        c1.getso().installsoftware(sw1,c1);
        c1.getso().installsoftware(sw2,c1);
        System.out.println("Se han instalado los programas " + " Actualmente hay un espacio en el disco de: " + c1.getHardDisk() + " y una RAM de " + c1.getRamMemory());
        c1.getso().uninstallsoftware(sw1, c1);
        c1.getso().uninstallsoftware(sw2, c1);
        System.out.println("Softwares desinstalados correctamente" + " Actualmente hay un espacio en el disco de: " + c1.getHardDisk() + " y una RAM de " + c1.getRamMemory());
        c1.format(os);
        System.out.println("se ha formateado el software" + " Actualmente hay un espacio en el disco de: " + c1.getHardDisk() + " y una RAM de " + c1.getRamMemory());
    }
}