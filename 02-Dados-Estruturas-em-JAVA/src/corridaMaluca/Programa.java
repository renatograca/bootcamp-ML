package corridaMaluca;

public class Programa {
    public static void main(String[] args) {
        MadRaceInscription madRaceInscription = new MadRaceInscription();
        madRaceInscription.addParticipant("Renato",25, Categoria.AVANCADA.name());
        madRaceInscription.addParticipant("Eliana",17, Categoria.MEDIA.name());
        madRaceInscription.addParticipant("Diogo",20, Categoria.PEQUENA.name());
        madRaceInscription.addParticipant("Patricia",17, Categoria.AVANCADA.name());

        System.out.println("     ------*****------     ");
        System.out.println("----   PARTICIPANTES   ----");
        System.out.println(madRaceInscription.getAllParticipants());

        System.out.println("     ------*****------     ");
        System.out.println("----   REMOCAO   ----");
        madRaceInscription.removeParticipant("Renato");
    }
}
