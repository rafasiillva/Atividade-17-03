public class Pessoa {
    short idade = 135; // 16 bits
    char letraInicial = 'H'; // 16 bits
    float peso = 85.8f; // 32 bits


    public void informacoes(){
        System.out.println(" - - - INFORMAÇÕES - - - ");
        System.out.println("Nome:" + letraInicial+"enrique");
        System.out.println("Idade:" + idade + " anos");
        System.out.println("Peso: " + peso + " Kg");
    }
    
}