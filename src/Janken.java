
public class Janken {

	public static void main(String[] args) {
		
		String nameP1      = args[0] ;
		String nameP2      = args[1] ; 
		String nameReferee = args[2] ; 
		
//		instance
		Player  p1      = new Player(  nameP1 ) ;   
		Player  p2      = new Player(  nameP2 ) ;      
		Referee ref     = new Referee( nameReferee ) ; 
		
		
//		Referee 開始前掛け声
		ref.startJanken();
		
//		playerがじゃんけん
		p1.makeHandStatus();
		p2.makeHandStatus();
		
//		Refereeが両playerの出した手を言う
		ref.checkHand(p1);
		ref.checkHand(p2);
		
		
//		"Winnerは..."の後に勝敗を言う
		ref.judgeJanken(p1,p2);	

	}

}
