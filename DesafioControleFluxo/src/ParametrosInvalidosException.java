public class ParametrosInvalidosException extends Exception{
private int numero1;
private int numero2;

public ParametrosInvalidosException(int numero1, int numero2){
    super();
    this.numero1 = numero1;
    this.numero2 = numero2;
}

    @Override
    public String getMessage() {
        return "ERRO , "+ numero1 +" não pode ser maior que " + numero2 +" !!";
    }

    @Override
    public String toString() {
        return "ERRO , "+ numero1 +" não pode ser maior que " + numero2 +" !!";
    }
}
