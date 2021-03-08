package towerofhanoi;

public class TowerOfHanoi {
    /**
     *
     * @param n = no. of discs
     * @param s = source
     * @param a = auxi (by using which we are shifting the nodes)
     * @param d = destination
     */
    public void towerOfHanoi(int n, char s, char a, char d){
        if(n>=1){
            towerOfHanoi(n-1, s, d, a);
            System.out.println(n + " " + s + " ====>" + d);
            towerOfHanoi(n-1, a, s, d);
        }
    }
}

//Execution class
class TowerOfHanoiMain{
    public static void main(String[] args) {
        TowerOfHanoi obj = new TowerOfHanoi();
        obj.towerOfHanoi(3,'a','b','c');
    }
}



