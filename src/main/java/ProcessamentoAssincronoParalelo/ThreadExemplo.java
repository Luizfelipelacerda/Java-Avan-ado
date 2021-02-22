package ProcessamentoAssincronoParalelo;

public class ThreadExemplo {
    public static void main(String[] args) {
/*
        Thread thread = new Thread(new BarraDeCarregamento2());
        Thread thread2 = new Thread(new BarraDeCarregamento3());

        thread.start();
        thread2.start();
        System.out.println("nome da thread: "+thread.getName());
        System.out.println("nome da thread2: "+thread2.getName());
*/

        GerarPDF iniciarGerarPDF = new GerarPDF();
        BarraDeCarregamento iniciarBarraDeCarregamento = new BarraDeCarregamento(iniciarGerarPDF);
        iniciarGerarPDF.start();
        iniciarBarraDeCarregamento.start();
    }
}

class GerarPDF extends Thread {
    @Override
    public void run(){
        try{
            System.out.println("Iniciar geração de PDF");
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("PDF Gerado");
    }
}

class BarraDeCarregamento extends Thread{
    private Thread iniciarGerarPDF;
    public BarraDeCarregamento(Thread iniciarGerarPDF) {
        this.iniciarGerarPDF = iniciarGerarPDF;
    }

    @Override
    public void run(){
        while(true) {
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            if(!iniciarGerarPDF.isAlive()){
                break;
            }
            System.out.println("Loading...");
        }
    }
}
class BarraDeCarregamento2 implements Runnable{
    @Override
    public void run(){
        try{
            Thread.sleep(3000);
            System.out.println("rodei : BarraDeCarregamento2");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class BarraDeCarregamento3 implements Runnable{
    @Override
    public void run(){
        try{
            Thread.sleep(1000);
            System.out.println("rodei : BarraDeCarregamento3");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}