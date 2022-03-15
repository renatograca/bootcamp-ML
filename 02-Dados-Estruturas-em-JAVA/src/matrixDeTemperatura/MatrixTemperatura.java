package matrixDeTemperatura;

public class MatrixTemperatura {
    public static void main(String[] args) {
        matrix();
    }

    private static int[][] temperature() {
        int[][] maxAndMinTemperatura = {
                {-2, 33},
                {-3, 32},
                {-8, 27},
                {4, 37},
                {6, 42},
                {5, 43},
                {0, 39},
                {-7, 26},
                {-1, 31},
                {-10, 35},
        };
        return maxAndMinTemperatura;
    }
    private static String[] citys() {
        return new String[]{
                "Londres",
                "Madrid",
                "Nueva York",
                "Buenos Aries",
                "Asunción",
                "São Paulo",
                "Lima",
                "Santiago de Chile",
                "Lisboa",
                "Tokio",
        };
    }
    private static void matrix() {
        maxTemperature();
        minTemperature();
    }

    private static void maxTemperature() {
        String[] city = citys();

        int[][] maxAndMinTemperatura = temperature();

        int min = 0;
        int indexMin = 0;
        for(int i = 0; i < city.length; i++) {
            if(min > maxAndMinTemperatura[i][0]) {
                min = maxAndMinTemperatura[i][0];
                indexMin = i;
            }
        }
        System.out.println("A temperatura baixa foi em " + city[indexMin] +
                ", com " + min +
                " C.");
    }

    private  static  void minTemperature(){
        String[] city = citys();

        int[][] maxAndMinTemperatura = temperature();

        int max = 0;
        int indexMax = 0;

        for(int i = 0; i < city.length; i++) {
            if(max < maxAndMinTemperatura[i][1]) {
                max = maxAndMinTemperatura[i][1];
                indexMax = i;
            }
        }
        System.out.println("A temperatura alta foi em " + city[indexMax] +
                ", com " + max +
                " C.");
    }
}
