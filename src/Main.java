public class Main {
    public static void main(String[] args) {
        Computer1 c1 = new Computer1(" Juan ", 500, 8, " Windows ");
        System.out.println("El nombre del PC es " + c1.getName() + " " + c1.getHardDisk() + " GB de disco duro " + c1.getRamMemory() + " GB de RAM " + " El Sistema Operativo es " + c1.getso());

        OperatingSystem os = new OperatingSystem(" Windows ", " 2.0 ", " 64 bits ", true, 20, 2);
        System.out.println( "El nombre del SO es " + os.getOsName() + " " + os.getOsVersion() + " " + os.getOsArchitecture() + " " + os.getOsSpaceRequirement() + " GB de disco duro " + os.getOsRamMemoryRequirement() + " GB de RAM ");

        Software sw1 = new Software(" Discord ", " 64 bits ", 2, 1);
        System.out.println("El Sw1 es" + sw1.getSoftwareName() + " " + sw1.getSoftwareVersion() + " " + sw1.getSoftwareSpaceRequirement() + " GB de disco duro " + sw1.getSoftwareRamMemoryRequierement() + " GB de RAM ");

        Software sw2 = new Software(" Skype ", " 64 bits ", 1, 1);
        System.out.println("El Sw2 es " + sw2.getSoftwareName() + " " + sw2.getSoftwareVersion() + " " + sw2.getSoftwareSpaceRequirement() + " GB de disco duro " + sw2.getSoftwareRamMemoryRequierement() + " GB de RAM ");
        //instalamos el SO
        System.out.println(" Procedemos a instalar el Sistema Operativo ");
        c1.installOs(os);
        //instalamos el Software 1
        System.out.println("Procedemos a instalar el programa número 1. " + "Actualmente hay un espacio en el disco de: " + c1.getHardDisk() + " y una RAM de " + c1.getRamMemory());
        if (c1.getHardDisk() >= os.getOsSpaceRequirement() && c1.getRamMemory() >= os.getOsRamMemoryRequirement()) {
            c1.getso().installsoftware(sw1);
            c1.setRamMemory(c1.getRamMemory() - sw1.getSoftwareRamMemoryRequierement());
            c1.setHardDisk(c1.getHardDisk() - sw1.getSoftwareSpaceRequirement());
            System.out.println("Se ha instalado correctamente." + " Actualmente hay un espacio en el disco de: " + c1.getHardDisk() + " y una RAM de " + c1.getRamMemory());

        } else {
            System.out.println("No hay suficiente espacio en el disco o no hay suficiente RAM");
        }
        //instalamos el Software 2
        System.out.println("Procedemos a instalar el programa número 2. " + "Actualmente hay un espacio en el disco de: " + c1.getHardDisk() + " y una RAM de " + c1.getRamMemory());
        if (c1.getHardDisk() >= os.getOsRamMemoryRequirement() && c1.getRamMemory() >= os.getOsRamMemoryRequirement()) {
            c1.getso().installsoftware(sw2);
            c1.setRamMemory(c1.getRamMemory() - sw2.getSoftwareRamMemoryRequierement());
            c1.setHardDisk(c1.getHardDisk() - sw2.getSoftwareSpaceRequirement());
            System.out.println("Se ha instalado el programa" + " Actualmente hay un espacio en el disco de: " + c1.getHardDisk() + " y una RAM de " + c1.getRamMemory());

        } else {
            System.out.println("No hay suficiente espacio en el disco o no hay suficiente RAM");
        }
        //desinstalamos el Software 1
        System.out.println("Procedemos a desinstalar el programa número 1" + " Actualmente hay un espacio en el disco de: " + c1.getHardDisk() + " y una RAM de " + c1.getRamMemory());
        c1.getso().uninstallsoftware(sw1);
        c1.setRamMemory(c1.getRamMemory() + sw1.getSoftwareRamMemoryRequierement());
        c1.setHardDisk(c1.getHardDisk() + sw1.getSoftwareSpaceRequirement());
        System.out.println("Software desinstalado correctamente" + " Actualmente hay un espacio en el disco de: " + c1.getHardDisk() + " y una RAM de " + c1.getRamMemory());
        //desinstalamos el Software 2
        System.out.println("Procedemos a desinstalar el programa número 2" + " Actualmente hay un espacio en el disco de: " + c1.getHardDisk() + " y una RAM de " + c1.getRamMemory());
        c1.getso().uninstallsoftware(sw2);
        c1.setRamMemory(c1.getRamMemory() + sw2.getSoftwareRamMemoryRequierement());
        c1.setHardDisk(c1.getHardDisk() + sw2.getSoftwareSpaceRequirement());
        System.out.println("Software desinstalado correctamente" + " Actualmente hay un espacio en el disco de: " + c1.getHardDisk() + " y una RAM de " + c1.getRamMemory());
        //formateamos el PC
        System.out.println("Procedemos a formatear el disco" + " Actualmente hay un espacio en el disco de: " + c1.getHardDisk() + " y una RAM de " + c1.getRamMemory());
        c1.format(os);
        System.out.println("se ha formateado el software" + " Actualmente hay un espacio en el disco de: " + c1.getHardDisk() + " y una RAM de " + c1.getRamMemory());
    }
}