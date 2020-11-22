package AtividadeArthur;

public class AppVistoria{
    
    public static void main(String[] args) {
        Pessoa Roger = new Pessoa("Roger",25,new Cpf("75598724090"));
        Esportivo Subaru = new Esportivo("Esportivo","Subaru STI","SBA 0482",350);
        Esportivo Nissan = new Esportivo("Esportivo","Nissan 400z","OEK 0395",250);
        Esportivo Lexus = new Esportivo("Esportivo","Altezza IS300","LMU 5923",160);
        Sedan Honda = new Sedan("Sedan","Civic","EPD 9304",100);
        Sedan Hyundai = new Sedan("Sedan","HB20","PKW 4026",80);
        Sedan Toyota = new Sedan("Sedan","Corola","HCR 8107",110);
        Vistoria Mecanica = new Vistoria(Roger,"Vistoria Mecanica");
        Mecanica.setCarroEsportivos(Subaru);
        Mecanica.setCarroEsportivos(Nissan);
        Mecanica.setCarroEsportivos(Lexus);
        Mecanica.setCarroSedans(Honda);
        Mecanica.setCarroSedans(Hyundai);
        Mecanica.setCarroSedans(Toyota);
        Recibo Recibo = new Recibo("21/09/2017",Mecanica);
        System.out.println(Recibo.toString());
        System.out.println(Mecanica.toString());
        
        for (Esportivo esportivo : Mecanica.getCarroEsportivos()) {
            System.out.println(esportivo.toString());
        }

        for (Sedan sedan : Mecanica.getCarroSedans()) {
            System.out.println(sedan.toString());
        }
    }

}