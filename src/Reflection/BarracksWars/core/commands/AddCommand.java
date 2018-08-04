package Reflection.BarracksWars.core.commands;

import Reflection.BarracksWars.annotations.Inject;
import Reflection.BarracksWars.contracts.Executable;
import Reflection.BarracksWars.contracts.Repository;
import Reflection.BarracksWars.contracts.Unit;
import Reflection.BarracksWars.contracts.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

public class AddCommand implements Executable {

    @Inject
    private String[] data;

    @Inject
    private Repository repository;

    @Inject
    private UnitFactory unitFactory;

    @Override
    public String execute() throws ExecutionControl.NotImplementedException {
        String unitType = this.data[1];
        Unit unitToAdd = this.unitFactory.createUnit(unitType);

        this.repository.addUnit(unitToAdd);

        return unitType + " added!";
    }
}
