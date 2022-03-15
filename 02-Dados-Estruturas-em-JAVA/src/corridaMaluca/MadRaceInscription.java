package corridaMaluca;

import java.util.*;

public class MadRaceInscription {
    public static void main(String[] args) {
        addParticipant();
    }


    private static ArrayList<HashMap> subscribe(HashMap<String, String> inscription){
        ArrayList<HashMap> enrolled = new ArrayList<HashMap>();
        enrolled.add(inscription);
        System.out.println(enrolled);
        return enrolled;
    }

    private static void addParticipant() {
        Scanner terminal = new Scanner(System.in);
        HashMap<String, String> participant = new HashMap<>();
        HashMap<String, String> participant2 = new HashMap<>();

        participant.put("name", "Renato");
        participant2.put("name", "Xablau");
//        participant.put("RG", "");
//        participant.put("lastName", "");
//        participant.put("age", "");
//        participant.put("phoneNumber", "");
//        participant.put("emergencyNumber", "");
//        participant.put("bloodType", "");
        int j = subscribe(null).size();
        String meuid2 = String.valueOf(j);
        participant2.put("id", meuid2);
        subscribe(participant2);

        System.out.println("Preencha os dados solicitados");
//        for (String data: participant.keySet()) {
//            System.out.println("Digite o " + data + " do participante:");
//            participant.put(data, terminal.next());
//        }
        int i = subscribe(null).size();
        String meuid = String.valueOf(i);
        participant.put("id", meuid);

        subscribe(participant);
    }
}
