package Intro;
/* explaining�@class and method briefly*/ 
public class Method1 {
/*��̍\���́A�N���X�ƌĂ΂����̂�錾����\��
 * Java�ł̓N���X�Ƃ������̂�錾���Ă��̒��ŃR�[�h�������Ă���
 * public - �ǂ�����ł��A�N�Z�X���Ă�����Ƃ����Ӗ�
 * class - �N���X��錾����Ƃ����Ӗ��A���̂��ƂɃN���X�̖��O�ƈӖ��������Ă���
 * 
 * public�ȃN���X�̖��O�͂̓t�@�C�����i�g���q�������j�Ɠ����ɂ��Ȃ��Ƃ����Ȃ�
 */
	public static void main(String[] args) {
		//����̓��\�b�h�imethod�j�ƌĂ΂����̂ŁA�N���X�̒��Ƀ��\�b�h��錾���āA���̒��Ɏ��ۂɉ������邩�����B
		System.out.println("����ɂ���"); 
		//Java�ł͖��߂̍Ō�ɂ̓R�����i�G�j������K�v�������, ���͂̓_�u���N�I�[�e�[�V�����̒��ɏ����K�v�������
		name();//���\�b�h�̒��̏��������s���Ă��ĈӖ��I
	}
	//�N���X�⃁�\�b�h�͒��������Ŏn�܂�A���������ŏI����
	public static void name() {
		System.out.println("�ڂ��͐X�ł�");
	}

}


class Jikoshoukaisite{
	//public��class�͈�̃t�@�C���Ɉ�܂ŁApublic�����Ă��Ȃ��Ɠ����t�@�C�������炵�����̃N���X���Ăяo���Ȃ��B
	public static void  introduce(){
		System.out.println("���ȏЉ�Ă�������");
	}
}