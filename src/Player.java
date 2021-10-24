
public class Player {
	
	//---variable-----
	final String HAND_R = "Rock" ;     //手（Rock）
	final String HAND_S = "Scissor" ;   //手（Scissor）
	final String HAND_P = "Paper" ;     //手（Paper）
	
	
	//---field---
	String name       ;   //名前
	String handStatus ;   //ジャンケンの手
	
	
	//---Constructor(with Parameter)---
	Player(String nm){
		this.name       = nm ; 
	}
	
	
	//---Method----
	
	//fieldのhandStatusにランダムで出た手を割り当てる。
	void makeHandStatus(){
		
		int random1to3ForHand = 1 + (int)( Math.random() * 3.0 ); 
		
		switch(random1to3ForHand){
			case 1:
				this.handStatus = HAND_R ; //Rock
				break;
			
			case 2:
				this.handStatus = HAND_S ; //Scissor
				break;
			
			case 3:
				this.handStatus = HAND_P ; //Paper
				break;
		}
	}
}
