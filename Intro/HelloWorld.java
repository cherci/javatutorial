package Intro; //ここは気にしないで
/**@author Cherci */

public class HelloWorld {
	/*上の構文は、クラスと呼ばれるものを宣言する構文
	 * Javaではクラスというものを宣言してその中でコードを書いていく
	 * public - どこからでもアクセスしていいよという意味
	 * class - クラスを宣言するという意味、このあとにクラスの名前と意味を書いていく
	 * 
	 * publicなクラスの名前ははファイル名（拡張子を除く）と同じにしないといけない
	 */
	public static void main(String[] args) {
		//これはメソッド（method）と呼ばれるもので、クラスの中にメソッドを宣言して、その中に実際に何をするか書く。
		System.out.println("Hello World!");		//この処理ではコマンドプロンプトに文字列を表示する。Javaでは命令の最後にはコロン（；）をつける必要があって, 文章はダブルクオーテーションの中に書く必要があるよ
		
	}

}
