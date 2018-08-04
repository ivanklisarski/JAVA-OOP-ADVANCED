package Reflection.BarracksWars.core.commands;

import Reflection.BarracksWars.annotations.Inject;
import Reflection.BarracksWars.contracts.Executable;
import Reflection.BarracksWars.contracts.Repository;

public class ReportCommand implements Executable {

    @Inject
    private Repository repository;

    @Override
    public String execute() {
        String output = this.repository.getStatistics();
        return output;
    }
}