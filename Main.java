
class Main
{
    public static void main(String[] args) 
    {
        CalculatorView view = new CalculatorView();
        Calculator calculator = new CalculatorLogic();
        CalculatorLogic logic = new CalculatorLogic();
        CalculatorService service = new CalculatorService(logic);
        CalculatorLoger loger = new CalculatorLoger();

        CalculatorController controller = new CalculatorController(view, calculator, service, loger);
        // Ключь на старт!
        controller.start();
    }
}
