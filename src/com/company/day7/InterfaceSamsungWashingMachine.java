package com.company.day7;

public class InterfaceSamsungWashingMachine implements InterfaceWashingMachine, InterfaceWashingMachineMtn{

	@Override
	public void startButton() {
		// TODO Auto-generated method stub
		System.out.println("Start the Machine");
		
	}
	
	public static void main(String[] args) {
		InterfaceSamsungWashingMachine samsung = new InterfaceSamsungWashingMachine();
		samsung.startButton();
		samsung.mtnWashingMachine();
		
	}

	@Override
	public void mtnWashingMachine() {
		// TODO Auto-generated method stub
		System.out.println("Please maintaine my wasihng machine");
		
	}
	
}
