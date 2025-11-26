package ex2;

public class Calculatrice {
    private IAddition addService;

    public Calculatrice(IAddition addService) {
        this.addService = addService;
    }

    public int calcSomme(int num1, int num2) {
        System.out.println("**--- CalcService calc executed ---**");
        return addService.add(num1, num2);
    }
}
