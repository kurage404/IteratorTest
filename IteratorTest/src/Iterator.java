interface Iterator {
	public void first(); // 最初の要素
	public void next(); // 次の要素
	public boolean isDone(); // 最後の要素かどうか
	public Object getItem(); // 現在の位置の要素を取り出す
}