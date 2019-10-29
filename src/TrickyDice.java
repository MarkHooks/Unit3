public class TrickyDice {
    private static int randomroll(){
        return (int)(Math.random()*6)+1;
    }
    private static int trickyroll(){
        int percent = (int)(Math.random()*100)+1;
        if(percent >60)
            return 6;

        else if(percent>50 && percent<60)
            return 5;
        else if(percent > 30 && percent<50)
            return 4;
        else if (percent<30 && percent>20)
            return 3;
        else if(percent>10 && percent <20)
            return 2;
        else
            return 1;
    }
    public static void main(String[] args) {
        System.out.println(randomroll());
        System.out.println(trickyroll());
    }
}
