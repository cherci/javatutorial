package Intro;
/** explaining　class and method briefly*/ 
public class Method1 {
	public static void main(String[] args) {
		System.out.println("こんにちは"); 
		name();//メソッドの中の処理を実行してという意味
		IntroduceYourself.introduce();//違うクラスにあるプログラムは"クラス名.メソッド名"で呼び出す。
	}
	
	//クラスやメソッドは中かっこで始まり、中かっこで終わる。
	public static void name() {
		System.out.println("ぼくは森です");
	}
}


class IntroduceYourself{
	//publicのclassは一つのファイルに一つまで、publicがついていないと同じファイル内からしかそのクラスを呼び出せない。
	public static void  introduce(){
		System.out.println("そっちも自己紹介してください");
		String selfIntro = new java.util.Scanner(System.in).nextLine();//入力させる構文。次に学習する
		System.out.println(selfIntro);
	}
}