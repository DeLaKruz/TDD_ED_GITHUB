public class OperacionesTDD {
    public int sum(String n) {
            int j = 0;
            String finalComa = "";
            String[] subcadenas = n.split(",");
            int sumatorio = 0;
            int num = 0;

            while (j < n.length()) {
                finalComa = n.substring(j);
                j++;
            }
            if (finalComa.equalsIgnoreCase(",")){
                return -1;
            } else if (!n.isEmpty()){
                for (int i = 0; i < subcadenas.length; i++) {
                    sumatorio += Integer.parseInt(subcadenas[i]);
                    num = Integer.parseInt(subcadenas[i]);
                    if (num < 0){
                        return -1;
                    } else if (num > 1000){
                    sumatorio -= Integer.parseInt(subcadenas[i]);
                    System.out.println("Ignorar número más grande que 1000");
                }
                }
                return sumatorio;
            } else {
                return 0;
            }
        }
    }