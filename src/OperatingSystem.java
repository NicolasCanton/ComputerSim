import java.util.ArrayList;

public class OperatingSystem{
    private String osName;
    private String osVersion;
    private String osArchitecture;
    private boolean osOnlyCommand;
    private int osSpaceRequirement;
    private int osRamMemoryRequirement;
    private Software[] osSoftware;
    private ArrayList<Software> osSoftwares = new ArrayList<Software>();

    public OperatingSystem() {

    }

    public OperatingSystem(String osName ,String osVersion ,String osArchitecture ,boolean osOnlyCommand ,int osSpaceRequirement ,int osRamMemoryRequirement) {
        this.osName = osName;
        this.osVersion = osVersion;
        this.osArchitecture = osArchitecture;
        this.osOnlyCommand = osOnlyCommand;
        this.osSpaceRequirement = osSpaceRequirement;
        this.osRamMemoryRequirement = osRamMemoryRequirement;
    }

        public String getOsName () {
            return osName;
        }

        public void setOsName (String osName){
            this.osName = osName;
        }

        public String getOsVersion () {
            return osVersion;
        }

        public void setOsVersion (String osVersion){
            this.osVersion = osVersion;
        }

        public String getOsArchitecture () {
            return osArchitecture;
        }

        public void setOsArchitecture (String osArchitecture){
            this.osArchitecture = osArchitecture;
        }

        public boolean isOsOnlyCommand () {
            return osOnlyCommand;
        }

        public void setOsOnlyCommand ( boolean osOnlyCommand){
            this.osOnlyCommand = osOnlyCommand;
        }

        public int getOsSpaceRequirement () {
            return osSpaceRequirement;
        }

        public void setOsSpaceRequirement ( int osSpaceRequirement){
            this.osSpaceRequirement = osSpaceRequirement;
        }

        public int getOsRamMemoryRequirement () {
            return osRamMemoryRequirement;
        }

        public void setOsRamMemoryRequirement ( int osRamMemoryRequirement){
            this.osRamMemoryRequirement = osRamMemoryRequirement;
        }

        public Software[] getOsSoftware () {
            return osSoftware;
        }

        public void setOsSoftware (Software[]osSoftware){
            this.osSoftware = osSoftware;
        }

        public void installsoftware (Software sw ,Computer1 c1){
            if (c1.getHardDisk() >= sw.getSoftwareSpaceRequirement() && c1.getRamMemory() >= sw.getSoftwareRamMemoryRequierement()) {
                c1.setRamMemory(c1.getRamMemory() - sw.getSoftwareRamMemoryRequierement());
                c1.setHardDisk(c1.getHardDisk() - sw.getSoftwareSpaceRequirement());
                this.osSoftwares.add(sw);
            }else{
                System.out.println("No hay espacio para software");
            }
        }
        public void uninstallsoftware (Software sw ,Computer1 c1){
            c1.setRamMemory(c1.getRamMemory() + sw.getSoftwareRamMemoryRequierement());
            c1.setHardDisk(c1.getHardDisk() + sw.getSoftwareSpaceRequirement());
            this.osSoftwares.remove(sw);
        }
    }

