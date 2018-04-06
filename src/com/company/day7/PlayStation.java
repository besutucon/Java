package com.company.day7;

public class PlayStation implements gameLoad, gamePlay, gameSave {

	public static void main(String[] args) {
		PlayStation ps4 = new PlayStation();
		ps4.LoadingGame();
		ps4.startGame();
		ps4.GameSaving();
	}

	@Override
	public void GameSaving() {
		// TODO Auto-generated method stub
		System.out.println("Attention!!! The game is saving. Please wait. Do not exit");
		
	}

	@Override
	public void startGame() {
		// TODO Auto-generated method stub
		System.out.println("Yay Start playing the game!!!");
		
	}

	@Override
	public void LoadingGame() {
		// TODO Auto-generated method stub
		System.out.println("The game is loading. Please wait!!!");
		
	}
	
}
