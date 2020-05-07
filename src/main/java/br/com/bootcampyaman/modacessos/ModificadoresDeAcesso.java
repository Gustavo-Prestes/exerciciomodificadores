package br.com.bootcampyaman.modacessos;

public class ModificadoresDeAcesso {
    public void bomDia(){
        System.out.println("Bom dia");
    }
    protected void boaTarde () {
        System.out.println("Boa Tarde");
    }
    private void boaNoite(){
        System.out.println("Boa Noite");
    }
    public void getPrivate(){
        this.boaNoite();
    }
}
