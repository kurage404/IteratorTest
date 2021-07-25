class JyuurokushinHyouji implements Observer {
	public void update(Subject s) {
		print(((Suuchi)s).getValue());
	}
	private void print(int n) {
		System.out.println(n + "を 16 進数で表示します");
		System.out.println("16進数：" + Integer.toHexString(n));   //16進数表記に変換
	}
}