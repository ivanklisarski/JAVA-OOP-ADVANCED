package Reflection.BarracksWars.core.commands;

import Reflection.BarracksWars.annotations.Inject;
import Reflection.BarracksWars.contracts.Executable;
import Reflection.BarracksWars.contracts.Repository;
import jdk.jshell.spi.ExecutionControl;

public class RetireCommand implements Executable {

    @Inject
    private String[] data;

    @Inject
    private Repository repository;

    @Override
    public String execute() throws ExecutionControl.NotImplementedException {
        String unitType = this.data[1];

        try {
            this.repository.removeUnit(unitType);

            return unitType + " retired!";
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }
}

