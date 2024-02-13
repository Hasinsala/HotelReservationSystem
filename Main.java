import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        singleRoom single=new singleRoom(50,1000);
        doubleRoom doubleR=new doubleRoom(50,2000);

        readMe consol=new readMe(single,doubleR,200,30,20);
        consol.calculate();
    }

}