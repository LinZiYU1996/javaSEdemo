package FunctionalProgram.TheClassLibrary.multipleInheritance;

public interface Carriage {

    public default String rock() {
        return "... from side to side";
    }

}
