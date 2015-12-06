package fr.iutvalence.info.dut.m3105.preamble;

import java.util.Random;

public class Main
{

	public static void main(String[] args)
	{
		Random rng = new Random();
		
		TrafficSignal trafficSignal = new TrafficSignal();
		trafficSignal.start();
		
		while (true)
		{
			int delay = rng.nextInt(10);
			try
			{
				Thread.sleep(delay*1000);
			}
			catch (InterruptedException e)
			{
			}
			trafficSignal.pressButton();						
		}
	}

}
