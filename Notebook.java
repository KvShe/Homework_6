package Homeworks.Homework_6;

/**
 * * 1 - ОЗУ
 * * 2 - Объем HHD или SSD
 * * 3 - Операционная система
 * * 4 - Цвет …
 */
public class Notebook {
    int ram;
    int hardDriveShaft;
    HardDisk hardDisk;
    OS os;
    Color color;

    public Notebook(int ram, int hardDriveShaft, HardDisk hardDisk, OS os, Color color) {
        this.ram = ram;
        this.hardDriveShaft = hardDriveShaft;
        this.hardDisk = hardDisk;
        this.os = os;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Notebook -> RAM: " + ram + ", hardDriveShaft: " + hardDriveShaft + ", hardDisk: " + hardDisk + ", os: " + os + ", color: " + color;
    }
}
