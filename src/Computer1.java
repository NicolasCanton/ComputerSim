public class Computer1 {
    private Object InstallOS = new Object();
    private String name;
    private int hardDisk;
    private int ramMemory;
    private OperatingSystem so;

    public Computer1(String name ,int hardDisk ,int ramMemory) {
        this.name = name;
        this.hardDisk = hardDisk;
        this.ramMemory = ramMemory;
        this.so = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }

    public int getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }

    public OperatingSystem getso() {
        return so;
    }

    public void setSo(OperatingSystem so) {
        this.so = so;
    }

    public void install(OperatingSystem os) {
        if (this.hardDisk >= os.getOsSpaceRequirement() && this.ramMemory >= os.getOsRamMemoryRequirement()) {
            this.hardDisk = this.hardDisk - os.getOsSpaceRequirement();
            this.ramMemory = this.ramMemory - os.getOsRamMemoryRequirement();
            this.setSo(os);
            System.out.println("Se ha instalado Windows correctamente. ");
        } else {
            System.out.println("No hay suficiente espacio. ");
        }
    }

    public void format(OperatingSystem os) {
        hardDisk += os.getOsSpaceRequirement();
        ramMemory += +os.getOsRamMemoryRequirement();
        so =null;
    }
}