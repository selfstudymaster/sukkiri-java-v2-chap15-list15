package unsupportedmusicfileexception;

// list15-06 オリジナル例外クラスを定義する
// Exceptionクラスを継承してチェック例外にする
public class UnsupportedMusicFileException extends Exception {
	// エラ〜メッセージを受け取るコンストラクタ
	public UnsupportedMusicFileException(String msg) {
		super(msg);
	}
}
