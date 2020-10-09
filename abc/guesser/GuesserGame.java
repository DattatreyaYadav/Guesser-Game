package com.abc.guesser;

import java.util.Scanner;

class Guesser{
	int gnum;
	int guesserNumber() {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		gnum=scan.nextInt();	
		return gnum;
	}
}

class Player{
	int pnum;
	int playerNumber() {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		pnum=scan.nextInt();
		return pnum;
	}
}

class Umpire{
	int numfromguesser;
	int numfromplayer1;
	int numfromplayer2;
	int numfromplayer3;
	
	void collectNumberFromGuesser() {
		System.out.println("guesser please guess the number between 1 to 10");
		Guesser g=new Guesser();
		numfromguesser=g.guesserNumber();
		if(numfromguesser<1 ||  numfromguesser>10) {
			System.out.println("please guess a valid number!!!");
			numfromguesser=g.guesserNumber();
		}
	}
	
	void collectNumberFromPlayer() {
		System.out.println("player1 please guess the number between 1 to 10");
		Player p1=new Player();
		numfromplayer1=p1.playerNumber();
		if(numfromplayer1<1 ||  numfromplayer1>10) {
			System.out.println("please guess a valid number!!!");
			numfromplayer1=p1.playerNumber();
		}
		System.out.println("player2 please guess the number between 1 to 10");
		Player p2=new Player();
		numfromplayer2=p2.playerNumber();
		if(numfromplayer2<1 || numfromplayer2>10) {
			System.out.println("please guess a valid number!!!");
			numfromplayer2=p2.playerNumber();
		}
		System.out.println("player3 please guess the number between 1 to 10");
		Player p3=new Player();
		numfromplayer3=p3.playerNumber();
		if(numfromplayer3<1 ||  numfromplayer3>10) {
			System.out.println("please guess a valid number!!!");
			numfromplayer3=p3.playerNumber();
		}
		}
	  boolean compare() {
		if(numfromguesser==numfromplayer1) {
			System.out.println("player1 wins!!!");
			return true;
		}
		else if(numfromguesser==numfromplayer2) {
			System.out.println("player2 wins!!!");
			return true;
		}
		else if(numfromguesser==numfromplayer3) {
			System.out.println("player3 wins!!!");
			return true;
		}
		else {
			System.out.println("better luck next time !!!");
			return false;
		}
	}
}
public class GuesserGame {
	static int count=0;
	public static void main(String[] args) {
		
		count++;
		if(count<=5) {
		System.out.println("Round : " + count);
		Umpire u=new Umpire();
		u.collectNumberFromGuesser();
		u.collectNumberFromPlayer();
		boolean result=u.compare();
		if(result) {
			System.out.println("Game Over!!!");
			return;
		 }
		main(args);
		}
		else {
			System.out.println("your limit is done !!! ");
			System.out.println("restart the game again !!!");
			return;
		}
	}
}


/*
 Round : 1
guesser please guess the number between 1 to 10
9
player1 please guess the number between 1 to 10
2
player2 please guess the number between 1 to 10
3
player3 please guess the number between 1 to 10
4
better luck next time !!!
Round : 2
guesser please guess the number between 1 to 10
9
player1 please guess the number between 1 to 10
9
player2 please guess the number between 1 to 10
4
player3 please guess the number between 1 to 10
2
player1 wins!!!
Game Over!!!
*/

 /*
Round : 1
guesser please guess the number between 1 to 10
9
player1 please guess the number between 1 to 10

1
player2 please guess the number between 1 to 10
2
player3 please guess the number between 1 to 10
3
better luck next time !!!
Round : 2
guesser please guess the number between 1 to 10
1
player1 please guess the number between 1 to 10
2
player2 please guess the number between 1 to 10
3
player3 please guess the number between 1 to 10
4
better luck next time !!!
Round : 3
guesser please guess the number between 1 to 10
1
player1 please guess the number between 1 to 10
5
player2 please guess the number between 1 to 10
5
player3 please guess the number between 1 to 10
3
better luck next time !!!
Round : 4
guesser please guess the number between 1 to 10
1
player1 please guess the number between 1 to 10
4
player2 please guess the number between 1 to 10
4
player3 please guess the number between 1 to 10
2
better luck next time !!!
Round : 5
guesser please guess the number between 1 to 10
1
player1 please guess the number between 1 to 10
4
player2 please guess the number between 1 to 10
5
player3 please guess the number between 1 to 10
2
better luck next time !!!
your limit is done !!! 
restart the game again !!!

 */
