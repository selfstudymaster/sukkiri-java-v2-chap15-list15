package main;

import java.io.IOException;

// chap15 例外
// list15-01
//public class Main {
//	public static void main(String[] args) {
//		FileWriter fw = new FileWriter("data.txt"); // コンパイルエラーになる
//	}
//}

//list15-02
//public class Main {
//	public static void main(String[] args) {
//		try {
//			FileWriter fw = new FileWriter("data.txt"); // tryで囲む
//		} catch (IOException e) {
//			System.out.println("エラーが発生しました。");
//		}
//	}
//}

// list15-03 ざっくりと例外を捕捉する
// import java.io.*;
//public class Main {
//	public static void main(String[] args) {
//		try {
//			FileWriter fw = new FileWriter("data.txt"); // tryで囲む
//			fw.write("Hello!");
//			fw.close(); // 本来なら「ファイルが閉じなかった場合」の処理も書かなければならない
//			System.out.println("tryを実行");
//		} catch (Exception e) {
//			System.out.println("何らかの例外が発生しました。");
//		}
//	}
//}

//list15-04香さんが作成したプログラム
//import java.io.*;
//public class Main {
//	public static void main(String[] args) {
//		FileWriter fw = null;
//		try {
//			fw = new FileWriter("data.txt"); // tryで囲む
//			fw.write("Hello!");
//			System.out.println("tryを実行"); // 確認用
//		} catch (IOException e) {
//			System.out.println("エラーです");
//		}
//		fw.close(); // try-catchの後でcloseする // tryブロックの中でNullPoniterExceptionが発生すると例外がキャッチされず
//					//ファイルも閉じないままプログラミが強制終了する
//	}
//}

//list15-04捕捉 finallyで例外発生の如何を問わず必ず処理を実行する
//import java.io.*;
//public class Main {
//	public static void main(String[] args) {
//		try (FileWriter fw = new FileWriter("data.txt");) {
//
//			fw.write("Hello!");
////			System.out.println("tryを実行"); // 確認用
//		} catch (IOException e) {
//			System.out.println("エラーです");
//		}
////		// try (この()内に FileWriter fw = new FileWriter("data.txt"); を書く) {} と記述することで、
////		// finally {fw.close();} を書かなくても自動的にclose()メソッドが呼び出される
//	}
//}

//list15-05 例外インスタンスを自ら投げる
//import java.io.*;
// import person.Person;
//public class Main {
//	public static void main(String[] args) {
//		Person p = new Person();
//		p.setAge(-128); // 誤った値のセットを試みる(例外を投げる > 例外発生
//		// エラーメッセージ
//		// Exception in thread "main" java.lang.IllegalArgumentException: 年齢正の数を指定すべきです。指定値=-128
//		// at person.Person.setAge(Person.java:9)
//		// at main.Main.main(Main.java:78)
//	}
//}

//list15-07 オリジナル例外クラスを利用する
//import java.io.*;
//import unsupportedmusicfileexception.UnsupportedMusicFileException;
//public class Main {
//	public static void main(String[] args) {
//		try {
//			// 試験的に例外を発生させる
//			throw new UnsupportedMusicFileException("未対応のファイル形式です");
//		} catch (Exception e) {
//			e.printStackTrace();
//		} // エラーメッセージ
//		  // unsupportedmusicfileexception.UnsupportedMusicFileException: 未対応のファイル形式です
//		  // at main.Main.main(Main.java:93)
//	}
//}

// practice15-01
//public class Main {
//	public static void main(String[] args) {
//		public String s = null;
//		System.out.println(s.length()); // 意図的にエラーを出してます
//	}
//}

// practice15-02
//public class Main {
//	public static void main(String[] args) {
//
//		try {
//
//			String s = null;
//			System.out.println(s.length());
//
//		} catch (NullPointerException e) {
//
//			System.out.println("NullPointerException 例外をcatchしました");
//			System.out.println("ーースタックトレース(ここから)ーー");
//			e.printStackTrace();
//			System.out.println("ーースタックトレース(ここまで)ーー");
//			// エラ〜メッセージ
//			// NullPointerException 例外をcatchしました
//			// ーースタックトレース(ここから)ーー
//			// java.lang.NullPointerException
//			// at main.Main.main(Main.java:115)
//			// ーースタックトレース(ここまで)ーー
//
//		}
//	}
//}

//practice15-03
//public class Main {
//	public static void main(String[] args) {
//
//		try {
//			// APIリファレンスから送出例外を調べる
//			int i = Integer.parseInt("三");
//
//		} catch (NumberFormatException e) {
//
//			System.out.println("例外 NumberFormatException 例外をcatchしました");
//
//		}
//	}
//}

//practice15-04
public class Main {
	public static void main(String[] args) throws IOException {
		System.out.println("プログラムが起動しました");
		throw new IOException(); // 起動直後に異常終了させる
		// 表示結果:プログラムが起動しました
		// エラ〜メッセージも出力される
		// Exception in thread "main" java.io.IOException
		// at main.Main.main(Main.java:156)

	}
}