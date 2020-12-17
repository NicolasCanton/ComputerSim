public class Software {
    private String softwareName;
    private String softwareVersion;
    private int softwareSpaceRequirement;
    private int softwareRamMemoryRequierement;

    public Software(String softwareName ,String softwareVersion ,int softwareSpaceRequirement ,int softwareRamMemoryRequierement) {
        this.softwareName = softwareName;
        this.softwareVersion = softwareVersion;
        this.softwareSpaceRequirement = softwareSpaceRequirement;
        this.softwareRamMemoryRequierement = softwareRamMemoryRequierement;
    }

    public String getSoftwareName() {
        return softwareName;
    }

    public void setSoftwareName(String softwareName) {
        this.softwareName =softwareName;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public int getSoftwareSpaceRequirement() {
        return softwareSpaceRequirement;
    }

    public void setSoftwareSpaceRequirement(int softwareSpaceRequirement) {
        this.softwareSpaceRequirement = softwareSpaceRequirement;
    }

    public int getSoftwareRamMemoryRequierement() {
        return softwareRamMemoryRequierement;
    }

    public void setSoftwareRamMemoryRequierement(int softwareRamMemoryRequierement) {
        this.softwareRamMemoryRequierement = softwareRamMemoryRequierement;
    }
}



