package Reflection.BarracksWars.core.commands;

import Reflection.BarracksWars.contracts.Executable;

public class FightCommand implements Executable {

    @Override
    public String execute() {
        return "fight";
    }
}
