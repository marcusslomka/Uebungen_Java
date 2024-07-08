public class Laptop {
    private String hersteller;
    private float cpuHz;
    private float ram;
    private int diskSpace;
    private float monitorSize;
    private float weight;
}
//getter
public String getHersteller() {
    return this.hersteller;
}
public float getCpuHz() {
    return this.cpuHz;
}
public float getRam() {
    return this.ram;
}
public int getDiskSpace() {
    return this.diskSpace;
}
public float getMonitorSize() {
    return this.monitorSize;
}

public float getWeight() {
    return this.weight;
}

//setter
public String setHersteller(String newHersteller) {
    this.hersteller = newHersteller;
}
public void setCpuHz(float newCpuHz) {
    this.cpuHz = newCpuHz;
}
public void setRam(float newRam) {
    this.ram = newRam;
}
public void set(int newDiskSpace) {
    this.diskSpace = newDiskSpace;
}
public void setMonitorSize(float newMonitorSize) {
    this.monitorSize = newMonitorSize;
}
public void setWeight(float newWeight) {
    this.weight = newWeight;
}