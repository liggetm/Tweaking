package tweaking.templatePattern;

public abstract class AbstractTemplate {
    
    public void fixedAlgorithm() {
        firstMethod();
        templateMethod();
    }
    
    private void firstMethod() {
        System.out.println("Abstract first method running...");
    }
    
    abstract void templateMethod();
    
}
