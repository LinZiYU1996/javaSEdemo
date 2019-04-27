package FunctionalProgram.TheClassLibrary.defaultMethod;

public interface Child extends Parent{

    @Override
    default void welcome() {
        message("Child HI");
    }
}
