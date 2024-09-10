package ThirdTask;

public class Hero {
    private AbilityStrategy ability;

    // Konstruktor s početnom sposobnošću
    public Hero() {
        this.ability = new ZeroStrategy(); // Defaultna sposobnost
    }

    // Postavljanje nove sposobnosti i odmah njena primjena
    public void setAndApplyAbility(AbilityStrategy ability) {
        this.ability = ability;
        ability.applyAbility();
    }

    @Override
    public String toString() {
        return "Trenutni heroj s aktivnom sposobnošću: " + ability.getClass().getSimpleName();
    }
}

