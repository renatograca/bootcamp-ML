package corridaMaluca;

import java.util.*;

public class MadRaceInscription {

    private static int participantNumber = 0;
    private static List<Map> enrolled = new ArrayList<>();
    public MadRaceInscription() {

    }

    private static List<Map> subscribe(Map<String, String> inscription) {
        enrolled.add(inscription);
        return enrolled;
    }

    private static void valor(String categoria, int idade) {
        int DEZOITO = 18;
        if (idade < DEZOITO) {
            switch (categoria) {
                case "PEQUENA":
                    System.out.println("Valor da inscricao é de R$ 1.300,00");
                    break;
                default:
                    System.out.println("Valor da inscricao é de R$ 2.000,00");
                    break;
            }
        } else {
            switch (categoria) {
                case "PEQUENA":
                    System.out.println("Valor da inscricao é de R$ 1.500,00");
                    break;
                case "MEDIA":
                    System.out.println("Valor da inscricao é de R$ 2.300,00");
                default:
                    System.out.println("Valor da inscricao é de R$ 2.800,00");
                    break;
            }
        }
    }

    public void addParticipant(String nome, int idade, String categoria) {
        participantNumber++;
        Scanner terminal = new Scanner(System.in);
        Map<String, String> participant = new HashMap<>();
        int DEZOITO = 18;

        if (categoria == Categoria.AVANCADA.name() && idade < DEZOITO) {
            System.out.println(nome + " - Está categoria só é permitida para maiores de 18 anos!");
            System.out.println("--------------------");
        } else {
            participant.put("id", String.valueOf(participantNumber));
            participant.put("name", nome);
            participant.put("age", String.valueOf(idade));
            participant.put("Categoria", categoria);
            subscribe(participant);

            switch (categoria) {
                case "PEQUENA":
                    System.out.println(nome + " Fará " + Categoria.PEQUENA.getDescricao());
                    valor(categoria, idade);
                    System.out.println("--------------------");
                    break;
                case "MEDIA":
                    System.out.println(nome + " Fará " + Categoria.MEDIA.getDescricao());
                    valor(categoria, idade);
                    System.out.println("--------------------");
                    break;
                default:
                    System.out.println(nome + " Fará " + Categoria.AVANCADA.getDescricao());
                    valor(categoria, idade);
                    System.out.println("--------------------");
                    break;
            }
        }


//        participant.put("RG", "");
//        participant.put("lastName", "");
//        participant.put("phoneNumber", "");
//        participant.put("emergencyNumber", "");
//        participant.put("bloodType", "");

//        System.out.println("Preencha os dados solicitados");
//        for (String data: participant.keySet()) {
//            System.out.println("Digite o " + data + " do participante:");
//            participant.put(data, terminal.next());
//        }

    }

    public List<Map> getAllParticipants() {
        return enrolled;
    }

    public void removeParticipant(String nome) {
        System.out.println("-----");
        enrolled.removeIf(particitant -> particitant.containsValue(nome));

        System.out.println("-----");
        System.out.println(enrolled);
    }

}
