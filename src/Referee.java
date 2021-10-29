
public class Referee {
	
	
	//---Variable--
	final String HAND_R = "Rock" ;     //手（Rock）
	final String HAND_S = "Scissor" ;   //手（Scissor）
	final String HAND_P = "Paper" ;     //手（Paper）
	
	
	//---field---
	String name;
	
	
	//---Constructor(with parameter)---
	Referee(String nm){
		this.name = nm;   //名前
	}
	
	
	//---Method---
	
	//ジャンケン開始の掛け声
	void startJanken(){
		messageReferee("Ready... Go！！！！！");	
	}
	
	//Check both players hand method
	void checkHand( Player p ){
	
		//両playerのじゃんけんの手を何出したかを言う
		if( (p.handStatus).equals( HAND_R ) ){
			
			//"Rock"の場合
			messageReferee(p.name + " is Rock！");
			
		}else if( (p.handStatus).equals( HAND_S ) ){
			
			//"Scissor"の場合
			messageReferee(p.name + " is Scissor！");
			
		}else if( (p.handStatus).equals( HAND_P ) ){
			
			//"Paper"の場合
			messageReferee(p.name + " is Paper！");
			
		}else{
			
			//不正の場合、エラーメッセージを出力
			System.out.println("[ERROR]");
			
		}
	}
	
	//ジャンケンの判定をRefereeが言う。
	void judgeJanken(Player p1,Player p2){
		
		//結果を言う前に"Winner is..."から始める
		messageReferee("Winner is ....");
		
		//以下の勝敗の組み合わせで、結果が出た時にRefereeが勝敗宣言するので、その時の宣言文句。
		//あいこの場合
		if( (p1.handStatus).equals( p2.handStatus ) ){
			
			messageReferee("Draw! One more! Ready... go !");
			
			//Player1が勝った場合
		}else if(     (p1.handStatus.equals( HAND_R ) && p2.handStatus.equals( HAND_S ))
		           || (p1.handStatus.equals( HAND_S ) && p2.handStatus.equals( HAND_P ))
		           || (p1.handStatus.equals( HAND_P ) && p2.handStatus.equals( HAND_R ))  ) {
			
			messageReferee(p1.name + " is Winner！");
			
			//Player2が勝った場合
		}else if(     (p2.handStatus.equals( HAND_R ) && p1.handStatus.equals( HAND_S ))
		           || (p2.handStatus.equals( HAND_S ) && p1.handStatus.equals( HAND_P ))
		           || (p2.handStatus.equals( HAND_P ) && p1.handStatus.equals( HAND_R ))  ) {
			
			messageReferee(p2.name + " is winner");
			
		}else{
			
			//不正の場合、エラーメッセージを出力
			System.out.println("[ERROR]");
			
		}
	}
	
	//Show messages as a Referee
	void messageReferee(String msg){
		
		System.out.println( this.name + "「" + msg + "」");
		
	}

}
