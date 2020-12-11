public class Computer {
    private Object InstallOS = new Object();
    private String name;
    private int hardDisk;
    private int ramMemory;
    private Object operativeSystem;

    public Computer(String name ,int hardDisk ,int ramMemory ,Object operativeSystem) {
        this.name = name;
        this.hardDisk = hardDisk;
        this.ramMemory = ramMemory;
        this.InstallOS = InstallOS;
        this.operativeSystem = null;
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

    public Object getOperativeSystem() {
        return operativeSystem;
    }

    public void setOperativeSystem(Object operativeSystem) {
        this.operativeSystem = operativeSystem;
    }

    public void install(OperatingSystem os) {

        if (this.operativeSystem != null && hardDisk < os.getOsSpaceRequirement() && ramMemory < os.getOsRamMemoryRequirement()) {
            hardDisk -= os.getOsSpaceRequirement();
            ramMemory -= os.getOsRamMemoryRequirement();
        } else {
            System.out.println("No hay suficiente espacio. ");
        }
    }
    public void format(OperatingSystem os) {
        hardDisk += os.getOsSpaceRequirement();
        ramMemory += +os.getOsRamMemoryRequirement();
        operativeSystem = null;
    }
}
