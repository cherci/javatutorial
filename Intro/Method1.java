package Intro;
/** explaining�@class and method briefly*/ 
public class Method1 {
	public static void main(String[] args) {
		System.out.println("����ɂ���"); 
		name();//���\�b�h�̒��̏��������s���ĂƂ����Ӗ�
		IntroduceYourself.introduce();//�Ⴄ�N���X�ɂ���v���O������"�N���X��.���\�b�h��"�ŌĂяo���B
	}
	
	//�N���X�⃁�\�b�h�͒��������Ŏn�܂�A���������ŏI���B
	public static void name() {
		System.out.println("�ڂ��͐X�ł�");
	}
}


class IntroduceYourself{
	//public��class�͈�̃t�@�C���Ɉ�܂ŁApublic�����Ă��Ȃ��Ɠ����t�@�C�������炵�����̃N���X���Ăяo���Ȃ��B
	public static void  introduce(){
		System.out.println("�����������ȏЉ�Ă�������");
		String selfIntro = new java.util.Scanner(System.in).nextLine();//���͂�����\���B���Ɋw�K����
		System.out.println(selfIntro);
	}
}