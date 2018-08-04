package Reflection.BarracksWars.contracts;

import jdk.jshell.spi.ExecutionControl;

public interface Executable {

	String execute() throws ExecutionControl.NotImplementedException;

}
