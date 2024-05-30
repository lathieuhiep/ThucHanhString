public class Text {
    private String text;

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    // viet hoa chu cai trong chuoi
    public void upperCaseChar() {
        String upperCaseChar = text.toUpperCase();

        System.out.println("Chuỗi viết hoa: " + upperCaseChar);
    }

    // chuoi dao nguoc
    public void reverse() {
        System.out.print("Chuỗi đảo ngược: ");

        for (int i = text.length() - 1; i >= 0 ; i--) {
            char characters = text.charAt(i);

            System.out.print(characters);
        }
    }

    // viet hoa chu cai dau cua chuoi
    public void upperCaseFirstChars() {
        String kq = "";

        for (int i = 0; i < text.length(); i++) {
            String characters = text.charAt(i) + "";

            if (i == 0 || text.charAt(i - 1) == ' ') {
                characters = characters.toUpperCase();
            }

            kq += characters;
        }

        System.out.println("Chuỗi in hoa đầu mỗi kí tự: " + kq);
    }

    // Đảo ngược ký tự hoa thường trong chuỗi
    public void reverseCase() {
        String kq = "";

        for (int i = 0; i < text.length(); i++) {
            String characters = text.charAt(i) + "";
            String newCharacters = characters.toUpperCase();

            if ( newCharacters.equals(characters) ) {
                newCharacters = characters.toLowerCase();
            }

            kq += newCharacters;
        }

        System.out.println("Chuỗi biến đổi hoa thường: " + kq);
    }

    // Sắp xếp và in ra các ký tự trong chuỗi theo mã ASCII giảm dần
    public void sortCharDesc() {
        String kq = "";

        while (!text.isEmpty()) {
            String minChars = findMinChars();
            kq += minChars;
        }

        System.out.println("Chuỗi tăng dần: " + kq);
    }

    private String findMinChars() {
        char min = text.charAt(0);
        String minChars = min + "";

        for (int i = 1; i < text.length(); i++) {
            char nam = text.charAt(i);

            if ( nam < min ) {
                minChars = nam + "";
                min = nam;
            } else if ( nam == min ) {
                minChars += nam;
            }
        }

        text = text.replace(min + "", "");
        return minChars;
    }

    // In ra từng từ trong chuỗi biết rằng mỗi từ được hiểu là cách nhau bằng dấu cách
    public void printWord() {
        String gioTu = "";

        System.out.print("Chuỗi tách từ bằng dấu cách: ");

        for (int i = 0; i < text.length(); i++) {
            char nam = text.charAt(i);

            if ( nam != ' ' ) {
                gioTu += nam;

                if ( i == text.length() - 1 ) {
                    System.out.print(gioTu);
                }

            } else if (!gioTu.isEmpty()) {
                System.out.print(gioTu + ", ");
                gioTu = "";
            }
        }
    }

    // Xóa các ký tự dấu cách thừa trong chuỗi
    public void trimExtra() {
        String chuoiMoi = "";
        text = text.trim();

        System.out.print("Chuỗi xóa các ký tự dấu cách thừa: ");

        for (int i = 0; i < text.length(); i++) {
            char nam = text.charAt(i);

            if ( i > 0 && nam == ' ' ) {
                char namTruoc = text.charAt(i - 1);

                if ( namTruoc != ' ' ) {
                    chuoiMoi += nam;
                }
            } else {
                chuoiMoi += nam;
            }
        }

        System.out.println(chuoiMoi);
    }

    // tìm và in ra từ có nhiều ký tự nhất trong chuỗi
    public void findBigWord() {
        String gioBigWord = "";
        String gioTu = "";
        int gioMax = 0;

        System.out.print("Từ có nhiều ký tự nhất trong chuỗi: ");

        text += " ";
        for (int i = 0; i < text.length(); i++) {
            char nam = text.charAt(i);

            if ( nam != ' ' ) {
                gioTu += nam;
            } else if (!gioTu.isEmpty()) {
                if ( gioTu.length() > gioMax ) {
                    gioBigWord = gioTu;
                    gioMax = gioTu.length();
                } else if (gioTu.length() == gioMax) {
                    gioBigWord += " ," + gioTu;
                }

                gioTu = "";
            }
        }

        System.out.println(gioBigWord);
    }

    // Xóa dấu tiếng việt có trong chuỗi
    public void delUnicode() {
        String UNICODE = "áàảãạăắằẳẵặâấầẩẫậéèẻẽẹêếềểễệíìỉĩịóòỏõọôốồổỗộơớờởỡợúùủũụưứừửữựýỳỷỹỵđ"
                + "ÁÀẢÃẠĂẮẰẲẴẶÂẤẦẨẪẬÉÈẺẼẸÊẾỀỂỄỆÍÌỈĨỊÓÒỎÕỌÔỐỒỔỖỘƠỚỜỞỠỢÚÙỦŨỤƯỨỪỬỮỰÝỲỶỸỴĐ";
        String NONUNICODE = "aaaaaaaaaaaaaaaaaeeeeeeeeeeeiiiiiooooooooooooooooouuuuuuuuuuuyyyyyd"
                + "AAAAAAAAAAAAAAAAAEEEEEEEEEEEIIIIIOOOOOOOOOOOOOOOOOUUUUUUUUUUUYYYYYD";
        String gioMoi = "";

        System.out.println("Chuỗi bỏ kí tự tiếng việt: ");

        for (int i = 0; i < text.length(); i++) {
            char nam = text.charAt(i);

            int index = UNICODE.indexOf(nam);

            if ( index >= 0 ) {
                gioMoi += NONUNICODE.charAt(index);
            } else {
                gioMoi += nam;
            }
        }

        System.out.println(gioMoi);
    }

    // tổng 2 chuỗi
    public void tinhTong(String soA, String soB) {
        String gioTong = "";
        String tongChuoiSo = "";
        int gioNho = 0;

        int doDaiSoA = soA.length() - 1;
        int doDaiSoB = soB.length() - 1;

        while (doDaiSoA >= 0 || doDaiSoB >= 0 || gioNho != 0 ) {
            int chuSoA = (doDaiSoA >= 0) ? soA.charAt(doDaiSoA) - 48 : 0;
            int chuSoB = (doDaiSoB >= 0) ? soB.charAt(doDaiSoB) - 48 : 0;

            int tongChuSo = chuSoA + chuSoB + gioNho;
            gioNho = tongChuSo / 10;
            gioTong += tongChuSo % 10;

            doDaiSoA--;
            doDaiSoB--;
        }

        for (int i = gioTong.length() -1; i >= 0; i--) {
            char nam = gioTong.charAt(i);

            tongChuoiSo += nam;
        }

        System.out.println("Tổng 2 chuỗi số " + soA + " và " + soB + " là: " + tongChuoiSo);
    }
}