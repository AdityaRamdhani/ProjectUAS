public class linearSearch {
    public static void main(String[] args) {
        String[] kata = {"ADIT","DIT","DOT","DIDOT","SOPO","JARWO","JISO","TITI"};

        //System.out.println(linierSearch(intArray, -99));

        if(liniearSearch(kata,"DIDOT") != -1){
            System.out.println("Data ditemukan pada index ke " + liniearSearch(kata, "DIDOT"));
        } else{
            System.out.println("Data tidak ditemukan");
        }

    }

    public static int liniearSearch(String[] input, String value){
        for(int i=0; i < input.length; i++){
            if(input[i] == null ? value == null : input[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
}