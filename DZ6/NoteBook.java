package DZ6;

public class NoteBook {
    private String Ram;
    private String HardDrive;
    private String Systems;
    private String Colour;
    
    public NoteBook(String Ram, String HardDrive, String Systems, String Colour) {
        this.Ram = Ram;
        this.HardDrive = HardDrive;
        this.Systems = Systems;
        this.Colour = Colour;
    }

    public String getRam() {
        return Ram;
    }

    public String getHardDrive() {
        return HardDrive;
    }

    public String getSystems() {
        return Systems;
    }

    public String getColour() {
        return Colour;
    }

    @Override
    public String toString() {
        return "\nОЗУ = " + Ram + ", Объем ЖД = " + HardDrive + ", ОС = "
                + Systems + ", Цвет = " + Colour + "";
    }
}
