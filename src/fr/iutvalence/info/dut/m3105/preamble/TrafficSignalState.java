package fr.iutvalence.info.dut.m3105.preamble;

public enum TrafficSignalState
{
	GREEN(10), ORANGE(2), RED(10);
	
	private final int durationInSeconds;
	
	private TrafficSignalState(int durationInSeconds)
	{
		this.durationInSeconds = durationInSeconds;
	}
	
	public int getDurationInSeconds()
	{
		return this.durationInSeconds;
	}
}
