public class Main {
    public static void main(String[] args) {
        Text text1 = new Text("abc123nd4gg56");
        System.out.println("Chuỗi ban đầu: " + text1.getText());

        text1.upperCaseChar();
        text1.reverse();

        System.out.println("\n");
        Text text2 = new Text("nguyen van thanh");
        System.out.println("Chuỗi ban đầu: " + text2.getText());
        text2.upperCaseFirstChars();

        System.out.println("\n");
        Text text3 = new Text("Hello e hH");
        System.out.println("Chuỗi ban đầu: " + text3.getText());
        text3.reverseCase();

        System.out.println("\n");
        Text text4 = new Text("34598A3");
        System.out.println("Chuỗi ban đầu: " + text4.getText());
        text4.sortCharDesc();

        System.out.println("\n");
        Text text5 = new Text("Nguyễn Văn Thành_A");
        System.out.println("Chuỗi ban đầu: " + text5.getText());
        text5.printWord();

        System.out.println("\n");
        Text text6 = new Text("  Nguyễn  V ăn   Thành_A_  ");
        System.out.println("Chuỗi ban đầu: " + text6.getText());
        text6.trimExtra();

        System.out.println("\n");
        Text text7 = new Text("Lap trinh huong doi tuong");
        System.out.println("Chuỗi ban đầu: " + text7.getText());
        text7.findBigWord();
    }
}