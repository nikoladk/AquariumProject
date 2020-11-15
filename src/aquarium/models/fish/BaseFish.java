package aquarium.models.fish;

import static aquarium.common.ExceptionMessages.*;
import static aquarium.common.ConstantMessages.*;

public abstract class BaseFish implements Fish {

    private String name;
    private String species;
    private int size;
    private double price;

    protected BaseFish(String name, String species, double price) {
        setName(name);
        setSpecies(species);
        setPrice(price);
    }

    @Override
    public void setName(String name) {
        if(name == null || name.trim().length() < 1) {
            throw new NullPointerException(FISH_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    private void setSpecies(String species) {
        if(species == null || species.trim().length() < 1) {
            throw new NullPointerException(SPECIES_NAME_NULL_OR_EMPTY);
        }
        this.species = species;
    }

    protected void setSize(int size) {
        this.size = size;
    }

    private void setPrice(double price) {
        if (price <= 0) {
            throw new NullPointerException(FISH_PRICE_BELOW_OR_EQUAL_ZERO);
        }
        this.price = price;
    }

    @Override
    public abstract void eat();

    @Override
    public int getSize() {
      return this.size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
