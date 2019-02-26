public class ConditionalStatement {
    public static void main(String[] args) {
    int yourAge = 30;
    char yourSex = 'M';
    float yourHeight = 1.90f;
    char yourFirstNameLetter = 'Ю';


    if( yourAge > 20) {
        System.out.println("Ваш возраст больше 20");
    }

    if( yourSex == 'M') {
        System.out.println("Вы мужского пола");
    }

    if( yourSex == 'Ж') {
        System.out.println("Вы женского пола");
    }

    if( yourHeight < 1.80) {
        System.out.println("Вы ниже 1.80м");
    } else {
        System.out.println("Вы выше 1.80м");
    }

    if( yourFirstNameLetter == 'М') {
        System.out.println("Ваше имя начинается с М");
    } else if( yourFirstNameLetter == 'И') {
        System.out.println("Ваше имя начинается с И");
    } else {
        System.out.println("Ваше имя начинается не с И и не с М");
    }

    }
}