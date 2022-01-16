package Intro;
/* explaining　class and method briefly*/ 
public class Method1 {
/*上の構文は、クラスと呼ばれるものを宣言する構文
 * Javaではクラスというものを宣言してその中でコードを書いていく
 * public - どこからでもアクセスしていいよという意味
 * class - クラスを宣言するという意味、このあとにクラスの名前と意味を書いていく
 * 
 * publicなクラスの名前ははファイル名（拡張子を除く）と同じにしないといけない
 */
	public static void main(String[] args) {
		//これはメソッド（method）と呼ばれるもので、クラスの中にメソッドを宣言して、その中に実際に何をするか書く。
		System.out.println("こんにちは"); 
		//Javaでは命令の最後にはコロン（；）をつける必要があるよ, 文章はダブルクオーテーションの中に書く必要があるよ
		name();//メソッドの中の処理を実行してって意味！
	}
	//クラスやメソッドは中かっこで始まり、中かっこで終わるよ
	public static void name() {
		System.out.println("ぼくは森です");
	}

}


class Jikoshoukaisite{
	//publicのclassは一つのファイルに一つまで、publicがついていないと同じファイル内からしかそのクラスを呼び出せない。
	public static void  introduce(){
		System.out.println("自己紹介してください");
	}
}