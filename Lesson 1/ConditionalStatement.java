public class ConditionalStatement {
    public static void main(String[] args) {
    int yourAge = 30;
    char yourSex = 'M';
    float yourHeight = 1.90f;
    char yourFirstNameLetter = '�';


    if( yourAge > 20) {
        System.out.println("��� ������� ������ 20");
    }

    if( yourSex == 'M') {
        System.out.println("�� �������� ����");
    }

    if( yourSex == '�') {
        System.out.println("�� �������� ����");
    }

    if( yourHeight < 1.80) {
        System.out.println("�� ���� 1.80�");
    } else {
        System.out.println("�� ���� 1.80�");
    }

    if( yourFirstNameLetter == '�') {
        System.out.println("���� ��� ���������� � �");
    } else if( yourFirstNameLetter == '�') {
        System.out.println("���� ��� ���������� � �");
    } else {
        System.out.println("���� ��� ���������� �� � � � �� � �");
    }

    }
}