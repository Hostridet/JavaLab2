package com.company;

public class ClimbInfo {
    private final String peakName;
    private final int climbTime;

    public ClimbInfo(String peakName, int climbTime)
    {
        this.climbTime = climbTime;
        this.peakName = peakName;
    }
    public String getName()
    {
        return this.peakName;
    }
    public int getTime()
    {
        return this.climbTime;
    }

}
