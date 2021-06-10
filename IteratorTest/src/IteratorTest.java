public class IteratorTest {
	public static void main(String[] args) {
		GameListAggregate gameListAggregate = new GameListAggregate();
		gameListAggregate.add(new Game("みんなでゴルフ", 3700));
		gameListAggregate.add(new Game("ファイナルファンタジア", 7300));
		gameListAggregate.add(new Game("ロケットモンスター", 5400));
		gameListAggregate.add(new Game("サイコロの達人", 5200));
		Iterator iterator = gameListAggregate.createIterator();
		iterator.first(); // 先頭要素から
		while ( ! iterator.isDone() ) { // 要素がある間ture
			Game game = (Game)iterator.getItem(); // gemeを取得
			System.out.println(game.getName()); // 名称を取得and表示
			iterator.next(); // 次の要素へ
		}
	}
}