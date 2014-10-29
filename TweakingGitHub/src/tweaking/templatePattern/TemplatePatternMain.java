
package tweaking.templatePattern;

public class TemplatePatternMain {
    
    public static void main(String[] args) {
        final AbstractTemplate concrete1 = new ConcreteTemplate1();
        final AbstractTemplate concrete2 = new ConcreteTemplate2();
        concrete1.fixedAlgorithm();
        concrete2.fixedAlgorithm();
    }
    
}
