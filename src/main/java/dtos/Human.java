package dtos;

import exceptions.AllTeethsRemovedException;
import exceptions.EatingException;

public class Human extends Mammal{
    private boolean afterDentist;
    private boolean allTeethRemoved;

    public boolean isAfterDentist() {
        return afterDentist;
    }

    public void setAfterDentist(boolean afterDentist) {
        this.afterDentist = afterDentist;
    }

    public boolean isAllTeethRemoved() {
        return allTeethRemoved;
    }

    public void setAllTeethRemoved(boolean allTeethRemoved) {
        this.allTeethRemoved = allTeethRemoved;
    }

    public Human() {
    }

    @Override
    public void eat() {
        if (allTeethRemoved){
            throw new AllTeethsRemovedException("You never eat again!");
        }
        if (afterDentist) {
            throw new EatingException("Don't eat!");
        }
        super.eat();
    }
}
