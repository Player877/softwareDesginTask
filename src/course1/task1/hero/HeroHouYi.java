package course1.task1.hero;

import course1.task1.skill.*;
import course1.task1.skill.imp.*;

public class HeroHouYi implements InvisibleImp, SilentImp, ArcheryImp, VertigoImp, DisplacementImp {
    private final ArcheryAbility archeryAbility = new ArcheryAbility();
    private final DisplacementAbility displacementAbility = new DisplacementAbility();
    private final InvisibleAbility invisibleAbility = new InvisibleAbility();
    private final SilentAbility silentAbility = new SilentAbility();
    private final VertigoAbility vertigoAbility = new VertigoAbility();

    @Override
    public void doArchery() {
        archeryAbility.doArchery();
    }

    @Override
    public void doDisplacement() {
        displacementAbility.doDisplacement();
    }

    @Override
    public void doInvisible() {
        invisibleAbility.doInvisible();
    }

    @Override
    public void doSilent() {
        silentAbility.doSilent();
    }

    @Override
    public void doVertigo() {
        vertigoAbility.doVertigo();
    }
}
