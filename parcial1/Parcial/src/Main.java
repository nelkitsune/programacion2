public class Main {
    public static void main(String[] args) {
        //creacion de objetos site
        Site site1 = new Site(2,"23/04/2023","12:23");
        Site site2 = new Site(3,"05/8/2022","12:23");

        //creacion de objetos Facilities
        Facilities facilities1 = new Facilities("Adulta","Mendoza","suipacha","Esgrima");
        Facilities facilities2 = new Facilities("adolecente","san juan","papalos","Tenis");

        //creacion de objetos prueba
        Test test1 = new Test(1,"prueba A");
        Test test2 = new Test(2,"prueba B");
        Test test3 = new Test(3,"prueba C");

        //creacion de objetos nacional team
        National_team nationalTeam1 = new National_team("rojo","Chad");
        National_team nationalTeam2=new National_team("azul","Principado de Sealand");

        //creacion de objetos atlete
        Athlete athlete1 = new Athlete(44140492,"federico",1.75,24,79);
        Athlete athlete6 = new Athlete(42412093,"antoni",1.50,23,55);
        Athlete athlete5 = new Athlete(341411224,"jose",1.60,22,79);
        Athlete athlete4 = new Athlete(44140495,"maria",1.80,25,100);
        Athlete athlete3 = new Athlete(42341496,"lourdes",1.85,21,85);
        Athlete athlete2 = new Athlete(4434497,"thadeo",1.75,22,79);
        Athlete athlete7 = new Athlete(4434497,"pamela",1.75,22,79);

        //vinculacion entre clases segun su relacion
        nationalTeam1.setPertenece(athlete1);
        nationalTeam1.setPertenece(athlete2);
        nationalTeam1.setPertenece(athlete3);
        nationalTeam2.setPertenece(athlete4);
        nationalTeam2.setPertenece(athlete5);
        nationalTeam2.setPertenece(athlete6);
        nationalTeam2.setPertenece(athlete7);


        test1.setParticipantes(athlete1);
        test1.setParticipantes(athlete2);
        test2.setParticipantes(athlete3);
        test2.setParticipantes(athlete4);
        test2.setParticipantes(athlete7);
        test3.setParticipantes(athlete5);
        test3.setParticipantes(athlete6);

        facilities1.setSeHace(test1);
        facilities1.setSeHace(test2);
        facilities2.setSeHace(test3);

        site1.setDonde(facilities1);
        site2.setDonde(facilities2);

        //Desde un objeto Instalacion
        System.out.println("Nombre del 3er atleta de la 2da prueba: " +facilities1.getSeHace().get(1).getParticipantes().get(2).getName());
        System.out.println("Código de la 2da prueba: "+facilities1.getSeHace().get(1).getCode());
        System.out.println("--------------");

        //Desde un objeto EquipoNacional
        for (int i = 0; i < nationalTeam1.getPertenece().size() ; i++) {
            System.out.println(nationalTeam1.getPertenece().get(i).toString());
            System.out.println("------------");
        }

        for (int i = 0; i < nationalTeam2.getPertenece().size() ; i++) {
            System.out.println(nationalTeam2.getPertenece().get(i).toString());
            System.out.println("------------");
        }

    }
}