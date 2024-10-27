public class RemoveColoredPiece {
    public static boolean winnerOfGame(String colors) {
        boolean winner = false;

        if(colors.length() < 3){
            return winner;
        }

        boolean found = true;

        int turn = 0;

        while(found == true){

            boolean get = false;
        if(turn%2==0){
            for(int i=1;i<colors.length() - 1;i++){
                String str = colors.substring(i-1,i+2);
                if(str.equals("AAA")){
                    colors = colors.replaceFirst("AAA","AA");
                    found = true;
                    get = true;
                    break;
                }else{
                    // winner = false;
                    found = false;
                    // break;
                }
            }

            if(get == false){
                return false;
            }
        }

         if(turn%2!=0){
            for(int i=1;i<colors.length() - 1;i++){
                String str = colors.substring(i-1,i+2);
               if(str.equals("BBB")){
                        colors = colors.replaceFirst("BBB","BB");
                        found = true;
                        get = true;
                        break;
                }else{
                    // winner = true;
                    found = false;
                    // break;
                }
            }

            if(get == false){
                return true;
            }
        }

        turn++;
            }

            turn = turn - 1;

            if(turn%2 == 0){
                winner = true;
            }else{
                winner = false;
            }

            return winner;
        }
    public static void main(String[] args) {
        String color = "AAABABB";
        System.out.println(winnerOfGame(color));
    }
}
